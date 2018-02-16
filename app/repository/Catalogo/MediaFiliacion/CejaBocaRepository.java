package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.CejaBoca;
import play.db.ebean.EbeanConfig;

public class CejaBocaRepository extends BaseRepository{
    private static final String FIELD = "mecanismo";

    @Inject
    public CejaBocaRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, CejaBoca.class);
    }

    public PagedList<CejaBoca> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<CejaBoca>  exp = super.getEbeanServer().find(CejaBoca.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<CejaBoca> list() {
        return super.list(super.getEbeanServer().find(CejaBoca.class).where());
    }
}
