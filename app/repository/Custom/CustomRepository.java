package repository;

import core.database.ebean.ExpressionBuilder;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import javax.inject.Inject;
import play.db.ebean.EbeanConfig;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;


public class CustomRepository{

    private EbeanConfig ebeanConfig;

    private Class clzz;

    @Inject
    public CustomRepository(EbeanConfig ebeanConfig) {
        this.ebeanConfig = ebeanConfig;
    }

    public Class getClazz(){
        return this.clzz; 
    }

    public void setClazz(Class clzz){
        this.clzz = clzz; 
    }

    public <T> Object processQuery(List<String> customExp, String select){
        Object obj = null;

        ExpressionBuilder expBuilder = new ExpressionBuilder();
        
        // ExpressionList<T> obj = expBuilder.addAll(this.customParser(customExp)).get();

        return obj;
    }


    public boolean validQueryType(){
        return true;
    }

    private Map<String, Object> customParser(List<String> cExpr){
        Map<String, Object> values = new TreeMap<>();
        int i = 0;
        while (i < cExpr.size()) {
            String[] val = cExpr.get(i).split("::", 2);
            values.put(val[0], val[1]);
            i++;
        }

        return values;
    }

    
}
