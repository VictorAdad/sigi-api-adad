package repository;
import io.ebean.ExpressionList;
import io.ebean.PagedList;
import javax.inject.Inject;
import models.SolicitudPreAcuerdo;
import play.db.ebean.EbeanConfig;

public class SolicitudPreAcuerdoRepository extends BaseHerenciaRepository{
    String[] fields = {"fundamentoLegal", "plazo", "tipo"};
    @Inject
    public SolicitudPreAcuerdoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, SolicitudPreAcuerdo.class);
    }

    public PagedList<SolicitudPreAcuerdo> page(int page, int pageSize, String sortBy, String order, String filter) {
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }
    public PagedList<SolicitudPreAcuerdo> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<SolicitudPreAcuerdo>  exp = super.getEbeanServer().find(SolicitudPreAcuerdo.class).where();
        exp.eq("caso.id", id);
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }
}
