package repository;
import io.ebean.ExpressionList;
import io.ebean.PagedList;
import javax.inject.Inject;
import models.SolicitudPreRegistro;
import play.db.ebean.EbeanConfig;


public class SolicitudPreRegistroRepository extends BaseHerenciaRepository{
    String[] fields = {"tipo", "noTelefonico"};
    @Inject
    public SolicitudPreRegistroRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, SolicitudPreRegistro.class);
    }

    public PagedList<SolicitudPreRegistro> page(int page, int pageSize, String sortBy, String order, String filter) {
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }
    public PagedList<SolicitudPreRegistro> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<SolicitudPreRegistro>  exp = super.getEbeanServer().find(SolicitudPreRegistro.class).where();
        exp.eq("caso.id", id);
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }
}
