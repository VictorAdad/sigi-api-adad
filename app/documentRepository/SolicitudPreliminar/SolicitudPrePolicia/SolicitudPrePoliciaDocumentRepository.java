package documentRepository;
import javax.inject.Inject;
import play.db.ebean.EbeanConfig;
import java.util.HashMap;
import java.util.Date;
import core.util.App;
import play.Logger;
import models.PersonaCaso;
import models.SolicitudPrePolicia;
import ldpaModels.User;
import com.typesafe.config.Config;

public class SolicitudPrePoliciaDocumentRepository extends DocumentRepository{

    @Inject
    public SolicitudPrePoliciaDocumentRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, SolicitudPrePolicia.class);
    }

    public SolicitudPrePolicia findById(Long id){
        return super.getEbeanServer().find(SolicitudPrePolicia.class).where().eq("id",Long.valueOf(id)).findUnique();
    }

    public HashMap<String,Object> F1_011(Long id, Config configuration) throws Exception{
        SolicitudPrePolicia  object = findById(id);
        Logger.debug("Entrando al método F1_011 con ID:"+ id);
        Logger.debug("Object encontrado:"+object);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>() ;
        User user = App.getUsuario(object.caso,configuration);
        
        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xHechoDelictivo", object.caso.getDelitoPrincipal() == null ? "" : object.caso.getDelitoPrincipal().nombre);
        atributosDocumento.put("xVictima", (object.heredar ? 
                                            App.getAllPersonasHerencia(object.caso.id,"Víctima",object.id,true) :
                                            App.getAllValuesVictimas(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO").toUpperCase()));
        atributosDocumento.put("xImputado", (object.heredar ?
                                             App.getAllPersonasHerencia(object.caso.id,"Imputado",object.id,true) :
                                             App.getAllValuesImputados(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO").toUpperCase()));
        atributosDocumento.put("xOficio", object.noOficio);
        atributosDocumento.put("xPoblacion", user.getMunicipio() == null ? "" : user.getMunicipio());
        atributosDocumento.put("xEstado", "Estado de México");
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xActuacionesSolicitadas", object.actuacionesSolicitadas);
        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());

        atributosDocumento.put("dDocTitle","Oficio solicitud de policia de investigación");
        return atributosDocumento;
    }

    public HashMap<String,Object> F1_021(Long id, Config configuration) throws Exception{
        SolicitudPrePolicia  object = findById(id);
        //Logger.debug("Entrando al método F1_021 con ID:"+ id);
        //Logger.debug("Object encontrado:"+object);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>() ;
        User user = App.getUsuario(object.caso,configuration);
        
        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xHechoDelictivo", object.caso.getDelitoPrincipal() == null ? "" : object.caso.getDelitoPrincipal().nombre);
        atributosDocumento.put("xVictima", (object.heredar ? 
                                            App.getAllPersonasHerencia(object.caso.id,"Víctima",object.id,true) :
                                            App.getAllValuesVictimas(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO").toUpperCase()));
        atributosDocumento.put("xImputado", (object.heredar ?
                                             App.getAllPersonasHerencia(object.caso.id,"Imputado",object.id,true) :
                                             App.getAllValuesImputados(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO").toUpperCase()));
        atributosDocumento.put("xOficio", object.noOficio);
        atributosDocumento.put("xPoblacion", user.getMunicipio() == null ? "" : user.getMunicipio());
        atributosDocumento.put("xEstado", "Estado de México");
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xActuacionesSolicitadas", object.actuacionesSolicitadas);
        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());

        atributosDocumento.put("dDocTitle","Oficio solicitud a policia de investigación sin apercibimiento");
        return atributosDocumento;
    }
    
}
