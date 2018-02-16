package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.ModalidadAmbito;
import play.db.ebean.EbeanConfig;

public class ModalidadAmbitoRepository extends BaseRepository{
    private static final String FIELD = "modalidad";

    @Inject
    public ModalidadAmbitoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, ModalidadAmbito.class);
    }

    public PagedList<ModalidadAmbito> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<ModalidadAmbito>  exp = super.getEbeanServer().find(ModalidadAmbito.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<ModalidadAmbito> list() {
        return super.list(super.getEbeanServer().find(ModalidadAmbito.class).where());
    }
}
