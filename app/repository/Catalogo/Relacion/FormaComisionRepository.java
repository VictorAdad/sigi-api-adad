package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.FormaComision;
import play.db.ebean.EbeanConfig;

public class FormaComisionRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public FormaComisionRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, FormaComision.class);
    }

    public PagedList<FormaComision> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<FormaComision>  exp = super.getEbeanServer().find(FormaComision.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<FormaComision> list() {
        return super.list(super.getEbeanServer().find(FormaComision.class).where());
    }
}
