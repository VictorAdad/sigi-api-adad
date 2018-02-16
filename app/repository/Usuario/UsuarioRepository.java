package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import javax.inject.Inject;
import models.Usuario;
import play.db.ebean.EbeanConfig;
import java.util.Map;

public class UsuarioRepository extends BaseRepository{

    private static final String FIELD = "nombre";

    @Inject
    public UsuarioRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Usuario.class);
    }

    public PagedList<Usuario> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {"nombre"};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }


    public Map<String, String> optionsByAgency(Long id) {
        ExpressionList<Usuario>  exp = super.getEbeanServer().find(Usuario.class).where();
        exp.eq("agencia.id", id);
        exp.orderBy(UsuarioRepository.FIELD);
        return super.options(exp, "id", UsuarioRepository.FIELD);
    }
}
