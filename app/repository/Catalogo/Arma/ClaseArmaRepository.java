package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.ClaseArma;
import play.db.ebean.EbeanConfig;

public class ClaseArmaRepository extends BaseRepository{
    private static final String FIELD = "clase";

    @Inject
    public ClaseArmaRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, ClaseArma.class);
    }

    public PagedList<ClaseArma> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<ClaseArma>  exp = super.getEbeanServer().find(ClaseArma.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }


    public List<ClaseArma> list() {
        return super.list(super.getEbeanServer().find(ClaseArma.class).where());
    }
}
