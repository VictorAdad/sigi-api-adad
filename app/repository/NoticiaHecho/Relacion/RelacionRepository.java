package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import javax.inject.Inject;
import models.Relacion;
import play.db.ebean.EbeanConfig;

public class RelacionRepository extends BaseRepository{

    @Inject
    public RelacionRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Relacion.class);
    }

    public PagedList<Relacion> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {"tipo"};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public PagedList<Relacion> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<Relacion>  exp = super.getEbeanServer().find(Relacion.class).where();
        exp.eq("caso.id", id);
        String[] fields = {"tipo"};
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }

}
