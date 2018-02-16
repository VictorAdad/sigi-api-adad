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
import java.util.concurrent.CompletionStage;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.Json;
import play.Logger;
import play.Logger.ALogger;
import play.mvc.Result;
import play.mvc.With;
import repository.NotificacionesRepository;

import static java.util.concurrent.CompletableFuture.supplyAsync;

@With(SecuredBasicAuth.class)
public class NotificacionesController extends BaseController {

    public NotificacionesRepository repository;
    private final ALogger logger = Logger.of(this.getClass());

    @Inject
    public NotificacionesController(
        FormFactory formFactory,
        NotificacionesRepository repository,
        HttpExecutionContext httpExecutionContext
    ) {
        super(formFactory, repository, httpExecutionContext);
        this.repository = repository;
    }

    public CompletionStage<Result> pageByUser(int page, String sortBy, String order, String filter, int tr, String usr) {
        Logger.debug("Information controller method : \n\t "+super.controller+"@pageByUser");
        return super.page("pageByUser", new Object[]{
            page, sortBy, order, filter, tr, usr
        });
    }

    public CompletionStage<Result> countSinLeer(String usr) {
        return supplyAsync(() -> {
            return ok(this.repository.countSinLeer(usr));
        }, httpExecutionContext.current());
    }

    public CompletionStage<Result> countLeido(Long id) {
        return supplyAsync(() -> {
            return ok(this.repository.countLeido(id));
        }, httpExecutionContext.current());
    }
}

