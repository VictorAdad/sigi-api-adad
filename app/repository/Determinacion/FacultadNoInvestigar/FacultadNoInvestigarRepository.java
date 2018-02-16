package repository;
import io.ebean.ExpressionList;
import io.ebean.PagedList;
import javax.inject.Inject;
import models.FacultadNoInvestigar;
import play.db.ebean.EbeanConfig;

public class FacultadNoInvestigarRepository extends BaseHerenciaRepository{
    String[] fields = {"motivosAbstuvoInvestigar", "created", "destinatarioDeterminacion"};
    @Inject
    public FacultadNoInvestigarRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, FacultadNoInvestigar.class);
    }

    public PagedList<FacultadNoInvestigar> page(int page, int pageSize, String sortBy, String order, String filter) {
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public PagedList<FacultadNoInvestigar> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<FacultadNoInvestigar>  exp = super.getEbeanServer().find(FacultadNoInvestigar.class).where();
        exp.eq("caso.id", id);
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }
}
