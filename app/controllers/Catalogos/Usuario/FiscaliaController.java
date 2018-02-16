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
import models.Fiscalia;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.Json;
import repository.FiscaliaRepository;
import play.mvc.With;
import play.cache.AsyncCacheApi;
import play.cache.Cached;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de Fiscalia que es y forma parte
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
public class FiscaliaController extends BaseController {

    private FiscaliaRepository fiscaliaR;

    @Inject
    public FiscaliaController(
        FormFactory formFactory,
        FiscaliaRepository repository,
        HttpExecutionContext httpExecutionContext,
        AsyncCacheApi cache
    ) {
        super(formFactory, repository, httpExecutionContext, cache);
        this.fiscaliaR = repository;
    }

    public CompletionStage<Result> options() {
        return super.list("options", new Object[]{}, "FiscaliaController.options", 60 * 30);
    }

    public CompletionStage<Result> save() throws PersistenceException {
      return super.save(new String [] {"FiscaliaController.options"});
    }
    
    public CompletionStage<Result> update(Long id) throws PersistenceException {
      return super.update(id, new String [] {"FiscaliaController.options"});
    }
}
