package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import javax.inject.Inject;

import models.NoEjercicioAccionPenal;

import play.db.ebean.EbeanConfig;

public class NoEjercicioAccionPenalRepository extends BaseHerenciaRepository{
    String[] fields = {"ambitoHechos", "created"};
    @Inject
    public NoEjercicioAccionPenalRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, NoEjercicioAccionPenal.class);
    }

    public PagedList<NoEjercicioAccionPenal> page(int page, int pageSize, String sortBy, String order, String filter) {
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }
    public PagedList<NoEjercicioAccionPenal> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<NoEjercicioAccionPenal>  exp = super.getEbeanServer().find(NoEjercicioAccionPenal.class).where();
        exp.eq("caso.id", id);
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }
}
