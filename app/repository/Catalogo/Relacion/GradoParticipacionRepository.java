package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.GradoParticipacion;
import play.db.ebean.EbeanConfig;

public class GradoParticipacionRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public GradoParticipacionRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, GradoParticipacion.class);
    }

    public PagedList<GradoParticipacion> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<GradoParticipacion>  exp = super.getEbeanServer().find(GradoParticipacion.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<GradoParticipacion> list() {
        return super.list(super.getEbeanServer().find(GradoParticipacion.class).where());
    }
}
