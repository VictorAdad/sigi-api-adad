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

import javax.inject.Inject;
import models.Usuario;
import play.data.FormFactory;
import java.util.concurrent.CompletionStage;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.mvc.With;
import repository.UsuarioRepository;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de Usuario que es y forma parte
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
public class Usuarios extends BaseController {

    @Inject
    public Usuarios(
        FormFactory formFactory,
        UsuarioRepository repository,
        HttpExecutionContext httpExecutionContext
    ) {
        super(formFactory, repository, httpExecutionContext);
    }



    /**
     * Metodo que retorna la lista de valores
     * para un elemento select en formato de Json de un Modelo de Usuario.
     *
     * @author Gibrán Córdoba
     *
     *
     * @return      Json de Usuario actualizado
     * @see         models.Usuario
     *
     * @version 1.0
     *
     * @since 1.0
     */
    public CompletionStage<Result> optionsByAgency(Long id) {
        return super.list("optionsByAgency", new Object[]{
            id
        });
    }
}
