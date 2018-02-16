package repository;
import io.ebean.ExpressionList;
import io.ebean.PagedList;
import javax.inject.Inject;
import models.SolicitudPrePericial;
import play.db.ebean.EbeanConfig;

public class SolicitudPrePericialRepository extends BaseHerenciaRepository{
    
    String[] fields = {"tipo", "noOficio"};
    
    @Inject
    public SolicitudPrePericialRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, SolicitudPrePericial.class);
    }

    public PagedList<SolicitudPrePericial> page(int page, int pageSize, String sortBy, String order, String filter) {
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }
    
    public PagedList<SolicitudPrePericial> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<SolicitudPrePericial>  exp = super.getEbeanServer().find(SolicitudPrePericial.class).where();
        exp.eq("caso.id", id);
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }
}
