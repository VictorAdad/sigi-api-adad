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
import models.MotivoColorClase;
import play.cache.AsyncCacheApi;
import play.cache.Cached;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.mvc.With;
import repository.MotivoColorClaseRepository;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de MotivoColorClase que es y forma parte
  * de un caso de investigacion para la fiscalia del estado de
  * toluca.
  *
  * @author  Gibran Córdoba
  * @see     Set
  * @see     List
  * @see     Map
  * @see     Json
  * @see     Controllers
  * @since   1.0
  * @version 1.0
  */

@With(SecuredBasicAuth.class)
public class MotivoColorClaseController extends BaseController {

    private AsyncCacheApi cache;

    @Inject
    public MotivoColorClaseController(
        FormFactory formFactory,
        MotivoColorClaseRepository repository,
        HttpExecutionContext httpExecutionContext,
        AsyncCacheApi cache
    ) {
        super(formFactory, repository, httpExecutionContext);
        this.cache = cache;
    }

    /****************************************************************
    *****************************************************************
    ***                        METODOS CRUD                       ***
    *****************************************************************
    ****************************************************************/

    /**
     * Metodo que retorna la lista de valores
     * para un elemento select en formato de Json de un Modelo de MotivoColorClase.
     *
     * @author Gibrán Córdoba
     *
     *
     * @return      Json de MotivoColorClase actualizado
     * @see         models.MotivoColorClase
     *
     * @version 1.0
     *
     * @since 1.0
     */
    @Cached(key = "MotivoColorClaseController.options", duration = (60*60) * 2 )
    public CompletionStage<Result> options() {
        return super.list("options", new Class[]{}, new Object[]{});
    }

    /**
     * Metodo que retorna una lista de todos los registros de detalle lugar.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @param  id   id de MotivoColorClase
     *
     * @return      Json de todos los registros de MotivoColorClase
     * @see         models.MotivoColorClase
     *
     * @version 1.0
     *
     * @since 1.0
     */
    public CompletionStage<Result> list() throws PersistenceException {
        return super.list("list", new Class[]{
        }, new Object[]{
        });
    }
}
