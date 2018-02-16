package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import javax.inject.Inject;
import models.TipoInterviniente;
import play.db.ebean.EbeanConfig;
import java.util.Map;


public class TipoIntervinienteRepository extends BaseRepository{

	private static final String FIELD = "tipo";

    @Inject
    public TipoIntervinienteRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, TipoInterviniente.class);
    }

    public PagedList<TipoInterviniente> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {"clase"};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<TipoInterviniente>  exp = super.getEbeanServer().find(TipoInterviniente.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

}
