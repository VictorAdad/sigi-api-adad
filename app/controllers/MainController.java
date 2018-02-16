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
import java.util.concurrent.CompletionStage;
import java.util.Optional;
import models.BaseModel;
import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.Json;
import play.Logger;
import java.lang.reflect.Method;
import play.Logger.ALogger;
import play.mvc.Controller;
import play.mvc.Result;

import core.util.utilities.JsonViews;
import core.reflect.MethodUtil;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class MainController extends ResponseController {

    private final ALogger logger    = Logger.of(this.getClass());
    public String controller        = this.getClass().getCanonicalName();
    public final String MSSLOGGER   = "Information controller method: \n\t ";
    private final String ERRORMSS   = this.getClass().getCanonicalName()+" has an exception error: \n\t";
    public final Object repository;
    public final FormFactory formFactory;
    public final HttpExecutionContext httpExecutionContext;
    public final Class cls;

    public MainController(FormFactory formFactory, Object repository, HttpExecutionContext httpExecutionContext) {
        this.repository = repository;
        this.formFactory = formFactory;
        this.httpExecutionContext = httpExecutionContext;
        this.cls = this.getModelBaseClass(this.repository);
    }

    public Class getModelBaseClass(Object repository){
        Class obj = null;
        try{
            obj = (Class) this.repository.getClass().getMethod("getClazz").invoke(this.repository);
        }catch(Exception e){
            logger.error("No se pudo encontrar la clase de modelo.");
        }
        return obj;
    }


    public <T> CompletionStage<Result> page(String methodName, Object[] params){
        logger.debug(MSSLOGGER + controller + "@page \n\t");
        return supplyAsync(() -> {
            try{
                Method method = MethodUtil.getMethod(this.repository, methodName, MethodUtil.getTypes(params));
                Object val = MethodUtil.invoker(this.repository,method, params);
                method = null;
                if (val instanceof PagedList){
                    PagedList<T> list = (PagedList<T>) val;
                    return ok(this.pageConstructor(list));
                }else{
                    logger.error(ERRORMSS, "Error no se pudo encontrar el metodo a ejecutar o no encontro un paginador");
                    return internalServerError(
                        this.errorContructor(
                            this.createError("internalServerError", "No se pudo concluir el procedimiento, contactar a sistemas")
                        )
                    );
                }
            }catch (Exception e) {
                logger.error(ERRORMSS, e);
                return internalServerError(
                    this.errorContructor(
                        this.createError("internalServerError", "Hubo un problema en el servidor")
                    )
                );
            }
        }, httpExecutionContext.current() );
    }

    public <T> CompletionStage<Result> page(String methodName, Object[] params, Class<?> view){
        logger.debug(MSSLOGGER + controller + "@page \n\t");
        return supplyAsync(() -> {
            try{
                Method method = MethodUtil.getMethod(this.repository, methodName, MethodUtil.getTypes(params));
                Object val =  MethodUtil.invoker(this.repository, method, params);
                method = null;
                if (val instanceof PagedList){
                    PagedList<T> list = (PagedList<T>) val;
                    return ok(this.pageConstructor(list, view));
                }else{
                    logger.error(ERRORMSS, "Error no se pudo encontrar el metodo a ejecutar o no encontro un paginador");
                    return internalServerError(
                        this.errorContructor(
                            this.createError("internalServerError", "No se pudo concluir el procedimiento, contactar a sistemas")
                        )
                    );
                }
            }catch (Exception e) {
                logger.error(ERRORMSS, e);
                return internalServerError(
                    this.errorContructor(
                        this.createError("internalServerError", "Hubo un problema en el servidor")
                    )
                );
            }
        }, httpExecutionContext.current() );
    }


    @SuppressWarnings("unchecked")
    public <T> CompletionStage<Result> get(String methodName, Object[] params){
        logger.debug(MSSLOGGER + controller + "@get \n\t");
        Method method = MethodUtil.getMethod(this.repository, methodName, MethodUtil.getTypes(params));
        Object val = MethodUtil.invoker(this.repository, method, params);
        method = null;
        return supplyAsync(() -> {
                if (val instanceof Optional){
                    Optional<Object> optional = (Optional<Object>) val;
                    logger.debug("optional information:  \n\t"+optional);
                    if(optional.isPresent())
                        return ok(Json.toJson(optional));
                    else
                        return notFound(
                            this.errorContructor(
                                this.createError("notFoundError", "No se encontró un registro")
                            )
                        );
                }else{
                    return internalServerError(
                        this.errorContructor(
                            this.createError("internalServerError", "No se pudo concluir el procedimiento, contactar a sistemas")
                        )
                    );
                }
        }, httpExecutionContext.current());
    }

    @SuppressWarnings("unchecked")
    public <T> CompletionStage<Result> get(String methodName, Object[] params, Class<?> view){
        logger.debug(MSSLOGGER + controller + "@get \n\t");
        Method method = MethodUtil.getMethod(this.repository, methodName, MethodUtil.getTypes(params));
        Object val = MethodUtil.invoker(this.repository, method, params);
        method = null;
        return supplyAsync(() -> {
                if (val instanceof Optional){
                    Optional<Object> optional = (Optional<Object>) val;
                    logger.debug("optional information:  \n\t"+optional);
                    if(optional.isPresent())
                        return ok(JsonViews.toJson(optional, view));
                    else
                        return notFound(
                            this.errorContructor(
                                this.createError("notFoundError", "No se encontró un registro")
                            )
                        );
                }else{
                    return internalServerError(
                        this.errorContructor(
                            this.createError("internalServerError", "No se pudo concluir el procedimiento, contactar a sistemas")
                        )
                    );
                }
        }, httpExecutionContext.current());
    }

    @SuppressWarnings("unchecked")
    public <T> CompletionStage<Result> save() {
        logger.debug(MSSLOGGER + controller + "@save");
        return supplyAsync(() -> {
            Form<T> form = formFactory.form(cls, BaseModel.SaveStep.class).bindFromRequest();
            Method methodSave   = MethodUtil.getMethod(this.repository, "save", new Class[] {Object.class});
            if (form.hasErrors()) {
                return badRequest( this.errorContructor(form.errorsAsJson()) );
            } else {
                logger.debug("\n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
                try {
                    Object object       = form.get();
                    object              = methodSave.invoke(repository, object);
                    form = null;
                    methodSave = null;
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
                    logger.error(ERRORMSS, e);
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

    @SuppressWarnings("unchecked")
    public CompletionStage<Result> delete(Long id) {
        logger.debug(MSSLOGGER + controller + "@delete \n\t id: "+ id);
        return supplyAsync(() -> {
            try {
                Method methodDelete = MethodUtil.getMethod(this.repository, "delete", new Class[] {Long.TYPE});
                Object val = methodDelete.invoke(repository, id); 
                methodDelete = null;
                if (val instanceof Optional){
                    Optional<Boolean> v = (Optional<Boolean>) val;
                    val = null;
                    if(v.get())
                        return ok(
                            this.createNode("message", "Registro eliminado de forma exitosa")
                        );
                    else
                        return notFound(
                            this.errorContructor(
                                this.createError("notFoundError", "No se encontró un registro con el id: " + id)
                            )
                        );
                }else{
                    return internalServerError(
                        this.errorContructor(
                            this.createError("internalServerError", "No se pudo eliminar el objeto, contactar a sistemas")
                        )
                    );
                }
            }catch(Exception e) {
                logger.error(ERRORMSS, e);
                return internalServerError(
                    this.errorContructor(
                        this.createError("internalServerError", "El registro tiene relación con otros registros, contactar a sistemas")
                    )
                );
            }
        }, httpExecutionContext.current());
    }

    @SuppressWarnings("unchecked")
    public <T> CompletionStage<Result> update(Long id){
        logger.debug(MSSLOGGER + controller + "@update \n\t id: " + id );
        return supplyAsync(() -> {
            try {
                Form<T> form = formFactory.form(cls, BaseModel.UpdateStep.class).bindFromRequest();
                logger.debug(" \n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
                Method methodUpdate = MethodUtil.getMethod(this.repository, "update", new Class[] {Long.TYPE, Object.class});
                Object val = methodUpdate.invoke(repository, id, form.get());
                form = null;
                methodUpdate = null;
                if (val instanceof Optional) {
                    Optional<Object> data = (Optional<Object>) val;
                    if(data.isPresent())
                        return ok(
                            Json.toJson(data)
                        );
                    else
                        return notFound(
                            this.errorContructor(
                                this.createError("notFoundError", "No se encontró un registro con el id: " + id)
                            )
                        );
                }else{
                    return internalServerError(
                        this.errorContructor(
                            this.createError("internalServerError", "No se pudo concluir el procedimiento, contactar a sistemas")
                        )
                    );
                }
            } catch(Exception e) {
                logger.error(ERRORMSS, e);
                String[] errorMessages = e.getMessage().split(": ");
                return badRequest(Json.parse(errorMessages[1]));
            }
        }, httpExecutionContext.current());
     }


    @SuppressWarnings("unchecked")
    public <T> CompletionStage<Result> list(String methodName, Object[] params){
        logger.debug(MSSLOGGER + controller + "@list \n\t");
        Method method = MethodUtil.getMethod(this.repository, methodName, MethodUtil.getTypes(params));
        return supplyAsync(() -> {
            Object list = MethodUtil.invoker(this.repository, method, params);
            if (list != null)
                return ok(
                    Json.toJson(list)
                );
            else
                return notFound(
                    this.errorContructor(
                        this.createError("notFoundError", "No se encontraron registros.")
                    )
                );
        }, httpExecutionContext.current() );
    }


    @SuppressWarnings("unchecked")
    public <T> CompletionStage<Result> exec(String methodName, Object[] params){
        logger.debug(MSSLOGGER + controller + "@execute \n\t");
        return supplyAsync(() -> {
            Method method = MethodUtil.getMethod(this.repository, methodName, MethodUtil.getTypes(params));
            Object object = MethodUtil.invoker(this.repository, method, params);
            method = null;
            if (object != null)
                return ok(
                    Json.toJson(object)
                );
            else
                return notFound(
                    this.errorContructor(
                        this.createError("notFoundError", "No se encontro el objeto esperado.")
                    )
                );
        }, httpExecutionContext.current() );
    }



}
