package repository;

import javax.inject.Inject;
import models.Entrevista;
import play.db.ebean.EbeanConfig;
import io.ebean.PagedList;
import io.ebean.ExpressionList;

public class EntrevistaRepository extends BaseHerenciaRepository{
	String[] fields = {"nombreEntrevistado", "created"};
    @Inject
    public EntrevistaRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Entrevista.class);
    }

    public <T> PagedList<T> page(int page, int pageSize, String sortBy, String order, String filter) {
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public PagedList<Entrevista> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<Entrevista>  exp = super.getEbeanServer().find(Entrevista.class).where();
        exp.eq("caso.id", id);
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }
}
