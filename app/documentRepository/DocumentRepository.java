package documentRepository;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.ExpressionList;
import io.ebean.Transaction;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Iterator;
import java.lang.reflect.Field;

import play.db.ebean.EbeanConfig;
import play.libs.Json;
import play.Logger.ALogger;
import play.Logger;

public class DocumentRepository {

    private final ALogger logger = Logger.of(this.getClass());
    public final EbeanServer ebeanServer;
    private final Class cls;

    public DocumentRepository(EbeanConfig ebeanConfig, Class cls) {
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
    public Object saveDocument(Object data, HashMap<String,Object> atributos) {
        Class<?> type = data.getClass();
        Object object = null;
        Transaction txn = ebeanServer.beginTransaction();
        try {
            Iterator it = atributos.entrySet().iterator();
            object  = type.newInstance();
            object = data;
            if(atributos!=null && atributos.size()>0){
                while (it.hasNext()) {
                    Map.Entry pair = (Map.Entry)it.next();
                    Field field = type.getField(pair.getKey().toString());
                    field.setAccessible(true);
                    field.set(type.cast(object), pair.getValue());
                    field.setAccessible(false);
                    it.remove(); 
                    pair = null;
                    field = null;
                }
            }
            ebeanServer.insert(object, txn);
            txn.commit();
            // object = data;
        } catch (Exception e) {
            logger.error("Error al realizar la transacción save de documentos", e);
            txn.rollback();
            object = null;
        }
        txn.end();
        return object;
        
    }

    public Object copyObject(Object entity) throws IllegalAccessException, InstantiationException {
        Class<?> clazz = entity.getClass();
        Object newEntity = entity.getClass().newInstance();

        while (clazz != null) {
            copyFields(entity, newEntity, clazz);
            clazz = clazz.getSuperclass();
        }

        return newEntity;
    }

    public Object copyFields(Object entity, Object newEntity, Class<?> clazz) throws IllegalAccessException {
        List<Field> fields = new ArrayList<>();
        for (Field field : clazz.getDeclaredFields()) {
            fields.add(field);
        }
        for (Field field : fields) {
            field.setAccessible(true);
            field.set(newEntity, field.get(entity));
            field.setAccessible(false);
        }
        return newEntity;
    }

}
