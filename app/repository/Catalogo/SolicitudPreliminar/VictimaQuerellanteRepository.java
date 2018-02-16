package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import models.VictimaQuerellante;
import play.db.ebean.EbeanConfig;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class VictimaQuerellanteRepository extends BaseRepository{

    @Inject
    public VictimaQuerellanteRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, VictimaQuerellante.class);
    }

    public PagedList<VictimaQuerellante> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {"nombre"};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<VictimaQuerellante>  exp = super.getEbeanServer().find(VictimaQuerellante.class).where();
        exp.orderBy("nombre");
        return super.options(exp, "id", "nombre");
    }
}
