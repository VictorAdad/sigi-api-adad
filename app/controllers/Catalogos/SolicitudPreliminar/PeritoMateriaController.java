/*
 * Copyright (c)
 */
package controllers;

import java.util.concurrent.CompletionStage;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import models.PeritoMateria;
import play.data.FormFactory;
import play.cache.Cached;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.mvc.With;
import repository.PeritoMateriaRepository;
import play.cache.AsyncCacheApi;

 /**
  * Esta Clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de PeritoMateria que es y forma parte
  * de un caso de investigacion para la fiscalia del estado de
  * toluca.
  *
  * @author  Gibran Córdoba
  * 
  * @see     PeritoMateriaRepository
  * @see     Result
  * @see     PeritoMateria
  * @see     repository
  * @see     controllers
  * @since   1.0
  * @version 1.0
  */

@With(SecuredBasicAuth.class)
public class PeritoMateriaController extends BaseController {

    @Inject
    public PeritoMateriaController(
        FormFactory formFactory,
        PeritoMateriaRepository repository,
        HttpExecutionContext httpExecutionContext,
        AsyncCacheApi cache
    ) {
        super(formFactory, repository, httpExecutionContext, cache);
        this.controller = "PeritoMateriaController";
    }

    /**
     * Metodo que retorna la lista de valores
     * para un elemento select en formato de Json de un Modelo de PeritoMateria.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     *
     * @return      Json de PeritoMateria actualizado
     * @see         models.PeritoMateria
     *
     * @version 1.0
     *
     * @since 1.0
     */
    @Cached(key = "PeritoMateriaController.options", duration = (60*60) * 2 )
    public CompletionStage<Result> options() {
        return super.list("options", new Class[]{ }, new Object[]{});
    }

    public CompletionStage<Result> save() throws PersistenceException {
      return super.save(new String [] {"PeritoMateriaController.options"});
    }

    public CompletionStage<Result> update(Long id) throws PersistenceException {
      return super.update(id, new String [] {"PeritoMateriaController.options"});
    }
}
