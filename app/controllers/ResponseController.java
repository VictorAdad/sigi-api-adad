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

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.ebean.PagedList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.CompletionStage;
import java.util.Optional;
import models.BaseModel;
import models.BaseModel;
import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.Json;
import play.Logger;
import play.Logger.ALogger;
import play.mvc.Controller;
import play.mvc.Result;


import models.Caso;
import core.util.utilities.JsonViews;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class ResponseController extends Controller {

    private final ALogger logger = Logger.of(this.getClass());

    public ResponseController() {}

    public JsonNode pageConstructor(PagedList<?> list){
        JsonNode json = Json.newObject();
        logger.debug("Data: "+ Json.prettyPrint(Json.toJson(list.getList())));
        ((ObjectNode)json).set("data", Json.toJson(list.getList()));
        ((ObjectNode)json).set("totalCount", Json.toJson(list.getTotalCount()));
        return json;
    }

    public JsonNode pageConstructor(PagedList<?> list, Class<?> view){
        JsonNode json = Json.newObject();
        logger.debug("Data: "+ Json.prettyPrint(Json.toJson(list.getList())));
        ((ObjectNode)json).set("data", JsonViews.toJson(list.getList(), view));
        ((ObjectNode)json).set("totalCount", Json.toJson(list.getTotalCount()));
        return json;
    }

    public JsonNode errorContructor(JsonNode errors){
        JsonNode json = Json.newObject();
        logger.debug("Errors: "+ Json.prettyPrint(Json.toJson(errors)));
        ((ObjectNode)json).set("errors", errors);
        return json;
    }

    public JsonNode createError(String errorName, Object errorValue){
        JsonNode json = Json.newObject();
        ((ObjectNode)json).set(errorName, Json.toJson(errorValue) );
        return json;
    }

    public JsonNode responseContructor(String type, JsonNode response){
        JsonNode json = Json.newObject();
        logger.debug("Values to response: "+ Json.prettyPrint(Json.toJson(response)));
        ((ObjectNode)json).set(type , response);
        return json;
    }

    public JsonNode createNode(String nodeName, Object nodeValue){
        JsonNode json = Json.newObject();
        ((ObjectNode)json).set(nodeName, Json.toJson(nodeValue) );
        return json;
    }
}
