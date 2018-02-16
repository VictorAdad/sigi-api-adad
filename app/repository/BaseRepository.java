package repository;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.Expr;
import io.ebean.ExpressionList;
import io.ebean.PagedList;
import io.ebean.Transaction;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import core.util.Response;
import javax.persistence.PersistenceException;
import models.CatalogoSincronizacion;
import play.db.ebean.EbeanConfig;
import play.libs.Json;
import play.Logger.ALogger;
import play.Logger;
import play.mvc.Results;
import play.mvc.Result;

public class BaseRepository {

    private final ALogger logger = Logger.of(this.getClass());
    private static final String ERRORMSS = "Repository information exception error: ";
    public static final String MSSLOGGER = "Repository Information method : \n\t ";
    public final EbeanServer ebeanServer;
    private final Class cls;

    public BaseRepository(EbeanConfig ebeanConfig, Class cls) {
        this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
        this.cls = cls;
    }

    public EbeanServer getEbeanServer(){
        return this.ebeanServer;
    }

    public Class getClazz(){
        return this.cls;
    }

    @SuppressWarnings("unchecked")
    public <T> PagedList<T> page(int page, int pageSize, String sortBy, String order, String filter, String[] fields) {
        logger.debug(MSSLOGGER + this.cls.getCanonicalName()+ "@page \n\t");
        logger.debug("Getting future response objects: ");
        ExpressionList<T> expression = ebeanServer.find(this.cls).where();

        if(!filter.equals(""))
            for (String field : fields)
                expression = expression.ilike(field, "%" + filter + "%");

        expression.orderBy(sortBy + " " + order)
            .setFirstRow(page * pageSize)
            .setMaxRows(pageSize);

        logger.debug("Expression list total row counter: "+expression.findCount());

        return expression.findPagedList();
    }

    @SuppressWarnings("unchecked")
    public <T> PagedList<T> page(int page, String sortBy, String order, String filter, String[] fields, int tr, ExpressionList<T>  exp) {
        logger.debug(MSSLOGGER + this.cls.getCanonicalName()+ "@page \n\t");
        logger.debug("Getting future response objects: ");
        ExpressionList<T> expression = ebeanServer.find(this.cls).where();

        ExpressionList<T> exp1 = ebeanServer.find(this.cls).where();

        
        if(!filter.equals("")){ 
            expression = expression.or();
            for (String field : fields){
                expression = expression.ilike(field, "%" + filter + "%");
            }
            
        }

        expression = expression.where();
        
        if (exp != null)
            expression.addAll(exp);

        expression.orderBy(sortBy + " " + order)
            .setFirstRow(page * tr)
            .setMaxRows(tr);

        logger.debug("Expression list total row counter: "+expression.findCount());

        return expression.findPagedList();
    }

    @SuppressWarnings("unchecked")
    public <T> List<T> list(Map<String,Object> exp) {
        ExpressionList<T> myQuery = ebeanServer.find(this.cls).where();
        if (exp != null)
            myQuery.allEq(exp);

        return myQuery.findList();
    }

    @SuppressWarnings("unchecked")
    public <T> List<T> list(ExpressionList<T>  exp) {
        ExpressionList<T> myQuery = ebeanServer.find(this.cls).where();
        if (exp != null)
            myQuery.addAll(exp);

        return myQuery.findList();
    }

    @SuppressWarnings("unchecked")
    public <T> Map<String, String> options(ExpressionList<T>  exp, String key, String value) {
        logger.debug(MSSLOGGER + this.cls.getCanonicalName()+ "@options \n\t");
        HashMap<String, String> options = new LinkedHashMap<>();

        ExpressionList<T> myQuery = ebeanServer.find(this.cls).where();
        if (exp != null)
            myQuery.addAll(exp);

        try {
            logger.debug("List objects found in query: "+myQuery.findList().size());
            for (Object c : myQuery.findList()) {
                options.put(c.getClass().getField(key).get(c).toString(), c.getClass().getField(value).get(c).toString());
            }
        } catch (Exception e) {
            Logger.error(ERRORMSS, e);
        }
        return options;
    }

    @SuppressWarnings("unchecked")
    public Result save(Object data) throws PersistenceException, NullPointerException, Exception{
        Object object = null;
        Transaction txn = ebeanServer.beginTransaction();
        try {
            ebeanServer.save(data, txn);
            ebeanServer.refresh(data);
            CatalogoSincronizacion.sync(this.cls);
            txn.commit();
            object = data;
        } catch (PersistenceException e) {
            e.printStackTrace();
            logger.error("Error while trying to save object registry in database", e);
            logger.error("Data: {}", Json.toJson(data));
            txn.rollback();
            return Results.badRequest(Response.createError("PersistenceException",e.getMessage()));
        } catch (NullPointerException e) {
            e.printStackTrace();
            logger.error("Error while trying to save object registry in database", e);
            logger.error("Data: {}", Json.toJson(data));
            txn.rollback();
            return Results.badRequest(Response.createError("NullPointerException",e.getMessage()));
        }catch (Exception e) {
            e.printStackTrace();
            logger.error("Error while trying to save object registry in database", e);
            logger.error("Data: {}", Json.toJson(data));
            txn.rollback();
            return Results.badRequest(Response.createError("Exception",e.getMessage()));
        }
        txn.end();
        return Results.ok(Json.toJson(object));
    }

    @SuppressWarnings("unchecked")
    public Optional<Object> get(long id) {
        logger.debug("Getting object caso from BaseRepository@get... ");
        Object obj = ebeanServer.find(cls).setId(id).findUnique();
        if (obj != null) {
            logger.debug("Object Found: "+cls.cast(obj));   
        }else{
            logger.error("Object not Found :(");
        }

        return Optional.ofNullable(obj);
    }

    @SuppressWarnings("unchecked")
    public <T> Optional<Object> get(long id, ExpressionList<T>  exp) {
        ExpressionList<T> values = ebeanServer.find(cls).where();
        values.eq("id", id);
        if (exp != null) {
            values.addAll(exp);
        }
        return Optional.ofNullable(values.findUnique());
    }

    @SuppressWarnings("unchecked")
    public Optional<Boolean> delete(long id) {
        final Optional<Object> optional;
        Optional<Boolean> res;
        try {
            ebeanServer.beginTransaction();
            optional = Optional.ofNullable(ebeanServer.find(cls).setId(id).findUnique());
            boolean exist = optional.isPresent();
            optional.ifPresent(c -> ebeanServer.delete(c));
            ebeanServer.commitTransaction();
            res = Optional.ofNullable(exist);
        } catch (Exception e) {
            logger.error(ERRORMSS, e);
            res = Optional.empty();
            ebeanServer.rollbackTransaction();
        }
        ebeanServer.endTransaction();
        return res;
    }

    @SuppressWarnings("unchecked")
    public Optional<Object> update(long id, Object newData) {
        Optional<Object> value = Optional.empty();
        try {
            ebeanServer.beginTransaction();
            Object saved = ebeanServer.find(cls).setId(id).findUnique();
            Boolean updated = false;
            if (saved != null) {
                updated = true;
                newData.getClass().getField("id").set(newData, id);
                ebeanServer.update(newData);
                ebeanServer.refresh(newData);
                CatalogoSincronizacion.sync(this.cls);
                ebeanServer.commitTransaction();
                value = Optional.ofNullable(newData);
            }
        } catch (Exception e) {
            logger.error("Error while trying to save data registry in database", e);
            logger.error("Data: {}", Json.toJson(newData));
            ebeanServer.rollbackTransaction();
        }
        ebeanServer.endTransaction();
        return value;
    }
}
