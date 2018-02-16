package core.util.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.UUID;

public final class StringUtil{
    
    public static String sanitify(String mensaje){
        mensaje = mensaje.replace("á", "&aacute;");
        mensaje = mensaje.replace("Á", "&Aacute;");
        mensaje = mensaje.replace("é", "&eacute;");
        mensaje = mensaje.replace("É", "&Eacute;");
        mensaje = mensaje.replace("í", "&iacute;");
        mensaje = mensaje.replace("Í", "&Iacute;");
        mensaje = mensaje.replace("ñ", "&ntilde;");
        mensaje = mensaje.replace("Ñ", "&Ntilde;");
        mensaje = mensaje.replace("ó", "&oacute;");
        mensaje = mensaje.replace("Ó", "&Oacute;");
        mensaje = mensaje.replace("ú", "&uacute;");
        mensaje = mensaje.replace("Ú", "&Uacute;");
        mensaje = mensaje.replace("¡", "&iexcl;");
        mensaje = mensaje.replace("¿", "&iquest;");
        mensaje = mensaje.replace("&", "&amp;");
        return mensaje;
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

    public static String generateId(){
        return UUID.randomUUID().toString();
    }

}