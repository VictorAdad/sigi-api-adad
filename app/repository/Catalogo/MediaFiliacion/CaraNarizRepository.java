package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.CaraNariz;
import play.db.ebean.EbeanConfig;

public class CaraNarizRepository extends BaseRepository{
    private static final String FIELD = "mecanismo";

    @Inject
    public CaraNarizRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, CaraNariz.class);
    }

    public PagedList<CaraNariz> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<CaraNariz>  exp = super.getEbeanServer().find(CaraNariz.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<CaraNariz> list() {
        return super.list(super.getEbeanServer().find(CaraNariz.class).where());
    }
}
