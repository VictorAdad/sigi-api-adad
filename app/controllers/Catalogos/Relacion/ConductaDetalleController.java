/*
 * Copyright (c)
 */
package controllers;

import java.util.concurrent.CompletionStage;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.mvc.With;
import repository.ConductaDetalleRepository;

 /**
  * Esta Clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de ConductaDetalleController que es y forma parte
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
public class ConductaDetalleController extends BaseController {

    @Inject
    public ConductaDetalleController(FormFactory formFactory,
                ConductaDetalleRepository repository,
                HttpExecutionContext httpExecutionContext) {
        super(formFactory, repository, httpExecutionContext);
        this.controller = "ConductaDetalleController";
    }

    /****************************************************************
    *****************************************************************
    ***                        METODOS CRUD                       ***
    *****************************************************************
    ****************************************************************/

    /**
     * Metodo que retorna la lista de valores
     * para un elemento select en formato de Json de un Modelo de ConductaDetalleController.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     *
     * @return      Json de ConductaDetalleController actualizado
     * @see         models.ConductaDetalleController
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
     * @param  id   id de ConductaDetalleController
     *
     * @return      Json de todos los registros de ConductaDetalleController
     * @see         models.ConductaDetalleController
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
