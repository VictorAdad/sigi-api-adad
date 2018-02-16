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
import javax.inject.Inject;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import repository.EntrevistaRepository;
import java.util.concurrent.CompletionStage;
import play.mvc.Result;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de Entrevista que es y forma parte
  * de un caso de investigacion para la fiscalia del estado de
  * toluca.
  *
  * @author  Gibran Córdoba
  * @author  Jesus Viveros
  * @author  Lazaro Hernandez
  * @see     Set
  * @see     List
  * @see     Map
  * @see     Json
  * @see     Controllers
  * @since   1.0
  * @version 1.0
  */
public class Entrevistas extends BaseHerenciaController {

    @Inject
    public Entrevistas(
        FormFactory formFactory,
        EntrevistaRepository repository,
        HttpExecutionContext httpExecutionContext
    ) {
        super(formFactory, repository, httpExecutionContext);
    }
    /****************************************************************
    *****************************************************************
    ***                        METODOS CRUD                       ***
    *****************************************************************
    ****************************************************************/

    /**
     * Metodo que obtiene la paginacion de los regitros
     * de CalibreMecanismos filtrado con diferentes caracteristicas.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @param page numero de la pagina que se requiere listas
     * @param sortBy columna por la cual se va a filtrar los registros
     * @param order tipo de orden que se le dara a los registros Ex. "ASC" "DESC"
     * @param filter busqueda personalizada de los registros
     * @param tr numero de registros por consulta ex. 10, 25, 5
     *
     * @return      Json con array de objetos encontrados
     * @see         models.CalibreMecanismo
     *
     * @version 1.0
     *
     * @since 1.0
     */

    @Override
    public CompletionStage<Result> page(int page, String sortBy, String order,String filter, int tr
    ) {
        return super.page(page, sortBy, order, filter, tr);
    }
}
