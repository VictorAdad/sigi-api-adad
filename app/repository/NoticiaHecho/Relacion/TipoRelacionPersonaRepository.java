package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import io.ebean.Transaction;
import java.util.concurrent.CompletionStage;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import models.DetalleDelito;
import models.TipoRelacionPersona;
import models.DelitoCaso;
import models.Estatus;
import models.Caso;
import core.util.Response;
import play.db.ebean.EbeanConfig;
import play.libs.Json;
import play.Logger.ALogger;
import play.Logger;
import play.mvc.Results;
import play.mvc.Result;
import static java.util.concurrent.CompletableFuture.supplyAsync;

public class TipoRelacionPersonaRepository extends BaseRepository{

    private DatabaseExecutionContext executionContext;
    private final ALogger logger = Logger.of(this.getClass());

    @Inject
    public TipoRelacionPersonaRepository(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        super(ebeanConfig, TipoRelacionPersona.class);
        this.executionContext = executionContext;
    }

    public List<TipoRelacionPersona> list() {
        return super.list(super.getEbeanServer().find(TipoRelacionPersona.class).where());
    }

    public PagedList<TipoRelacionPersona> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {"tipo"};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public PagedList<TipoRelacionPersona> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<TipoRelacionPersona>  exp = super.getEbeanServer().find(TipoRelacionPersona.class).where();
        exp.eq("caso.id", id);
        String[] fields = {"caso.titulo"};
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }

    public Result save(Object data) throws PersistenceException{
        Logger.debug("TipoRelacionPersona@save()");
        DetalleDelito object = (DetalleDelito)data;
        Transaction txn = ebeanServer.beginTransaction();
        try {
            ebeanServer.insert(object);
            object.tipoRelacionPersona.detalleDelito = object;
            ebeanServer.insert(object.tipoRelacionPersona);
            
            if (object.tipoRelacionPersona.lugarTipoRelacionPersona.size() > 0){
                object.tipoRelacionPersona.lugarTipoRelacionPersona.get(0).tipoRelacionPersona = object.tipoRelacionPersona;
                ebeanServer.insert(object.tipoRelacionPersona.lugarTipoRelacionPersona.get(0));
            }

            if (object.tipoRelacionPersona.armaTipoRelacionPersona != null  &&  object.tipoRelacionPersona.armaTipoRelacionPersona.size() > 0){
                object.tipoRelacionPersona.armaTipoRelacionPersona.get(0).tipoRelacionPersona = object.tipoRelacionPersona;
                ebeanServer.insert(object.tipoRelacionPersona.armaTipoRelacionPersona.get(0));
            }

            if (object.tipoRelacionPersona.vehiculoTipoRelacionPersona != null && object.tipoRelacionPersona.vehiculoTipoRelacionPersona.size() > 0){
                object.tipoRelacionPersona.vehiculoTipoRelacionPersona.get(0).tipoRelacionPersona = object.tipoRelacionPersona;
                ebeanServer.insert(object.tipoRelacionPersona.vehiculoTipoRelacionPersona.get(0));

            }
            Estatus estatus = Estatus.find.query().where().eq("nombre", "NIC creado").findUnique();
            object.tipoRelacionPersona.caso.estatus = estatus;
            object.tipoRelacionPersona.caso.update();
            ebeanServer.refresh(object);
            txn.commit();
        } catch (PersistenceException e) {
            logger.error("Error while trying to save object registry in database", e);
            logger.error("Data: {}", Json.toJson(object));
            txn.rollback();
            return Results.badRequest(Response.createError("PersistenceException",e.getMessage()));
        }
        txn.end();
        return Results.ok(Json.toJson(object.tipoRelacionPersona));
    }

}