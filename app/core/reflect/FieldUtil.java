package core.database.ebean;

import java.lang.reflect.Field;

public class FieldUtil{

    public FieldUtil(){}

    public static boolean validField(String fieldName, Class clzz){
        boolean valid = false;
        Field[] fields = clzz.getFields();
        for (Field f: fields) {
            if (f.getName().equals(fieldName)) {
                valid = true;
            }
        }
        return valid;
    }
    
}
