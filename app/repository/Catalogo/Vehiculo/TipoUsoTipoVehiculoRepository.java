package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.TipoUsoTipoVehiculo;
import play.db.ebean.EbeanConfig;

public class TipoUsoTipoVehiculoRepository extends BaseRepository{
    private static final String FIELD = "colorOjo";

    @Inject
    public TipoUsoTipoVehiculoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, TipoUsoTipoVehiculo.class);
    }

    public PagedList<TipoUsoTipoVehiculo> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<TipoUsoTipoVehiculo>  exp = super.getEbeanServer().find(TipoUsoTipoVehiculo.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<TipoUsoTipoVehiculo> list() {
        return super.list(super.getEbeanServer().find(TipoUsoTipoVehiculo.class).where());
    }
}
