package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import models.TipoDomicilio;
import play.db.ebean.EbeanConfig;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class TipoDomicilioRepository extends BaseRepository{

    @Inject
    public TipoDomicilioRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, TipoDomicilio.class);
    }

    public PagedList<TipoDomicilio> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {"nombre"};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public List<TipoDomicilio> list() {
        return super.list(super.getEbeanServer().find(TipoDomicilio.class).where());
    }

    public Map<String, String> options() {
        ExpressionList<TipoDomicilio>  exp = super.getEbeanServer().find(TipoDomicilio.class).where();
        exp.orderBy("nombre");
        return super.options(exp, "id", "nombre");
    }
}
