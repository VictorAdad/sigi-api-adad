package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.Estado;
import play.db.ebean.EbeanConfig;

public class EstadoRepository extends BaseRepository{
	private static final String FIELD = "nombre";

    @Inject
    public EstadoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Estado.class);
    }

    public PagedList<Estado> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> optionsByPais(Long id) {
        ExpressionList<Estado>  exp = super.getEbeanServer().find(Estado.class).where();
        exp.eq("pais.id", id);
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<Estado> list() {
        return super.list(super.getEbeanServer().find(Estado.class).where());
    }
}
