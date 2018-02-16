package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import javax.inject.Inject;
import models.Predenuncia;
import play.db.ebean.EbeanConfig;
import java.util.Optional;

public class PredenunciaRepository extends BaseHerenciaRepository{

    @Inject
    public PredenunciaRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Predenuncia.class);
    }

    public PagedList<Predenuncia> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {"usuario"};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Optional<Object> getByCase(Long id) {
        ExpressionList<Predenuncia>  exp = super.getEbeanServer().find(Predenuncia.class).where();
        exp.eq("caso.id", id);
        return super.get(id, exp);
    }

    public PagedList<Predenuncia> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<Predenuncia>  exp = super.getEbeanServer().find(Predenuncia.class).where();
        exp.eq("caso.id", id);
        String[] fields = {"usuario"};
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }
}
