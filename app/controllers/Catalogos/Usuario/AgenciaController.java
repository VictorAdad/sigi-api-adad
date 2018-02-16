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

import javax.inject.Inject;
import models.Agencia;
import javax.persistence.PersistenceException;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.Json;
import repository.AgenciaRepository;
import play.cache.AsyncCacheApi;
import play.mvc.Result;
import play.mvc.With;
import play.cache.Cached;
import java.util.concurrent.CompletionStage;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de Agencia que es y forma parte
  * de un caso de investigacion para la fiscalia del estado de
  * toluca.
  *
  * @author  Gibran Córdoba
  *
  * @see     Agencia
  * @see     AgenciaRepository
  * @see     BaseController
  * @see     Controllers
  *
  * @since   1.0
  * @version 1.0
  */

@With(SecuredBasicAuth.class)
public class AgenciaController extends BaseController {

    private AgenciaRepository agenciaR;

    @Inject
    public AgenciaController(
        FormFactory formFactory,
        AgenciaRepository repository,
        HttpExecutionContext httpExecutionContext,
        AsyncCacheApi cache
    ) {
        super(formFactory, repository, httpExecutionContext, cache);
        this.agenciaR = repository;
    }

    /**
     * Metodo que retorna la lista de valores
     * para un elemento select en formato de Json de un Modelo de Agencia.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @return      Json de Agencia actualizado
     * @see         models.Agencia
     *
     * @version 1.0
     * @since 1.0
     */
    @Cached(key = "AgenciaController.options", duration = (60*60) * 2 )
    public CompletionStage<Result> options() {
        return super.list("options", new Class[]{ }, new Object[]{});
    }

    public CompletionStage<Result> save() throws PersistenceException {
      return super.save(new String [] {"AgenciaController.options"});
    }

    public CompletionStage<Result> update(Long id) throws PersistenceException {
      return super.update(id, new String [] {"AgenciaController.options"});
    }
}
