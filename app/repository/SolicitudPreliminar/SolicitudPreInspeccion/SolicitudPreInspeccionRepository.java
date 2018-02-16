package repository;
import io.ebean.ExpressionList;
import io.ebean.PagedList;
import javax.inject.Inject;
import models.SolicitudPreInspeccion;
import play.db.ebean.EbeanConfig;

public class SolicitudPreInspeccionRepository extends BaseHerenciaRepository{
    String[] fields = {"fechaHoraInspeccion", "adscripcion"};
    @Inject
    public SolicitudPreInspeccionRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, SolicitudPreInspeccion.class);
    }

    public PagedList<SolicitudPreInspeccion> page(int page, int pageSize, String sortBy, String order, String filter) {
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }
    public PagedList<SolicitudPreInspeccion> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<SolicitudPreInspeccion>  exp = super.getEbeanServer().find(SolicitudPreInspeccion.class).where();
        exp.eq("caso.id", id);
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }
}
