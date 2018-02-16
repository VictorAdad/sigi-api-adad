package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.Map;
import javax.inject.Inject;
import models.GrupoEtnico;
import play.db.ebean.EbeanConfig;

public class GrupoEtnicoRepository extends BaseRepository{
    public static final String FIELD = "nombre";

    @Inject
    public GrupoEtnicoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, GrupoEtnico.class);
    }

    public PagedList<GrupoEtnico> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {GrupoEtnicoRepository.FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<GrupoEtnico>  exp = super.getEbeanServer().find(GrupoEtnico.class).where();
        exp.orderBy(GrupoEtnicoRepository.FIELD);
        return super.options(exp, "id", GrupoEtnicoRepository.FIELD);
    }
}
