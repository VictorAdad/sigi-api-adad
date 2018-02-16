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
import javax.inject.Inject;
import models.BaseModel;
import models.DetalleDelito;
import play.cache.AsyncCacheApi;
import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.Json;
import play.Logger;
import play.mvc.Result;
import play.mvc.With;
import repository.DetalleDelitoRepository;

import static java.util.concurrent.CompletableFuture.supplyAsync;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de CalibreMecanismo que es y forma parte
  * de un caso de investigacion para la fiscalia del estado de
  * toluca.
  *
  * @author  Gibran Córdoba
  * @author  Jesus Viveros
  * @author  Lazaro Hernandez
  * @see     Set
  * @see     List
  * @see     Map
  * @see     Json
  * @see     Controllers
  * @since   1.0
  * @version 1.0
  */

@With(SecuredBasicAuth.class)
public class DetalleDelitos extends BaseController {

    private AsyncCacheApi cache;

    DetalleDelitoRepository tipoR;

    @Inject
    public DetalleDelitos(FormFactory formFactory,
                DetalleDelitoRepository repository,
                HttpExecutionContext httpExecutionContext,
                AsyncCacheApi cache) {
        super(formFactory, repository, httpExecutionContext);
        this.tipoR = repository;
        this.cache = cache;
    }

    public CompletionStage<Result> update(Long id) {
        Form<DetalleDelito> form = this.formFactory.form(DetalleDelito.class, BaseModel.UpdateStep.class).bindFromRequest();
        Logger.debug("Information controller method : \n\t DetalleDelito@update \n\t Form: "+ form);
        return supplyAsync(() -> {
            try {
                if (form.hasErrors())
                    return badRequest( this.errorContructor(form.errorsAsJson()));

                Object obj = tipoR.update(id, form.get());
                
                if (obj != null) {
                   return created(Json.toJson(obj));
                }else{
                    return internalServerError(
                        this.errorContructor(
                            this.createError("internalServerError", "No se pudo almacenar el registro")
                        )
                    );
                }
            } catch(Exception e) {
                Logger.error("Error");
                e.printStackTrace();
                String errorMessage = e.getMessage();
                Logger.error(errorMessage);
                return internalServerError(
                        this.errorContructor(
                            this.createError("internalServerError", "No se pudo almacenar el registro")
                        )
                    );
            }
        }, httpExecutionContext.current());            
    }
}
