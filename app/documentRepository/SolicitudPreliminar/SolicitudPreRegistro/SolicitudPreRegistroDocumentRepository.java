package documentRepository;
import javax.inject.Inject;
import models.SolicitudPreRegistro;
import play.db.ebean.EbeanConfig;
import java.util.HashMap;
import play.Logger;
import core.util.App;
import models.PersonaCaso;
import java.util.Date;
import ldpaModels.User;
import com.typesafe.config.Config;

public class SolicitudPreRegistroDocumentRepository extends DocumentRepository{

    @Inject
    public SolicitudPreRegistroDocumentRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, SolicitudPreRegistro.class);
    }

    public SolicitudPreRegistro findById(Long id){
        return super.getEbeanServer().find(SolicitudPreRegistro.class).where().eq("id",Long.valueOf(id)).findUnique();
    }

    public HashMap<String,Object> F1_017(Long id, Config configuration) throws Exception{
        SolicitudPreRegistro  object = findById(id);
        String [] fecha = App.getActualDate();
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>();
        User user = App.getUsuario(object.caso,configuration);

        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xHoraAtencion", object.caso.detenido ? object.horaAtencion : App.parseDateTimeToStringShort(new Date()));
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xContenidoConstancia", object.contenidoConstancia);
        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());
        atributosDocumento.put("dDocTitle","Registro General");
        return atributosDocumento;
    }

    public HashMap<String,Object> F2_063(Long id, Config configuration){
        String [] fecha =App.getActualDate();
        SolicitudPreRegistro  object = findById(id);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>() ;
        User user = App.getUsuario(object.caso,configuration);

        Logger.debug("Entrando al método F2_063 con ID:"+ id);
        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xHoraAtencion", object.caso.detenido ? object.horaAtencion : App.parseDateTimeToStringShort(new Date()));
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xContenidoConstancia", object.contenidoConstancia);
        atributosDocumento.put("xMayusImputado", (object.heredar ?
                                             App.getAllPersonasHerencia(object.caso.id,"Imputado",object.id,true) :
                                             App.getAllValuesImputados(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO").toUpperCase()));
        
        atributosDocumento.put("xImputado", (object.heredar ?
                                             App.getAllPersonasHerencia(object.caso.id,"Imputado",object.id,false) :
                                             App.getAllValuesImputados(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO")));
        
        atributosDocumento.put("xNumeroTelefonico",object.noTelefonico);
        atributosDocumento.put("xAtencionLlamada",object.atencionLlamada);
        
        atributosDocumento.put("dDocTitle","Registro para permitir al imputado comunicarse con su defensor o familiar");

        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());

        return atributosDocumento;
    }

    public HashMap<String,Object> F1_006(Long id, Config configuration){
        String [] fecha =App.getActualDate();
        SolicitudPreRegistro  object = findById(id);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>() ;
        User user = App.getUsuario(object.caso,configuration);

        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xHoraAtencion", object.caso.detenido ? object.horaAtencion : App.parseDateTimeToStringShort(new Date()));
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xContenidoConstancia", object.contenidoConstancia);
        atributosDocumento.put("xFundamentoLegal",object.fundamentoLegal);
        atributosDocumento.put("xContenidoAcuerdo",object.contenidoAcuerdo);
        atributosDocumento.put("xFinalidad",object.finalidad);
        atributosDocumento.put("xPlazoCumplimentado",object.plazo);
        atributosDocumento.put("xApercibimiento",object.apercibimiento);

        atributosDocumento.put("dDocTitle","Acuerdo general");

        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());

        return atributosDocumento;
    }

    public HashMap<String,Object> F1_019(Long id, Config configuration){
        String [] fecha =App.getActualDate();
        SolicitudPreRegistro  object = findById(id);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>() ;
        User user = App.getUsuario(object.caso,configuration);

        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xHoraAtencion", object.caso.detenido ? object.horaAtencion : App.parseDateTimeToStringShort(new Date()));
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xContenidoConstancia", object.contenidoConstancia);
        atributosDocumento.put("xFundamentoLegal",object.fundamentoLegal);
        atributosDocumento.put("xContenidoAcuerdo",object.contenidoAcuerdo);
        atributosDocumento.put("xFinalidad",object.finalidad);
        atributosDocumento.put("xPlazoCumplimentado",object.plazo);
        atributosDocumento.put("xApercibimiento",object.apercibimiento);

        atributosDocumento.put("dDocTitle","Acuerdo General sin Apercibimiento");

        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());

        return atributosDocumento;
    }

}
