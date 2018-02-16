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
import javax.persistence.PersistenceException;
import javax.inject.Inject;
import models.Distrito;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.Json;
import repository.DistritoRepository;
import play.mvc.Result;
import play.mvc.With;
import play.cache.AsyncCacheApi;
import play.cache.Cached;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de Distrito que es y forma parte
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
public class DistritoController extends BaseController {

    private DistritoRepository distritoR;

    @Inject
    public DistritoController(
        FormFactory formFactory,
        DistritoRepository repository,
        HttpExecutionContext httpExecutionContext,
        AsyncCacheApi cache
    ) {
        super(formFactory, repository, httpExecutionContext, cache);
        this.distritoR = repository;
    }

    /**
     * Metodo que retorna la lista de valores
     * para un elemento select en formato de Json de un Modelo de CalibreMecanismo.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     *
     * @return      Json de CalibreMecanismo actualizado
     * @see         models.CalibreMecanismo
     *
     * @version 1.0
     *
     * @since 1.0
     */
    @Cached(key = "DistritoController.options", duration = (60*60) * 2 )
    public CompletionStage<Result> options() {
        return super.list("options", new Class[]{}, new Object[]{});
    }

    /**
     * Metodo que retorna una lista de todos los registros de la tipo de uso y de vehiculo.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @param  id   id de CalibreMecanismo
     *
     * @return      Json de todos los registros de CalibreMecanismo
     * @see         models.CalibreMecanismo
     *
     * @version 1.0
     *
     * @since 1.0
     */
    @Cached(key = "DistritoController.list", duration = (60*60) * 2 )
    public CompletionStage<Result> list() {
        return super.list("list", new Class[]{
        }, new Object[]{
        });
    }

    public CompletionStage<Result> save() throws PersistenceException {
      return super.save(new String [] {"DistritoController.list", "DistritoController.options"});
    }

    public CompletionStage<Result> update(Long id) throws PersistenceException {
      return super.update(id, new String [] {"DistritoController.list", "DistritoController.options"});
    }
}
