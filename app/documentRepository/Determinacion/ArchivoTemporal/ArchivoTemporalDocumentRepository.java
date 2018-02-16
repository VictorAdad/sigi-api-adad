package documentRepository;

import javax.inject.Inject;
import play.db.ebean.EbeanConfig;
import java.util.HashMap;
import core.util.App;

import java.util.Date;
import core.util.App;

import models.PersonaCaso;
import models.ArchivoTemporal;
import ldpaModels.User;
import play.Logger;
import com.typesafe.config.Config;

public class ArchivoTemporalDocumentRepository extends DocumentRepository{

    @Inject
    public ArchivoTemporalDocumentRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, ArchivoTemporal.class);
    }

    public ArchivoTemporal findById(Long id){
        return super.getEbeanServer().find(ArchivoTemporal.class).where().eq("id",Long.valueOf(id)).findUnique();
    }

    public HashMap<String,Object> F1_012(Long id, Config configuration){
        ArchivoTemporal  object = findById(id);
        User user = App.getUsuario(object.caso,configuration);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>();
        String [] fecha = App.getActualDate();

        Logger.debug("Object encontrado:"+object);

        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xHechoDelictivo", object.caso.getDelitoPrincipal() == null ? "" : object.caso.getDelitoPrincipal().nombre);
        atributosDocumento.put("xVictima", (object.heredar ? 
                                            App.getAllPersonasHerencia(object.caso.id,"Víctima",object.id,false) :
                                            App.getAllValuesVictimas(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO")));
        atributosDocumento.put("xImputado", (object.heredar ?
                                             App.getAllPersonasHerencia(object.caso.id,"Imputado",object.id,false) :
                                             App.getAllValuesImputados(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO")));
        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xHoraAtencion", object.caso.detenido ? object.horaAtencion : App.parseDateTimeToStringShort(new Date()));
        atributosDocumento.put("dDocTitle","Determinacion de archivo temporal");
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());

        return atributosDocumento;
    }
}