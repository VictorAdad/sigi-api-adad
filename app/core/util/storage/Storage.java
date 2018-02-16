package core.util.storage;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Map;

import play.Logger;
import play.Logger.ALogger;

public class Storage{

    private ALogger logger = Logger.of("c.u.Storage");

    private String name;

    private ArrayList<Store<?>> stores = new ArrayList<Store<?>>();

    public Storage(String key){
        this.name = key;
    }

    public String getName(){
        return this.name;
    }

    public Store get(String key){
        //System.out.println("Getting store: "+key);
        //System.out.println("Current stores: "+this.stores.size());
        Store<?> object = null;
        for(Store store: this.stores) {
            //System.out.println("Current store: "+store.getName());
            if(store.getName().equals(key)){
                logger.debug("Equals store key...returning object: "+store);
                object = store;
            }
        }
        return object;  
    }

    public Store<?> createStore(Store<?> store){
        //System.out.println("Creating store");
        if (!valid(store.getName())) {
            logger.debug("add store to the list...");
            this.stores.add(store);
            return store;
        }else{
            logger.debug("Error: Llave para crear Store ya esta guardada");
            return null;
        }  
    }

    public void removeStore(Store<?> store){
        this.stores.remove(store);
    }

    public boolean valid(String key){
        logger.debug("Validating key: "+key);
        boolean valid = false;
        for (Store store: this.stores) {
            if(store.getName().equals(key)){
                valid = true;
            }
        } 
        logger.debug("Valid value "+valid);
        return valid;
    }

    
}