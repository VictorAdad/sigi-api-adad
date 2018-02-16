package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.Cabello;
import play.db.ebean.EbeanConfig;

public class CabelloRepository extends BaseRepository{
    private static final String FIELD = "color";

    @Inject
    public CabelloRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Cabello.class);
    }

    public PagedList<Cabello> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<Cabello>  exp = super.getEbeanServer().find(Cabello.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<Cabello> list() {
        return super.list(super.getEbeanServer().find(Cabello.class).where());
    }
}
