/*
 * Copyright (c)
 */
package controllers;

import java.util.concurrent.CompletionStage;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import models.ViolenciaGenero;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.cache.Cached;
import play.mvc.Result;
import play.mvc.With;
import repository.ViolenciaGeneroRepository;
import play.cache.AsyncCacheApi;

 /**
  * Esta Clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de ViolenciaGenero que es y forma parte
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
public class ViolenciaGeneroController extends BaseController {

    @Inject
    public ViolenciaGeneroController(FormFactory formFactory,
          ViolenciaGeneroRepository repository,
          HttpExecutionContext httpExecutionContext,
          AsyncCacheApi cache
        ) {
        super(formFactory, repository, httpExecutionContext, cache);
    }

    /**
     * Metodo que retorna una lista de todos los registros de la tipo de uso y de vehiculo.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @param  id   id de ViolenciaGenero
     *
     * @return      Json de todos los registros de ViolenciaGenero
     * @see         models.ViolenciaGenero
     *
     * @version 1.0
     *
     * @since 1.0
     */
    @Cached(key = "ViolenciaGeneroController.list", duration = (60*60) * 2 )
    public CompletionStage<Result> list() throws PersistenceException {
        return super.list("list", new Class[]{
        }, new Object[]{
        });
    }

    public CompletionStage<Result> save() throws PersistenceException {
      return super.save(new String [] {"ViolenciaGeneroController.list"});
    }

    public CompletionStage<Result> update(Long id) throws PersistenceException {
      return super.update(id, new String [] {"ViolenciaGeneroController.list"});
    }
}
