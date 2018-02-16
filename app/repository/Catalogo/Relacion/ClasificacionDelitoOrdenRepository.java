package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.ClasificacionDelitoOrden;
import play.db.ebean.EbeanConfig;

public class ClasificacionDelitoOrdenRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public ClasificacionDelitoOrdenRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, ClasificacionDelitoOrden.class);
    }

    public PagedList<ClasificacionDelitoOrden> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<ClasificacionDelitoOrden>  exp = super.getEbeanServer().find(ClasificacionDelitoOrden.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<ClasificacionDelitoOrden> list() {
        return super.list(super.getEbeanServer().find(ClasificacionDelitoOrden.class).where());
    }
}
