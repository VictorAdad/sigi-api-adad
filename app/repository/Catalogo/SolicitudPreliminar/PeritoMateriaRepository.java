package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import models.PeritoMateria;
import play.db.ebean.EbeanConfig;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class PeritoMateriaRepository extends BaseRepository{

    @Inject
    public PeritoMateriaRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, PeritoMateria.class);
    }

    public PagedList<PeritoMateria> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {"nombre"};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<PeritoMateria>  exp = super.getEbeanServer().find(PeritoMateria.class).where();
        exp.orderBy("nombre");
        return super.options(exp, "id", "nombre");
    }
}
