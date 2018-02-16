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
import repository.AcuerdoRepository;
import play.mvc.With;
import play.mvc.Result;
import javax.persistence.PersistenceException;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de Acuerdos que es y forma parte
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
public class Acuerdos extends BaseHerenciaController {

    @Inject
    public Acuerdos(
        FormFactory formFactory,
        AcuerdoRepository repository,
        HttpExecutionContext httpExecutionContext
    ) {
        super(formFactory, repository, httpExecutionContext);
    }

    public CompletionStage<Result> listByCaseAndTipo(Long idCaso, String tipo) throws PersistenceException {
        return super.list("listByCaseAndTipo", new Object[]{
            idCaso, tipo
        });
    }
}
