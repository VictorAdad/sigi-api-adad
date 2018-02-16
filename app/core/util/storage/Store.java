package core.util.storage;

import java.util.ArrayList;
import java.sql.Timestamp;
import core.util.utilities.TimestampUtil;

import play.Logger;
import play.Logger.ALogger;

public class Store<T>{

    private ALogger logger = Logger.of("c.u.Storage");

    private String name;

    private ArrayList<T> versions = new ArrayList<T>();

    private T value;

    private Timestamp created = TimestampUtil.now();

    private Timestamp lastModified = TimestampUtil.now();

    public Store(String name, T value){
        this.name = name;
        this.value = value;
        this.add(this.value);
    }

    public Store(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public <T> T get(Class<T> clazz){
        return (T) clazz.cast(this.value);
    }

    public Store update(T value){
        this.versions.add(this.value);
        this.value = value;
        this.lastModified = TimestampUtil.now();
        return this;
    }

    public Store add(T value){
        this.value = value;
        this.versions.add(this.value);
        this.created = TimestampUtil.now();
        this.lastModified = TimestampUtil.now();
        return this;
    }

    public void empty(){
        this.value = null;
        this.versions = null;
    }

    public void restore(){
        this.value    = this.versions.get(0);
        this.versions   = new ArrayList<T>();
        this.versions.add(this.value);
    }

    public void rollback(){
        this.value    = this.versions.get(this.versions.size() - 2);
        this.versions.remove(this.versions.size() - 1);
    }

    public Timestamp getLastModified(){
        return lastModified;
    }

    public Timestamp getCreated(){
        return created;
    }
    
}