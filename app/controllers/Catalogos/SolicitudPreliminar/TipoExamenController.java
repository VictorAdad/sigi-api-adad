/*
 * Copyright (c)
 */
package controllers;

import java.util.concurrent.CompletionStage;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import models.TipoExamen;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.mvc.With;
import repository.TipoExamenRepository;
import play.cache.AsyncCacheApi;
import play.cache.Cached;

 /**
  * Esta Clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de TipoExamen que es y forma parte
  * de un caso de investigacion para la fiscalia del estado de
  * toluca.
  *
  * @author  Gibran Córdoba
  * 
  * @see     TipoExamenRepository
  * @see     Result
  * @see     TipoExamen
  * @see     repository
  * @see     controllers
  * @since   1.0
  * @version 1.0
  */

@With(SecuredBasicAuth.class)
public class TipoExamenController extends BaseController {

    @Inject
    public TipoExamenController(
        FormFactory formFactory,
        TipoExamenRepository repository,
        HttpExecutionContext httpExecutionContext,
        AsyncCacheApi cache
    ) {
        super(formFactory, repository, httpExecutionContext, cache);
        this.controller = "TipoExamenController";
    }

    /**
     * Metodo que retorna la lista de valores
     * para un elemento select en formato de Json de un Modelo de TipoExamen.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     *
     * @return      Json de TipoExamen actualizado
     * @see         models.TipoExamen
     *
     * @version 1.0
     *
     * @since 1.0
     */
    @Cached(key = "TipoExamenController.options", duration = (60*60) * 2 )
    public CompletionStage<Result> options() {
        return super.list("options", new Class[]{ }, new Object[]{});
    }

    public CompletionStage<Result> save() throws PersistenceException {
      return super.save(new String [] {"TipoExamenController.options"});
    }

    public CompletionStage<Result> update(Long id) throws PersistenceException {
      return super.update(id, new String [] {"TipoExamenController.options"});
    }
}
