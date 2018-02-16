package repository;
import io.ebean.ExpressionList;
import io.ebean.PagedList;
import javax.inject.Inject;
import models.SolicitudPrePolicia;
import play.db.ebean.EbeanConfig;

public class SolicitudPrePoliciaRepository extends BaseHerenciaRepository{
    String[] fields = {"noOficio", "nombreComisario"};
    @Inject
    public SolicitudPrePoliciaRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, SolicitudPrePolicia.class);
    }

    public PagedList<SolicitudPrePolicia> page(int page, int pageSize, String sortBy, String order, String filter) {
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }
    public PagedList<SolicitudPrePolicia> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<SolicitudPrePolicia>  exp = super.getEbeanServer().find(SolicitudPrePolicia.class).where();
        exp.eq("caso.id", id);
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }
}
