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
import java.util.concurrent.CompletionStage;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Method;

import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.Json;
import play.Logger;
import play.Logger.ALogger;
import play.data.Form;
import play.data.FormFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.BaseModel;


import static java.util.concurrent.CompletableFuture.supplyAsync;

public class BaseHerenciaController extends CaseCatalogBaseController {

    private final ALogger logger = Logger.of(this.getClass());

    @Inject
    public BaseHerenciaController(
        FormFactory formFactory,
        Object repository,
        HttpExecutionContext httpExecutionContext
    ) {
        super(formFactory, repository, httpExecutionContext);
    }

    @Override
    public <T> CompletionStage<Result> save() {
        logger.debug(MSSLOGGER + controller + "@save");
        return supplyAsync(() -> {
            Form<T> form = formFactory.form(cls, BaseModel.SaveStep.class).bindFromRequest();
            logger.debug("\n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
            if (form.hasErrors()) {
                return badRequest( this.errorContructor(form.errorsAsJson()) );
            } else {
                try {

                    JsonNode personas = request().body().asJson().get("personas");
                    List<String> listId = new ArrayList<String>();
                    for (JsonNode p : personas) {
                        listId.add(p.get("id").toString());
                    }
                    Result result = null;
                    Object object       = form.get();
                    List<Object> params = new ArrayList<Object>();
                    params.add(object);
                    params.add(listId);
                    Method methodSave   = this.repository.getClass().getMethod("save", new Class[] {Object.class});
                    result              = (Result) methodSave.invoke(repository, params);
                    methodSave = null;
                    return result;
                    // if (object != null)
                    //     return created(
                    //         Json.toJson(object)
                    //     );
                    // else
                    //     return internalServerError(
                    //         this.errorContructor(
                    //             this.createError("internalServerError", "No se pudo almacenar el registro")
                    //         )
                    //     );
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
