package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.LabioOjo;
import play.db.ebean.EbeanConfig;

public class LabioOjoRepository extends BaseRepository{
    private static final String FIELD = "colorOjo";

    @Inject
    public LabioOjoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, LabioOjo.class);
    }

    public PagedList<LabioOjo> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<LabioOjo>  exp = super.getEbeanServer().find(LabioOjo.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<LabioOjo> list() {
        return super.list(super.getEbeanServer().find(LabioOjo.class).where());
    }
}
