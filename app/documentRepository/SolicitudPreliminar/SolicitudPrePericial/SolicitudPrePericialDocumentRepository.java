package documentRepository;
import javax.inject.Inject;
import models.SolicitudPrePericial;
import play.db.ebean.EbeanConfig;
import java.util.HashMap;
import play.Logger;
import core.util.App;
import models.PersonaCaso;
import java.util.Date;
import ldpaModels.User;
import com.typesafe.config.Config;

public class SolicitudPrePericialDocumentRepository extends DocumentRepository{

    @Inject
    public SolicitudPrePericialDocumentRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, SolicitudPrePericial.class);
    }

    public HashMap<String,Object> F1_009(Long id, Config configuration) throws Exception{
        SolicitudPrePericial  object = findById(id);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>() ;
        User user = App.getUsuario(object.caso,configuration);

        Logger.debug("Entrando al método F1_001 con ID:"+ id);
        Logger.debug("Object encontrado:"+object);
        Logger.debug("NIC:"+object.caso.nic);
        Logger.debug("NUC:"+object.caso.nuc);
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
        atributosDocumento.put("xSolicitaPerito", object.peritoMateria == null ? "" : object.peritoMateria.nombre);
        atributosDocumento.put("xFinalidadRequerimiento", object.finalidad);
        atributosDocumento.put("xPlazoRendirInformes", object.plazoDias);
        atributosDocumento.put("xApercibimiento", object.apercibimiento);
        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());
        atributosDocumento.put("xDirectorInstituto", object.directorInstituto);
        atributosDocumento.put("dDocTitle","Oficio solicitud a servicios periciales");
        return atributosDocumento;
    }

    public HashMap<String,Object> F1_010(Long id, Config configuration){
        SolicitudPrePericial  object = findById(id);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>();
        User user = App.getUsuario(object.caso,configuration);

        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xHechoDelictivo",object.caso.getDelitoPrincipal() == null ? "" : object.caso.getDelitoPrincipal().nombre);
        atributosDocumento.put("xVictima", (object.heredar ? 
                                            App.getAllPersonasHerencia(object.caso.id,"Víctima",object.id,true) :
                                            App.getAllValuesVictimas(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO").toUpperCase()));
        atributosDocumento.put("xImputado", (object.heredar ?
                                             App.getAllPersonasHerencia(object.caso.id,"Imputado",object.id,true) :
                                             App.getAllValuesImputados(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO").toUpperCase()));
        atributosDocumento.put("xOficio",object.noOficio);
        atributosDocumento.put("xPoblacion", user.getMunicipio() == null ? "" : user.getMunicipio());
        atributosDocumento.put("xEstado", "Estado de México");
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xMedicoLegista",object.medicoLegista);
        atributosDocumento.put("xSolicitaExamen",object.tipoExamen == null ? "" : object.tipoExamen.nombre);
        atributosDocumento.put("xRealizaraExamen",object.realizadoA);
        atributosDocumento.put("xApercibimiento",object.apercibimiento);
        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());
        atributosDocumento.put("xMedicoLegistaMayus",object.medicoLegista);
        atributosDocumento.put("dDocTitle","Oficio solicitud examen psicofísico");

        return atributosDocumento;
    }

    public SolicitudPrePericial findById(Long id){
        return super.getEbeanServer().find(SolicitudPrePericial.class).where().eq("id",Long.valueOf(id)).findUnique();
    }
}