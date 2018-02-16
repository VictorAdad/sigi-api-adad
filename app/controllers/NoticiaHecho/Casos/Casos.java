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

import com.fasterxml.jackson.annotation.JsonView;
import java.sql.SQLException;
import java.util.concurrent.CompletionStage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import models.BaseModel;
import ldpaModels.User;
import models.Caso;
import models.Titular;
import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.Json;
import play.Logger.ALogger;
import play.Logger;
import play.mvc.Result;
import play.mvc.With;
import repository.CasoRepository;
import com.typesafe.config.Config;

import static java.util.concurrent.CompletableFuture.supplyAsync;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de Caso para la fiscalia del
  * estado de toluca.
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
public class Casos extends BaseController {
    public CasoRepository casoR;
    private final ALogger logger = Logger.of(this.getClass());

    @Inject 
    private Config configuration;

    @Inject
    public Casos(
        FormFactory formFactory,
        CasoRepository repository,
        HttpExecutionContext httpExecutionContext,
        Config configuration
    ) {
        super(formFactory, repository, httpExecutionContext,configuration);
        this.casoR = repository;
    }

    /****************************************************************
    *****************************************************************
    ***                        METODOS CRUD                       ***
    *****************************************************************
    ****************************************************************/

    /**
     * Metodo que guarda un objeto de Caso.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @return      Json con el objeto de Caso guardado
     * @see         models.Caso
     *
     * @version 1.0
     *
     * @since 1.0
     */
    public CompletionStage<Result> save() {
        Form<Caso> form = this.formFactory.form(Caso.class, BaseModel.SaveStep.class).bindFromRequest();
        logger.debug("Information controller method: Casos@save \n\t Form: "+ form);
        return supplyAsync(() -> {
            try {
                if (form.hasErrors())
                    return badRequest( this.errorContructor(form.errorsAsJson()));

                Long idDelito = Long.parseLong(form.rawData().get("delitoCaso.delito.id"));
                Object obj = casoR.save(form.get(), idDelito);
                return created(Json.toJson(obj));
            } catch(PersistenceException e) {
                String errorMessage = e.getMessage();
                Logger.error("Information controller method: Casos@save \n\t Form: "+ form);
                return badRequest( Json.parse( errorMessage.split(": ")[1]) );
            } catch(NullPointerException e){
                String errorMessage = e.getMessage();
                Logger.error("Information controller method: Casos@save \n\t Form: "+ form);
                return badRequest( Json.parse( errorMessage.split(": ")[1]) );
            }
        }, httpExecutionContext.current());            
    }

    public CompletionStage<Result> get(Long id){
        return super.get(id, Caso.class, Caso.Get.class);
    }

    public CompletionStage<Result> page(int p, String sortBy, String order, String filter, int tr){
        return super.page(p, sortBy, order, filter, tr, Caso.Page.class);
    }

    public CompletionStage<Result> pageByTitular(int page, String sortBy, String order, String filter, int tr, String usr) {
        Logger.debug("Information controller method : \n\t "+super.controller+"@pageByTitular");
        return super.page("pageByTitular", new Object[]{
            page, sortBy, order, filter, tr, usr
        });
    }

    public CompletionStage<Result> pageByFiscalia(int page, String sortBy, String order, String filter, int tr, String fiscalia) {
        Logger.debug("Information controller method : \n\t "+super.controller+"@pageByFiscalia");
        return super.page("pageByFiscalia", new Object[]{
            page, sortBy, order, filter, tr, fiscalia
        });
    }

    public CompletionStage<Result> getAll(Long id){
      return supplyAsync(() -> {
          try{
              HashMap<String,Object> val = casoR.getAll(id);
              if (val != null ){
                  return ok(Json.toJson(val));
              }else{
                  return ok("[]");
              }
          }catch(Exception e){
              Logger.error("Exception:"+e);
              return ok("[]");
          }
      }, httpExecutionContext.current());
    }  

    public CompletionStage<Result> getDocuments(Long id){
      return supplyAsync(() -> {
          try{
              HashMap<String,Object> val = casoR.getDocuments(id);
              if (val != null ){
                  return ok(Json.toJson(val));
              }else{
                  return internalServerError(
                      this.errorContructor(
                          this.createError("internalServerError", "No se pudo concluir el procedimiento, contactar a sistemas")
                      )
                  );
              }
          }catch(Exception e){
              Logger.error("Exception:"+e);
              return internalServerError(
                  this.errorContructor(
                      this.createError("internalServerError", "Error al procesar la información")
                  )
              );
          }
      }, httpExecutionContext.current());
    }  

    public CompletionStage<Result> getPropietario(Long id){
      return supplyAsync(() -> {
          try{
              User object = Titular.getPropietarioTitular(configuration,id);
              if (object != null ){
                  return ok(Json.toJson(object));
              }else{
                  return ok("[]");
              }
          }catch(Exception e){
              Logger.error("Exception:"+e);
              return ok("[]");
          }
      }, httpExecutionContext.current());
    }  
}
