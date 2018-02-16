/*
 * Copyright (c)
 */
package controllers;

import java.util.concurrent.CompletionStage;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import models.VictimaQuerellante;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.mvc.With;
import repository.VictimaQuerellanteRepository;
import play.cache.AsyncCacheApi;
import play.cache.Cached;

 /**
  * Esta Clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de VictimaQuerellante que es y forma parte
  * de un caso de investigacion para la fiscalia del estado de
  * toluca.
  *
  * @author  Gibran Córdoba
  * 
  * @see     VictimaQuerellanteRepository
  * @see     Result
  * @see     VictimaQuerellante
  * @see     repository
  * @see     controllers
  * @since   1.0
  * @version 1.0
  */

@With(SecuredBasicAuth.class)
public class VictimaQuerellanteController extends BaseController {

    @Inject
    public VictimaQuerellanteController(
        FormFactory formFactory,
        VictimaQuerellanteRepository repository,
        HttpExecutionContext httpExecutionContext,
        AsyncCacheApi cache
    ) {
        super(formFactory, repository, httpExecutionContext, cache);
        this.controller = "VictimaQuerellanteController";
    }

    /**
     * Metodo que retorna la lista de valores
     * para un elemento select en formato de Json de un Modelo de VictimaQuerellante.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @return      Json de VictimaQuerellante actualizado
     * @see         models.VictimaQuerellante
     *
     * @version 1.0
     *
     * @since 1.0
     */
    @Cached(key = "VictimaQuerellanteController.options", duration = (60*60) * 2 )
    public CompletionStage<Result> options() {
        return super.list("options", new Class[]{ }, new Object[]{});
    }

    public CompletionStage<Result> save() throws PersistenceException {
      return super.save(new String [] {"VictimaQuerellanteController.options"});
    }

    public CompletionStage<Result> update(Long id) throws PersistenceException {
      return super.update(id, new String [] {"VictimaQuerellanteController.options"});
    }
}
