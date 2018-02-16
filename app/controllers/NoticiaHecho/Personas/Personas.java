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
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;
import java.util.List;
import javax.inject.Inject;
import models.BaseModel;
import com.typesafe.config.Config;
import models.Persona;
import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.Json;
import play.Logger;
import play.Logger.ALogger;
import play.mvc.Result;
import play.mvc.With;
import repository.PersonaRepository;
import javax.persistence.PersistenceException;

import static java.util.concurrent.CompletableFuture.supplyAsync;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de Persona que es y forma parte
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
public class Personas extends BaseController {

    PersonaRepository personaR;
    private final ALogger logger = Logger.of(this.getClass());
    
    private final Config config;

    @Inject
    public Personas(
        FormFactory formFactory,
        PersonaRepository repository,
        HttpExecutionContext httpExecutionContext,
        Config config
    ) {
        super(formFactory, repository, httpExecutionContext);
        this.personaR = repository;
        this.config = config;
    }

    /****************************************************************
    *****************************************************************
    ***                        METODOS CRUD                       ***
    *****************************************************************
    ****************************************************************/

    /**
     * Metodo que guarda un objeto de Persona.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @return      Json con el objeto de Persona guardado
     * @see         models.Persona
     *
     * @version 1.0
     *
     * @since 1.0
     */
    public CompletionStage<Result> save() {
      logger.debug("Information controller method : \n\t Personas@save");
        try {
            Form<Persona> form = formFactory.form(Persona.class).bindFromRequest();
            Logger.debug("Information controller method : \n\t Personas@save \n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
            long comparar = form.get().personaCaso.get(0).tipoInterviniente.id;
            if (comparar == config.getLong("Evomatik.tipoPersona.idVictimaDesconocido") || comparar == config.getLong("Evomatik.tipoPersona.idImputadoDesconocido")){
              form = formFactory.form(Persona.class).bindFromRequest();
            } else {
              form = formFactory.form(Persona.class, BaseModel.SaveStep.class).bindFromRequest();
            }
            Persona object = form.get();
            return CompletableFuture.completedFuture(personaR.save(object));
        } catch(PersistenceException e) {
            return supplyAsync(() -> badRequest(":c")
            , httpExecutionContext.current());
        }
    }

    public CompletionStage<Result> update(Long id) {
        Form<Persona> form = this.formFactory.form(Persona.class, BaseModel.UpdateStep.class).bindFromRequest();
        logger.debug("Information controller method : \n\t Personas@update");
        return supplyAsync(() -> {
            try {
                if (form.hasErrors())
                    return badRequest( this.errorContructor(form.errorsAsJson()));
                Object obj = personaR.update(id, form.get());
                return created(Json.toJson(obj));
                
            } catch(Exception e) {
                return internalServerError(":c");
            }
        }, httpExecutionContext.current());
    }
}
