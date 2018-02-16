/*
 * Copyright (c)
 */
package controllers;

import java.util.concurrent.CompletionStage;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import models.ConcursoDelito;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.cache.Cached;
import play.mvc.With;
import repository.ConcursoDelitoRepository;
import play.cache.AsyncCacheApi;

 /**
  * Esta Clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de ConcursoDelito que es y forma parte
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
public class ConcursoDelitoController extends BaseController {

    @Inject
    public ConcursoDelitoController(FormFactory formFactory,
        ConcursoDelitoRepository repository,
        HttpExecutionContext httpExecutionContext,
        AsyncCacheApi cache) {
        super(formFactory, repository, httpExecutionContext, cache);
    }

    /****************************************************************
    *****************************************************************
    ***                        METODOS CRUD                       ***
    *****************************************************************
    ****************************************************************/

    /**
     * Metodo que retorna la lista de valores
     * para un elemento select en formato de Json de un Modelo de ConcursoDelito.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     *
     * @return      Json de ConcursoDelito actualizado
     * @see         models.ConcursoDelito
     *
     * @version 1.0
     *
     * @since 1.0
     */

    @Cached(key = "ConcursoDelitoController.options", duration = (60*60) * 2 )
    public CompletionStage<Result> options() {
        return super.list("options", new Class[]{}, new Object[]{});
    }

    /**
     * Metodo que retorna una lista de todos los registros de la tipo de uso y de vehiculo.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @param  id   id de ConcursoDelito
     *
     * @return      Json de todos los registros de ConcursoDelito
     * @see         models.ConcursoDelito
     *
     * @version 1.0
     *
     * @since 1.0
     */
    @Cached(key = "ConcursoDelitoController.list", duration = (60*60) * 2 )
    public CompletionStage<Result> list() throws PersistenceException {
        return super.list("list", new Class[]{}, new Object[]{});
    }

    public CompletionStage<Result> save() throws PersistenceException {
      return super.save(new String [] {"ConcursoDelitoController.list", "ConcursoDelitoController.options"});
    }

    public CompletionStage<Result> update(Long id) throws PersistenceException {
      return super.update(id, new String [] {"ConcursoDelitoController.list", "ConcursoDelitoController.options"});
    }
}
