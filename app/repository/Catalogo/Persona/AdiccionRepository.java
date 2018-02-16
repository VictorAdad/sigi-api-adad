package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.Map;
import javax.inject.Inject;
import models.Adiccion;
import play.db.ebean.EbeanConfig;

public class AdiccionRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public AdiccionRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Adiccion.class);
    }

    public PagedList<Adiccion> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<Adiccion>  exp = super.getEbeanServer().find(Adiccion.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }
}
