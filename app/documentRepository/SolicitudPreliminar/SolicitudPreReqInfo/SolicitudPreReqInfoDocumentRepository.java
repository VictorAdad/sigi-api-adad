package documentRepository;
import javax.inject.Inject;
import models.SolicitudPreReqInfo;
import play.db.ebean.EbeanConfig;
import java.util.HashMap;
import play.Logger;
import core.util.App;
import models.PersonaCaso;
import java.util.Date;
import ldpaModels.User;
import com.typesafe.config.Config;

public class SolicitudPreReqInfoDocumentRepository extends DocumentRepository{

    @Inject
    public SolicitudPreReqInfoDocumentRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, SolicitudPreReqInfo.class);
    }

    public HashMap<String,Object> F2_039(Long id, Config configuration) throws Exception{
        SolicitudPreReqInfo  object = findById(id);
        Logger.debug("Entrando al método F2_039 con ID:"+ id);
        Logger.debug("Object encontrado:"+object);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>() ;
        User user = App.getUsuario(object.caso,configuration);

        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xHechoDelictivo", object.caso.getDelitoPrincipal() == null ? "" : object.caso.getDelitoPrincipal().nombre);
        atributosDocumento.put("xVictima",App.getAllPersonasHerencia(object.caso.id,"Víctima",object.id,true));
        atributosDocumento.put("xImputadoMayus", (object.heredar ?
                                             App.getAllPersonasHerencia(object.caso.id,"Imputado",object.id,true) :
                                             App.getAllValuesImputados(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO").toUpperCase()));
        
        atributosDocumento.put("xImputado", (object.heredar ?
                                             App.getAllPersonasHerencia(object.caso.id,"Imputado",object.id,false) :
                                             App.getAllValuesImputados(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO")));
        atributosDocumento.put("xOficio", object.noOficio);
        atributosDocumento.put("xPoblacion", user.getMunicipio() == null ? "" : user.getMunicipio());
        atributosDocumento.put("xEstado", "Estado de México");
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xNombreAutoridadDirige", object.autoridadReq);
        atributosDocumento.put("xCargoAdscripcionAutoridad", object.cargoTurnoAdscripcion);
        atributosDocumento.put("xDireccionInstitucion", object.domicilioAutoridad);
        atributosDocumento.put("xInfoSolicitada", object.infoRequerida);
        atributosDocumento.put("xPlazoRemitirInfo", object.plazoDias);
        atributosDocumento.put("dDocTitle","Solicitud de requerimiento de información");
        atributosDocumento.put("xNombreAutoridadDirigeMayus", object.autoridadReq == null ? "" : object.autoridadReq.toUpperCase());
        atributosDocumento.put("xCargoAdscripcionAutoridadMayus", object.cargoTurnoAdscripcion == null ? "" : object.cargoTurnoAdscripcion.toUpperCase());
        atributosDocumento.put("xDireccionInstitucionMayus", object.domicilioAutoridad == null ? "" : object.domicilioAutoridad.toUpperCase());
        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());

        return atributosDocumento;
    }

    public HashMap<String,Object> F1_020(Long id, Config configuration) throws Exception{
        SolicitudPreReqInfo  object = findById(id);
        Logger.debug("Entrando al método F1_020 con ID:"+ id);
        Logger.debug("Object encontrado:"+object);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>() ;
        User user = App.getUsuario(object.caso,configuration);
        
        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xHechoDelictivo", object.caso.getDelitoPrincipal() == null ? "" : object.caso.getDelitoPrincipal().nombre);
        atributosDocumento.put("xVictima", (object.heredar ? 
                                            App.getAllPersonasHerencia(object.caso.id,"Víctima",object.id,true) :
                                            App.getAllValuesVictimas(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO").toUpperCase()));
        
        atributosDocumento.put("xImputadoMayus", (object.heredar ?
                                             App.getAllPersonasHerencia(object.caso.id,"Imputado",object.id,true) :
                                             App.getAllValuesImputados(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO").toUpperCase()));
        
        atributosDocumento.put("xImputado", (object.heredar ?
                                             App.getAllPersonasHerencia(object.caso.id,"Imputado",object.id,false) :
                                             App.getAllValuesImputados(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO")));
        atributosDocumento.put("xOficio", object.noOficio);
        atributosDocumento.put("xPoblacion", user.getMunicipio() == null ? "" : user.getMunicipio());
        atributosDocumento.put("xEstado", "Estado de México");
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xNombreAutoridadDirige", object.autoridadReq);
        atributosDocumento.put("xCargoAdscripcionAutoridad", object.cargoTurnoAdscripcion);
        
        atributosDocumento.put("xDireccionInstitucion", object.domicilioAutoridad);
        atributosDocumento.put("xInfoSolicitada", object.infoRequerida);
        atributosDocumento.put("dDocTitle","Solicitud de requerimiento de información sin apercibimiento");
        atributosDocumento.put("xNombreAutoridadDirigeMayus", object.autoridadReq == null ? "" : object.autoridadReq.toUpperCase());
        atributosDocumento.put("xCargoAdscripcionAutoridadMayus", object.cargoTurnoAdscripcion == null ? "" : object.cargoTurnoAdscripcion.toUpperCase());
        atributosDocumento.put("xDireccionInstitucionMayus", object.domicilioAutoridad == null ? "" : object.domicilioAutoridad.toUpperCase());
        
        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());

        return atributosDocumento;
    }

    public SolicitudPreReqInfo findById(Long id){
        return super.getEbeanServer().find(SolicitudPreReqInfo.class).where().eq("id",Long.valueOf(id)).findUnique();
    }

}
