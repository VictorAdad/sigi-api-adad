package documentRepository;
import javax.inject.Inject;
import models.SolicitudPreAcuerdo;
import play.db.ebean.EbeanConfig;
import java.util.HashMap;
import play.Logger;
import core.util.App;
import models.PersonaCaso;
import java.util.Date;
import models.Usuario;
import models.Titular;
import ldpaModels.User;
import com.typesafe.config.Config;

public class SolicitudPreAcuerdoDocumentRepository extends DocumentRepository{

    @Inject
    public SolicitudPreAcuerdoDocumentRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, SolicitudPreAcuerdo.class);
    }


    public HashMap<String,Object> F1_001(Long id, Config configuration) throws Exception{
        SolicitudPreAcuerdo  object = findById(id);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>() ;
        User user = App.getUsuario(object.caso,configuration);
        Logger.debug("Entrando al método F1_001 con ID:"+ id);
        Logger.debug("Object encontrado:"+object);

        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xHechoDelictivo", object.caso.getDelitoPrincipal() == null ? "" : object.caso.getDelitoPrincipal().nombre);
        atributosDocumento.put("xVictimaMayus", (object.heredar ? 
                                                App.getAllPersonasHerencia(object.caso.id,"Víctima",object.id,true) :
                                                App.getAllValuesVictimas(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO").toUpperCase()));
        atributosDocumento.put("xVictima", (object.heredar ? 
                                            App.getAllPersonasHerencia(object.caso.id,"Víctima",object.id,false) :
                                            App.getAllValuesVictimas(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO")));
        atributosDocumento.put("xImputado", (object.heredar ?
                                             App.getAllPersonasHerencia(object.caso.id,"Imputado",object.id,true) :
                                             App.getAllValuesImputados(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO").toUpperCase()));
        atributosDocumento.put("xOficio", object.noOficioAtencion);
        atributosDocumento.put("xPoblacion", user.getMunicipio() == null ? "" : user.getMunicipio());
        atributosDocumento.put("xEstado", "Estado de México");
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xNombreAutoridadDirige", object.autoridadJuridico == null ? "" : object.autoridadJuridico.toUpperCase());
        atributosDocumento.put("xCargoAdscripcionAutoridad", object.cargoAdscripcionJuridico  == null ? "" : object.cargoAdscripcionJuridico.toUpperCase());
        atributosDocumento.put("xNecesidades", object.necesidades);
        atributosDocumento.put("xUbicacionAgenciaMP", object.ubicacionAtencion);
        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());
        atributosDocumento.put("dDocTitle","Oficio para ayuda y atención a la víctima");

        return atributosDocumento;
    }

    public SolicitudPreAcuerdo findById(Long id){
        return super.getEbeanServer().find(SolicitudPreAcuerdo.class).where().eq("id",Long.valueOf(id)).findUnique();
    }
    
    public HashMap<String,Object> F1_002(Long id, Config configuration){
        SolicitudPreAcuerdo  object = findById(id);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>() ;
        User user = App.getUsuario(object.caso,configuration);

        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xHechoDelictivo", object.caso.getDelitoPrincipal() == null ? "" : object.caso.getDelitoPrincipal().nombre.toUpperCase());
        atributosDocumento.put("xVictimaMayus", (object.heredar ? 
                                                App.getAllPersonasHerencia(object.caso.id,"Víctima",object.id,true) :
                                                App.getAllValuesVictimas(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO").toUpperCase()));
        atributosDocumento.put("xVictima", (object.heredar ? 
                                            App.getAllPersonasHerencia(object.caso.id,"Víctima",object.id,false) :
                                            App.getAllValuesVictimas(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO")));
        atributosDocumento.put("xImputado", (object.heredar ?
                                             App.getAllPersonasHerencia(object.caso.id,"Imputado",object.id,true) :
                                             App.getAllValuesImputados(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO").toUpperCase()));
        
        atributosDocumento.put("xOficio", object.noOficioAtencion);
        atributosDocumento.put("xPoblacion", user.getMunicipio() == null ? "" : user.getMunicipio());
        atributosDocumento.put("xEstado", "Estado de México");
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xNombreAutoridadDirige", object.autoridadJuridico == null ? "" : object.autoridadJuridico.toUpperCase());
        atributosDocumento.put("xCargoAdscripcionAutoridad", object.cargoAdscripcionJuridico  == null ? "" : object.cargoAdscripcionJuridico.toUpperCase());
        atributosDocumento.put("xDenunciaQuerelle",object.denunciaQuerella == null ? "" : object.denunciaQuerella.nombre );
        atributosDocumento.put("xVictimaOfendidoQuerellante", object.victimaQuerellante == null ? "" : object.victimaQuerellante.nombre);
        atributosDocumento.put("xUbicacionAgenciaMP", object.ubicacionJuridico);
        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());
        atributosDocumento.put("dDocTitle","Solicitud de asesor juridico");
        return atributosDocumento;
    }
    
}
