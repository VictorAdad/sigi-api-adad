package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.List;
import javax.inject.Inject;
import models.Arma;
import play.db.ebean.EbeanConfig;

public class ArmaRepository extends BaseRepository{

    @Inject
    public ArmaRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Arma.class);
    }

    public PagedList<Arma> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {"clase"};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public PagedList<Arma> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<Arma>  exp = super.getEbeanServer().find(Arma.class).where();
        exp.eq("caso.id", id);
        String[] fields = {"created"};
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }

    public List<Arma> listByCase(Long id) {
        ExpressionList<Arma>  exp = super.getEbeanServer().find(Arma.class).where();
        exp.eq("caso.id", id);
        return super.list(exp);
    }

}
