package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.DesaparicionConsumacion;
import play.db.ebean.EbeanConfig;

public class DesaparicionConsumacionRepository extends BaseRepository{
    private static final String FIELD = "consumacion";

    @Inject
    public DesaparicionConsumacionRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, DesaparicionConsumacion.class);
    }

    public PagedList<DesaparicionConsumacion> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<DesaparicionConsumacion>  exp = super.getEbeanServer().find(DesaparicionConsumacion.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<DesaparicionConsumacion> list() {
        return super.list(super.getEbeanServer().find(DesaparicionConsumacion.class).where());
    }
}
