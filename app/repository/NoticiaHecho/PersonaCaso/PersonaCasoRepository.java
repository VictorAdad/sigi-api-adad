package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.List;
import javax.inject.Inject;
import models.PersonaCaso;
import play.db.ebean.EbeanConfig;

public class PersonaCasoRepository extends BaseRepository{

    @Inject
    public PersonaCasoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, PersonaCaso.class);
    }

    public PagedList<PersonaCaso> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {"caso.nic"};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public PagedList<PersonaCaso> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<PersonaCaso>  exp = super.getEbeanServer().find(PersonaCaso.class).where();
        exp.eq("caso.id", id);
        String[] fields = {"persona.nombre"};
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }

    public List<PersonaCaso> listByCase(Long id) {
        ExpressionList<PersonaCaso>  exp = super.getEbeanServer().find(PersonaCaso.class).where();
        exp.eq("caso.id", id);
        return super.list(exp);
    }

    public List<PersonaCaso> listByCaseAndTipoInterviniente(Long idCaso, Long idTipoInterviniente) {
        ExpressionList<PersonaCaso>  exp = super.getEbeanServer().find(PersonaCaso.class).where();
        exp.eq("caso.id", idCaso);
        exp.eq("tipoInterviniente.id", idTipoInterviniente);
        return super.list(exp);
    }

}
