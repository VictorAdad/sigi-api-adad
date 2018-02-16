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
import models.DocSolPreInspeccion;
import java.util.concurrent.CompletionStage;
import play.mvc.Result;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de DocSolPreInspeccion que es y forma parte
  * de un caso de investigacion para la fiscalia del estado de
  * toluca.
  *
  * @author  Oli
  * @see     Set
  * @see     List
  * @see     Map
  * @see     Json
  * @see     Controllers
  * @since   1.0
  * @version 1.0
  */
public class DocsSolPreInspecciones extends DocumentBaseController {

    @Inject
    public DocsSolPreInspecciones(
        FormFactory formFactory,
        DocSolPreInspeccion model,
        HttpExecutionContext httpExecutionContext
    ) {
        super(formFactory, model, httpExecutionContext);
    }
}