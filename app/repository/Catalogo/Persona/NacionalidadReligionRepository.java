package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import models.NacionalidadReligion;
import play.db.ebean.EbeanConfig;

public class NacionalidadReligionRepository extends BaseRepository{
    private static final String FIELD = "religion";

    @Inject
    public NacionalidadReligionRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, NacionalidadReligion.class);
    }

    public PagedList<NacionalidadReligion> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<NacionalidadReligion>  exp = super.getEbeanServer().find(NacionalidadReligion.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<NacionalidadReligion> list() {
        return super.list(super.getEbeanServer().find(NacionalidadReligion.class).where());
    }
}
