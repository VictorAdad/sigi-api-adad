package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.Map;
import javax.inject.Inject;

import models.Interprete;

import play.db.ebean.EbeanConfig;

public class InterpreteRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    @Inject
    public InterpreteRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Interprete.class);
    }

    public PagedList<Interprete> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {InterpreteRepository.FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<Interprete>  exp = super.getEbeanServer().find(Interprete.class).where();
        exp.orderBy(InterpreteRepository.FIELD);
        return super.options(exp, "id", InterpreteRepository.FIELD);
    }
}
