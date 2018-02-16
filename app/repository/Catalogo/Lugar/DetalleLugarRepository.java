package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.DetalleLugar;
import play.db.ebean.EbeanConfig;

public class DetalleLugarRepository extends BaseRepository{
    private static final String FIELD = "tipoLugar";

    @Inject
    public DetalleLugarRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, DetalleLugar.class);
    }

    public PagedList<DetalleLugar> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<DetalleLugar>  exp = super.getEbeanServer().find(DetalleLugar.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<DetalleLugar> list() {
        return super.list(super.getEbeanServer().find(DetalleLugar.class).where());
    }
}
