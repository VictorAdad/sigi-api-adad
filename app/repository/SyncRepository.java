package repository;

import javax.inject.Inject;
import models.CatalogoSincronizacion;
import play.Configuration;

public class SyncRepository {

    private Configuration config;

    @Inject
    public SyncRepository(Configuration config) {
        this.config = config;
    }

    public void init(){
        Boolean active = this.config.getBoolean("Evomatik.config.sync.active");
        CatalogoSincronizacion.loadContent(active);
    }
}
