package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;

import java.util.Map;
import javax.inject.Inject;

import models.PresentoLlamada;

import play.db.ebean.EbeanConfig;

public class PresentoLlamadaRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public PresentoLlamadaRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, PresentoLlamada.class);
    }

    public PagedList<PresentoLlamada> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }
    
    public Map<String, String> options() {
        ExpressionList<PresentoLlamada>  exp = super.getEbeanServer().find(PresentoLlamada.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }
}
