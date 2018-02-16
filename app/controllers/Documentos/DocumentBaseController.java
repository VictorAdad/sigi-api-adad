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
import io.ebean.PagedList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.CompletionStage;
import java.util.Optional;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import models.BaseModel;
import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.Json;
import play.Logger;
import play.Logger.ALogger;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import play.mvc.BodyParser;
import java.io.File;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import models.Caso;
import core.util.utilities.JsonViews;
import core.ucm.UcmService;
import com.typesafe.config.Config;
import javax.inject.Inject;
import documentRepository.DocumentRepository;
import play.db.ebean.EbeanConfig;
import java.lang.reflect.Field;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class DocumentBaseController extends ResponseController {

    private final ALogger logger = Logger.of(this.getClass());
    public static final String CONTEXT = "Context error: \n";
    public static final String MSSLOGGER = "Information controller method : \n\t ";
    private static final String ERRORMSS = "Repository information exception error: ";
    public String controller;
    public final Object model;
    public final FormFactory formFactory;
    public final HttpExecutionContext httpExecutionContext;
    public final Class cls;

    @Inject 
    private Config configuration;

    @Inject 
    public EbeanConfig ebeanConfig;

    public DocumentBaseController(FormFactory formFactory,
                          Object model,
                          HttpExecutionContext httpExecutionContext) {
        this.model = model;
        this.formFactory = formFactory;
        this.httpExecutionContext = httpExecutionContext;
        this.cls = this.getModelBaseClass(this.model);
        this.controller = this.getClass().getCanonicalName();
    }

    public Class getModelBaseClass(Object model){
        Class obj = null;
        try{
            obj = (Class)this.model.getClass();
        }catch(Exception e){
            logger.error("No se pudo encontrar la clase de modelo.");
        }
        return obj;
    }


    @SuppressWarnings("unchecked")
    @BodyParser.Of(BodyParser.MultipartFormData.class)
    public <T> CompletionStage<Result> save(Long id) {
        logger.debug(MSSLOGGER + controller + "@save");
        List<Object> objectsSave = new ArrayList<Object>();
        List<String> objectsError = new ArrayList<String>();
        return supplyAsync(() -> {
            Form<T> form = formFactory.form(cls).bindFromRequest();
            if (form.hasErrors()) {
                return badRequest( this.errorContructor(form.errorsAsJson()) );
            } else {
                try {
                    Caso caso = Caso.find.byId(id);
                    UcmService ridc = new UcmService(configuration, null);
                    HashMap<String,Object> atributosDocumento = new HashMap<String,Object>();
                    HashMap<String,Object> atributosUCM = new HashMap<String,Object>();
                    atributosDocumento.put("xNIC",caso.nic);
                    atributosDocumento.put("xNUC",caso.nuc);
                    
                    logger.debug("\n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
                   
                    MultipartFormData data = request().body().asMultipartFormData();
                    List<FilePart> fileParts = data.getFiles();
                    Object object = form.get();
                    for (FilePart part : fileParts) {
                        if (part != null && !part.getFilename().equals("")) {
                            Field field = object.getClass().getField("id");
                            field.setAccessible(true);
                            field.set(object.getClass().cast(object), null);
                            field.setAccessible(false);
                            String[] extension = part.getFilename().split("\\.");
                            String fileName = extension[0];
                            logger.debug("File name:"+fileName);
                            atributosDocumento.put("xIdAplicacion", configuration.getString("Evomatik.idAplicacion"));
                            atributosUCM = ridc.checkIn((File)part.getFile(), fileName, part.getContentType(), extension[1], "DOC_ADD",atributosDocumento);
                            DocumentRepository documentRepository = new DocumentRepository(ebeanConfig, object.getClass());
                            object    = documentRepository.saveDocument(object, atributosUCM);
                            if (object != null)
                                objectsSave.add(documentRepository.copyObject(object));
                            else
                                objectsError.add(fileName);
                            
                        } 
                    }

                    JsonNode json = Json.newObject();
                    ((ObjectNode)json).set("saved", Json.toJson(objectsSave));
                    ((ObjectNode)json).set("error", Json.toJson(objectsError));
                    logger.debug("Data saved: "+ Json.prettyPrint(Json.toJson(objectsSave)));
                    logger.debug("Data error: "+ Json.prettyPrint(Json.toJson(objectsError)));
                    return created(
                            json
                        );

                } catch(Exception e) {
                    logger.error(CONTEXT, e);
                    String[] errorMessages = e.getMessage().split(": ");
                    return internalServerError(
                        this.errorContructor(
                            this.createError(errorMessages[0], errorMessages[1])
                        )
                    );
                }
            }
        }, httpExecutionContext.current());
    }
}
