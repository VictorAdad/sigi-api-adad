package repository;

import io.ebean.PagedList;
import javax.inject.Inject;
import java.util.List;
import models.TipoDetenido;
import play.db.ebean.EbeanConfig;

public class TipoDetenidoRepository extends BaseRepository{
    private static final String FIELD = "tipoDetencion";

    @Inject
    public TipoDetenidoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, TipoDetenido.class);
    }

    public PagedList<TipoDetenido> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public List<TipoDetenido> list() {
        return super.list(super.getEbeanServer().find(TipoDetenido.class).where());
    }
}
