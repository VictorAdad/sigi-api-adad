/*
 * Copyright (c) Evomatik software 2017
 *
 * Este codigo fue llevado a cabo por el equipo de evomatik
 * cualquier persona ajena a la compañia y/o del codigo fuente
 * que realize modificaciones o copie el siguiente codigo sera
 * acreditado para una sancion legal y monetaria.
 *
 */
package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.concurrent.CompletionStage;
import java.util.ArrayList;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.libs.Json;
import play.Logger.ALogger;
import play.Logger;
import play.mvc.Result;
import com.typesafe.config.Config;
import java.util.HashMap;
import java.util.List;
import play.db.ebean.EbeanConfig;
import javax.inject.Inject;
import play.data.FormFactory;
import java.lang.StringBuilder;
import java.io.File;

import models.DocAcuerdo;
import models.DocSolPreInspeccion;
import models.DocSolPreAcuerdo;
import models.DocPredenuncia;
import models.DocAcuerdo;
import models.DocSolPrePericial;
import models.DocEntrevista;
import models.DocFacultadNoInvestigar;
import models.DocNoEjercicioAccion;
import models.DocAcuerdo;
import models.DocSolPreReqInfo;
import models.DocSolPreRegistro;
import models.DocAcuerdo;
import models.DocSolPrePolicia;
import models.DocFacultadNoInvestigar;
import models.DocNoEjercicioAccion;
import models.DocSolPrePericial;
import models.DocFacultadNoInvestigar;
import models.DocNoEjercicioAccion;
import models.DocArchivoTemporal;
import core.ucm.UcmService;
import documentRepository.*;
import play.libs.ws.*;

import static java.util.concurrent.CompletableFuture.supplyAsync;


public class Documentos extends Controller 
{
    @Inject 
    private Config configuration;

    public final HttpExecutionContext httpExecutionContext;
    private final ALogger logger = Logger.of(this.getClass());

    @Inject 
    public EbeanConfig ebeanConfig;

    private final WSClient ws;

    @Inject
    public Documentos(HttpExecutionContext httpExecutionContext, Config configuration, WSClient ws) {
        this.configuration=configuration;
        this.httpExecutionContext = httpExecutionContext;
        this.ws  = ws;
    }
    
    public <T> CompletionStage<Result> save(Long id, String formato) {
        return supplyAsync(() -> {
            try {
                logger.debug("Intentando guardar el documento...");
                List<HashMap<String,Object>> atributosDocumento = new ArrayList<HashMap<String,Object>>(); // Atributos propios del formato
                HashMap<String,Object> atributosUCM = new HashMap<String,Object>(); // Atributos que devuelve content del documento
                UcmService ridc = new UcmService(configuration, ws);
                logger.debug("Conexión establecida con UCM");
                atributosDocumento = createMetadatos(atributosDocumento,id, formato);
                Object object = atributosDocumento.get(1).get("objectDocument");
                atributosDocumento.get(1).remove("objectDocument");
                atributosUCM = ridc.saveDocument(formato,atributosDocumento.get(0) );
                DocumentRepository documentRepository = new DocumentRepository(ebeanConfig, object.getClass());
                atributosUCM.putAll(atributosDocumento.get(1));
                object    = documentRepository.saveDocument(object, atributosUCM);
                logger.debug("Formato generado");
                if (object != null)
                    return created(
                        Json.toJson(object)
                    );
                else
                    return internalServerError(
                        this.errorContructor(
                            this.createError("internalServerError", "No se pudo almacenar el registro")
                        )
                    );
            } catch(Exception e) {
                // logger.error(CONTEXT, e);
                e.printStackTrace();
                String errorMessage = e.getMessage();
                return internalServerError(
                    this.errorContructor(
                        this.createError("internalServerError", errorMessage)
                    )
                );
            }
        }, httpExecutionContext.current());
    
    }

    public JsonNode errorContructor(JsonNode errors){
        JsonNode json = Json.newObject();
        logger.debug("Errors: "+ Json.prettyPrint(Json.toJson(errors)));
        ((ObjectNode)json).set("errors", errors);
        return json;
    }

    public JsonNode createError(String errorName, Object errorValue){
        JsonNode json = Json.newObject();
        ((ObjectNode)json).set(errorName, Json.toJson(errorValue) );
        return json;
    }

    // Método que devuelve los metadatos del formato
    public List<HashMap<String,Object>> createMetadatos(List<HashMap<String,Object>> atributos, Long id, String formato) throws Exception{
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>();
        HashMap<String,Object> atributoUCM = new HashMap<String,Object>();
        switch (formato) {
            case "F1_001":
            case "F1_002":
                SolicitudPreAcuerdoDocumentRepository solicitudPreAcuerdo = new SolicitudPreAcuerdoDocumentRepository(ebeanConfig);
                if(formato.equals("F1_001")){
                    atributosDocumento = solicitudPreAcuerdo.F1_001(id, configuration);
                } else if(formato.equals("F1_002")){ // "F1_002"
                    atributosDocumento = solicitudPreAcuerdo.F1_002(id, configuration);
                } 
                atributoUCM.put("solicitudPreAcuerdo",solicitudPreAcuerdo.findById(id));
                atributoUCM.put("objectDocument",new DocSolPreAcuerdo());
                break;
            case "F1_003":
            case "F1_004":
            case "F1_005":
                PredenunciaDocumentRepository preDenuncia = new PredenunciaDocumentRepository(ebeanConfig);
                if(formato.equals("F1_003")){
                    atributosDocumento = preDenuncia.F1_003(id, configuration);
                } else if(formato.equals("F1_004")){
                    atributosDocumento = preDenuncia.F1_004(id, configuration);
                } else if(formato.equals("F1_005")){
                    atributosDocumento = preDenuncia.F1_005(id, configuration);
                }
                atributoUCM.put("predenuncia",preDenuncia.findById(id));
                atributoUCM.put("objectDocument",new DocPredenuncia());
                break;
            case "F2_117":    
            case "F1_007": 
            case "F1_015_016":
            case "F2_138":
                AcuerdoDocumentRepository acuerdoDocument = new AcuerdoDocumentRepository(ebeanConfig);
                if(formato.equals("F1_007")){
                    atributosDocumento = acuerdoDocument.F1_007(id, configuration);
                } else if(formato.equals("F1_015_016")){
                    atributosDocumento = acuerdoDocument.F1_015_016(id, configuration);
                } else if(formato.equals("F2_138")){
                    atributosDocumento = acuerdoDocument.F2_138(id, configuration);                    
                } else if(formato.equals("F2_117")){
                    atributosDocumento = acuerdoDocument.F2_117(id, configuration);                  
                }
                atributoUCM.put("acuerdo",acuerdoDocument.findById(id));
                atributoUCM.put("objectDocument",new DocAcuerdo());
                break;
            case "F1_008":
                EntrevistaDocumentRepository entrevistaDocument = new EntrevistaDocumentRepository(ebeanConfig);
                atributosDocumento = entrevistaDocument.F1_008(id, configuration);
                atributoUCM.put("entrevista",entrevistaDocument.findById(id));
                atributoUCM.put("objectDocument",new DocEntrevista());
                break;
            case "F1_009":
            case "F1_010":
                SolicitudPrePericialDocumentRepository solicitudPrePericialDocument = new SolicitudPrePericialDocumentRepository(ebeanConfig);
                if(formato.equals("F1_009")){
                    atributosDocumento = solicitudPrePericialDocument.F1_009(id, configuration);
                } else if(formato.equals("F1_010")){
                    atributosDocumento = solicitudPrePericialDocument.F1_010(id, configuration);
                }
                atributoUCM.put("solicitudPrePericial",solicitudPrePericialDocument.findById(id));
                atributoUCM.put("objectDocument",new DocSolPrePericial());
                break;
            case "F1_011":
            case "F1_021":
                SolicitudPrePoliciaDocumentRepository solicitudPrePoliciaDocument = new SolicitudPrePoliciaDocumentRepository(ebeanConfig);
                if(formato.equals("F1_011")){
                    atributosDocumento = solicitudPrePoliciaDocument.F1_011(id, configuration);
                } else if(formato.equals("F1_021")){
                    atributosDocumento = solicitudPrePoliciaDocument.F1_021(id, configuration);
                }
                atributoUCM.put("solicitudPrePolicia",solicitudPrePoliciaDocument.findById(id));
                atributoUCM.put("objectDocument",new DocSolPrePolicia());
                break;
            case "F1_012":
                ArchivoTemporalDocumentRepository archivoTemporalDocument = new ArchivoTemporalDocumentRepository(ebeanConfig);
                atributosDocumento = archivoTemporalDocument.F1_012(id, configuration);
                atributoUCM.put("archivoTemporal",archivoTemporalDocument.findById(id));
                atributoUCM.put("objectDocument",new DocArchivoTemporal());
                break;
            case "F1_013":
                FacultadNoInvestigarDocumentRepository facultadNoInvestigarDocument = new FacultadNoInvestigarDocumentRepository(ebeanConfig);
                atributosDocumento = facultadNoInvestigarDocument.F1_013(id, configuration);
                atributoUCM.put("facultadNoInvestigar",facultadNoInvestigarDocument.findById(id));
                atributoUCM.put("objectDocument",new DocFacultadNoInvestigar());
                break;
            case "F1_014":
            case "F1_022":
                NoEjercicioAccionPenalDocumentRepository noEjercicioDocument = new NoEjercicioAccionPenalDocumentRepository(ebeanConfig);
                if(formato.equals("F1_014")){
                    atributosDocumento = noEjercicioDocument.F1_014(id, configuration);
                } else if(formato.equals("F1_022")){
                    atributosDocumento = noEjercicioDocument.F1_022(id, configuration);
                }
                atributoUCM.put("noEjercicioAccionPenal",noEjercicioDocument.findById(id));
                atributoUCM.put("objectDocument",new DocNoEjercicioAccion());
                break;
            case "F2_039":
            case "F1_020":
                SolicitudPreReqInfoDocumentRepository SolicitudPreReqInfo = new SolicitudPreReqInfoDocumentRepository(ebeanConfig);
                if(formato.equals("F2_039")){
                    atributosDocumento = SolicitudPreReqInfo.F2_039(id, configuration);
                } else if(formato.equals("F1_020")){
                    atributosDocumento = SolicitudPreReqInfo.F1_020(id, configuration);
                }
                atributoUCM.put("solicitudPreReqInfo",SolicitudPreReqInfo.findById(id));
                atributoUCM.put("objectDocument",new DocSolPreReqInfo());
                break;            
            case "F1_017":
            case "F2_063":
            case "F1_006":
            case "F1_019":
                SolicitudPreRegistroDocumentRepository SolicitudPreRegistro = new SolicitudPreRegistroDocumentRepository(ebeanConfig);
                if(formato.equals("F1_019")){
                    atributosDocumento = SolicitudPreRegistro.F1_019(id, configuration);
                } else if(formato.equals("F1_017")){
                    atributosDocumento = SolicitudPreRegistro.F1_017(id, configuration);
                } else if(formato.equals("F2_063")){
                    atributosDocumento = SolicitudPreRegistro.F2_063(id, configuration);
                } else if(formato.equals("F1_006")){
                    atributosDocumento = SolicitudPreRegistro.F1_006(id, configuration);
                } 
                atributoUCM.put("solicitudPreRegistro",SolicitudPreRegistro.findById(id));
                atributoUCM.put("objectDocument",new DocSolPreRegistro());
                break;
            case "F1_018":
                SolicitudPreInspeccionDocumentRepository SolicitudPreInspeccion = new SolicitudPreInspeccionDocumentRepository(ebeanConfig);
                atributosDocumento = SolicitudPreInspeccion.F1_018(id, configuration);
                atributoUCM.put("solicitudPreInspeccion",SolicitudPreInspeccion.findById(id));
                atributoUCM.put("objectDocument",new DocSolPreInspeccion());
                break;
            default:
                return null;

        }
        atributosDocumento.put("xIdAplicacion", configuration.getString("Evomatik.idAplicacion"));
        atributos.add(atributosDocumento);
        atributos.add(atributoUCM);
        return atributos;
    }

    public Result descargarDocumento(String uuidOracle, String contentType, String fileName, String tipo)
    {  
        File archivo = null;
        StringBuilder contenT = new StringBuilder(contentType);
        try {
            UcmService ridc = new UcmService(configuration, ws);
            int index = contentType.lastIndexOf("-");
            contenT.setCharAt(index, '/');
            archivo = ridc.getFile(uuidOracle, "latest",contentType,tipo);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        Result response = ok(archivo);
        response.as(contenT.toString());
        response().setHeader("Content-disposition","attachment; filename="+fileName);
        return response;
    }

}