package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import models.TipoExamen;
import play.db.ebean.EbeanConfig;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class TipoExamenRepository extends BaseRepository{

    @Inject
    public TipoExamenRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, TipoExamen.class);
    }

    public PagedList<TipoExamen> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {"nombre"};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<TipoExamen>  exp = super.getEbeanServer().find(TipoExamen.class).where();
        exp.orderBy("nombre");
        return super.options(exp, "id", "nombre");
    }
}
