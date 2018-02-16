package repository;
import io.ebean.ExpressionList;
import io.ebean.PagedList;
import javax.inject.Inject;
import java.util.Map;
import models.Subdireccion;
import play.db.ebean.EbeanConfig;

public class SubdireccionRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public SubdireccionRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Subdireccion.class);
    }

    public PagedList<Subdireccion> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {SubdireccionRepository.FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<Subdireccion>  exp = super.getEbeanServer().find(Subdireccion.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }
}
