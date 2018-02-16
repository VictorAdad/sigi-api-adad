package repository;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import io.ebean.Transaction;
import java.util.ArrayList;
import java.util.concurrent.CompletionStage;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import models.Notificacion;
import org.apache.commons.lang3.StringUtils;
import play.db.ebean.EbeanConfig;
import play.libs.Json;
import play.Logger.ALogger;
import play.Logger;
import models.Notificacion;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class NotificacionesRepository extends BaseRepository {

    private static final String CASEIDENTIFIER = "caso.id";
    private final ALogger logger = Logger.of(this.getClass());

    @Inject
    public NotificacionesRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Notificacion.class);
    }

    public PagedList<Notificacion> pageByUser(int page, String sortBy, String order, String filter, int tr, String userName) {
        ExpressionList<Notificacion>  exp = super.getEbeanServer().find(Notificacion.class).where();
        exp.eq("username", userName);
        exp.eq("leido", false);
        exp.orderBy("created desc");
        String[] fields = {"titulo", "contenido"};
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }

    public JsonNode countSinLeer(String usr) {
        ObjectNode node = Json.newObject();
        int count = super.getEbeanServer().find(Notificacion.class).where()
                .eq("username", usr)
                .eq("leido", false)
                .findCount();
        node.put("count", count);

        return Json.toJson(node);
    }

    public JsonNode countLeido(Long id) {
        Transaction txn = ebeanServer.beginTransaction();
        Notificacion notificacion = super.getEbeanServer().find(Notificacion.class).where().eq("id", id).findUnique();
        try {
            notificacion.leido = true;
            ebeanServer.update(notificacion);  
            txn.commit();
            ebeanServer.refresh(notificacion);
        } catch (Exception e) {
            logger.error("Error while trying to update object registry in database", e);
            txn.rollback();
        }
        txn.end();
        return Json.toJson(notificacion);
    }

}
