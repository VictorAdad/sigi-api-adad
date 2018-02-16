/*
 * Copyright (c) Evomatik software 2017
 * 
 * Este codigo fue llevado a cabo por el equipo de evomatik
 * cualquier persona ajena a la compañia y/o del codigo fuente
 * que realize modificaciones o copie el siguiente codigo sera 
 * acreditado para una sancion legal y monetaria. 
 * 
 */
package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;

public class HomeController extends Controller {

    public Result index() {
    	ObjectNode result = Json.newObject();
    	result.put("name", "SIGI-API");
    	result.put("version", "1.0.0");
    	result.put("host", "localhost");
    	result.put("timestamp", System.currentTimeMillis() );
        return ok(result);
    }
}
