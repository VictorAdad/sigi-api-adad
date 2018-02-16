package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.ConductaDetalle;
import play.db.ebean.EbeanConfig;

public class ConductaDetalleRepository extends BaseRepository{
    private static final String FIELD = "conducta";

    @Inject
    public ConductaDetalleRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, ConductaDetalle.class);
    }

    public PagedList<ConductaDetalle> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<ConductaDetalle>  exp = super.getEbeanServer().find(ConductaDetalle.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<ConductaDetalle> list() {
        return super.list(super.getEbeanServer().find(ConductaDetalle.class).where());
    }
}
