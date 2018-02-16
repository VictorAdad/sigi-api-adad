package core.util;

import core.util.*;
import play.mvc.*;
import play.libs.Json;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Response{

    public static String generateResponseJson(String status, String message){
        StringBuilder builder = new StringBuilder();
        builder.append("{\"estatus\": \""+status+"\",\"message\": \""+message+"\"}");
        return builder.toString();
    }

    public static ObjectNode generateResponseJson(String status, String message, String response, String errorCode){
        ObjectNode result = Json.newObject();
        result.put("status", status );
        if (!message.equals("")) {
          result.put("message", message ); 
        }
        if (status.equals("error")) {
          if (!errorCode.equals("")) {
            result.put("errorCode", errorCode ); 
          }  
        }

        result.put("response", response );
        return result;
    }


    public static ObjectNode generateResponseJson(String status, String message , ObjectNode response){
        ObjectNode result = Json.newObject();
        result.put("status", status );
        if (!message.equals("")) {
          result.put("message", message ); 
        }
        result.set("response", response );
        return result;
    }

    public static ObjectNode generateResponseJson(String status, String message , String response){
        ObjectNode result = Json.newObject();
        result.put("status", status );
        if (!message.equals("")) {
          result.put("message", message ); 
        }
        result.put("response", response );
        return result;
    }

    public static ObjectNode generateResponseJson(String status, String message , JsonNode response){
        ObjectNode result = Json.newObject();
        result.put("status", status );
        if (!message.equals("")) {
          result.put("message", message ); 
        }
        result.set("response", response );
        return result;
    }

    public static String generateErrorCode(String errorType, int code){
        String errorName = "";
        String errorCode = "";
        String error     = "";
        Map<String, String> errorMap = new TreeMap<String,String>();
        errorMap.put("WS_ERROR",                      "1000");
        errorMap.put("DATABASE_ERROR",                "2000");
        errorMap.put("LOGIN_ERROR",                   "3000");
        errorMap.put("REQUEST_ERROR",                 "4000");
        errorMap.put("SECURITY_ERROR",                "5000");
        errorMap.put("UNKNOWN_ERROR",                 "X0000");

        Iterator<String> it = errorMap.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            // Logger.debug("Clave: " + key + " -> Valor: " + map.get(key));
            if (errorType.equals(key)) {
               errorName = key;
               errorCode = errorMap.get(key);
            }
        }

        if (!errorName.equals("") && !errorCode.equals("")) {
            error = constructError(errorName, errorCode, Integer.toString(code) );
        }else{
            error = constructError("UNKNOWN_ERROR", errorMap.get("UNKNOWN_ERROR"), Integer.toString(code) );
        }
        return error;
    }

    public static String constructError(String name, String errorCode, String code) {
        String[] SYS_CODE = {StrLib.COMP_CODE, "0000"};
        String out = "";
        out = SYS_CODE[0]+"_"+name+"-"+SYS_CODE[1].toString()+"-"+errorCode+""+code;
        return out;
    }

    public static ObjectNode validateObject(Object o){
        if(o != null){
            return Response.generateResponseJson("Correcto", "Registro encontrado", Json.toJson(o));
        }else{
            return Response.generateResponseJson("error", "Registro no encontrado", "error", Response.generateErrorCode("DATABASE_ERROR", 1));
        }
    }

    public static JsonNode createError(String errorName, Object errorValue){
        JsonNode json = Json.newObject();
        ((ObjectNode)json).set(errorName, Json.toJson(errorValue) );
        return json;
    }
}