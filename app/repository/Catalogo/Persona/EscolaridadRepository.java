package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.Map;
import javax.inject.Inject;
import models.Escolaridad;
import play.db.ebean.EbeanConfig;

public class EscolaridadRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public EscolaridadRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Escolaridad.class);
    }

    public PagedList<Escolaridad> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {EscolaridadRepository.FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<Escolaridad>  exp = super.getEbeanServer().find(Escolaridad.class).where();
        exp.orderBy(EscolaridadRepository.FIELD);
        return super.options(exp, "id", EscolaridadRepository.FIELD);
    }

}
