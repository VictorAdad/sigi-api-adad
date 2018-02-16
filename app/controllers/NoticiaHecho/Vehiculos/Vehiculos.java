/*
 * Copyright (c) Evomatik software 2017
 *
 * Este codigo fue llevado a cabo por el equipo de evomatik
 * cualquier persona ajena a la compañia que realize modificaciones o
 * copie el siguiente codigo sera acreditado para una sancion legal y
 * monetaria.
 */
package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.typesafe.config.Config;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import models.BaseModel;
import models.DelitoCaso;
import models.Vehiculo;
import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.Json;
import play.Logger;
import java.lang.reflect.Field;
import play.mvc.Http.RequestBody;
import play.mvc.Result;
import play.mvc.With;
import repository.VehiculoRepository;

import static java.util.concurrent.CompletableFuture.supplyAsync;
 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de Vehiculo que es y forma parte
  * de un caso de investigacion para la fiscalia del estado de
  * toluca.
  *
  * @author  Gibran Córdoba
  * @see     Set
  * @see     List
  * @see     Map
  * @see     Json
  * @see     Controllers
  * @since   1.0
  * @version 1.0
  */

@With(SecuredBasicAuth.class)
public class Vehiculos extends CaseCatalogBaseController {

    VehiculoRepository vehiculoR;
    private final Config config;
    
    @Inject
    public Vehiculos(
        FormFactory formFactory,
        VehiculoRepository repository,
        HttpExecutionContext httpExecutionContext,
        VehiculoRepository vehiculoR,
        Config config
    ) {
        super(formFactory, repository, httpExecutionContext);
        this.vehiculoR = repository;
        this.config = config;
    }

    /****************************************************************
    *****************************************************************
    ***                        METODOS CRUD                       ***
    *****************************************************************
    ****************************************************************/

    /**
     * Metodo que retorna la actualizacion de un Modelo de Vehiculo.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @param  id   id de Vehiculo
     *
     * @return      Json de Vehiculo actualizado
     * @see         models.Vehiculo
     *
     * @version 1.0
     *
     * @since 1.0
     */
    public CompletionStage<Result> list(Long id) throws PersistenceException {
        return super.list("listByCase", new Class[]{
            Long.class
        }, new Object[]{
            id
        });
    }

    public CompletionStage<Result> save() {
        try {
            Form<Vehiculo> form = formFactory.form(Vehiculo.class).bindFromRequest();
            Logger.debug("Information controller method : \n\t Vehiculos@save \n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
            for (DelitoCaso delitoCaso : form.get().caso.delitosCaso) {
              if (delitoCaso.delito.id == config.getLong("Evomatik.delito.id")) {
                form = formFactory.form(Vehiculo.class, BaseModel.SaveStep.class).bindFromRequest();
              }
            }
            Vehiculo object = form.get();
            for (Field f : object.getClass().getFields()) {
              f.setAccessible(true);
              if (f.get(object) == null) {
                return CompletableFuture.completedFuture(vehiculoR.save(object));
              }
            }
            return supplyAsync(() -> badRequest("El registro no contiene al menos un campo valido")
            , httpExecutionContext.current());
        } catch(Exception e) {
            e.printStackTrace();
            String errorMessage = e.getMessage();
            Logger.error(errorMessage);
            String[] errors = errorMessage.split(": ");
            return supplyAsync(() -> badRequest(Json.parse(errors[0]))
            , httpExecutionContext.current());
        }
    }
}
