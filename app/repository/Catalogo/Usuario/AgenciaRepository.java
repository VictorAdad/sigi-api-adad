package repository;

import core.util.Response;
import io.ebean.PagedList;
import io.ebean.ExpressionList;
import io.ebean.Transaction;
import io.ebean.SqlRow;
import io.ebean.SqlQuery;
import io.ebean.Ebean;
import io.ebean.CallableSql;

import javax.inject.Inject;
import models.Agencia;
import play.db.ebean.EbeanConfig;
import play.Logger;
import play.Logger.ALogger;
import play.libs.Json;
import java.util.Map;
import java.util.List;
import play.mvc.Results;
import play.mvc.Result;

public class AgenciaRepository extends BaseRepository{
    private static final String FIELD = "nombre";

    private final ALogger logger = Logger.of(this.getClass());

    @Inject
    public AgenciaRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Agencia.class);
    }

    public PagedList<Agencia> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {AgenciaRepository.FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        Map<String, String> options = null;
        ExpressionList<Agencia>  exp = super.getEbeanServer().find(Agencia.class).where();
        exp.orderBy("nombre");
        if (super.options(exp, "id", "nombre") instanceof Map) {
            options = super.options(exp, "id", "nombre");
        }
        return options;
    }

    public Result save(Object data) {
        String sql = "";
        Object object = data;
        Transaction txn = ebeanServer.beginTransaction();
        try {
            Agencia agencia = (Agencia)object;
            String nom =(agencia.nombre).replaceAll("[^\\dB-DF-HJ-NP-TV-Zb-df-hj-np-tv-z' ']", "").replace(' ','_');
            sql="SELECT SEQUENCE_NAME FROM user_sequences WHERE sequence_name='"+"SEQ_AGENCIA_"+nom.toUpperCase()+"'";
            SqlQuery sqlQuery = Ebean.createSqlQuery(sql);
            List<SqlRow> list = sqlQuery.findList();
            if (list.size() == 0){
                String sqlProcedure = "call SP_CREAR_SECUENCIA(?)";
                CallableSql cs = Ebean.createCallableSql(sqlProcedure);
                cs.setParameter(1, nom);
                //Logger.error("SQL"+cs.getSql());
                Ebean.execute(cs);
                (agencia.secuencia)=("SEQ_AGENCIA_"+nom);
                ebeanServer.save(object, txn);
                ebeanServer.refresh(object);
                txn.commit();
                object = data;
            }else {
                (agencia.secuencia)=("SEQ_AGENCIA_"+nom);
                ebeanServer.save(object, txn);
                ebeanServer.refresh(object);
                txn.commit();
                object = data;
            }
        } catch (Exception e) {
            logger.error("Error while trying to save data registry in database", e);
            logger.error("Data: {}", Json.toJson(data));
            txn.rollback();
            object = null;
            return Results.badRequest(Response.createError("Exception",e.getMessage()));
        }
        txn.end();
        return Results.ok(Json.toJson(object));
    }
}
