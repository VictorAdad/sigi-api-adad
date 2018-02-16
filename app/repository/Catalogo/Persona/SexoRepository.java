package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.Sexo;
import play.db.ebean.EbeanConfig;

public class SexoRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public SexoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Sexo.class);
    }

    public PagedList<Sexo> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {SexoRepository.FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public List<Sexo> list() {
        return super.list(super.getEbeanServer().find(Sexo.class).where());
    }

    public Map<String, String> options() {
        ExpressionList<Sexo>  exp = super.getEbeanServer().find(Sexo.class).where();
        exp.orderBy(SexoRepository.FIELD);
        return super.options(exp, "id", SexoRepository.FIELD);
    }
}
