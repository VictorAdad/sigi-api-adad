package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;

import models.ComplexionPielSangre;

import play.db.ebean.EbeanConfig;

public class ComplexionPielSangreRepository extends BaseRepository{
    private static final String FIELD = "colorPiel";

    @Inject
    public ComplexionPielSangreRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, ComplexionPielSangre.class);
    }

    public PagedList<ComplexionPielSangre> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<ComplexionPielSangre>  exp = super.getEbeanServer().find(ComplexionPielSangre.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<ComplexionPielSangre> list() {
        return super.list(super.getEbeanServer().find(ComplexionPielSangre.class).where());
    }
}
