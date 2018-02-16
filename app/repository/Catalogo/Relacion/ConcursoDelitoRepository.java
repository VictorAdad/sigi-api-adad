package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.ConcursoDelito;
import play.db.ebean.EbeanConfig;

public class ConcursoDelitoRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public ConcursoDelitoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, ConcursoDelito.class);
    }

    public PagedList<ConcursoDelito> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<ConcursoDelito>  exp = super.getEbeanServer().find(ConcursoDelito.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<ConcursoDelito> list() {
        return super.list(super.getEbeanServer().find(ConcursoDelito.class).where());
    }
}
