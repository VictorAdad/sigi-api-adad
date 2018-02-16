package core.util.email.template;

import java.io.StringWriter;
import java.util.Map;

public class TemplateBuilder{

    //Contructor
    public TemplateBuilder(){};

    public static StringWriter get(String name,  Map<String,String> props){
        TemplateEngine t = new TemplateEngine(name,props);
        return t.build();
    };

}