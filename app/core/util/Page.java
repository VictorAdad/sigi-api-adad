package core.util;

import play.Logger;
import play.Logger.ALogger;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import io.ebean.PagedList;
import io.ebean.ExpressionList;
import io.ebean.Expression;
import static io.ebean.Expr.*;
import io.ebean.Model;
import io.ebean.Finder;
import java.lang.ClassCastException;
import com.fasterxml.jackson.databind.ObjectMapper;

// Ejemplo para poder imprimir consola con diferentes colores.
// System.out.println("\033[31;1mHello\033[0m, \033[32;1;2mworld!\033[0m");
// System.out.println("\033[31mRed\033[32m, Green\033[33m, Yellow\033[34m, Blue\033[0m");

public class Page {

    private final static ALogger logger = Logger.of(Page.class);

    public static Map<String, Object> page(Finder<Long, ?> find, Map<String, Object> params, ArrayList<Expression>   expres) {
        logger.debug("Page@page Page Contructor: \n\nParams: \n\tvalues: \n\t\t" + params + "\n Current User: \n\tNO SET FUNCTION YET\n");

        Map<String, Object>     page        = new TreeMap<String, Object>();
        ArrayList<Expression>   expressions = expres;
        ArrayList<Object>       objects     = getPage(find, expressions, params);
        PagedList<Model>        pagination  = null;
        Integer                 totalRows   = 0;
        try{
            pagination = (PagedList<Model>) objects.get(1);
            totalRows  = pagination.getTotalCount();
        }catch(ClassCastException cce){
            logger.error("Error obteniendo el paginador: "+cce);
            cce.printStackTrace();
        }catch(Exception e){
            logger.error("Error: "+e);
            e.printStackTrace();
        }

        // PagedList<Model>
        page.put("draw", Integer.parseInt((String)params.get("draw")));
        page.put("recordsTotal",  objects.get(0));
        page.put("recordsFiltered",   totalRows);
        page.put("data",   pagination.getList());

        return page;
    }

    public static ArrayList<Object> getPage(Finder<Long, ?> find, ArrayList<Expression> expressions, Map<String, Object> params) {
        ArrayList<Object>       array           = new ArrayList<Object>();
        ExpressionList<?>       query           = find.query().where();
        Integer                 pageSize        = (params.get("pageSize") != null) ? Integer.parseInt((String)params.get("pageSize")) : 10;
        Integer                 start           = (params.get("start") != null) ? Integer.parseInt((String)params.get("start")) : 1;
        ObjectMapper            mapper          = new ObjectMapper();
        Map<String, Object>     values          = mapper.convertValue(params.get("order"), Map.class);
        String                  order           = (values.get("value") != null  &&  !values.get("value").equals(""))  ? String.valueOf(values.get("value")).trim().replaceAll("\\s+", " ") : "desc";
        String                  sortBy          = (values.get("column") != null &&  !values.get("column").equals("")) ? String.valueOf(values.get("column")).trim().replaceAll("\\s+", " ") : "";
                                mapper          = new ObjectMapper();
                                values          = mapper.convertValue(params.get("filter"), Map.class);
        String                  filterValue     = (values.get("value") != null  &&  !values.get("value").equals(""))  ? String.valueOf(values.get("value")).trim().replaceAll("\\s+", " ") : "";
        String                  filterColumn    = (values.get("column") != null &&  !values.get("column").equals("")) ? String.valueOf(values.get("column")).trim().replaceAll("\\s+", " ") : "";

        expressions.forEach(exp -> query.add(exp));

        array.add(query.findCount());

        if (!filterColumn.equals("")) {
            query.add(ilike(filterColumn, "%" + filterValue + "%"));
        }

        query.orderBy(sortBy + " " + order);

         array.add((PagedList<Model>) query
            .setFirstRow(start)
            .setMaxRows(pageSize)
            .findPagedList());
        return array;
    }

    public static Map<String, Object> generateValues(Map<String, String[]> values){
        Map<String, Object> params = new TreeMap<String, Object>();
        Map<String, Object> temps = new TreeMap<String, Object>();
        temps.put("column", values.get("order[column]")[0]);
        temps.put("value", values.get("order[value]")[0]);
        params.put("draw", values.get("draw")[0]);
        params.put("order", temps);
        temps = new TreeMap<String, Object>();
        temps.put("column", "id");
        temps.put("value", values.get("search")[0]);
        params.put("filter", temps);
        params.put("pageSize", values.get("rows")[0]);
        params.put("start", values.get("start")[0]);
        return params;
    };
}
