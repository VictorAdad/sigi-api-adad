package core.util.storage;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Map;

import play.Logger;
import play.Logger.ALogger;


public final class LocalStorage{

    private final static ALogger logger = Logger.of("c.u.Storage");

    private static ArrayList<Storage> storages = new ArrayList<Storage>();

    public static Storage getStorage(String key){
        Storage storageObject = null;
        for (Storage storage: storages) {
            if(storage.getName().equals(key)){
                storageObject = storage;
            }
        }
        return storageObject;
    }

    public void removeStorage(Storage storage){
        storages.remove(storage);
    }

    public static Storage createStorage(String key){
        logger.debug("Creating storage...");
        Storage storageObject = null;
        if (!valid(key)) {
            storageObject = new Storage(key);
            storages.add(storageObject);
        }else{
            logger.debug("Error: Llave para crear Storage ya esta guardada");
        }
        return storageObject;
    }

    public static boolean valid(String key){
        boolean valid = false;
        for (Storage storage: storages) {
            if(storage.getName().equals(key)){
                valid = true;
            }
        } 
        return valid;
    }


}


