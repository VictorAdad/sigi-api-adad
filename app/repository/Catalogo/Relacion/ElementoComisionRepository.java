package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.ElementoComision;
import play.db.ebean.EbeanConfig;

public class ElementoComisionRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public ElementoComisionRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, ElementoComision.class);
    }

    public PagedList<ElementoComision> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<ElementoComision>  exp = super.getEbeanServer().find(ElementoComision.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<ElementoComision> list() {
        return super.list(super.getEbeanServer().find(ElementoComision.class).where());
    }
}
