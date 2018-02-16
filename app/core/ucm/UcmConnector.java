package core.ucm;

import com.typesafe.config.Config;
import play.Logger;
import java.util.HashMap;
import java.util.List;
import java.io.File;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import oracle.stellent.ridc.IdcClient;
import oracle.stellent.ridc.IdcClientManager;
import oracle.stellent.ridc.IdcContext;
import oracle.stellent.ridc.model.DataBinder;
import oracle.stellent.ridc.model.DataObject;
import oracle.stellent.ridc.model.DataResultSet;
import oracle.stellent.ridc.model.TransferFile;
import oracle.stellent.ridc.protocol.ServiceResponse;
import oracle.stellent.ridc.IdcClientException;

import java.util.Hashtable;

public class UcmConnector{

    private Config configuration;
    
    //arguments needs to connect to UCM
    private String idcConnectionURL = "";

    private String username = "";

    private String password = "";

    private IdcClient client;

    private IdcContext userContext;

    public void setClient(IdcClient client){
        this.client = client;
    }

    public IdcClient getClient(){
        return this.client;
    }

    public void setUserContext(IdcContext userContext){
        this.userContext = userContext;
    }

    public IdcContext getUserContext(){
        return this.userContext;
    }

    public UcmConnector(Config configuration) {
        this.configuration=configuration;
        idcConnectionURL = configuration.getString("Evomatik.ucm.url");// "idc://10.0.30.10:4444"
        username = configuration.getString("Evomatik.ucm.username"); // "adminWS"
        password = configuration.getString("Evomatik.ucm.password"); // "DEVevomatik!"
    }

    public void connect() throws Exception{
        IdcClientManager clientManager = new IdcClientManager ();
        client = clientManager.createClient(idcConnectionURL);
        client.getConfig().setSocketTimeout(configuration.getInt("Evomatik.ucm.socketTimeout")); // 30 seconds
        client.getConfig().setConnectionSize(configuration.getInt("Evomatik.ucm.connectionSize")); // 20 connections
        userContext = new IdcContext(username, password);
    }

}
