/*
 * Copyright (c)
 */
package controllers;

import java.util.concurrent.CompletionStage;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import models.DenunciaQuerella;
import play.data.FormFactory;
import play.cache.Cached;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.mvc.With;
import repository.DenunciaQuerellaRepository;
import play.cache.AsyncCacheApi;

 /**
  * Esta Clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de DenunciaQuerella que es y forma parte
  * de un caso de investigacion para la fiscalia del estado de
  * toluca.
  *
  * @author  Gibran Córdoba
  *
  * @see     DenunciaQuerellaRepository
  * @see     Result
  * @see     DenunciaQuerella
  * @see     repository
  * @see     controllers
  * @since   1.0
  * @version 1.0
  */

@With(SecuredBasicAuth.class)
public class DenunciaQuerellaController extends BaseController {

    @Inject
    public DenunciaQuerellaController(
        FormFactory formFactory,
        DenunciaQuerellaRepository repository,
        HttpExecutionContext httpExecutionContext,
        AsyncCacheApi cache
    ) {
        super(formFactory, repository, httpExecutionContext, cache);
        this.controller = "DenunciaQuerellaController";
    }

    /**
     * Metodo que retorna la lista de valores
     * para un elemento select en formato de Json de un Modelo de DenunciaQuerella.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     *
     * @return      Json de DenunciaQuerella actualizado
     * @see         models.DenunciaQuerella
     *
     * @version 1.0
     *
     * @since 1.0
     */
    @Cached(key = "DenunciaQuerellaController.options", duration = (60*60) * 2 )
    public CompletionStage<Result> options() {
        return super.list("options", new Class[]{ }, new Object[]{});
    }

    public CompletionStage<Result> save() throws PersistenceException {
      return super.save(new String [] {"DenunciaQuerellaController.options"});
    }

    public CompletionStage<Result> update(Long id) throws PersistenceException {
      return super.update(id, new String [] {"DenunciaQuerellaController.options"});
    }
}
