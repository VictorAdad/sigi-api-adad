package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import io.ebean.Transaction;
import java.util.List;
import javax.inject.Inject;
import models.Titular;
import core.util.Response;
import play.db.ebean.EbeanConfig;
import play.libs.Json;
import play.mvc.Result;
import play.mvc.Results;
import play.Logger;

public class TitularRepository extends BaseRepository{

    @Inject
    public TitularRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Titular.class);
    }

    public PagedList<Titular> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<Titular>  exp = super.getEbeanServer().find(Titular.class).where();
        exp.eq("caso.id", id);
        String[] fields = {"fechaAsignacion"};
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }

    public Result save(Object data) {
        Object object = data;
        Transaction txn = ebeanServer.beginTransaction();
        try {
            Titular titular = ((Titular)object);
            titular.vigente = true;
            ebeanServer.insert(titular);
            Titular titularAnt = Titular.find.query().where()
                                                .eq("caso.id", titular.caso.id)
                                                .eq("vigente", true)
                                                .findUnique();
            titularAnt.vigente = false;
            ebeanServer.update(titularAnt);
            txn.commit();
        } catch (Exception e) {
            txn.rollback();
            Logger.error("Data: {}", Json.toJson(object));
            return Results.badRequest(Response.createError("Exception",e.getMessage()));
        }
        txn.end();
        return Results.ok(Json.toJson(object));
    }

}
