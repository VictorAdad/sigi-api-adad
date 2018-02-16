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

import java.util.concurrent.CompletionStage;
import play.libs.concurrent.HttpExecutionContext;
import java.util.Optional;
import play.libs.Json;
import play.Logger;
import play.Logger.ALogger;
import play.mvc.Result;
import java.lang.reflect.Method;
import core.reflect.MethodUtil;
import com.typesafe.config.Config;
import static java.util.concurrent.CompletableFuture.supplyAsync;

public class SimpleController extends ResponseController {

    private final ALogger logger    = Logger.of(this.getClass());
    public String controller        = this.getClass().getCanonicalName();
    public final String MSSLOGGER   = "Information controller method: \n\t ";
    private final String ERRORMSS   = this.controller+" has an exception error: \n\t";
    public final Object repository;
    public final HttpExecutionContext httpExecutionContext;
    private Config configuration;

    public SimpleController(
        Object repository,
        HttpExecutionContext httpExecutionContext,
        Config configuration
    ) {
        this.repository = repository;
        this.httpExecutionContext = httpExecutionContext;
        this.configuration = configuration;
    }

    @SuppressWarnings("unchecked")
    public <T> CompletionStage<Result> exec(String methodName, Object[] params){
        logger.debug(MSSLOGGER + controller + "@execute \n\t");
        Method method = MethodUtil.getMethod(this.repository, methodName, MethodUtil.getTypes(params));
        return supplyAsync(() -> {
            Object object = (Object) MethodUtil.invoker(this.repository, method, params);
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
