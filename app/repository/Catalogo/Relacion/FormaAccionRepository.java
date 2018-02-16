package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.FormaAccion;
import play.db.ebean.EbeanConfig;

public class FormaAccionRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public FormaAccionRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, FormaAccion.class);
    }

    public PagedList<FormaAccion> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<FormaAccion>  exp = super.getEbeanServer().find(FormaAccion.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<FormaAccion> list() {
        return super.list(super.getEbeanServer().find(FormaAccion.class).where());
    }
}
