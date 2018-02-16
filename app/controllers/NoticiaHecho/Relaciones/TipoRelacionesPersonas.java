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
import java.util.concurrent.CompletableFuture;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import models.BaseModel;
import models.TipoRelacionPersona;
import models.DetalleDelito;
import models.TipoRelacionPersona;
import play.cache.AsyncCacheApi;
import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.Json;
import play.mvc.Result;
import play.mvc.With;
import play.Logger;
import repository.TipoRelacionPersonaRepository;

import static java.util.concurrent.CompletableFuture.supplyAsync;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de CalibreMecanismo que es y forma parte
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
public class TipoRelacionesPersonas extends CaseCatalogBaseController {

    private AsyncCacheApi cache;

    TipoRelacionPersonaRepository tipoR;

    @Inject
    public TipoRelacionesPersonas(FormFactory formFactory,
                TipoRelacionPersonaRepository repository,
                HttpExecutionContext httpExecutionContext,
                AsyncCacheApi cache) {
        super(formFactory, repository, httpExecutionContext);
        this.tipoR = repository;
        this.cache = cache;
    }

    /****************************************************************
    *****************************************************************
    ***                        METODOS CRUD                       ***
    *****************************************************************
    ****************************************************************/

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
    public CompletionStage<Result> list() throws PersistenceException {
        return super.list("list", new Class[]{
        }, new Object[]{
        });
    }


    /**
     * Metodo que guarda un objeto de TipoRelacionPersona.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @return      Json con el objeto de TipoRelacionPersona guardado
     * @see         models.TipoRelacionPersona
     *
     * @version 1.0
     *
     * @since 1.0
     */

    public CompletionStage<Result> save() {
        Form<DetalleDelito> form = formFactory.form(DetalleDelito.class, BaseModel.SaveStep.class).bindFromRequest();
        Logger.debug("Information controller method : \n\t TipoRelacionPersonas@save \n\t Form: "+ form +" \n\t data: "+ Json.prettyPrint(Json.toJson(form.get())));
        //return supplyAsync(() -> {
            if (form.hasErrors()){
                return supplyAsync(() -> badRequest( this.errorContructor(form.errorsAsJson())), httpExecutionContext.current());
            }
                DetalleDelito object = form.get();
                //Object object = tipoR.save(form.get());
                
                // if (obj != null) {return CompletableFuture.completedFuture(personaR.save(object));
                return CompletableFuture.completedFuture(tipoR.save(object));
                //   return created(Json.toJson(((DetalleDelito)obj).tipoRelacionPersona));
                // }else{
                //     return internalServerError(
                //         this.errorContructor(
                //             this.createError("internalServerError", "No se pudo almacenar el registro")
                //         )
                //     );
                // }

        //}, httpExecutionContext.current());            
    }
}
