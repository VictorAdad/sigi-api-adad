package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.FormaConducta;
import play.db.ebean.EbeanConfig;

public class FormaConductaRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public FormaConductaRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, FormaConducta.class);
    }

    public PagedList<FormaConducta> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<FormaConducta>  exp = super.getEbeanServer().find(FormaConducta.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<FormaConducta> list() {
        return super.list(super.getEbeanServer().find(FormaConducta.class).where());
    }
}
