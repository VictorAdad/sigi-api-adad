package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import javax.inject.Inject;
import models.TipoPersona;
import play.db.ebean.EbeanConfig;
import java.util.Map;
import java.util.List;

public class TipoPersonaRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public TipoPersonaRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, TipoPersona.class);
    }

    public PagedList<TipoPersona> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {TipoPersonaRepository.FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<TipoPersona>  exp = super.getEbeanServer().find(TipoPersona.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }
}
