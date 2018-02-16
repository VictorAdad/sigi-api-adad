package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.CatalogoSincronizacion;
import play.db.ebean.EbeanConfig;

public class CatalogoSincronizacionRepository extends BaseRepository{
	private static final String FIELD = "nombre";

    @Inject
    public CatalogoSincronizacionRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, CatalogoSincronizacion.class);
    }

    public List<CatalogoSincronizacion> list() {
        return super.list(super.getEbeanServer().find(CatalogoSincronizacion.class).where());
    }
}
