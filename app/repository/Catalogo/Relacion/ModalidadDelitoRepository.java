package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.ModalidadDelito;
import play.db.ebean.EbeanConfig;

public class ModalidadDelitoRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public ModalidadDelitoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, ModalidadDelito.class);
    }

    public PagedList<ModalidadDelito> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<ModalidadDelito>  exp = super.getEbeanServer().find(ModalidadDelito.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<ModalidadDelito> list() {
        return super.list(super.getEbeanServer().find(ModalidadDelito.class).where());
    }
}
