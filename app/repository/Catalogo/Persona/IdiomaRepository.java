package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import models.IdiomaIdentificacion;
import play.db.ebean.EbeanConfig;

public class IdiomaRepository extends BaseRepository{
	private static final String FIELD = "nombre";

    @Inject
    public IdiomaRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, IdiomaIdentificacion.class);
    }

    public PagedList<IdiomaIdentificacion> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }


    public Map<String, String> options() {
        ExpressionList<IdiomaIdentificacion>  exp = super.getEbeanServer().find(IdiomaIdentificacion.class).where();
        exp.orderBy(IdiomaRepository.FIELD);
        return super.options(exp, "id", IdiomaRepository.FIELD);
    }

    public List<IdiomaIdentificacion> list() {
        return super.list(super.getEbeanServer().find(IdiomaIdentificacion.class).where());
    }
}
