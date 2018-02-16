package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;

import java.util.Map;
import javax.inject.Inject;

import models.TipoLinea;

import play.db.ebean.EbeanConfig;

public class TipoLineaRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public TipoLineaRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, TipoLinea.class);
    }

    public PagedList<TipoLinea> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<TipoLinea>  exp = super.getEbeanServer().find(TipoLinea.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }
}
