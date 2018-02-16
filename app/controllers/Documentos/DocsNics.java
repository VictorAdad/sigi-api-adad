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
import io.ebean.PagedList;
import javax.inject.Inject;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.Logger;
import play.libs.Json;
import models.DocNic;
import repository.DocNicRepository;
import play.mvc.Result;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de DocNic que es y forma parte
  * de un caso de investigacion para la fiscalia del estado de
  * toluca.
  *
  * @author  Oli
  * @see     Set
  * @see     List
  * @see     Map
  * @see     Json
  * @see     Controllers
  * @since   1.0
  * @version 1.0
  */

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class DocsNics extends DocumentBaseController {

    DocNicRepository docNicR;

    @Inject
    public DocsNics(
        FormFactory formFactory,
        DocNicRepository repository,
        DocNic model,
        HttpExecutionContext httpExecutionContext
    ) {
        super(formFactory, model, httpExecutionContext);
        this.docNicR = repository;
    }

    public CompletionStage<Result> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        Logger.debug("Information controller method : \n\t DocsNics@pageByCase ");
        return supplyAsync(() -> {
            try {
                PagedList<DocNic> obj = docNicR.pageByCase(id,page,sortBy,order,filter,tr);
                return ok(this.pageConstructor(obj));
            } catch(Exception e) {
                String errorMessage = e.getMessage();
                Logger.error(errorMessage);
                return badRequest( Json.parse( errorMessage.split(": ")[1]) );
            }
        }, httpExecutionContext.current());            
    }
}
