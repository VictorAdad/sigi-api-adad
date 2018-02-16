package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.EfectoDetalle;
import play.db.ebean.EbeanConfig;

public class EfectoDetalleRepository extends BaseRepository{
    private static final String FIELD = "efecto";

    @Inject
    public EfectoDetalleRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, EfectoDetalle.class);
    }

    public PagedList<EfectoDetalle> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<EfectoDetalle>  exp = super.getEbeanServer().find(EfectoDetalle.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<EfectoDetalle> list() {
        return super.list(super.getEbeanServer().find(EfectoDetalle.class).where());
    }
}
