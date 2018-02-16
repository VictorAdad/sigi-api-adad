package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import javax.inject.Inject;
import models.Distrito;
import play.db.ebean.EbeanConfig;
import java.util.Map;
import java.util.List;

public class DistritoRepository extends BaseRepository{
    private static final String FIELD = "clave";

    @Inject
    public DistritoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Distrito.class);
    }

    public PagedList<Distrito> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {DistritoRepository.FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<Distrito>  exp = super.getEbeanServer().find(Distrito.class).where();
        //exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<Distrito> list() {
        return super.list(super.getEbeanServer().find(Distrito.class).where());
    }
}
