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
import models.Predenuncia;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Result;
import play.mvc.With;
import repository.PredenunciaRepository;

 /**
  * Esta clase es un controlador para manipular las acciones
  * del Modelo y el repositorio de Predenuncia que es y forma parte
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
public class Predenuncias extends BaseHerenciaController {

    @Inject
    public Predenuncias(
        FormFactory formFactory,
        PredenunciaRepository repository,
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
     * Metodo que retorna un objeto de predenuncia filtrado por caso.
     *
     * @author Oscar Gibrán Córdoba Méndez
     *
     * @param  id   id de caso
     *
     * @return      Json de predenuncia
     * @see         models.Predenuncia
     *
     * @version 1.0
     *
     * @since 1.0
     */
    public CompletionStage<Result> getByCase(Long id) throws PersistenceException {
        return super.get("getByCase", new Class[]{
            Long.class
        }, new Object[]{
            id
        });
    }
}
