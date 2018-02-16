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
import models.TipoLinea;
import play.cache.AsyncCacheApi;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.cache.Cached;
import play.mvc.With;
import repository.TipoLineaRepository;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de TipoLinea que es y forma parte
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
public class TipoLineaController extends BaseController {

    private AsyncCacheApi cache;

    @Inject
    public TipoLineaController(FormFactory formFactory,
                TipoLineaRepository repository,
                HttpExecutionContext httpExecutionContext,
                AsyncCacheApi cache) {
        super(formFactory, repository, httpExecutionContext, cache);
        this.cache = cache;
    }

    @Cached(key = "TipoLineaController.options", duration = (60*60) * 2 )
    public CompletionStage<Result> options() {
        return super.list("options", new Class[]{}, new Object[]{});
    }

    public CompletionStage<Result> save() throws PersistenceException {
      return super.save(new String [] {"TipoLineaController.options"});
    }

    public CompletionStage<Result> update(Long id) throws PersistenceException {
      return super.update(id, new String [] {"TipoLineaController.options"});
    }
}
