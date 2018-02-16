package repository;

import java.util.Map;
import io.ebean.PagedList;
import io.ebean.ExpressionList;
import javax.inject.Inject;
import models.Turno;
import play.db.ebean.EbeanConfig;

public class TurnoRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public TurnoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Turno.class);
    }

    public PagedList<Turno> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {TurnoRepository.FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }
    
    public Map<String, String> options() {
        Map<String, String> options = null;
        ExpressionList<Turno>  exp = super.getEbeanServer().find(Turno.class).where();
        exp.orderBy(FIELD);
        if (super.options(exp, "id", FIELD) instanceof Map) {
            options = super.options(exp, "id", FIELD);
        }
        return options;
    }
}
