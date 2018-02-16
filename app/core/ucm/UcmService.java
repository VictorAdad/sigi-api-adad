package core.ucm;


import com.typesafe.config.Config;
import play.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.io.File;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import core.util.word.ParserWord;

import oracle.stellent.ridc.IdcClient;
import oracle.stellent.ridc.IdcClientManager;
import oracle.stellent.ridc.IdcContext;
import oracle.stellent.ridc.model.DataBinder;
import oracle.stellent.ridc.model.DataObject;
import oracle.stellent.ridc.model.DataResultSet;
import oracle.stellent.ridc.model.TransferFile;
import oracle.stellent.ridc.protocol.ServiceResponse;
import oracle.stellent.ridc.IdcClientException;

import play.libs.ws.*;
import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSBodyReadables;

import core.util.utilities.FileUtil;

public class UcmService implements WSBodyReadables{

    private UcmConnector conn;

    private Config configuration;

    private String pathTem = "";

    private String urlWs = "";

    private final WSClient ws;

    public UcmService(Config configuration, WSClient ws) throws Exception{
        this.conn = new UcmConnector(configuration);
        conn.connect();
        pathTem = configuration.getString("Evomatik.paths.temFiles");
        urlWs = configuration.getString("Evomatik.wsDoc.url");
        this.ws = ws;
    }

    // Crear formato F1
    public HashMap<String, Object> saveDocument( String formato, HashMap<String, Object> atributosDocumento ) throws Exception {                
        //obtener plantilla desde content
        ServiceResponse response = getFile(formato);
        InputStream stream = response.getResponseStream();

        if(stream==null){
            Logger.error("No se pudo obtener la plantilla "+formato);
            throw new Exception("No se pudo obtener la plantilla "+formato);
        }
        
        Logger.debug("Se obtiene la plantilla "+formato); 
        //reemplazar los metadatos en el .docx
        byte[] bytesDocumentoFinal = ParserWord.parsingDocument(stream,atributosDocumento);
        
        if(bytesDocumentoFinal==null){
            Logger.error("No se pudo crear el documento final");  
            throw new Exception("No se pudo crear el .docx de la plantilla "+formato);  
        } 

        response.close();
        
        //Almecena el .docx en UCM
        HashMap<String, Object> atributosDoc = checkIn(bytesDocumentoFinal, formato ,atributosDocumento);
       
        return atributosDoc;
    }

    
    public ServiceResponse getFile(String ddocname) throws Exception {
        
        //Executing a Service Request
        // get the binder
        DataBinder binder = conn.getClient().createBinder();
        binder.putLocal ("IdcService", "GET_FILE");
        binder.putLocal ("dDocName", ddocname );
        binder.putLocal ("Rendition", "Primary"); // Primary trae docx
        binder.putLocal ("RevisionSelectionMethod", "LatestReleased");
       
        ServiceResponse response = conn.getClient().sendRequest (conn.getUserContext(), binder);
        
        if (response.getResponseType().equals(ServiceResponse.ResponseType.BINDER))
        {
            DataBinder responseBinder = response.getResponseAsBinder(false); // do not check for errors
            int statusCode = responseBinder.getLocalData().getInteger("StatusCode");
            String statusMessage = responseBinder.getLocal ("StatusMessage");
            response.close();
            throw new IllegalStateException("Download response was not a stream - Error: " + statusCode + " - " + statusMessage);
        }else{
            return response;
        }
                 
    }

    public File getFile(String ddocname, String version, String extension, String tipo){
        try{
            //Executing a Service Request
            // get the binder
            DataBinder binder = conn.getClient().createBinder();
            binder.putLocal ("IdcService", "GET_FILE");
            binder.putLocal ("dDocName", ddocname);
            binder.putLocal ("Rendition", "Primary");// Archivo nativo
            binder.putLocal ("RevisionSelectionMethod", version);
            ServiceResponse response = conn.getClient().sendRequest (conn.getUserContext(), binder); 
            
            if (response.getResponseType().equals(ServiceResponse.ResponseType.BINDER))
            {
                DataBinder responseBinder = response.getResponseAsBinder(false); // do not check for errors
                int statusCode = responseBinder.getLocalData().getInteger("StatusCode");
                String statusMessage = responseBinder.getLocal ("StatusMessage");
                response.close();
                throw new IllegalStateException("Download response was not a stream - Error: " + statusCode + " - " + statusMessage);
            }else{
                //path de archivos temporales
                File out = File.createTempFile(pathTem+ddocname+"_"+version, extension);
                InputStream fis = response.getResponseStream();
                FileOutputStream fos = new FileOutputStream(out);

                Logger.debug("Downloading File..."+ddocname);

                byte[] readData = new byte[1024];
                    int j = fis.read(readData);
                    while (j != -1){
                        fos.write(readData, 0, j);
                        j = fis.read(readData);
                    } 

                fis.close();
                fos.close();
                response.close();
                Logger.debug("File Downloaded");
                return out;
            }
            
        }catch(Exception e){
            Logger.error("Error al descargar documento, "+e.getMessage());
            //e.printStackTrace();
        }

        return null;
    
    }


    // CheckIn para formatos
    public HashMap<String, Object> checkIn(byte[] bytesContent,String formato ,HashMap<String,Object> atributosDocumento ) throws Exception{
           
        //Executing a Service Request
        // get the binder
        DataBinder binder = conn.getClient().createBinder();
        //obligatorios
        binder.putLocal ("IdcService", "CHECKIN_UNIVERSAL");            
        binder.putLocal ("dDocType", "Document");
        binder.putLocal ("dSecurityGroup", "Secure");        
        binder.putLocal ("dDocAccount", "");
        //metadato de perfil
        binder.putLocal ("xIdcProfile", formato); // F1_001, F1_002, F1_003, F1_004, F1_005, 
        binder.putLocal ( "dDocTitle" ,  (String) atributosDocumento.get("dDocTitle") );

        String[] metadatos = {"xVictima","xHechoDelictivo","xImputado","xNIC","xNUC","xIdAplicacion"};
  
        //extras
        for(String metadato: metadatos){
            if(atributosDocumento.containsKey(metadato)){
                binder.putLocal ( metadato ,  (String) atributosDocumento.get(metadato) );
            }
        }
        // for(String key: atributosDocumento.keySet() ){
        //     binder.putLocal ( key ,  (String) atributosDocumento.get(key) );    
        // }

        // WS Documento
        // Logger.debug("-> " + FileUtil.getDocumentBase64(bytesContent));
        JsonNode json = Json.newObject().put("docWord", FileUtil.getDocumentBase64(bytesContent));
        String url = this.urlWs + "/SIGISBP/ConvertPDFRestService";
        Logger.debug("La url del WS es: " + url);
        CompletionStage<JsonNode> rsp = this.ws.url(url)
                                        .setContentType("application/json")
                                        .post(json)
                                        .thenApply(r -> r.getBody(json()));
        JsonNode jsonResponse = rsp.toCompletableFuture().get();
        if( !jsonResponse.hasNonNull("return") || 
            !jsonResponse.get("return").get("responseCode").asText().equals("1") ||
            jsonResponse.get("return").get("pdfBytes").asText().isEmpty()){
            Logger.error("--> Error (response del servicio de transformación): "+jsonResponse);
            throw new Exception("Error en el response del servicio de transformación a PDF: "+jsonResponse.get("return").get("responseMessage").asText());
        }
        String fileStr = jsonResponse.get("return").get("pdfBytes").asText();
        // Logger.debug("-> "+fileStr);
        File file = FileUtil.getFileFromBase64(fileStr, ".pdf");

        // //archivo
        TransferFile primaryFile = new TransferFile(file);
        primaryFile.setFileName(formato+".pdf");
        // primaryFile.setContentType(contentType);
        binder.addFile("primaryFile", primaryFile);
        
        // ejecución de servicio
        ServiceResponse response = conn.getClient().sendRequest(conn.getUserContext(), binder);
        
        //obtener respuesta
        DataBinder dataBinder = response.getResponseAsBinder();
        
        //imprimir respuesta
        Logger.debug( dataBinder.getLocal("Formato"+formato+" generado en content ...") );
        Logger.debug( dataBinder.getLocal("StatusMessage") );
        Logger.debug( dataBinder.getLocal("StatusCode") );
        Logger.debug( dataBinder.getLocal("dDocName") );

        // bais.close();
        
        // Información que se va a almacenar en base de datos
        HashMap<String, Object> valoresContent = new HashMap<String, Object>();
        valoresContent.put("nameEcm", dataBinder.getLocal("dDocTitle"));
        valoresContent.put("pathEcm", null);
        valoresContent.put("uuidEcm", dataBinder.getLocal("dDocName"));
        valoresContent.put("contentType", "application/pdf");
        valoresContent.put("extension", "pdf");
        valoresContent.put("tipo", "Formato");

        response.close();
        return valoresContent;
        
    }

    // CheckIn para documentos adjuntos
    public HashMap<String, Object> checkIn(File file,String fileName,String contentType, String extension, String formato ,HashMap<String,Object> atributosDocumento ) throws Exception{
           
        //Executing a Service Request
        // get the binder
        DataBinder binder = conn.getClient().createBinder();
        //obligatorios
        binder.putLocal ("IdcService", "CHECKIN_UNIVERSAL");            
        binder.putLocal ("dDocTitle", fileName);
        binder.putLocal ("dDocType", "Document");
        binder.putLocal ("dSecurityGroup", "Secure");        
        binder.putLocal ("dDocAccount", "");
        
        //metadato de perfil
        binder.putLocal ("xIdcProfile", formato); // F1_001, F1_002, F1_003, F1_004, F1_005, 
        
        //extras
        for(String key: atributosDocumento.keySet() ){
            binder.putLocal ( key ,  (String) atributosDocumento.get(key) );    
        }
        
        //archivo
        // binder.addFile("primaryFile", file);
        TransferFile primaryFile = new TransferFile(file);
        primaryFile.setFileName(fileName+"."+extension);
        primaryFile.setContentType(contentType);
        binder.addFile("primaryFile", primaryFile);
        
        // ejecución de servicio
        ServiceResponse response = conn.getClient().sendRequest(conn.getUserContext(), binder);
        
        //obtener respuesta
        DataBinder dataBinder = response.getResponseAsBinder();
        
        //imprimir respuesta
        Logger.debug( dataBinder.getLocal("Formato"+formato+" generado en content ...") );
        Logger.debug( dataBinder.getLocal("StatusMessage") );
        Logger.debug( dataBinder.getLocal("StatusCode") );
        Logger.debug( dataBinder.getLocal("dDocName") );


        HashMap<String, Object> valoresContent = new HashMap<String, Object>();
        valoresContent.put("nameEcm", dataBinder.getLocal("dDocTitle"));
        valoresContent.put("pathEcm", null);
        valoresContent.put("uuidEcm", dataBinder.getLocal("dDocName"));
        valoresContent.put("contentType", contentType);
        valoresContent.put("extension", extension);
        valoresContent.put("tipo", "Documento");

        response.close();
        return valoresContent;
        
    }

    
}
