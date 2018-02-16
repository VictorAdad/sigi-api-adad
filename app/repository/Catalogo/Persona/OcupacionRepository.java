package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.Map;
import javax.inject.Inject;
import models.Ocupacion;
import play.db.ebean.EbeanConfig;

public class OcupacionRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public OcupacionRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Ocupacion.class);
    }

    public PagedList<Ocupacion> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {OcupacionRepository.FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<Ocupacion>  exp = super.getEbeanServer().find(Ocupacion.class).where();
        exp.orderBy(OcupacionRepository.FIELD);
        return super.options(exp, "id", OcupacionRepository.FIELD);
    }
}
