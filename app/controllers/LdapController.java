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

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import java.util.concurrent.CompletionStage;
import javax.inject.Inject;
import play.libs.concurrent.HttpExecutionContext;
import repository.LdapRepository;
import com.typesafe.config.Config;

@With(SecuredBasicAuth.class)
public class LdapController extends SimpleController {

    @Inject 
    private Config configuration;

    @Inject
    public LdapController(
        LdapRepository repository,
        HttpExecutionContext httpExecutionContext,
        Config configuration
    ) {
        super(repository, httpExecutionContext,configuration);
    }


    public CompletionStage<Result> getAgencies(String fiscalia) {
        return super.exec("getAgencies", new Object[] {
            fiscalia
        });
    }


    public CompletionStage<Result> getMembers(String agencia) {
        return super.exec("getMembers", new Object[] {
            agencia
        });
    }

    public CompletionStage<Result> getUsers(String usuario) {
        return super.exec("getUsers", new Object[] {
            usuario
        });
    }


    public CompletionStage<Result> getAllAgencies() {
        return super.exec("getAllAgencies", new Object[] {});
    }
}
