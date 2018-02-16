package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;

import java.util.Map;
import java.util.List;
import javax.inject.Inject;

import models.Colonia;

import play.db.ebean.EbeanConfig;

public class ColoniaRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public ColoniaRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Colonia.class);
    }

    public PagedList<Colonia> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> optionsByMunicipio(Long id) {
        ExpressionList<Colonia>  exp = super.getEbeanServer().find(Colonia.class).where();
        exp.eq("municipio.id", id);
        exp.orderBy(ColoniaRepository.FIELD);
        return super.options(exp, "id", ColoniaRepository.FIELD);
    }
    
    public List<Colonia> list() {
        return super.list(super.getEbeanServer().find(Colonia.class).where());
    }

    public List<Colonia> listByMunicipio(Long id) {
        ExpressionList<Colonia>  exp = super.getEbeanServer().find(Colonia.class).select("nombre,cp").where();
        exp.eq("municipio.id", id);
        return super.list(exp);
    }
}
