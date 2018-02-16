package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.MarcaSubMarca;
import play.db.ebean.EbeanConfig;

public class MarcaSubMarcaRepository extends BaseRepository{
    private static final String FIELD = "marca";

    @Inject
    public MarcaSubMarcaRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, MarcaSubMarca.class);
    }

    public PagedList<MarcaSubMarca> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<MarcaSubMarca>  exp = super.getEbeanServer().find(MarcaSubMarca.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

    public List<MarcaSubMarca> list() {
        return super.list(super.getEbeanServer().find(MarcaSubMarca.class).where());
    }
}
