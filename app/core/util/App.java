package core.util;

import java.util.Base64;
import java.util.Map;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.io.File;
import java.io.FileInputStream;

import java.text.SimpleDateFormat;
import java.text.DateFormat;

import java.nio.charset.Charset;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.PersonaCaso;
import models.PersonaHerencia;
import models.Titular;
import models.Caso;
import ldpaModels.Ldap;
import ldpaModels.User;

import play.Logger;
import play.libs.Json;
import com.typesafe.config.Config;

public class App{

    public static String[] getAuth(String[] authorization) {
        if (authorization != null && authorization[0].startsWith("Basic")) {
            // Authorization: Basic base64credentials
            String base64Credentials = authorization[0].substring("Basic".length()).trim();
            String credentials = new String(Base64.getDecoder().decode(base64Credentials),Charset.forName("UTF-8"));
            // credentials = username:password
            final String[] values = credentials.split(":",2);
            return values;
        }
        return null;
    }

    public static String generateId(){
        return UUID.randomUUID().toString();
    }


    public static String parseDateTimeToString(Date date){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String stringDate = null;
        try{
            stringDate = dateFormat.format(date);
        }catch(Exception e){
            e.printStackTrace();
        }
        return stringDate;
    }

    public static Date parseStringDate( String dateInString, String stringFormat)
    {
       SimpleDateFormat formatter = new SimpleDateFormat(stringFormat);
       Date date = null;
       try {

           date = formatter.parse(dateInString);

       } catch (Exception e) {
           //e.printStackTrace();
       }
       return date;
    }
    public static Date parseStringDate( String dateInString, String stringFormat, Locale locale)
    {
       SimpleDateFormat formatter = new SimpleDateFormat(stringFormat,locale);
       Date date = null;
       try {

           date = formatter.parse(dateInString);

       } catch (Exception e) {
           //e.printStackTrace();
       }
       return date;
    }
    public static Date parseStringDate(String dateString){
        Date date = null;
        date = parseStringDate(dateString, "dd-MMM-yy",Locale.ENGLISH);
        if (date!=null)
            return date;
        date = parseStringDate(dateString, "dd-MMM-yyyy",Locale.ENGLISH);
        if (date!=null)
            return date;
        date = parseStringDate(dateString, "dd/MMM/yy",Locale.ENGLISH);
        if (date!=null)
            return date;
        date = parseStringDate(dateString, "dd/MMM/yyyy",Locale.ENGLISH);
        if (date!=null)
            return date;
        Locale l = new Locale("es","MX","MX");
        date = parseStringDate(dateString, "dd-MMM-yy",l);
        if (date!=null)
            return date;
        date = parseStringDate(dateString, "dd-MMM-yyyy",l);
        if (date!=null)
            return date;
        date = parseStringDate(dateString, "dd/MMM/yy",l);
        if (date!=null)
            return date;
        date = parseStringDate(dateString, "dd/MMM/yyyy",l);
        if (date!=null)
            return date;
        return null;
    }

    public static byte[] getBytesFile(File file){
        byte[] bFile = new byte[(int) file.length()];
        try {
            FileInputStream fileInputStream=null;
            try {
                //convert file into array of bytes
                fileInputStream = new FileInputStream(file);
                fileInputStream.read(bFile);
                fileInputStream.close();

            }catch(Exception e){
                e.printStackTrace();
            }
        }catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return bFile;
    }

    public static boolean isAlphaNumeric(String line){
        String pattern = "^[a-zA-Z0-9]*$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        if (m.find()) {
            return m.group(0).length()==line.length();
        }
        return false;
    }

    public static String parseDateTimeToStringShort(Date date){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        String stringDate = null;
        try{
            stringDate = dateFormat.format(date);
        }catch(Exception e){
            e.printStackTrace();
        }
        return stringDate;
    }

    public static String parseDateToString(Date date, String format){
        DateFormat dateFormat = new SimpleDateFormat(format);
        String stringDate = null;
        try{
            stringDate = dateFormat.format(date);
        }catch(Exception e){
            e.printStackTrace();
        }
        return stringDate;
    }

    public static String parseDateLocaleToString(Date date){
        String fecha = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        try{
            fecha = dateFormat.format(date);
        }catch(Exception e){
            e.printStackTrace();
        }
        return fecha;
    }

    public static String [] getActualDate (){
        String [] fecha = new String [3];
        Date actualDate=new Date();
        SimpleDateFormat format = new SimpleDateFormat("MMMM",new Locale("ES"));

        fecha[0]=Integer.toString(actualDate.getDate());
        fecha[1]=format.format(actualDate).substring(0, 1).toUpperCase()+format.format(actualDate).substring(1);
        fecha[2]=Integer.toString(actualDate.getYear()+1900);
        return fecha;
    } 


    public static String parseDate(Date date){
        String [] fecha = new String [3];
        SimpleDateFormat format = new SimpleDateFormat("MMMM",new Locale("ES"));

        fecha[0]=Integer.toString(date.getDate());
        fecha[1]=format.format(date).substring(0, 1).toUpperCase()+format.format(date).substring(1);
        fecha[2]=Integer.toString(date.getYear()+1900);
        return fecha[0]+" de "+fecha[1]+" de "+fecha[2];
    } 
    
    public static String getAllValuesVictimas(Long id, String sql){
        String values="";
        String[] tiposIntervinientes = {"Víctima","Ofendido","Víctima desconocida"};
        for (int i=0;i<tiposIntervinientes.length;i++){
            if (!(PersonaCaso.getValuesByField(id, tiposIntervinientes[i], sql).equals(""))){
                values+=PersonaCaso.getValuesByField(id, tiposIntervinientes[i], sql)+", ";
            }
        }
        if(values.length()>0){
            values=values.substring(0, values.length()-2);
        }
        return values;
    }

    public static String getAllPersonasHerencia(Long idCaso, String tipo, Long actuacion, Boolean upperCase){
        String[] tiposVictimas = {"Víctima","Ofendido","Víctima desconocida"};
        String[] tiposImputados = {"Imputado", "Imputado desconocido"};
        List<PersonaCaso> personas = PersonaCaso.find.query().where().eq("caso.id",idCaso).findList();
        String nombres = "";
        Boolean herencia = false;
        for(PersonaCaso persona: personas){
            PersonaHerencia object = PersonaHerencia.findExistenteByTipos(persona,actuacion,(tipo.equals("Víctima")?tiposVictimas:tiposImputados));
            
            if(object != null){
                herencia = true;
                if(object.personaCaso.tipoInterviniente.tipo.equals("Víctima desconocida")){
                    nombres += "Identidad desconocida, ";
                } else if(object.personaCaso.tipoInterviniente.tipo.equals("Imputado desconocido")){
                    nombres += "Quien resulte responsable, ";
                } else {
                    nombres += (object.personaCaso.persona.nombre != null ? object.personaCaso.persona.nombre+" " : "") + (object.personaCaso.persona.paterno != null ? object.personaCaso.persona.paterno+" " : "") + (object.personaCaso.persona.materno != null ? object.personaCaso.persona.materno+", " : "");
                } 
            }
        }
        if(!herencia){
            if(tipo.equals("Víctima")){
                nombres = getAllValuesVictimas(idCaso,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO");
            } else {
                nombres = getAllValuesImputados(idCaso,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO");
            }    
        } else {
            if(nombres.length()>0 && nombres.endsWith(", ")){
                nombres=nombres.substring(0, nombres.length()-2);
            }else{
                nombres=nombres.substring(0, nombres.length()-1);
            }
        }
        if(upperCase){
            return nombres.toUpperCase();
        } else {
            return nombres;    
        }
    }

    public static String getAllValuesImputados(Long id, String sql){
        String values="";
        String[] tiposIntervinientes = {"Imputado","Imputado desconocido"};
        for (int i=0;i<tiposIntervinientes.length;i++){
            if (!PersonaCaso.getValuesByField(id, tiposIntervinientes[i], sql).equals("")){
                values+=PersonaCaso.getValuesByField(id, tiposIntervinientes[i], sql)+", ";
            }
        }
        if(values.length()>0){
            values=values.substring(0, values.length()-2);
        }
        return values;
    }

    public static String getValuesByHerencia(Long id, JsonNode node, String sql){
        String values="";
        for (int i=0; i<node.size();i++){
            JsonNode innerNode = node.get(i);
            if (!PersonaCaso.getSpecificValuesByField(id,innerNode.get("id").asLong(),sql).equals("")){
                values += PersonaCaso.getSpecificValuesByField(id,innerNode.get("id").asLong(),sql)+", ";
            }
        }
         if(values.length()>0){
             values=values.substring(0, values.length()-2);
        }
        return values;
    }


    public static String getDomiciliosByHerencia(JsonNode node){
        String values="";
        for (int i=0; i<node.size();i++){
            JsonNode innerNode = node.get(i);
            JsonNode field = innerNode.get("id");
            PersonaHerencia personaHerencia = PersonaHerencia.find.query().where()
                .eq("id", field.asLong())
                .findUnique();
            PersonaCaso personaCaso = PersonaCaso.find.query().where()
                .eq("id",personaHerencia.personaCaso.id)
                .findUnique();
            if(personaCaso.persona.localizacionPersona!=null){
                if (!PersonaCaso.getDomicilios(personaCaso.persona.localizacionPersona).equals("")){
                    values += PersonaCaso.getDomicilios(personaCaso.persona.localizacionPersona)+", ";
                }
            }
        }
        if(values.length()>0){
            values=values.substring(0, values.length()-2);
        }
        return values;
    }

    public static String getTelefonosByHerencia(JsonNode node){
        String values="";
        for (int i=0; i<node.size();i++){
            JsonNode innerNode = node.get(i);
            JsonNode field = innerNode.get("id");
            PersonaHerencia personaHerencia = PersonaHerencia.find.query().where()
                .eq("id", field.asLong())
                .findUnique();
            PersonaCaso personaCaso = PersonaCaso.find.query().where()
                .eq("id",personaHerencia.personaCaso.id)
                .findUnique();
            if(personaCaso.persona.localizacionPersona!=null){
                if (!PersonaCaso.getTelefonos(personaCaso.persona.localizacionPersona).equals("")){
                    values += PersonaCaso.getTelefonos(personaCaso.persona.localizacionPersona);
                }
            }
        }
        if(values.length()>0){
            values=values.substring(0, values.length()-2);
        }
        return values;
    }

    public static String getMovilesByHerencia(JsonNode node){
        String values="";
        for (int i=0; i<node.size();i++){
            JsonNode innerNode = node.get(i);
            JsonNode field = innerNode.get("id");
            PersonaHerencia personaHerencia = PersonaHerencia.find.query().where()
                .eq("id", field.asLong())
                .findUnique();
            PersonaCaso personaCaso = PersonaCaso.find.query().where()
                .eq("id",personaHerencia.personaCaso.id)
                .findUnique();
            if(personaCaso.persona.localizacionPersona!=null){
                if (!PersonaCaso.getMoviles(personaCaso.persona.localizacionPersona).equals("")){
                    values += PersonaCaso.getMoviles(personaCaso.persona.localizacionPersona);
                }
            }
        }
        if(values.length()>0){
            values=values.substring(0, values.length()-2);
        }
        return values;
    }

    public static String getFechasNacimientoByHerencia(JsonNode node){
        String values="";
        for (int i=0; i<node.size();i++){
            JsonNode innerNode = node.get(i);
            JsonNode field = innerNode.get("id");
            PersonaHerencia personaHerencia = PersonaHerencia.find.query().where()
                .eq("id", field.asLong())
                .findUnique();
            PersonaCaso personaCaso = PersonaCaso.find.query().where()
                .eq("id",personaHerencia.personaCaso.id)
                .findUnique();
            if (personaCaso.persona.fechaNacimiento!=null){
                values += parseDate(personaCaso.persona.fechaNacimiento)+", ";

            }
        }
        if(values.length()>0){
            values=values.substring(0, values.length()-2);
        }
        return values;
    }

    public static User getUsuario(Caso caso,Config configuration){
        User user = new User();
        if (caso.titulares!=null){
            for (Titular titular : caso.titulares){
                if(titular.vigente){
                    Ldap ldap = new Ldap(configuration);
                    List<User> users = ldap.getUsers(titular.userNameAsignado);
                    user = users.get(0);
                    return user;
                }
            }
        }
        return user;
    }

}