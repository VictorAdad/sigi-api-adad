package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.Oreja;
import play.db.ebean.EbeanConfig;

public class OrejaRepository extends BaseRepository{
    private static final String FIELD = "mecanismo";

    @Inject
    public OrejaRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Oreja.class);
    }

    public PagedList<Oreja> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<Oreja>  exp = super.getEbeanServer().find(Oreja.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<Oreja> list() {
        return super.list(super.getEbeanServer().find(Oreja.class).where());
    }
}
