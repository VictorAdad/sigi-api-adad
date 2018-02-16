package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.Map;
import javax.inject.Inject;
import models.Pais;
import play.db.ebean.EbeanConfig;

public class PaisRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public PaisRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Pais.class);
    }

    public PagedList<Pais> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        play.Logger.debug("Pais@options");
        ExpressionList<Pais>  exp = super.getEbeanServer().find(Pais.class).where();
        exp.orderBy("nombre desc");
        return super.options(exp, "id",  FIELD);
    }
}
