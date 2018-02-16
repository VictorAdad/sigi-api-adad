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
import models.BaseModel;
import javax.persistence.PersistenceException;
import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.Json;
import play.Logger;
import play.Logger.ALogger;
import play.mvc.Controller;
import play.mvc.Result;
import play.cache.AsyncCacheApi;
import akka.Done;
import models.Caso;
import core.util.utilities.JsonViews;
import com.typesafe.config.Config;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class BaseController extends ResponseController {

    private final ALogger logger = Logger.of(this.getClass());
    public static final String CONTEXT = "Context error: \n";
    public static final String MSSLOGGER = "Information controller method : \n\t ";
    private static final String ERRORMSS = "Repository information exception error: ";
    public String controller;
    public final Object repository;
    public final FormFactory formFactory;
    public final HttpExecutionContext httpExecutionContext;
    public final Class cls;
    private AsyncCacheApi cache;
    private Config configuration;

    public BaseController(FormFactory formFactory,
                          Object repository,
                          HttpExecutionContext httpExecutionContext,
                          AsyncCacheApi cache) {
        this.repository = repository;
        this.formFactory = formFactory;
        this.httpExecutionContext = httpExecutionContext;
        this.cache = cache;
        this.cls = this.getModelBaseClass(this.repository);
        this.controller = this.getClass().getCanonicalName();
    }

    public BaseController(FormFactory formFactory,
                          Object repository,
                          HttpExecutionContext httpExecutionContext,
                          AsyncCacheApi cache,
                          Config configuration) {
        this.repository = repository;
        this.formFactory = formFactory;
        this.httpExecutionContext = httpExecutionContext;
        this.cache = cache;
        this.cls = this.getModelBaseClass(this.repository);
        this.controller = this.getClass().getCanonicalName();
        this.configuration = configuration;
    }

    public BaseController(FormFactory formFactory,
                          Object repository,
                          HttpExecutionContext httpExecutionContext) {
        this.repository = repository;
        this.formFactory = formFactory;
        this.httpExecutionContext = httpExecutionContext;
        this.cls = this.getModelBaseClass(this.repository);
        this.controller = this.getClass().getCanonicalName();
    }

    public BaseController(FormFactory formFactory,
                          Object repository,
                          HttpExecutionContext httpExecutionContext,
                          Config configuration) {
        this.repository = repository;
        this.formFactory = formFactory;
        this.httpExecutionContext = httpExecutionContext;
        this.cls = this.getModelBaseClass(this.repository);
        this.controller = this.getClass().getCanonicalName();
        this.configuration = configuration;
    }

    public Class getModelBaseClass(Object repository){
        Class obj = null;
        try{
            obj = (Class)this.repository.getClass().getMethod("getClazz").invoke(this.repository);
        }catch(Exception e){
            logger.error("No se pudo encontrar la clase de modelo.");
        }
        return obj;
    }

    public CompletionStage<Result> page(int p, String sortBy, String order, String filter, int tr) {
        logger.debug(MSSLOGGER + controller + "@page \n\t");
        return supplyAsync(() -> {
            try{
                Method methodPage = this.getMethod("page", new Class[] {
                    Integer.TYPE,
                    Integer.TYPE,
                    String.class,
                    String.class,
                    String.class
                });

                PagedList<?> list = (PagedList<?>) methodPage.invoke(repository, p, tr, sortBy, order, filter);
                methodPage = null;
                return ok(this.pageConstructor(list));
            }catch (Exception e) {
                logger.error(ERRORMSS, e);
                return internalServerError(
                    this.errorContructor(
                        this.createError("internalServerError", "Hubo un problema en el servidor")
                    )
                );
            }
        }, httpExecutionContext.current());
    }

    public CompletionStage<Result> page(int p, String sortBy, String order, String filter, int tr, Class<?> view) {
        logger.debug(MSSLOGGER + controller + "@page \n\t");
        return supplyAsync(() -> {
            try{
                Method methodPage = this.getMethod("page", new Class[] {
                    Integer.TYPE,
                    Integer.TYPE,
                    String.class,
                    String.class,
                    String.class
                });

                PagedList<?> list = (PagedList<?>) methodPage.invoke(repository, p, tr, sortBy, order, filter);
                methodPage = null;
                return ok(this.pageConstructor(list, view));
            }catch (Exception e) {
                logger.error(ERRORMSS, e);
                return internalServerError(
                    this.errorContructor(
                        this.createError("internalServerError", "Hubo un problema en el servidor")
                    )
                );
            }
        }, httpExecutionContext.current());
    }

    public <T> CompletionStage<Result> page(String methodName, Object[] params){
        logger.debug(MSSLOGGER + controller + "@page \n\t");
        return supplyAsync(() -> {
            try{
                Method method = this.getMethod(methodName, this.getTypes(params));
                Object val = this.invoker(method, params);
                method = null;
                if (val instanceof PagedList){
                    PagedList<?> list = (PagedList<?>) val;
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
                Method method = this.getMethod(methodName, this.getTypes(params));
                Object val = this.invoker(method, params);
                method = null;
                if (val instanceof PagedList){
                    PagedList<?> list = (PagedList<?>) val;
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
    public <T> CompletionStage<Result> get(Long id){
        logger.debug(MSSLOGGER + controller + "@get \n\t id: "+ id);
        return supplyAsync(() -> {
            try{
                Method methodGet = this.getMethod("get", new Class[] {Long.TYPE});
                Object val = methodGet.invoke(repository, id);
                methodGet = null;
                if (val instanceof Optional){
                    Optional<Object> optional = (Optional<Object>) val;
                    if(!optional.isPresent())
                        return notFound(
                            Json.parse("{\"error\":\"No exite un registro con id " + id + ".\",\"estatus\":\"404\"}")
                        );

                    Form<T> form = formFactory.form(cls.getSuperclass()).fill(optional.get());
                    return ok(Json.toJson(form.get()));
                }else{
                    return internalServerError(
                        this.errorContructor(
                            this.createError("internalServerError", "No se pudo concluir el procedimiento, contactar a sistemas")
                        )
                    );
                }
            }catch(Exception e){
                logger.error(CONTEXT, e);
                return internalServerError(
                    this.errorContructor(
                        this.createError("internalServerError", "Error al procesar la información")
                    )
                );
            }
        }, httpExecutionContext.current());
    }

    @SuppressWarnings("unchecked")
    public <T> CompletionStage<Result> get(Long id, Class clz){
        logger.debug(MSSLOGGER + controller + "@get \n\t id: "+ id);
        return supplyAsync(() -> {
            try{
                Method methodGet = this.getMethod("get", new Class[] {Long.TYPE});
                Object val = methodGet.invoke(repository, id);
                methodGet = null;
                if (val instanceof Optional){
                    Optional<Object> optional = (Optional<Object>) val;
                    if(!optional.isPresent())
                        return notFound(
                            this.errorContructor(
                                this.createError("notFoundError", "No exite un registro con id " + id)
                            )
                        );

                    Form<T> form = formFactory.form(clz.getSuperclass()).fill(optional.get());
                    return ok(Json.toJson(form.get()));
                }else{
                    return internalServerError(
                        this.errorContructor(
                            this.createError("internalServerError", "No se pudo concluir el procedimiento, contactar a sistemas")
                        )
                    );
                }
            }catch(Exception e){
                logger.error(CONTEXT, e);
                return internalServerError(
                    this.errorContructor(
                        this.createError("internalServerError", "Error al procesar la información")
                    )
                );
            }
        }, httpExecutionContext.current());
    }

    @SuppressWarnings("unchecked")
    public <T> CompletionStage<Result> get(Long id, Class clz, Class<?> view){
        logger.debug(MSSLOGGER + controller + "@get \n\t id: "+ id);
        return supplyAsync(() -> {
            try{
                Method methodGet = this.getMethod("get", new Class[] {Long.TYPE});
                Object val = methodGet.invoke(repository, id);
                methodGet = null;
                if (val instanceof Optional){
                    Optional<Object> optional = (Optional<Object>) val;
                    if(!optional.isPresent())
                        return notFound(
                            this.errorContructor(
                                this.createError("notFoundError", "No exite un registro con id " + id)
                            )
                        );

                    Form<T> form = formFactory.form(clz.getSuperclass()).fill(optional.get());
                    return ok(JsonViews.toJson(form.get(), view));
                }else{
                    return internalServerError(
                        this.errorContructor(
                            this.createError("internalServerError", "No se pudo concluir el procedimiento, contactar a sistemas")
                        )
                    );
                }
            }catch(Exception e){
                logger.error(CONTEXT, e);
                return internalServerError(
                    this.errorContructor(
                        this.createError("internalServerError", "Error al procesar la información")
                    )
                );
            }
        }, httpExecutionContext.current());
    }

    @SuppressWarnings("unchecked")
    public <T> CompletionStage<Result> get(String methodName, Class<?>[] paramNames, Object[] params){
        logger.debug(MSSLOGGER + controller + "@get \n\t");
        return supplyAsync(() -> {
                Method method = this.getMethod(methodName, paramNames);
                Object val = this.invoker(method, params);
                method = null;
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
    public <T> CompletionStage<Result> save() {
        logger.debug(MSSLOGGER + controller + "@save");
        return supplyAsync(() -> {
            Form<T> form = formFactory.form(cls, BaseModel.SaveStep.class).bindFromRequest();
            logger.debug("\n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
            if (form.hasErrors()) {
                return badRequest( this.errorContructor(form.errorsAsJson()) );
            } else {
                Result result = null;
                try {
                    Object object       = form.get();
                    Method methodSave   = this.getMethod("save", new Class[] {Object.class});
                    result       = (Result) methodSave.invoke(repository, object);
                    methodSave = null;
                    // return created(
                    //     Json.toJson(object)
                    // );
                // } catch(PersistenceException e){
                //     e.printStackTrace();
                //     return internalServerError(":c");
                // } catch(NullPointerException e){
                //     e.printStackTrace();
                //     return internalServerError(":c");
                } catch(PersistenceException e){
                    logger.error("\n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
                    e.printStackTrace();
                    return internalServerError(":c");
                } catch(NullPointerException e){
                    logger.error("\n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
                    e.printStackTrace();
                    return internalServerError(":c");
                } catch(Exception e) {
                    logger.error("\n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
                    e.printStackTrace();
                    // return internalServerError(":c");
                }
                return result;
            }
        }, httpExecutionContext.current());
    }

    @SuppressWarnings("unchecked")
    public <T> CompletionStage<Result> save(String[] keys) {
        logger.debug(MSSLOGGER + controller + "@save");
        return supplyAsync(() -> {
            Form<T> form = formFactory.form(cls, BaseModel.SaveStep.class).bindFromRequest();
            logger.debug("\n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));

            
            if (form.hasErrors()) {
                return badRequest( this.errorContructor(form.errorsAsJson()) );
            } else {
                try {
                    Object object       = form.get();
                    Method methodSave   = this.getMethod("save", new Class[] {Object.class});
                    object              = methodSave.invoke(repository, object);
                    methodSave = null;
                    logger.debug("\n\t Borrando Cache");
                    for (String key : keys) {
                        CompletionStage<Done> result = cache.remove(key);
                    }
                    return created(
                        Json.toJson(object)
                    );

                } catch(PersistenceException e){
                    logger.error("\n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
                    logger.debug("\n\t Form: "+ form);
                    e.printStackTrace();
                    return internalServerError(":c");
                } catch(NullPointerException e){
                    logger.error("\n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
                    logger.debug("\n\t Form: "+ form);
                    e.printStackTrace();
                    return internalServerError(":c");
                } catch(Exception e) {
                    logger.error("\n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
                    logger.debug("\n\t Form: "+ form);
                    e.printStackTrace();
                    return internalServerError(":c");
                }
            }
        }, httpExecutionContext.current());
    }

    @SuppressWarnings("unchecked")
    public <T> CompletionStage<Result> save(Class clazz) {
        logger.debug(MSSLOGGER + controller + "@save");
        Form<T> form = formFactory.form(clazz, BaseModel.SaveStep.class).bindFromRequest();
        return supplyAsync(() -> {
            try {
                Method methodSave   = this.getMethod("save", new Class[] {Object.class});
                Object objSaved     = methodSave.invoke(repository, form.get());
                methodSave = null;

                return created(Json.toJson(objSaved));
                } catch(PersistenceException e){
                    logger.error("\n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
                    logger.debug("\n\t Form: "+ form);
                    e.printStackTrace();
                    return internalServerError(":c");
                } catch(NullPointerException e){
                    logger.error("\n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
                    logger.debug("\n\t Form: "+ form);
                    e.printStackTrace();
                    return internalServerError(":c");
                } catch(Exception e) {
                    logger.error("\n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
                    logger.debug("\n\t Form: "+ form);
                    e.printStackTrace();
                    return internalServerError(":c");
                }
        }, httpExecutionContext.current());
    }

    @SuppressWarnings("unchecked")
    public CompletionStage<Result> delete(Long id) {
        logger.debug(MSSLOGGER + controller + "@delete \n\t id: "+ id);
        return supplyAsync(() -> {
            try {
                Method methodDelete = this.getMethod("delete", new Class[] {Long.TYPE});
                Object val = methodDelete.invoke(repository, id);
                methodDelete = null;
                if (val instanceof Optional){
                    Optional<Boolean> v = (Optional<Boolean>) val;
                    if(v.get()){
                        v = null;
                        return ok(
                            this.createNode("message", "Registro eliminado de forma exitosa")
                        );
                    }else{
                        v = null;
                        return notFound(
                            this.errorContructor(
                                this.createError("notFoundError", "No se encontró un registro con el id: " + id)
                            )
                        );
                    }
                }else{
                    return internalServerError(
                        this.errorContructor(
                            this.createError("internalServerError", "No se pudo eliminar el objeto, contactar a sistemas")
                        )
                    );
                }
            }catch(Exception e) {
                logger.error(CONTEXT, e);
                return internalServerError(
                    this.errorContructor(
                        this.createError("internalServerError", "El registro tiene relación con otros registros, contactar a sistemas")
                    )
                );
            }
        }, httpExecutionContext.current());
    }

    @SuppressWarnings("unchecked")
    public <T> CompletionStage<Result> update(Long id, Class clazz){
        logger.debug(MSSLOGGER + controller + "@update \n\t id: " + id );
        Form<T> form = formFactory.form(clazz, BaseModel.UpdateStep.class).bindFromRequest();
        logger.debug(" \n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
        return supplyAsync(() -> {
            try {
                Method methodUpdate = this.getMethod("update", new Class[] {Long.TYPE, Object.class});
                Object val = methodUpdate.invoke(repository, id, form.get());
                methodUpdate = null;
                if (val instanceof Optional) {
                    Optional<Object> data = (Optional<Object>) val;
                    if(data.isPresent())
                        return ok(
                            Json.toJson(data.get())
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
                logger.error("\n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
                logger.error(CONTEXT, e);
                String errorMessage = e.getMessage();
                return  badRequest(Json.parse(errorMessage.split(": ")[1]));
            }
        }, httpExecutionContext.current());
    }

    @SuppressWarnings("unchecked")
    public <T> CompletionStage<Result> update(Long id){
        logger.debug(MSSLOGGER + controller + "@update \n\t id: " + id );
        Form<T> form = formFactory.form(cls, BaseModel.UpdateStep.class).bindFromRequest();
        logger.debug(" \n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
        return supplyAsync(() -> {
            try {
                Method methodUpdate = this.getMethod("update", new Class[] {Long.TYPE, Object.class});
                Object val = methodUpdate.invoke(repository, id, form.get());
                if (val instanceof Optional) {
                    Optional<Object> data = (Optional<Object>) val;
                    if(data.isPresent())
                        return ok(
                            Json.toJson(data.get())
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
                logger.error("\n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
                logger.error(CONTEXT, e);
                String[] errorMessages = e.getMessage().split(": ");
                return badRequest(Json.parse(errorMessages[1]));
            }
        }, httpExecutionContext.current());
     }

    @SuppressWarnings("unchecked")
    public <T> CompletionStage<Result> update(Long id, String[] keys){
        logger.debug(MSSLOGGER + controller + "@update \n\t id: " + id );
        Form<T> form = formFactory.form(cls, BaseModel.UpdateStep.class).bindFromRequest();
        logger.debug(" \n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
        return supplyAsync(() -> {
            try {
                Method methodUpdate = this.getMethod("update", new Class[] {Long.TYPE, Object.class});
                Object val = methodUpdate.invoke(repository, id, form.get());
                if (val instanceof Optional) {
                    Optional<Object> data = (Optional<Object>) val;
                    if(data.isPresent()){
                        logger.debug("\n\t Borrando Cache");
                        for (String key : keys) {
                            CompletionStage<Done> result = cache.remove(key);
                        }
                        return ok(
                            Json.toJson(data.get())
                        );
                    }else
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
                logger.error("\n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
                logger.error(CONTEXT, e);
                String[] errorMessages = e.getMessage().split(": ");
                return badRequest(Json.parse(errorMessages[1]));
            }
        }, httpExecutionContext.current());
     }

    @SuppressWarnings("unchecked")
    public <T> CompletionStage<Result> list(String methodName, Class<?>[] paramNames, Object[] params){
        logger.debug(MSSLOGGER + controller + "@list \n\t");
        return supplyAsync(() -> {
            Method method = this.getMethod(methodName, paramNames);
            Object list = this.invoker(method, params);
            method = null;
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
    public <T> CompletionStage<Result> list(String methodName, Object[] params){
        logger.debug(MSSLOGGER + controller + "@list \n\t");
        return supplyAsync(() -> {
            Method method = this.getMethod(methodName, this.getTypes(params));
            Object list = this.invoker(method, params);
            method = null;
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
    public <T> CompletionStage<Result> list(String methodName, Object[] params, String cacheKey, int cacheTime){
        logger.debug(MSSLOGGER + controller + "@list \n\t");
        return supplyAsync(() -> {
            Method method = this.getMethod(methodName, this.getTypes(params));
            Object list = null;
            try{
                logger.debug("trying to take cache object in order to validate cache exists: "+cache.get(cacheKey).toCompletableFuture().get());
                if (cache.get(cacheKey).toCompletableFuture().get() == null) {  
                    logger.debug("Cache is not set yet :( we will take object from database :) ");      
                    list = this.invoker(method, params);
                    logger.debug(String.format("Saving object %s in cache key '%s'", list, cacheKey) );
                    CompletionStage<Done> result = cache.set(cacheKey, list, cacheTime);
                }else{
                        logger.debug("get value from cache: "+cache.get(cacheKey).toCompletableFuture().get());
                        list = cache.get(cacheKey).toCompletableFuture().get();
                }
            }catch(Exception ie){
                logger.error("InterruptedException", ie);
            }    
            method = null;
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

    /**
    *
    * Este metodo solo es por si se llegase a necesitas
    * es la misma funcionalidad que mandar a llamar directo el metodo
    * de la clase Method
    *
    * @see Method
    */
    private Object invoker(Method method, Object[] paramsNames){
        logger.debug(controller + "@invoker(method, paramsNames) => ("+method+", "+paramsNames+")");
        Object obj = null;
        try {
            obj = method.invoke(this.repository, paramsNames);
        }catch (IllegalAccessException aie) {
            logger.error("Metodo no es accesible", aie);
        }catch (IllegalArgumentException iarge) {
            logger.error("Metodo no es una instancia de la clase o los argumentos no son correctos", iarge);
        }catch (InvocationTargetException ite) {
            logger.error("Metodo arrojo una excepción", ite);
        }catch (NullPointerException npe) {
            logger.error("Objeto especificado es nulo", npe);
        }catch (ExceptionInInitializerError eiie) {
            logger.error("Error en la inicializacion del objeto", eiie);
        }
        return obj;
    }

    private Method getMethod(String methodName, Class<?>[] paramTypes){
        logger.debug(controller + "@getMethod(methodName, paramTypes) => ("+methodName+", "+paramTypes+")");
        Method method = null;
        try{
            method = this.repository.getClass().getMethod(methodName, paramTypes);
        }catch(NoSuchMethodException nsme){
            logger.error("No se encontro el metodo a ejecutar", nsme);
        }catch(NullPointerException npe){
            logger.error("Error nombre no es correcto", npe);
        }
        return method;
    }

    private Class<?>[] getTypes(Object[] values){
        Class<?>[] parameters = new Class<?>[values.length];
        for (int i=0; i < values.length; i++) {
            logger.debug("Type found: "+values[i].getClass());
            if (values[i] instanceof Integer) {
                parameters[i] = Integer.TYPE;
            } else{
                parameters[i] = values[i].getClass();
            }
        }
        values = null;
        return parameters;
    }
}
