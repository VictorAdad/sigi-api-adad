package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import models.DenunciaQuerella;
import play.db.ebean.EbeanConfig;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class DenunciaQuerellaRepository extends BaseRepository{

    @Inject
    public DenunciaQuerellaRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, DenunciaQuerella.class);
    }

    public PagedList<DenunciaQuerella> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {"nombre"};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        Map<String, String> options = null;
        ExpressionList<DenunciaQuerella>  exp = super.getEbeanServer().find(DenunciaQuerella.class).where();
        exp.orderBy("nombre");
        if (super.options(exp, "id", "nombre") instanceof Map) {
            options = super.options(exp, "id", "nombre");
        }
        return options;
    }
}
