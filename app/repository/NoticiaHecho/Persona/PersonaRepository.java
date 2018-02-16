
package repository;

import io.ebean.PagedList;
import io.ebean.Transaction;
import java.util.concurrent.CompletionStage;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import models.Persona;
import models.PersonaCaso;
import models.Estatus;
import models.Caso;
import core.util.Response;
import play.Logger.ALogger;
import play.Logger;
import play.db.ebean.EbeanConfig;
import play.libs.Json;
import play.mvc.Results;
import play.mvc.Result;


import static java.util.concurrent.CompletableFuture.supplyAsync;

public class PersonaRepository extends BaseRepository{

    private DatabaseExecutionContext executionContext;
    private final ALogger logger = Logger.of(this.getClass());

    @Inject
    public PersonaRepository(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        super(ebeanConfig, Persona.class);
        this.executionContext = executionContext;
    }

    public PagedList<Persona> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {"nombre"};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Result save(Object data) throws PersistenceException{
        // return supplyAsync(() -> {
            Object object = data;
            Transaction txn = ebeanServer.beginTransaction();
            try {
                ebeanServer.insert(object);
                ((Persona)object).personaCasoId = ((Persona)object).personaCaso.get(0).id;
                Estatus estatus = Estatus.find.query().where().eq("nombre", "Pre denuncia en espera").findUnique();
                Caso caso = Caso.find.byId(((Persona)object).personaCaso.get(0).caso.id);
                if (!caso.estatus.nombre.equals("NIC creado") && 
                    !caso.estatus.nombre.equals("Acuerdo de inicio") && 
                    !caso.estatus.nombre.equals("NUC creado") &&
                    !caso.estatus.nombre.equals("Actuaciones") &&
                    !caso.estatus.nombre.equals("Cierre relativo")) {
                    caso.estatus = estatus;
                    caso.update();                
                }
                txn.commit();
            } catch (PersistenceException e) {
                e.printStackTrace();
                txn.rollback();
                return Results.badRequest(Response.createError("PersistenceException",e.getMessage()));
            }
            txn.end();
            return Results.ok(Json.toJson(object));
        // }, executionContext);
    }

    public Object update(Long id, Object data) {
        logger.debug("Persona@update... ");
        Object object = data;
        Transaction txn = ebeanServer.beginTransaction();
        try {
            ((Persona)object).personaCasoId = ((Persona)object).personaCaso.get(0).id;
            ebeanServer.update(object);  
            ebeanServer.refresh(object);
            txn.commit();
        } catch (Exception e) {
            logger.error("Error while trying to update object registry in database", e);
            logger.error("Data: {}", Json.toJson(object));
            txn.rollback();
            object = null;
        }
        txn.end();
        return object;
    }
}
