/*
 * Copyright (c)
 */
package controllers;

import java.util.concurrent.CompletionStage;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.cache.Cached;
import play.mvc.With;
import repository.ElementoComisionRepository;
import play.cache.AsyncCacheApi;

 /**
  * Esta Clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de ElementoComisionController que es y forma parte
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
public class ElementoComisionController extends BaseController {

    @Inject
    public ElementoComisionController(FormFactory formFactory,
        ElementoComisionRepository repository,
        HttpExecutionContext httpExecutionContext,
        AsyncCacheApi cache) {
        super(formFactory, repository, httpExecutionContext, cache);
        this.controller = "ElementoComisionController";
    }

    /****************************************************************
    *****************************************************************
    ***                        METODOS CRUD                       ***
    *****************************************************************
    ****************************************************************/

    /**
     * Metodo que retorna la lista de valores
     * para un elemento select en formato de Json de un Modelo de ElementoComisionController.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     *
     * @return      Json de ElementoComisionController actualizado
     * @see         models.ElementoComisionController
     *
     * @version 1.0
     *
     * @since 1.0
     */
    
    @Cached(key = "ElementoComisionController.options", duration = (60*60) * 2 )
    public CompletionStage<Result> options() {
        return super.list("options", new Class[]{}, new Object[]{});
    }

    /**
     * Metodo que retorna una lista de todos los registros de la tipo de uso y de vehiculo.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @param  id   id de ElementoComisionController
     *
     * @return      Json de todos los registros de ElementoComisionController
     * @see         models.ElementoComisionController
     *
     * @version 1.0
     *
     * @since 1.0
     */
    
    @Cached(key = "ElementoComisionController.list", duration = (60*60) * 2 )
    public CompletionStage<Result> list() throws PersistenceException {
        return super.list("list", new Class[]{
        }, new Object[]{
        });
    }

    public CompletionStage<Result> save() throws PersistenceException {
      return super.save(new String [] {"ElementoComisionController.list", "ElementoComisionController.options"});
    }

    public CompletionStage<Result> update(Long id) throws PersistenceException {
      return super.update(id, new String [] {"ElementoComisionController.list","ElementoComisionController.options"});
    }
}
