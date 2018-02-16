package repository;
import io.ebean.ExpressionList;
import io.ebean.PagedList;
import javax.inject.Inject;
import models.ArchivoTemporal;
import play.db.ebean.EbeanConfig;

public class ArchivoTemporalRepository extends BaseHerenciaRepository{
    String[] fields = {"fechaCreacion"};
    @Inject
    public ArchivoTemporalRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, ArchivoTemporal.class);
    }

    public PagedList<ArchivoTemporal> page(int page, int pageSize, String sortBy, String order, String filter) {
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }
    public PagedList<ArchivoTemporal> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<ArchivoTemporal>  exp = super.getEbeanServer().find(ArchivoTemporal.class).where();
        exp.eq("caso.id", id);
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }
}
