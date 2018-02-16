package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.ProcedenciaAseguradora;
import play.db.ebean.EbeanConfig;

public class ProcedenciaAseguradoraRepository extends BaseRepository{
    private static final String FIELD = "procedencia";

    @Inject
    public ProcedenciaAseguradoraRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, ProcedenciaAseguradora.class);
    }

    public PagedList<ProcedenciaAseguradora> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<ProcedenciaAseguradora>  exp = super.getEbeanServer().find(ProcedenciaAseguradora.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<ProcedenciaAseguradora> list() {
        return super.list(super.getEbeanServer().find(ProcedenciaAseguradora.class).where());
    }
}
