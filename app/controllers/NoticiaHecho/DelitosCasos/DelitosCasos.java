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
import java.util.Map;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import models.BaseModel;
import models.Caso;
import models.Delito;
import models.DelitoCaso;
import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.Json;
import play.Logger;
import play.mvc.Result;
import play.mvc.With;
import repository.DelitoCasoRepository;
import static java.util.concurrent.CompletableFuture.supplyAsync;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de DelitoCaso que es y forma parte
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
public class DelitosCasos extends CaseCatalogBaseController {

    @Inject
    public DelitosCasos(
        FormFactory formFactory,
        DelitoCasoRepository repository,
        HttpExecutionContext httpExecutionContext
    ) {
        super(formFactory, repository, httpExecutionContext);
    }

    /****************************************************************
    *****************************************************************
    ***                        METODOS CRUD                       ***
    *****************************************************************
    ****************************************************************/

    /**
     * Metodo que retorna la actualizacion de un Modelo de DelitoCaso.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @param  id   id de DelitoCaso
     *
     * @return      Json de DelitoCaso actualizado
     * @see         models.DelitoCaso
     *
     * @version 1.0
     *
     * @since 1.0
     */
    public CompletionStage<Result> list(Long id) throws PersistenceException {
        return super.list("listByCase", new Class[]{
            Long.class
        }, new Object[]{
            id
        });
    }

    /**
     * Metodo que guarda un objeto de DelitoCaso.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @return      Json con el objeto de DelitoCaso guardado
     * @see         models.DelitoCaso
     *
     * @version 1.0
     *
     * @since 1.0
     */
    public CompletionStage<Result> save() {
        try {
            Form<DelitoCaso> form = formFactory.form(DelitoCaso.class, BaseModel.UpdateStep.class).bindFromRequest();
            Logger.debug("Information controller method : \n\t DelitosCasos@save \n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
            return supplyAsync(() -> {
                Long idCaso = Long.parseLong(form.rawData().get("caso.id"));
                Long idDelito = Long.parseLong(form.rawData().get("delito.id"));

                List<DelitoCaso> delitosCasos = DelitoCaso.find.query().where()
                                                .eq("caso.id", idCaso)
                                                .eq("delito.id", idDelito)
                                                .findList();

                if(!delitosCasos.isEmpty()){
                    return badRequest( Json.parse("{\"error\":\"Ese caso(" + idCaso + ") ya está ligado a ese delito(" + idDelito + ").\",\"estatus\":\"404\"}") );
                }else{
                    Delito delito = Delito.find.byId(idDelito);
                    Caso caso = Caso.find.byId(idCaso);
                    if(delito == null)
                        return badRequest( Json.parse("{\"error\":\"Ese delito(" + idDelito + ") no existe.\",\"estatus\":\"404\"}") );
                    if(caso == null)
                        return badRequest( Json.parse("{\"error\":\"Ese caso(" + idCaso + ") no existe.\",\"estatus\":\"404\"}") );
                    DelitoCaso delitoCaso = new DelitoCaso();
                    delitoCaso.delito = delito;
                    delitoCaso.caso = caso;
                    delitoCaso.save();
                    return created(Json.toJson(delitoCaso));
                }
            }, httpExecutionContext.current());
        } catch(Exception e) {
            String errorMessage = e.getMessage();
            Logger.error(errorMessage);
            String[] errors = errorMessage.split(": ");
            return supplyAsync(() -> badRequest(Json.parse(errors[1]))
            , httpExecutionContext.current());
        }
    }

    /**
     * Método para cambiar el delito principal
     *
     * @author Jesús Martín Viveros Aguilar
     *
     * @param  id   id de delito
     *
     * @return      Json de Delito actualizado
     * @see         models.Delito
     *
     * @version 1.0
     *
     * @since 1.0
     */
    public CompletionStage<Result> patch(Long id) throws PersistenceException {
        Logger.debug("Information controller method : \n\t DelitoCaso@patch \n\t id: "+ id);
        return supplyAsync(() -> {
            DelitoCaso delitoCaso = DelitoCaso.find.byId(id);
            delitoCaso.principal = !delitoCaso.principal;
            delitoCaso.update();
            return ok(Json.toJson(delitoCaso));
        }, httpExecutionContext.current());
    }


    /**
     * Método para cambiar el delito principal
     *
     * @author Gibrán Córdoba
     *
     * @param   id          id del delitoCaso a actualizar como delito predeterminado
     * @param   idCaso      id de caso
     *
     * @return      Json de Delito actualizado
     * @see         models.Delito
     *
     * @version 1.0
     *
     * @since 1.0
     */
    public CompletionStage<Result> setDefault(Long id, Long idCaso){
        Logger.debug("Information controller method : \n\t DelitoCaso@setDefault \n\t id: "+ id + "\n\t idCaso: "+ idCaso);
        return supplyAsync(() -> {
            if ( !((DelitoCasoRepository)this.repository).validateCase(idCaso) ) {
                return badRequest(this.errorContructor(
                    this.createError("badRequestError", "No se encontro el caso o el delitoCaso")
                ));
            }else{
                DelitoCaso dc = ((DelitoCasoRepository)this.repository).validRelation(id, idCaso);
                if (dc != null){
                    if( ((DelitoCasoRepository)this.repository).setDefault(dc, idCaso) ){
                        return ok(this.createNode("message", 
                            "El Delito con ID "+id+" se actualizo correctamente como nuevo predeterminado"
                        ));
                    }else{
                        return internalServerError(this.errorContructor(
                            this.createError("internalServerError", 
                                "El Caso no esta relacionado con el Delito que requiere ser predeterminado"
                            )
                        ));
                    }
                }else{
                    return badRequest(this.errorContructor(
                        this.createError("internalServerError", 
                            "El Caso no esta relacionado con el Delito que requiere ser predeterminado"
                        )
                    ));
                }
            }
        }, httpExecutionContext.current());
    }
}
