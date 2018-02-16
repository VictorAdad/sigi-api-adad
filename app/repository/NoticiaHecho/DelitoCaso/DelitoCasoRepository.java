package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.List;
import javax.inject.Inject;
import models.DelitoCaso;
import play.db.ebean.EbeanConfig;
import java.util.Optional;
import play.Logger;
import play.Logger.ALogger;
import com.typesafe.config.Config;

public class DelitoCasoRepository extends BaseRepository{

    private static final String ERRORMSS = "Repository information exception error: ";
    public static final String MSSLOGGER = "Repository Information method : \n\t ";
    private final ALogger logger = Logger.of(this.getClass());
    private EbeanConfig ebeanConfig;
    private Config configuration;
    @Inject
    public DelitoCasoRepository(EbeanConfig ebeanConfig,Config configuration) {
        super(ebeanConfig, DelitoCaso.class);
        this.ebeanConfig = ebeanConfig;
        this.configuration = configuration;
    }

    public PagedList<DelitoCaso> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {"principal"};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public PagedList<DelitoCaso> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<DelitoCaso>  exp = super.getEbeanServer().find(DelitoCaso.class).where();
        exp.eq("caso.id", id);
        String[] fields = {"delito.nombre"};
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }

    public List<DelitoCaso> listByCase(Long id) {
        ExpressionList<DelitoCaso>  exp = super.getEbeanServer().find(DelitoCaso.class).where();
        exp.eq("caso.id", id);
        return super.list(exp);
    }


    public boolean setDefault(DelitoCaso dc, Long idCaso) {
        logger.debug(MSSLOGGER + this.getClass()+ "@setDefault \n\t");
        boolean completed = false;
        List<DelitoCaso> list = null;
        try {
            super.getEbeanServer().beginTransaction();
            //Validar que el casodelito si existe y 
            //validar que no sea el mismo principal
            if (dc.principal){
                logger.debug("No se realizo ninguna accion");
                completed = true;
            }else{ 
                // obtener la lista de DelitoCaso
                list = super.getEbeanServer().find(DelitoCaso.class).where()
                    .eq("caso.id", idCaso)
                    .findList();

                logger.debug("Rows founded: "+list.size());

                if(list.size() > 0){
                    
                    
                    int i = 0;
                    while (i < list.size()) {
                        logger.debug("id: "+list.get(i).id );
                        // Valida que el delito caso que encontramos y el de la lista sean iguales
                        list.get(i).principal = (dc.id.equals(list.get(i).id));
                        list.get(i).save();
                        i++;
                    }
                    completed = true;
                }
            }
            super.getEbeanServer().commitTransaction();
        } catch (Exception e) {
            logger.error(ERRORMSS, e);
            super.getEbeanServer().rollbackTransaction();
        }
        super.getEbeanServer().endTransaction();

        return completed;
    }

    public boolean validateCase(Long idCaso) {
        logger.debug(MSSLOGGER + this.getClass()+ "@validateCase \n\t");
        boolean valid = false;
        CasoRepository cr = new CasoRepository(this.ebeanConfig,configuration);
        Optional<Object> obj = cr.get(idCaso);
        logger.debug("Optional returned : "+obj);
        logger.debug("Object returned : "+obj.get());
        // si esta todo correcto se valida que el caso exista
        if (obj.isPresent())
            valid = true;
        
        logger.debug("Case Status: "+valid);
        return valid;
    }


    public DelitoCaso validRelation(Long id, Long idCaso) {
        logger.debug(MSSLOGGER + this.getClass()+ "@validateRelation \n\t id: "+ id + "\n\t idCaso: "+ idCaso);
        DelitoCaso dc = null;
        DelitoCaso delitocaso = DelitoCaso.find.byId(id);
        //Validacion de que el delito caso que se esta buscando tenga el caso correspondiente
        if (delitocaso != null && delitocaso.caso.id.equals(idCaso))
            dc = delitocaso;
        else
           logger.error("El Delito no se encuentra relacionado con el caso con ID: +"+idCaso);

        return dc;
    }
    

}
