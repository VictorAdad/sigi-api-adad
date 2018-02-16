package core.ws;

import play.Logger;
import play.Logger.ALogger;
import play.mvc.*;
import play.libs.ws.*;
import play.libs.Json;
import java.util.concurrent.CompletionStage;
import java.util.Calendar;
import javax.inject.Inject;
import java.sql.Timestamp;
import java.util.function.Function;
import com.fasterxml.jackson.databind.JsonNode;

import core.util.storage.*;
import core.util.utilities.TimestampUtil;

/**
 *  Clase para reutilizar las funciones de WS de Play framework 2.5
 *  <p>
 *  Metodo para recolección de información a traves de un servicio en cualquier formato
 *  </p>
 *  @author Diego Matus - Gibrán Córdoba
 *  @since JDK 1.7
 *  @version 0.1
 *  @see <a href="https://www.playframework.com/documentation/2.5.x/JavaWS">JavaWS</a>  
 */
public class Ws{

    /*********************/
    /*    PROPERTIES     */
    /*********************/

    private final static ALogger logger = Logger.of(Ws.class);

    private final ALogger log = Logger.of(this.getClass());

    private static WSClient WS;

    private WSRequest request;

    private Integer timeOut = 5000;

    private String url;

    private String contentType = "application/json";

    CompletionStage<WSResponse> response;

    /*********************/
    /* SETTERS Y GETTERS */
    /*********************/

    public WSRequest getRequest(){
        return this.request;
    }

    public void setRequest(WSRequest request){
        this.request = request;
    }

    public String getUrl(){
        return this.url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public Integer getTimeOut(){
        return this.timeOut;
    }

    public void setTimeout(Integer timeOut){
        this.timeOut = timeOut;
    }

    public String getContentType(){
        return this.contentType;
    }

    public void setContentType(String contentType){
        this.contentType = contentType;
    }



    /*********************/
    /*    CONTRUCTORS    */
    /*********************/
    /**
     * Constructor method for ws
     * Method description:
     * 
     * @author Diego Matus - Gibrán Córdoba
     * @createdAt 2017-03-20
     * @updatedAt 2017-03-20
     * @since     JDK 1.7
     * @version   1.0
     */
    
    public Ws(){}

    /**
     * Constructor method for ws
     * Method description:
     * 
     * @author Diego Matus - Gibrán Córdoba
     * @createdAt 2017-03-20
     * @updatedAt 2017-03-20
     * @since     JDK 1.7
     * @version   1.0
     * @param     ws          [WSClient] Recibe el Cliente de WS de Play para poder usarlo.
     */
    @Inject
    public Ws(WSClient ws){
        this.WS = ws;
    }

    /**
     * Constructor method for ws
     * Method description:
     * 
     * @author Diego Matus - Gibrán Córdoba
     * @createdAt 2017-03-20
     * @updatedAt 2017-03-20
     * @since     JDK 1.7
     * @version   1.0
     * @param     ws          [WSClient] Recibe el Cliente de WS de Play para poder usarlo.
     * @param     url         [String] Recibe la Url del servicio que se requiera utilizar.
     */
    public Ws(String url){
        this.url = url;
    }

    /**
     * Constructor method for ws
     * Method description:
     * 
     * @author Diego Matus - Gibrán Córdoba
     * @createdAt 2017-03-20
     * @updatedAt 2017-03-20
     * @since     JDK 1.7
     * @version   1.0
     * @param     ws          [WSClient] Recibe el Cliente de WS de Play para poder usarlo.
     * @param     url         [String] Recibe la Url del servicio que se requiera utilizar.
     * @param     contentType [String] Contentype en el que se mandara la información, (Este campo tiene por default "application/json") 
     * @param     timeOut     [Integer] Numero de timeout esperado para el servicio en milisegundos(ex. 1000 = 1 Segundo)(Este campo tiene por default "4500")
     */
    public Ws(WSClient ws, String url, String contentType, Integer timeOut){
        contentType = (contentType != null) ? contentType : this.contentType;
        timeOut     = (timeOut != null) ? timeOut : this.timeOut;
        this.WS = ws;
        this.url = url;
        this.contentType = contentType;
        this.timeOut = timeOut;
    }

    /**
     * prepare method for WSRequest on WS Class
     * Method description:
     * @author Diego Matus - Gibrán Córdoba
     * @createdAt 2017-03-20
     * @updatedAt 2017-03-20
     * @since     JDK 1.7
     * @version   1.0
     * @return    [WSRequest] Retorna request con cabezeras de tiempo de espera y con timestamp de la envio
     */
    private WSRequest beforeSend(Integer timeOut, String url, String contentType)
    {
        timeOut     = (timeOut      != null) ? timeOut      : this.timeOut;
        contentType = (contentType  != null) ? contentType  : this.contentType;
        url         = (url          != null) ? url          : this.url;
        log.debug("url: "+url);  
        if (this.request == null) {
            this.request = WS.url(url);
        }
        
        return this.request
                    .setRequestTimeout(timeOut)
                    .setContentType(contentType)
                    .setHeader("Timestamp", new Timestamp(Calendar.getInstance().getTime().getTime()).toString());         
    }


    /**
     * make a get request to WS
     * Method description:
     * @author Diego Matus - Gibrán Córdoba
     * @createdAt 2017-03-20
     * @updatedAt 2017-03-20
     * @since     1.7
     * @version   1.0
     * @return                this will be returned
     */
    public Ws get()
    {
        //Logger.debug("Ws@get()");
        this.request  = this.beforeSend(null, null, null);
        this.response = this.request.get();
        return this;
    }

    /**
     * make a get request to WS
     * Method description:
     * @author Diego Matus - Gibrán Córdoba
     * @createdAt 2017-03-20
     * @updatedAt 2017-03-20
     * @since     1.7
     * @version   1.0
     * @param     uri         [String] set a url WS request
     * @return                this will be returned
     */
    public Ws get(String uri)
    {
        log.debug("Ws@get(uri)");
        this.request  = this.beforeSend(null, uri, null);
        this.response = this.request.get();
        return this;
    }

    /**
     * make a get request to WS
     * Method description:
     * @author Diego Matus - Gibrán Córdoba
     * @createdAt 2017-03-20
     * @updatedAt 2017-03-20
     * @since     1.7
     * @version   1.0
     * @param     uri         [String] set a url WS request
     * @param     contentType [String] set contentType to the request
     * @return                this will be returned
     */
    public Ws get(String uri, String contentType)
    {
        log.debug("Ws@get(uri, contentType)" + uri);
        this.request  = this.beforeSend(null, uri, contentType);
        this.response = this.request.get();
        return this;
    }


    public Ws post(String uri, String data, String contentType)
    {
        log.debug("Ws@post(uri, data, contentType) -> " + data);
        this.request  = this.beforeSend(null, uri, contentType);
        this.response = this.request.post(data);
        return this;
    }

    public Ws post(String uri, JsonNode data, String contentType)
    {
        log.debug("Ws@post(uri, data, contentType) -> " + data);
        this.request  = this.beforeSend(null, uri, contentType);
        this.response = this.request.post(data);
        return this;
    }

    public Ws post(JsonNode data){
        log.debug("Ws@post(data) -> " + data);
        this.request = this.beforeSend(null, null, null);
        this.response = this.request.post(data);
        return this;
    }

    public Ws post(String data){
        log.debug("Ws@post(data) -> " + data);
        this.request  = this.beforeSend(null, null, null);
        this.response = this.request.post(data);
        return this;
    }

    public Ws put(String uri, String data, String contentType)
    {
        log.debug("Ws@put(uri, data, contentType) -> ");
        log.debug("uri        -> "+uri);
        log.debug("data       -> "+data);
        log.debug("contentype -> "+contentType);
        this.request  = this.beforeSend(null, uri, contentType);
        this.response = this.request.put(data);
        return this;
    }

    public Ws put(String uri, JsonNode data, String contentType)
    {
        log.debug("Ws@put(uri, data, contentType) -> " + data);
        this.request  = this.beforeSend(null, uri, contentType);
        this.response = this.request.put(data);
        return this;
    }

    public Ws put(JsonNode data){
        log.debug("Ws@put(data) -> " + data);
        this.request = this.beforeSend(null, null, null);
        this.response = this.request.put(data);
        return this;
    }

    public Ws put(String data){
        log.debug("Ws@put(data) -> " + data);
        this.request  = this.beforeSend(null, null, null);
        this.response = this.request.put(data);
        return this;
    }

    public CompletionStage<?> done(Function <WSResponse, ?> function){
        return this.response.thenApply(function);
    }

    public Ws url(String url){
        log.debug("Ws@url(url) -> "+url);
        this.request = WS.url(url);
        return this;
    }

    public Ws setHeader(String name, String value){
        log.debug("Ws@setHeader(name, value) -> "+name+" "+value);
        this.request.setHeader(name, value);
        return this;
    }

    public Ws setContentTypeWS(String contentType){
        log.debug("Ws@setContentTypeWS(contentType) -> "+contentType);
        this.request.setContentType(contentType);
        return this;
    }

    public Ws setAuth(String user, String pass, WSAuthScheme auth){
        log.debug("Ws@setAuth(user, pass, auth) -> "+user+" "+pass);
        if (this.request == null) {
            this.request = WS.url(this.url);
        }
        this.request.setAuth(user, pass, auth);
        return this;
    }


    public static CompletionStage<?> getJson(String url, int timeout){
        logger.debug(" -> @getServiceJson... ");
        Ws request = new Ws(url);
        request.setTimeout(timeout);
        return request.get()
            .done((response) -> {
               return response.asJson();
            })
            .exceptionally(th -> {
                logger.error("error: " + th);
                return null;
            });
    }

    public static CompletionStage<?> getJson(String url){
        logger.debug(" -> @getServiceJson... ");
        Ws request = new Ws(url);
        request.setTimeout(60000);
        return request.get()
            .done((response) -> {
               return response.asJson();
            })
            .exceptionally(th -> {
                logger.error("error: " + th);
                return null;
            });
    }

    public static JsonNode serviceJson(String url, String storage, String store, Object prop, int duration){
        
        JsonNode nodes = null;
        JsonNode node = null;
        boolean validInterval = false;

        //new flow will be created to reused a LocalStorage. this method will reuse memory to share information between Services and LocalStorage.
        Storage storageObject = LocalStorage.getStorage(storage);
        Store<JsonNode> storeObject = storageObject.get(store);
        if (storageObject.get(store) == null) {
            storeObject = (Store<JsonNode>) storageObject.createStore(new Store<JsonNode>(store));
        }
        
        if (prop != null) {
            logger.debug("Serching object... ");    
            try{
                if (storeObject.get(JsonNode.class) != null) {
                    validInterval = TimestampUtil.validateInterval( TimestampUtil.now(), storeObject.getLastModified(), Long.valueOf(60 * 1000) );
                    logger.debug("Validating store update: "+ validInterval );
                    if (validInterval) {
                        logger.debug("get property from local storage... ");
                        nodes = storeObject.get(JsonNode.class);
                    }else{
                        logger.debug("renew store...Looking for on service...");
                        nodes = (JsonNode) Ws.getJson(url).toCompletableFuture().get();
                        if (nodes != null) {
                            logger.debug("Updating Storage...");
                            storeObject.add(nodes); 
                        }
                        
                    }
                }else{
                    logger.debug("store is undefined...Looking for on service...");
                    nodes = (JsonNode) Ws.getJson(url).toCompletableFuture().get();
                    if (nodes != null) {
                        // logger.debug("Updating Storage...");
                        // storeObject.add(nodes); 
                    }
                }   
                if (nodes == null) {
                    return Json.parse("{\"error\": \"Error al obtener nodo, no se pudo obtener información del servidor\"}");  
                }
            }catch(Exception e){
                logger.error("Error: "+e.getMessage());
                return Json.parse("{\"error\": \"Error al obtener nodo, error en el servidor.\"}");  
            }  
        }else{
            logger.debug("No Existe la propiedad a validar... ");
            return Json.parse("{\"error\": \"No existe la propiedad a validar\"}");
        }  
        return nodes; 
    }

    public static JsonNode serviceJson(String url, String storage, String store, int duration){
        
        JsonNode nodes = null;
        JsonNode node = null;
        boolean validInterval = false;

        //new flow will be created to reused a LocalStorage. this method will reuse memory to share information between Services and LocalStorage.
        Storage storageObject = LocalStorage.getStorage(storage);
        Store<JsonNode> storeObject = storageObject.get(store);
        if (storageObject.get(store) == null) {
            storeObject = (Store<JsonNode>) storageObject.createStore(new Store<JsonNode>(store));
        }
          
        try{
            if (storeObject.get(JsonNode.class) != null) {
                validInterval = TimestampUtil.validateInterval( TimestampUtil.now(), storeObject.getLastModified(), Long.valueOf(duration) );
                logger.debug("Validating store update: "+ validInterval );
                if (validInterval) {
                    logger.debug("get property from local storage... ");
                    nodes = storeObject.get(JsonNode.class);
                }else{
                    logger.debug("renew store...Looking for on service...");
                    nodes = (JsonNode) Ws.getJson(url, 60000).toCompletableFuture().get();
                    if (nodes != null) {
                        logger.debug("Updating Storage...");
                        storeObject.add(nodes); 
                    }
                    
                }
            }else{
                logger.debug("store is undefined...Looking for on service...");
                nodes = (JsonNode) Ws.getJson(url, 60000).toCompletableFuture().get();
                if (nodes != null) {
                    // logger.debug("Updating Storage...");
                    // storeObject.add(nodes); 
                }
            }   
            if (nodes == null) {
                return Json.parse("{\"error\": \"Error al obtener nodo, no se pudo obtener información del servidor\"}");  
            }
        }catch(Exception e){
            logger.error("Error: "+e.getMessage());
            return Json.parse("{\"error\": \"Error al obtener nodo, error en el servidor.\"}");  
        }   
        return nodes; 
    }


    /**
     *
     *  Ejemplo de Peticion con el WS para Json
     * 
     *  Ws request = new Ws(ws);
     *  request.setTimeout(10000);
     *  CompletionStage<Result> result = (CompletionStage<Result>) request.url("http://localhost:9000/reproceso-incidencias/list").get()
     *          .done((response) -> {
     *              Logger.debug(response.asJson() + "");
     *              return ok(response.asJson());
     *          })
     *          .exceptionally(th -> {
     *              // will be executed when there is an exception.
     *              Logger.debug("error: " + th.getMessage());
     *              return null;
     *          });
     *
     *
     *
     *  Ejemplo de Peticion con el WS para VIEW
     *  
     *  Ws request = new Ws(ws);
     *  request.setTimeout(10000);
     *  CompletionStage<Result> result = (CompletionStage<Result>) request.url("http://localhost:9000/reproceso-incidencias").get()
     *          .done((response) -> {
     *              Logger.debug(response.getBodyAsStream() + "");
     *              return ok(response.getBodyAsStream());
     *          })
     *          .exceptionally(th -> {
     *              // will be executed when there is an exception.
     *              Logger.debug("error: " + th.getMessage());
     *              return null;
     *          });
     *
     */


    // public JsonNode getAreaIncidencia(){
    //     JsonNode node = null;
    //     node = this.getArea(Ws.serviceJson(
    //             play.Configuration.root().getString("Evomatik.serviceBus.url")+"/api/area", 
    //             "priceShoes", 
    //             "areas-tipo-incidencia",
    //             this.area)
    //     ); 
    //     return node;   
    // }

}