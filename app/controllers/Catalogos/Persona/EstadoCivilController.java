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
import models.EstadoCivil;
import play.cache.AsyncCacheApi;
import play.cache.Cached;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.mvc.With;
import repository.EstadoCivilRepository;
import play.cache.Cached;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de EstadoCivil que es y forma parte
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
public class EstadoCivilController extends BaseController {

    private AsyncCacheApi cache;

    @Inject
    public EstadoCivilController(FormFactory formFactory,
                EstadoCivilRepository repository,
                HttpExecutionContext httpExecutionContext,
                AsyncCacheApi cache) {
        super(formFactory, repository, httpExecutionContext, cache);
        this.cache = cache;
    }

    /****************************************************************
    *****************************************************************
    ***                        METODOS CRUD                       ***
    *****************************************************************
    ****************************************************************/

    /**
     * Metodo que retorna la lista de valores
     * para un elemento select en formato de Json de un Modelo de EstadoCivil.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     *
     * @return      Json de EstadoCivil actualizado
     * @see         models.EstadoCivil
     *
     * @version 1.0
     *
     * @since 1.0
     */
    @Cached(key = "EstadoCivilController.options", duration = (60*60) * 2 )
    public CompletionStage<Result> options() {
        return super.list("options", new Class[]{}, new Object[]{});
    }

    public CompletionStage<Result> save() throws PersistenceException {
      return super.save(new String [] {"EstadoCivilController.options"});
    }

    public CompletionStage<Result> update(Long id) throws PersistenceException {
      return super.update(id, new String [] {"EstadoCivilController.options"});
    }
}
