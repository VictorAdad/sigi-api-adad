package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.FrenteMenton;
import play.db.ebean.EbeanConfig;

public class FrenteMentonRepository extends BaseRepository{
    private static final String FIELD = "formaMenton";

    @Inject
    public FrenteMentonRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, FrenteMenton.class);
    }

    public PagedList<FrenteMenton> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<FrenteMenton>  exp = super.getEbeanServer().find(FrenteMenton.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<FrenteMenton> list() {
        return super.list(super.getEbeanServer().find(FrenteMenton.class).where());
    }
}
