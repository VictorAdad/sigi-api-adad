package core.util.utilities;

import java.lang.StringBuilder;
import java.util.Map;
import java.util.Map.Entry;

public final class MapUtil{
    
    public static String print(Map <?, ?> map) {
        StringBuilder sb = new StringBuilder(128);
        sb.append("\n{\n");
        for (Entry<?,?> entry : map.entrySet()) {
            if (sb.length() > 3) {
                sb.append(", \n");
            }
            sb.append("\t"+entry.getKey()).append(" = ").append(entry.getValue());
        }
        sb.append("\n}\n");
        return sb.toString();
    }    

}
