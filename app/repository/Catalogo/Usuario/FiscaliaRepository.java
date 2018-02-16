package repository;
import io.ebean.ExpressionList;
import io.ebean.PagedList;
import javax.inject.Inject;
import java.util.Map;
import models.Fiscalia;
import play.db.ebean.EbeanConfig;

public class FiscaliaRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public FiscaliaRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Fiscalia.class);
    }

    public PagedList<Fiscalia> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FiscaliaRepository.FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<Fiscalia>  exp = super.getEbeanServer().find(Fiscalia.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }
}
