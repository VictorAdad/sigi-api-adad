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
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import models.Cabello;
import play.cache.AsyncCacheApi;
import play.cache.Cached;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.mvc.With;
import repository.CabelloRepository;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de Cabello que es y forma parte
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
public class CabelloController extends BaseController {


    @Inject
    public CabelloController(
        FormFactory formFactory,
        CabelloRepository repository,
        HttpExecutionContext httpExecutionContext,
        AsyncCacheApi cache
    ) {
        super(formFactory, repository, httpExecutionContext, cache);
    }

    /****************************************************************
    *****************************************************************
    ***                        METODOS CRUD                       ***
    *****************************************************************
    ****************************************************************/

    /**
     * Metodo que retorna la lista de valores
     * para un elemento select en formato de Json de un Modelo de Cabello.
     *
     * @author Gibrán Córdoba
     *
     *
     * @return      Json de Cabello actualizado
     * @see         models.Cabello
     *
     * @version 1.0
     *
     * @since 1.0
     */
    @Cached(key = "CabelloController.options", duration = (60*60) * 2 )
    public CompletionStage<Result> options() {
        return super.list("options", new Object[]{}, "CabelloController.options", 60 * 30);
    }

    /**
     * Metodo que retorna una lista de todos los registros del cabello.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @param  id   id de Cabello
     *
     * @return      Json de todos los registros de Cabello
     * @see         models.Cabello
     *
     * @version 1.0
     *
     * @since 1.0
     */
    @Cached(key = "CabelloController.list", duration = (60*60) * 2 )
    public CompletionStage<Result> list() throws PersistenceException {
        return super.list("list", new Object[]{}, "CabelloController.list", 60 * 30 );
    }

    public CompletionStage<Result> save() throws PersistenceException {
      return super.save(new String [] {"CabelloController.list", "CabelloController.options"});
    }

    public CompletionStage<Result> update(Long id) throws PersistenceException {
      return super.update(id, new String [] {"CabelloController.list", "CabelloController.options"});
    }
}
