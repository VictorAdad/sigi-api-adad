package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.TipoTransportacion;
import play.db.ebean.EbeanConfig;

public class TipoTransportacionRepository extends BaseRepository{
    private static final String FIELD = "tipo";

    @Inject
    public TipoTransportacionRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, TipoTransportacion.class);
    }

    public PagedList<TipoTransportacion> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<TipoTransportacion>  exp = super.getEbeanServer().find(TipoTransportacion.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<TipoTransportacion> list() {
        return super.list(super.getEbeanServer().find(TipoTransportacion.class).where());
    }
}
