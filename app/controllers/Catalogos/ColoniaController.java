/*
 * Copyright (c) Evomatik software 2017
 *
 * Este codigo fue lllevado a cabo por el equipo de evomatik
 * cualquier persona ajena a la compañia y/o del codigo fuente
 * que realize modificaciones o copie el siguiente codigo sera
 * acreditado para una sancion legal y monetaria.
 *
 */
package controllers;

import java.util.concurrent.CompletionStage;
import javax.persistence.PersistenceException;
import javax.inject.Inject;
import models.Colonia;
import play.cache.AsyncCacheApi;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.mvc.With;
import repository.ColoniaRepository;
import play.cache.Cached;
 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de Colonia que es y forma parte
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
public class ColoniaController extends BaseController {

    private AsyncCacheApi cache;

    @Inject
    public ColoniaController(FormFactory formFactory,
                ColoniaRepository repository,
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
     * para un elemento select en formato de Json de un Modelo de Colonia.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     *
     * @return      Json de Colonia actualizado
     * @see         models.Colonia
     *
     * @version 1.0
     *
     * @since 1.0
     */
    public CompletionStage<Result> options(Long id) {
        return super.list("optionsByMunicipio", new Class[]{
            Long.class
        }, new Object[]{
            id
        });
    }
    @Cached(key = "ColoniaController.list", duration = (60*60) * 2 )
    public CompletionStage<Result> list() {
        return super.list("list", new Class[]{
        }, new Object[]{
        });
    }

    public CompletionStage<Result> listByMunicipio(Long id) throws PersistenceException {
      return super.list("listByMunicipio", new Class[]{
          Long.class
      }, new Object[]{
          id
      });
    }
    
    public CompletionStage<Result> save() throws PersistenceException {
      return super.save(new String [] {"ColoniaController.list", "ColoniaController.options"});
    }

    public CompletionStage<Result> update(Long id) throws PersistenceException {
      return super.update(id, new String [] {"ColoniaController.list", "ColoniaController.options"});
    }
}
