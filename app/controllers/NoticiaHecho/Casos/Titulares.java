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
import java.util.List;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import models.BaseModel;
import models.Titular;
import ldpaModels.Ldap;
import ldpaModels.User;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.mvc.With;
import play.Logger;
import repository.TitularRepository;
import play.data.Form;
import play.libs.Json;
import core.util.email.Email;
import com.typesafe.config.Config;
import static java.util.concurrent.CompletableFuture.supplyAsync;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de Titular que es y forma parte
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
public class Titulares extends CaseCatalogBaseController {

    @Inject 
    private Config configuration;

    @Inject
    public Titulares(
        FormFactory formFactory,
        TitularRepository repository,
        HttpExecutionContext httpExecutionContext
    ) {
        super(formFactory, repository, httpExecutionContext);
    }

    /**
     * Metodo que guarda un objeto de Titular.
     *
     * @author Oli Mixtega
     *
     * @return      Json con el objeto de Titular guardado
     * @see         models.Titular
     *
     * @version 1.0
     *
     * @since 1.0
     */
    public CompletionStage<Result> save() {
        Form<Titular> form = formFactory.form(Titular.class, BaseModel.SaveStep.class).bindFromRequest();
        try {
            Logger.debug("Information controller method : \n\t Titular@save");
            return supplyAsync(() -> {
                Long idCaso = Long.parseLong(form.rawData().get("caso.id"));
                Titular titularAnt = Titular.find.query().where()
                                                 .eq("caso.id", idCaso)
                                                 .eq("vigente", true)
                                                 .findUnique();
                titularAnt.vigente = false;
                titularAnt.update();
                Titular titular = form.get();
                titular.vigente = true;
                titular.save();
                titular.refresh();

                Ldap ldap = new Ldap(configuration);
                List<User> users = ldap.getUsers(titular.userNameAsignado);
                String email = "";
                String mensaje = "Se le transfirió un nuevo caso.";

                for (User user: users) {
                    email = user.getEmail();
                    try{
                        Logger.debug("trying to send email...");
                        Email.send(email, mensaje); 
                    }catch(Exception e){
                        Logger.error("error mandando el correo electronico", e);
                    }
                }

                return created(Json.toJson(titular));
            }, httpExecutionContext.current());
        } catch(Exception e) {
            Logger.error("Information controller method : \n\t Titular@save \n\t Form: "+ form);
            String errorMessage = e.getMessage();
            Logger.error(errorMessage);
            String[] errors = errorMessage.split(": ");
            return supplyAsync(() -> badRequest(Json.parse(errors[1]))
            , httpExecutionContext.current());
        }
    }

}
