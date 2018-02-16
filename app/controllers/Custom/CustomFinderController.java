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

import javax.inject.Inject;
import play.mvc.Controller;
import repository.CustomRepository;
import java.util.concurrent.CompletionStage;
import play.mvc.Result;
import play.mvc.With;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.Logger;
import static java.util.concurrent.CompletableFuture.supplyAsync;

import core.error.CustomFinderException;
import java.util.List;
import play.libs.Json;
import play.Logger;

@With(SecuredBasicAuth.class)
public class CustomFinderController extends BaseController {

    @Inject
    public CustomFinderController(
        FormFactory formFactory,
        CustomRepository customRepository,
        HttpExecutionContext httpExecutionContext
    ) {
        super(formFactory, customRepository, httpExecutionContext);
    }

    public CompletionStage<Result> finder(String className, List<String> customExp, String select) {
        Logger.debug(className+" - "+customExp+" - "+select);
        return supplyAsync(() -> {

            CustomRepository cr = null;
            Class<?> clzz = null;
            Result response = null;
            Object queryResult = null;

            if (className.equals("") && customExp.size() == 0)
                return ok();

            if (className.equals("") && (customExp.size() > 0 && !select.equals("all")) )
                return badRequest(
                    this.errorContructor(
                        this.createError("badRequestError", "Model '"+className+"' no son validos o se encuentran vacios, intentelo nuevamente")
                    )
                );

            try{
                clzz = Class.forName("models."+ className );
                cr = (CustomRepository) this.repository;
                cr.setClazz(clzz);
            }catch(Exception e){
                Logger.error("Error: ", e);
                return internalServerError(
                    this.errorContructor(
                        this.createError("internalServerError", "La clase '"+className+"' de referencia no se encontro, intente con alguna otra")
                    )
                );
            }


            try{

                if (queryResult == null)
                    throw new CustomFinderException("Error al recuperar queryResult");

            }catch(CustomFinderException cfe){
                play.Logger.error("Error: ", cfe);
                return internalServerError(
                    this.errorContructor(
                        this.createError("internalServerError", "Error al obtener la informacion del procesamiento del resultado, intentelo nuevamente")
                    )
                );
            }
            return ok(clzz+" - "+customExp+" - "+select);
        }, httpExecutionContext.current());
    }

}
