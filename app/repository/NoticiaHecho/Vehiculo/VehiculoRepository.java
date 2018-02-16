package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.List;
import io.ebean.Transaction;
import java.util.concurrent.CompletionStage;
import javax.inject.Inject;
import models.Vehiculo;
import core.util.Response;
import play.db.ebean.EbeanConfig;
import play.libs.Json;
import play.mvc.Results;
import play.mvc.Result;
import play.Logger;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class VehiculoRepository extends BaseRepository{
    
    private DatabaseExecutionContext executionContext;

    @Inject
    public VehiculoRepository(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        super(ebeanConfig, Vehiculo.class);
        this.executionContext = executionContext;
    }

    public Result save(Object data) {
        Object object = data;
        Transaction txn = ebeanServer.beginTransaction();
        try {
            ebeanServer.insert(object);
            ebeanServer.update(object);
            txn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            txn.rollback();
            Logger.error("Data: {}", Json.toJson(object));
            return Results.badRequest(Response.createError("Exception",e.getMessage()));
        }
        txn.end();
        return Results.ok(Json.toJson(object));
    }
    public PagedList<Vehiculo> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {"campoVehiculo"};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public PagedList<Vehiculo> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<Vehiculo>  exp = super.getEbeanServer().find(Vehiculo.class).where();
        exp.eq("caso.id", id);
        String[] fields = {"campoVehiculo"};
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }

    public List<Vehiculo> listByCase(Long id) {
        ExpressionList<Vehiculo>  exp = super.getEbeanServer().find(Vehiculo.class).where();
        exp.eq("caso.id", id);
        return super.list(exp);
    }


}
