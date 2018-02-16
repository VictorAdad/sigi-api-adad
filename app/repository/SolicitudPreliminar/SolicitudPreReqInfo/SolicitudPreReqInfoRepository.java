package repository;
import io.ebean.ExpressionList;
import io.ebean.PagedList;
import javax.inject.Inject;
import models.SolicitudPreReqInfo;
import play.db.ebean.EbeanConfig;

public class SolicitudPreReqInfoRepository extends BaseHerenciaRepository{
    String[] fields = {"noOficio", "fechaReq", "autoridadReq"};
    @Inject
    public SolicitudPreReqInfoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, SolicitudPreReqInfo.class);
    }

    public PagedList<SolicitudPreReqInfo> page(int page, int pageSize, String sortBy, String order, String filter) {
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }
    public PagedList<SolicitudPreReqInfo> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<SolicitudPreReqInfo>  exp = super.getEbeanServer().find(SolicitudPreReqInfo.class).where();
        exp.eq("caso.id", id);
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }
}
