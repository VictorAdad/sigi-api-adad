package documentRepository;

import javax.inject.Inject;
import play.db.ebean.EbeanConfig;
import java.util.HashMap;
import play.Logger;
import core.util.App;
import models.Lugar;
import models.Acuerdo;
import models.PersonaCaso;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.net.ssl.ExtendedSSLSession;
import ldpaModels.User;
import com.typesafe.config.Config;

public class AcuerdoDocumentRepository extends DocumentRepository{

    @Inject
    public AcuerdoDocumentRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Acuerdo.class);
    }

    public HashMap<String,Object> F2_117(Long id, Config configuration) throws Exception{
        Acuerdo  object = findById(id);
        User user = App.getUsuario(object.caso,configuration);
        Logger.debug("Entrando al método F2_117 con ID:"+ id);
        Logger.debug("Object encontrado:"+object);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>() ;
        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xVictima", (object.heredar ? 
                                            App.getAllPersonasHerencia(object.caso.id,"Víctima",object.id,false) :
                                            App.getAllValuesVictimas(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO")));
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xHoraAtencion", object.caso.detenido ? object.horaAtencion : App.parseDateTimeToStringShort(new Date()));
        atributosDocumento.put("dDocTitle","Registro de derivacion a la justicia restaurativa");
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());
        
        return atributosDocumento;
    }

    public HashMap<String,Object> F1_007(Long id, Config configuration) throws Exception{
        Acuerdo  object = findById(id);
        User user = App.getUsuario(object.caso, configuration);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>();

        Logger.debug("Entrando al método F1_007 con ID:"+ id);
        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xHechoDelictivo", object.caso.getAllDelitos() == null ? "" : object.caso.getAllDelitos());
        atributosDocumento.put("xVictima",App.getAllValuesVictimas(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO"));
        atributosDocumento.put("xImputado",App.getAllValuesImputados(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO"));
        atributosDocumento.put("xLugarHechos", Lugar.getLugares(object.caso.id,"LUGAR DE LOS HECHOS"));
        atributosDocumento.put("xLugarHallazgo", Lugar.getLugares(object.caso.id,"LUGAR DE HALLAZGO"));
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.caso.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());
        atributosDocumento.put("dDocTitle","Caratula Acuerdo General");
        return atributosDocumento;
    }

    public Acuerdo findById(Long id){
        return super.getEbeanServer().find(Acuerdo.class).where().eq("id",Long.valueOf(id)).findUnique();
    }

    public HashMap<String,Object> F2_138(Long id, Config configuration){
        Acuerdo  object = findById(id);
        User user = App.getUsuario(object.caso, configuration);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>() ;
        String [] fecha = App.getActualDate();

        Logger.debug("Entrando al método F2_138 con ID:"+ id);
        Logger.debug("Object encontrado:"+object);
        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xHechoDelictivo", object.caso.getDelitoPrincipal() == null ? "" : object.caso.getDelitoPrincipal().nombre);
        atributosDocumento.put("xVictima", (object.heredar ? 
                                            App.getAllPersonasHerencia(object.caso.id,"Víctima",object.id,true) :
                                            App.getAllValuesVictimas(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO").toUpperCase()));
        atributosDocumento.put("xImputado", (object.heredar ?
                                             App.getAllPersonasHerencia(object.caso.id,"Imputado",object.id,true) :
                                             App.getAllValuesImputados(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO").toUpperCase()));
        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xHoraAtencion", object.caso.detenido ? object.horaAtencion : App.parseDateTimeToStringShort(new Date()));
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase()); 
        atributosDocumento.put("dDocTitle","Acuerdo de recepción y/o radicación"); 
        
        return atributosDocumento;
    }

    public HashMap<String,Object> F1_015_016(Long id, Config configuration) throws Exception{
        Acuerdo  object = findById(id);
        User user = App.getUsuario(object.caso, configuration);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>();
        String [] fecha = App.getActualDate();

        Logger.debug("Object encontrado:"+object);
        atributosDocumento.put("xNIC",object.caso.nic);
        atributosDocumento.put("xNUC",object.caso.nuc);
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xHoraAtencion", object.caso.detenido ? object.horaAtencion : App.parseDateTimeToStringShort(new Date()));
        atributosDocumento.put("xEstado","Estado de México");
        atributosDocumento.put("xPoblacion", user.getMunicipio() == null ? "" : user.getMunicipio());
        atributosDocumento.put("xRecibioLlamada",object.presentoLlamada == null ? "" : object.presentoLlamada.nombre);
        atributosDocumento.put("xManifesto",object.manifesto);
        atributosDocumento.put("xNarracionHechos",object.heredarSintesisHechos ? object.caso.predenuncia.get(0).hechosNarrados  : object.sintesisHechos);
        atributosDocumento.put("xVictima", (object.heredar ? 
                                            App.getAllPersonasHerencia(object.caso.id,"Víctima",object.id,false) :
                                            App.getAllValuesVictimas(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO")));
        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());

        atributosDocumento.put("dDocTitle","Acuerdo de inicio");

        return atributosDocumento;
    }

}
