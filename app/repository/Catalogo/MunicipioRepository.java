package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.Municipio;
import play.db.ebean.EbeanConfig;

public class MunicipioRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public MunicipioRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Municipio.class);
    }

    public PagedList<Municipio> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {MunicipioRepository.FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> optionsByEstado(Long id) {
        ExpressionList<Municipio>  exp = super.getEbeanServer().find(Municipio.class).where();
        exp.eq("estado.id", id);
        exp.orderBy(MunicipioRepository.FIELD);
        return super.options(exp, "id", MunicipioRepository.FIELD);
    }

    public List<Municipio> list() {
        return super.list(super.getEbeanServer().find(Municipio.class).where());
    }
}
