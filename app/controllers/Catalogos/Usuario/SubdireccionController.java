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
import play.mvc.Result;
import javax.persistence.PersistenceException;
import javax.inject.Inject;
import models.Subdireccion;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.Json;
import repository.SubdireccionRepository;
import play.mvc.With;
import play.cache.AsyncCacheApi;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de Subdireccion que es y forma parte
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
public class SubdireccionController extends BaseController {

    private SubdireccionRepository subdireccionR;

    @Inject
    public SubdireccionController(
        FormFactory formFactory,
        SubdireccionRepository repository,
        HttpExecutionContext httpExecutionContext,
        AsyncCacheApi cache
    ) {
        super(formFactory, repository, httpExecutionContext, cache);
        this.subdireccionR = repository;
    }

    public CompletionStage<Result> options() {
        return super.list("options", new Object[]{}, "SubdireccionController.options", 60 * 30);
    }

    public CompletionStage<Result> save() throws PersistenceException {
      return super.save(new String [] {"SubdireccionController.options"});
    }

    public CompletionStage<Result> update(Long id) throws PersistenceException {
      return super.update(id, new String [] {"SubdireccionController.options"});
    }
}
