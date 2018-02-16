
package repository;
import io.ebean.PagedList;
import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.Map;
import javax.inject.Inject;
import models.Base;
import play.db.ebean.EbeanConfig;

public class BasesRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public BasesRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Base.class);
    }

    public PagedList<Base> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {BasesRepository.FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<Base>  exp = super.getEbeanServer().find(Base.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }
}
