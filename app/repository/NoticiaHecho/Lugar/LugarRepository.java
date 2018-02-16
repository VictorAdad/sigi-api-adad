package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import io.ebean.Transaction;
import com.typesafe.config.Config;
import java.util.List;
import javax.inject.Inject;

import models.Lugar;
import models.Pais;
import models.Estatus;
import models.Caso;
import core.util.Response;

import play.db.ebean.EbeanConfig;
import play.libs.Json;
import play.mvc.Results;
import play.mvc.Result;
import play.Logger;

public class LugarRepository extends BaseRepository{

    private final Config config;

    @Inject
    public LugarRepository(EbeanConfig ebeanConfig, Config config) {
        super(ebeanConfig, Lugar.class);
        this.config = config;
    }

    public PagedList<Lugar> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {"calle"};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public PagedList<Lugar> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<Lugar>  exp = super.getEbeanServer().find(Lugar.class).where();
        exp.eq("caso.id", id);
        String[] fields = {"calle"};
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }

    public List<Lugar> listByCase(Long id) {
        ExpressionList<Lugar>  exp = super.getEbeanServer().find(Lugar.class).where();
        exp.eq("caso.id", id);
        return super.list(exp);
    }

    public Result save(Object data) {
        Object object = data;
        Transaction txn = ebeanServer.beginTransaction();
        try {
            Lugar lugar = (Lugar)object;
            Pais pais = Pais.find.byId(lugar.pais.id);
            if((
                pais != null &&
                pais.nombre.equals(config.getString("Evomatik.general.mexico"))) &&
                (
                    (lugar.estado == null || lugar.estado.id == null) ||
                    (lugar.municipio == null || lugar.municipio.id == null) ||
                    (lugar.colonia == null || lugar.colonia.id == null)
                )
            ){
                object = Json.parse("{\"message\":\"Falta el estado, municipio o colonia.\"}");
                txn.rollback();
            }else{
                ebeanServer.insert(object);
                txn.commit();
            }
            Estatus estatus = Estatus.find.query().where().eq("nombre", "Pre denuncia en espera").findUnique();
            Caso caso = Caso.find.byId(lugar.caso.id);
            if (!caso.estatus.nombre.equals("NIC creado") && 
                !caso.estatus.nombre.equals("Acuerdo de inicio") && 
                !caso.estatus.nombre.equals("NUC creado") &&
                !caso.estatus.nombre.equals("Actuaciones") &&
                !caso.estatus.nombre.equals("Cierre relativo")) {
                caso.estatus = estatus;
                caso.update();                
            }
        } catch (Exception e) {
            e.printStackTrace();
            Logger.error("Data: {}", Json.toJson(object));
            txn.rollback();
            return Results.badRequest(Response.createError("Exception",e.getMessage()));
        }
        txn.end();
        return Results.ok(Json.toJson(object));
    }
}
