package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.MotivoColorClase;
import play.db.ebean.EbeanConfig;

public class MotivoColorClaseRepository extends BaseRepository{
    private static final String FIELD = "mecanismo";

    @Inject
    public MotivoColorClaseRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, MotivoColorClase.class);
    }

    public PagedList<MotivoColorClase> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<MotivoColorClase>  exp = super.getEbeanServer().find(MotivoColorClase.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }


    public List<MotivoColorClase> list() {
        return super.list(super.getEbeanServer().find(MotivoColorClase.class).where());
    }
}
