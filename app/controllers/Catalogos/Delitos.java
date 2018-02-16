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
import javax.persistence.PersistenceException;
import javax.inject.Inject;
import models.Delito;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.mvc.With;
import play.cache.AsyncCacheApi;
import play.cache.Cached;
import play.libs.Json;
import repository.DelitoRepository;
import com.typesafe.config.Config;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de Delito que es y forma parte
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
public class Delitos extends BaseController {

    private DelitoRepository delitoR;

    @Inject 
    private Config configuration;

    @Inject
    public Delitos(
        FormFactory formFactory,
        DelitoRepository repository,
        HttpExecutionContext httpExecutionContext,
        AsyncCacheApi cache,
        Config configuration
    ) {
        super(formFactory, repository, httpExecutionContext, cache, configuration);
        this.delitoR = repository;
    }

    /****************************************************************
    *****************************************************************
    ***                        METODOS CRUD                       ***
    *****************************************************************
    ****************************************************************/

    /**
     * Metodo que obtiene un objeto de Delito desde base de datos.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @param name identificador del registro de delito
     *
     * @return      Json con el objeto de Delito encontrado
     * @see         models.Delito
     *
     * @version 1.0
     *
     * @since 1.0
     */
    public CompletionStage<Result> getByName(String name) {
        return delitoR.getByName(name).thenApplyAsync(list -> {
            play.Logger.debug("Information controller method : \n\t Delitos@getByName \n\t data: "+ Json.prettyPrint(Json.toJson(list)));
            return ok(Json.toJson(list));
        }, httpExecutionContext.current());
    }

    /**
     * Metodo que retorna una lista de todos los registros de delitos.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @param  id   id de Delito
     *
     * @return      Json de todos los registros de Delito
     * @see         models.Delito
     *
     * @version 1.0
     *
     * @since 1.0
     */
    @Cached(key = "DelitoRepository.list", duration = (60*60) * 2 )
    public CompletionStage<Result> list() {
        return super.list("list", new Class[]{
        }, new Object[]{
        });
    }

    public CompletionStage<Result> save() throws PersistenceException {
      return super.save(new String [] {"DelitoRepository.list"});
    }

    public CompletionStage<Result> update(Long id) throws PersistenceException {
      return super.update(id, new String [] {"DelitoRepository.list"});
    }
}
