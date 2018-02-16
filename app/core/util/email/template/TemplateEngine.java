package core.util.email.template;

import core.error.TemplateEngineException;

import java.util.Map;
import java.io.StringWriter;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import play.Configuration;
import java.util.Properties;


public class TemplateEngine{

    //Contructors
    //
    public TemplateEngine(Map<String, String> props){};

    public TemplateEngine(String name, Map<String, String> props){
        this.name   = name;
        this.props  = props;
    };

    public TemplateEngine(String name){
        this.name   = name;
    };

    private String path = System.getProperty("user.dir");

    private String name = "default";

    private Map<String, String> props;

    public StringWriter build(){
        System.out.println("CURRENT PATH: "+ path);

        /* now render the template into a StringWriter */
        StringWriter writer = new StringWriter();

        try{
            /*  next, get the Template  */
            if (!this.name.equals("")) {
                VelocityEngine ve = new VelocityEngine();
                Properties props = new Properties();
                props.put("file.resource.loader.path", path);
                ve.init(props);
                System.out.println("PATH TEMPLATE : \n\t"+ path+play.Configuration.root().getString("Evomatik.distPath")+"/email/templates/"+this.name+".html");
                Template template = ve.getTemplate(play.Configuration.root().getString("Evomatik.distPath")+"/email/templates/"+this.name+".html");  
                /*  create a context and add data */
                VelocityContext context = new VelocityContext();
                context.put("config", play.Configuration.root());

                System.out.println("PROPS : \n\t"+this.props);
                if (this.props != null && this.props.size() > 0) {
                    this.props.forEach((key, value) -> {
                        System.out.println("Key : " + key + " Value : " + value);
                        context.put(key, value);
                    });
                    
                }
                
                template.merge( context, writer );
            }else{
                throw new TemplateEngineException("No se pudo encotrar template con el nombre \'"+this.name+"\' para contruir");
            }
    
        }catch(TemplateEngineException tee){
            System.out.println("ERROR: TemplateEngineException error: "+ tee);
        }catch(Exception e){
            System.out.println("ERROR: Exception error: "+ e);
        }
        return writer;  
    }
}