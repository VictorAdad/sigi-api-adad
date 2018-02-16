package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.CalibreMecanismo;
import play.db.ebean.EbeanConfig;

public class CalibreMecanismoRepository extends BaseRepository{
    private static final String FIELD = "mecanismo";

    @Inject
    public CalibreMecanismoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, CalibreMecanismo.class);
    }

    public PagedList<CalibreMecanismo> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<CalibreMecanismo>  exp = super.getEbeanServer().find(CalibreMecanismo.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<CalibreMecanismo> list() {
        return super.list(super.getEbeanServer().find(CalibreMecanismo.class).where());
    }
}
