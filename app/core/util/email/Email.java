package core.util.email;

import core.util.email.template.TemplateBuilder;
import core.util.utilities.MapUtil;
import play.Configuration;
import play.Logger.ALogger;
import play.Logger;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.inject.Inject;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Date;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Properties;

import java.lang.StringBuilder;

public class Email {
    
    private Configuration configuration;

    private static final ALogger logger = Logger.of(Email.class);

    private static boolean sandbox      = Configuration.root().getBoolean("email.sandbox");

    private static boolean active       = Configuration.root().getBoolean("email.active");

    private static String templateName  = (Configuration.root().getString("email.defaultTemplate") != null) ? Configuration.root().getString("email.defaultTemplate") : "default";

    private static String host          = Configuration.root().getString("email.smtp.host");
    
    private static String auth          = Configuration.root().getString("email.smtp.auth");
    
    private static String port          = Configuration.root().getString("email.smtp.port");
    
    private static String starttls      = Configuration.root().getString("email.smtp.starttls.enable");
    
    private static String EMAIL         = Configuration.root().getString("email.smtp.account");
    
    private static String PASS          = Configuration.root().getString("email.smtp.password");
    
    private static String subject       = (Configuration.root().getString("email.defaultSubject") != null) ? Configuration.root().getString("email.defaultSubject") : "Notificacion de Correo Electronico";

    private static String from          = (Configuration.root().getString("email.smtp.from") != null) ? Configuration.root().getString("email.from") : "noreply";

    private static Boolean debug        = (Configuration.root().getBoolean("email.debug") != null) ? Configuration.root().getBoolean("email.debug") : false;

    private static Integer timeout      = (Configuration.root().getInt("email.timeout") != null) ? Configuration.root().getInt("email.timeout") : 1000;
    
    private static Properties props     = new Properties();

    @Inject
    public Email(Configuration configuration) {
        this.configuration  = configuration; 
    }

    /**
     * Created by Gibran
     * [Método para el envío de correos electrónicos]
     * @param mensaje  [Mensaje que se desea enviar en el correo]
     * @param correo   [Correo al que se envía el email]
     * @param conCopia [Lista de correos a los cuales se les mandará una copia,
     *                  en caso de que no se desee mandar copias poner este parámetro con los
     *                  siguientes valores= null o '']
     */

    public static void send(String email, String message, String[] cc) throws Exception{
        logger.debug("Email@send(email, message, cc) \n\n");
        sendEmail("", message, email, cc);
    }

    public static void send(String email, String message) throws Exception{
        logger.debug("Email@send(email, message) \n\n");
        sendEmail("", message, email, new String[0]);
    }

    public static void send(String subjectValue, String email, String message, String[] cc) throws Exception{
        logger.debug("Email@send(subjectValue, email, message, cc) \n\n");
        sendEmail(subjectValue, message, email, cc);      
    }    

    public static void send(String subjectValue, String email,  String message) throws Exception{
        logger.debug("Email@send(subjectValue, email, message) \n\n");
        sendEmail(subjectValue, message, email, new String[0]);
    }

    private static void sendEmail(String subjectValue, String message, String email, String[] cc) throws Exception{
        logger.debug("Email@sendEmail(subjectValue, message, email, cc)");
        Session session =  null; 
        MimeMessage msg = null;

        if(isEnabled()){  
            setProps();
            logger.debug("Estatus Sandbox: "+isSandBoxActive(message, email, cc));
            if (!isSandBoxActive(message, email, cc)){ 
                logger.debug("Construction email ");
                session = setSession();
                logger.debug("Session:  "+session);
                msg = new MimeMessage(session);
                logger.debug("MimeMessage:  "+msg);
                if (subjectValue.equals("")) {
                   msg.setSubject(subject); 
                   msg.setDescription("my description1");
                }else{
                   msg.setSubject(subjectValue); 
                   msg.setDescription("my description");
                }
                session.setDebug(debug);
                msg.setSentDate(new Date());
                setHeaders(msg);
                setRecipients(msg, email, cc);
                BodyPart        body        = setBody(message, templateName);
                BodyPart        image       = setAttach();
                MimeMultipart   multiPart   = setMultiPart(body, null);
                msg.setContent(multiPart);
                logger.debug("Sending email...");
                Transport.send(msg);
                logger.debug("Se ha enviado el correo de manera satisfactoria a la dirección: "+email);
            }
        }
    }

    private static Session setSession() throws Exception{
        Session session = Session.getInstance(props, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL, PASS);
            }
        });
        return session;
    }

    private static void setHeaders(MimeMessage msg) throws Exception{
        msg.setFrom(new InternetAddress(from, subject));
    }

    private static void setRecipients(MimeMessage msg, String email, String[] cc) throws Exception{
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
        for(String c: cc) {
            if(!c.equals("") && c != null){
                msg.addRecipients(Message.RecipientType.BCC, InternetAddress.parse(c));
            }
        }
    }

    private static BodyPart setBody(String msg, String templateName) throws Exception{
        BodyPart body = new MimeBodyPart();
        Map<String, String> props = new TreeMap<String, String>();
        props.put("message", msg);
        body.setContent(new TemplateBuilder().get(templateName, props).toString(), "text/html");
        return body;
    }

    private static BodyPart setAttach() throws Exception{ 
        BodyPart imagen = new MimeBodyPart();
        String path = System.getProperty("user.dir");
        DataSource fds = new FileDataSource(path+play.Configuration.root().getString("Evomatik.distPath")+"/resources/images/logo.png");
        imagen.setDataHandler(new DataHandler(fds));
        imagen.setHeader("Content-ID","<image>");
        return imagen;
    }

    private static MimeMultipart setMultiPart(BodyPart body, ArrayList<BodyPart> attachments) throws Exception{
        MimeMultipart multiPart = new MimeMultipart();
        multiPart.addBodyPart(body);
        if (attachments != null) {
            for (BodyPart attach:  attachments) {
                multiPart.addBodyPart(attach);   
            }            
        }
        return multiPart;
    }  

    public static boolean isEnabled(){
        if(!active)
            logger.warn("Email is not enabled");
        return active;
    }

    public static boolean isSandBoxActive(String message, String email, String[] cc) throws Exception{
        if(sandbox)
            getInformationSandbox(message, email, cc); 
        return sandbox;
    }


    private static void setProps(){
        // set properties
        props.put("mail.smtp.user",             EMAIL);
        props.put("mail.smtp.password",         PASS);
        props.put("mail.smtp.host",             host);
        props.put("mail.smtp.auth",             auth);
        props.put("mail.smtp.port",             port);
        props.put("mail.smtp.starttls.enable",  starttls);
        props.put("mail.smtp.connectiontimeout", timeout);
    }

    private static void getInformationSandbox(String message, String email, String[] cc) throws Exception{
        logger.warn("\n Sandbox mode active, your email havent been sended : sorry ü...\n\t but... \n\t here the email information to send: \n");
        logger.warn("\n\t email: \n\t\t"+email+ "\n\t cc: \n\t\t"+cc+"\n\t message: \n\t\t"+message+"\n\t props: \n\t\t"+MapUtil.print(props)+"\n\t template name: \n\t\t"+templateName);
        Map<String, String> props = new TreeMap<String, String>();
        props.put("message", message);
        props.put("subjectName", from);
        logger.warn("template: \n\n\n"+new TemplateBuilder().get(templateName, props).toString());
    }



    /** 
     * Ejemplo para enviar email:
     * @author Gibran Cordoba
     *
     *  try{
     *      Logger.debug("trying to send email...");
     *      Email.send("o.cordobam@hotmail.com","demo de correo electronico");
     *  }catch(Exception e){
     *      Logger.error("error mandando el correo electronico", e);
     *  }
     *
     *
    */

}
