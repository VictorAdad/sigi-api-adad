package database;

import play.Logger;
import play.Configuration;

public class Queries{

    public static String date(String column)
    {
        String q =  "";
        if(play.Configuration.root().getString("Evomatik.db").equals("oracle")){
            q = "trunc("+column+")";
        }else if(play.Configuration.root().getString("Evomatik.db").equals("mysql")){
            q = column;
        }else{
            Logger.error("=> Base de Datos Incorrecta D: "+play.Configuration.root().getString("Evomatik.db"));
        }
        return q;
    }

    public static String date(String column, Configuration conf)
    {
        String q =  "";
        if(conf.getString("Evomatik.db").equals("oracle")){
            q = "trunc("+column+")";
        }else if(conf.getString("Evomatik.db").equals("mysql")){
            q = column;
        }else{
            Logger.error("=> Base de Datos Incorrecta D: "+conf.getString("Evomatik.db"));
        }
        return q;
    }

    public static String concat(String[] columns)
    {
        Logger.info("=> DB CONCAT()");
        Logger.debug("=> ARRAY "+columns.length);
        String q    = "";
        if(play.Configuration.root().getString("Evomatik.db").equals("oracle")){
            String list = "";
            for (int i = 0; i < columns.length; i++){
                if (i+1 != columns.length){
                    list += columns[i]+" || ";
                }else{
                    list += columns[i];
                } 
                    
            }
            q = list;
        }else if(play.Configuration.root().getString("Evomatik.db").equals("mysql")){
            String list = "";
            for (int i = 0; i < columns.length; i++){
                if (i+1 != columns.length){
                    list +=  columns[i]+", ";
                }else{
                    list += columns[i];
                } 
                    
            }
            q = "concat("+list+")";
        }else{
            Logger.error("=> Base de Datos Incorrecta D: "+play.Configuration.root().getString("Evomatik.db"));
        }
        Logger.debug("q"+q);
        return q;
    }
}