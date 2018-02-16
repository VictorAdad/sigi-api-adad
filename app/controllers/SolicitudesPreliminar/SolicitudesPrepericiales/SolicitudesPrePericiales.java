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
import models.SolicitudPrePericial;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import repository.SolicitudPrePericialRepository;
import play.mvc.With;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de SolicitudPrePericial que es y forma parte
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
public class SolicitudesPrePericiales extends BaseHerenciaController {

    @Inject
    public SolicitudesPrePericiales(
        FormFactory formFactory,
        SolicitudPrePericialRepository repository,
        HttpExecutionContext httpExecutionContext
    ) {
        super(formFactory, repository, httpExecutionContext);
    }
}
