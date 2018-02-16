package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.Map;
import javax.inject.Inject;
import models.EstadoCivil;
import play.db.ebean.EbeanConfig;

public class EstadoCivilRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public EstadoCivilRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, EstadoCivil.class);
    }

    public PagedList<EstadoCivil> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {EstadoCivilRepository.FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<EstadoCivil>  exp = super.getEbeanServer().find(EstadoCivil.class).where();
        exp.orderBy(EstadoCivilRepository.FIELD);
        return super.options(exp, "id", EstadoCivilRepository.FIELD);
    }
}
