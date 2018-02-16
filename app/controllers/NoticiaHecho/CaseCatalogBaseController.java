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

import java.util.concurrent.CompletionStage;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.Json;
import play.Logger;
import play.Logger.ALogger;
import play.mvc.Result;
import play.mvc.With;

@With(SecuredBasicAuth.class)
public class CaseCatalogBaseController extends BaseController {

    private final ALogger logger = Logger.of(this.getClass());

    public CaseCatalogBaseController(
        FormFactory formFactory,
        Object repository,
        HttpExecutionContext httpExecutionContext
    ){
        super(formFactory, repository, httpExecutionContext);
    }

    /**
     * Metodo que obtiene todos los registros filtrados por el caso
     * y filtrados con paginacion de los datos.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @param id identificador del caso
     * @param page numero de la pagina que se requiere listas
     * @param sortBy columna por la cual se va a filtrar los registros
     * @param order tipo de orden que se le dara a los registros Ex. "ASC" "DESC"
     * @param filter busqueda personalizada de los registros
     * @param tr numero de registros por consulta ex. 10, 25, 5
     *
     * @return      Json con objetos encontrados
     * @see         Models
     *
     * @version 1.0
     *
     * @since 1.0
     */
    public CompletionStage<Result> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        Logger.debug("Information controller method : \n\t "+super.controller+"@pageByCase");
        return super.page("pageByCase", new Object[]{
            id, page, sortBy, order, filter, tr
        });
    }
}
