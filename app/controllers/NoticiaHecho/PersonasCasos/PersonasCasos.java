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
import javax.persistence.PersistenceException;
import models.PersonaCaso;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.mvc.With;
import repository.PersonaCasoRepository;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de PersonaCaso que es y forma parte
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
public class PersonasCasos extends CaseCatalogBaseController {

    @Inject
    public PersonasCasos(
        FormFactory formFactory,
        PersonaCasoRepository repository,
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
     * Metodo que retorna la actualizacion de un Modelo de PersonaCaso.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @param  id   id de PersonaCaso
     *
     * @return      Json de PersonaCaso actualizado
     * @see         models.PersonaCaso
     *
     * @version 1.0
     *
     * @since 1.0
     */
    public CompletionStage<Result> list(Long id) throws PersistenceException {
        return super.list("listByCase", new Class[]{
            Long.class
        }, new Object[]{
            id
        });
    }


    /**
     * Metodo que retorna la una lista de personas relacionadas con un caso
     * en especifico y un tipo de inteviniente de un Modelo de PersonaCaso.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @param  id   id de PersonaCaso
     *
     * @return      Json de PersonaCaso actualizado
     * @see         models.PersonaCaso
     *
     * @version 1.0
     *
     * @since 1.0
     */
    public CompletionStage<Result> listByCaseAndTipoInterviniente(Long idCaso, Long idTipoInterviniente) throws PersistenceException {
        return super.list("listByCaseAndTipoInterviniente", new Object[]{
            idCaso, idTipoInterviniente
        });
    }
}
