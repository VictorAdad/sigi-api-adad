package core.util.utilities;

import java.sql.Timestamp;

import play.Logger;
import play.Logger.ALogger;


public final class TimestampUtil{

    private final static ALogger logger = Logger.of("c.u.Utilities");
    
    public static Long getInterval(Timestamp t1, Timestamp t2){
        return t1.getTime() - t2.getTime();
    }

    public static Timestamp now(){
        return new Timestamp(System.currentTimeMillis());
    }

    public static Timestamp create(Long time){
        return new Timestamp(time);
    }

    public static boolean validateInterval(Timestamp t1, Timestamp t2, Long interval){
        boolean valid = false;
        Long timeInterval = getInterval(t1, t2);
        logger.debug("timeInterval: "+timeInterval);
        if (timeInterval < interval) {
            valid = true;
        }
        return valid;
    }
}