package core.database.ebean;

import io.ebean.ExpressionList;
import java.util.Map;

public class ExpressionBuilder{

    ExpressionList<?> expr;

    public ExpressionBuilder(){}

    public ExpressionBuilder(ExpressionList<?> expr){
        this.expr = expr;
    }

    public ExpressionBuilder addAll(Map<String, Object> exp){
        return this;
    }

    public ExpressionList<?> get(){
        return this.expr;
    }

}
