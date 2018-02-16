/*
 * Copyright (c)
 */
package controllers;

import java.util.concurrent.CompletionStage;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import models.EfectoDetalle;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.mvc.With;
import repository.EfectoDetalleRepository;

 /**
  * Esta Clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de EfectoDetalle que es y forma parte
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

@With(SecuredBasicAuth.class)
public class EfectoDetalleController extends BaseController {

    @Inject
    public EfectoDetalleController(FormFactory formFactory,
                EfectoDetalleRepository repository,
                HttpExecutionContext httpExecutionContext) {
        super(formFactory, repository, httpExecutionContext);
        this.controller = "EfectoDetalleController";
    }

    /****************************************************************
    *****************************************************************
    ***                        METODOS CRUD                       ***
    *****************************************************************
    ****************************************************************/

    /**
     * Metodo que retorna la lista de valores
     * para un elemento select en formato de Json de un Modelo de EfectoDetalle.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     *
     * @return      Json de EfectoDetalle actualizado
     * @see         models.EfectoDetalle
     *
     * @version 1.0
     *
     * @since 1.0
     */


    public CompletionStage<Result> options() {
        return super.list("options", new Class[]{}, new Object[]{});
    }

    /**
     * Metodo que retorna una lista de todos los registros de la tipo de uso y de vehiculo.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @param  id   id de EfectoDetalle
     *
     * @return      Json de todos los registros de EfectoDetalle
     * @see         models.EfectoDetalle
     *
     * @version 1.0
     *
     * @since 1.0
     */
    public CompletionStage<Result> list() throws PersistenceException {
        return super.list("list", new Class[]{
        }, new Object[]{
        });
    }
}
