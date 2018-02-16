package documentRepository;
import javax.inject.Inject;
import models.SolicitudPreInspeccion;
import play.db.ebean.EbeanConfig;
import java.util.HashMap;
import play.Logger;
import core.util.App;
import models.PersonaCaso;
import java.util.Date;
import ldpaModels.User;
import com.typesafe.config.Config;

public class SolicitudPreInspeccionDocumentRepository extends DocumentRepository{

    @Inject
    public SolicitudPreInspeccionDocumentRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, SolicitudPreInspeccion.class);
    }

    public HashMap<String,Object> F1_018(Long id, Config configuration) throws Exception{
        SolicitudPreInspeccion  object = findById(id);
        String [] fecha = App.getActualDate();
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>();
        User user = App.getUsuario(object.caso,configuration);
        Logger.debug("Entrando al método F1_017 con ID:"+ id);
        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xHoraAtencion", object.caso.detenido ? object.horaAtencion : App.parseDateTimeToStringShort(new Date()));
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xDescripcionInspeccion", object.descripcion);
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());

        atributosDocumento.put("dDocTitle","Inspeccion General");
        
        return atributosDocumento;
    }

    public SolicitudPreInspeccion findById(Long id){
        return super.getEbeanServer().find(SolicitudPreInspeccion.class).where().eq("id",Long.valueOf(id)).findUnique();
    }

}