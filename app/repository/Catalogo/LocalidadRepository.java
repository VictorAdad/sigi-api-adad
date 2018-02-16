package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;

import java.util.Map;
import java.util.List;
import javax.inject.Inject;

import models.Localidad;

import play.db.ebean.EbeanConfig;

public class LocalidadRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public LocalidadRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Localidad.class);
    }

    public PagedList<Localidad> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> optionsByMunicipio(Long id) {
        ExpressionList<Localidad>  exp = super.getEbeanServer().find(Localidad.class).where();
        exp.eq("municipio.id", id);
        exp.orderBy(LocalidadRepository.FIELD);
        return super.options(exp, "id", LocalidadRepository.FIELD);
    }
    
    public List<Localidad> list() {
        return super.list(super.getEbeanServer().find(Localidad.class).where());
    }
}
