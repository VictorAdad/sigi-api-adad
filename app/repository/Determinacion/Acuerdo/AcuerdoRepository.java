package repository;
import io.ebean.ExpressionList;
import io.ebean.PagedList;
import io.ebean.Transaction;
import javax.inject.Inject;
import models.Acuerdo;
import java.util.concurrent.CompletionStage;
import java.util.List;
import play.db.ebean.EbeanConfig;
import play.libs.Json;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class AcuerdoRepository extends BaseHerenciaRepository{

    private DatabaseExecutionContext executionContext;
    String[] fields = {"created"};
    @Inject
    public AcuerdoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Acuerdo.class);
    }

    public PagedList<Acuerdo> page(int page, int pageSize, String sortBy, String order, String filter) {
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public PagedList<Acuerdo> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<Acuerdo>  exp = super.getEbeanServer().find(Acuerdo.class).where();
        exp.eq("caso.id", id);
        exp.eq("tipo", "Acuerdo Radicación");
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }

    public List<Acuerdo> listByCaseAndTipo(Long idCaso, String tipo) {
        ExpressionList<Acuerdo>  exp = super.getEbeanServer().find(Acuerdo.class).where();
        exp.eq("caso.id", idCaso);
        exp.eq("tipo", tipo);
        return super.list(exp);
    }

    // public Object save(Object data) {
        
    //     Object object = data;
    //     Transaction txn = ebeanServer.beginTransaction();
    //     try {
    //         ebeanServer.insert(object);
    //         // ebeanServer.refresh(object);
    //         ebeanServer.update(((Acuerdo)object).caso);
    //         txn.commit();
    //     } catch (Exception e) {
    //         txn.rollback();
    //         object = Json.parse("{\"message\":\"No se pudo almacenar el registro.\"}");
    //     }
    //     txn.end();
    //     return object;
    // }
}
