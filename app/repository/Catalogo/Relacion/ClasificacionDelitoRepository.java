package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.ClasificacionDelito;
import play.db.ebean.EbeanConfig;

public class ClasificacionDelitoRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public ClasificacionDelitoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, ClasificacionDelito.class);
    }

    public PagedList<ClasificacionDelito> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<ClasificacionDelito>  exp = super.getEbeanServer().find(ClasificacionDelito.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<ClasificacionDelito> list() {
        return super.list(super.getEbeanServer().find(ClasificacionDelito.class).where());
    }
}
