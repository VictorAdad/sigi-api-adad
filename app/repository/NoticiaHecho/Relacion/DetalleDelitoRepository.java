package repository;

import io.ebean.Transaction;
import java.util.ArrayList;
import javax.inject.Inject;
import models.ArmaTipoRelacionPersona;
import models.DetalleDelito;
import models.EfectoViolencia;
import models.LugarTipoRelacionPersona;
import models.HostigamientoAcoso;
import models.TipoRelacionPersona;
import models.TrataPersona;
import models.VehiculoTipoRelacionPersona;
import play.db.ebean.EbeanConfig;
import play.libs.Json;
import play.Logger.ALogger;
import play.Logger;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class DetalleDelitoRepository extends BaseRepository{

    private final ALogger logger = Logger.of(this.getClass());

    @Inject
    public DetalleDelitoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, DetalleDelito.class);
    }

    public Object update(Long id, Object data) {
    	logger.debug("DetalleDelito@update... ");
        Object object = data;
        Transaction txn = ebeanServer.beginTransaction();
        try {
            ((DetalleDelito)object).id = id;
            if(((DetalleDelito)object).hostigamientoAcoso.size() == 0)
                ((DetalleDelito)object).hostigamientoAcoso = new ArrayList<HostigamientoAcoso>();
            
            if(((DetalleDelito)object).trataPersona.size() == 0)
                ((DetalleDelito)object).trataPersona = new ArrayList<TrataPersona>();

            if(((DetalleDelito)object).efectoViolencia.size() == 0)
                ((DetalleDelito)object).efectoViolencia = new ArrayList<EfectoViolencia>();

            ebeanServer.update(object);

            if(((DetalleDelito)object).tipoRelacionPersona != null){
                TipoRelacionPersona tipo = ((DetalleDelito)object).tipoRelacionPersona;
                if(tipo != null)
                    ebeanServer.update(tipo);
            }
            if(((DetalleDelito)object).tipoRelacionPersona.vehiculoTipoRelacionPersona.size() > 0){
                VehiculoTipoRelacionPersona vehiculo = ((DetalleDelito)object).tipoRelacionPersona.vehiculoTipoRelacionPersona.get(0);
                if(vehiculo != null)
                	ebeanServer.update(vehiculo);
            }

            if(((DetalleDelito)object).tipoRelacionPersona.lugarTipoRelacionPersona.size() > 0){
                LugarTipoRelacionPersona lugar = ((DetalleDelito)object).tipoRelacionPersona.lugarTipoRelacionPersona.get(0);
                if(lugar != null)
                	ebeanServer.update(lugar);
            }

            if(((DetalleDelito)object).tipoRelacionPersona.armaTipoRelacionPersona.size() > 0){
                ArmaTipoRelacionPersona arma = ((DetalleDelito)object).tipoRelacionPersona.armaTipoRelacionPersona.get(0);
                if(arma != null)
                	ebeanServer.update(arma);
            }

            ebeanServer.refresh(object);
            txn.commit();
            

        } catch (Exception e) {
            logger.error("Error while trying to update object registry in database", e);
            logger.error("Data: {}", Json.toJson(object));
            txn.rollback();
            object = null;
        }
        TipoRelacionPersona tipo = ebeanServer.find(TipoRelacionPersona.class)
        .where()
        .eq("detalleDelito.id",((DetalleDelito)object).id)
        .findUnique();
        
        txn.end();
        return tipo;
    }
}
