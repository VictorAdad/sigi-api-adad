package documentRepository;

import javax.inject.Inject;
import play.db.ebean.EbeanConfig;
import java.util.HashMap;
import core.util.App;

import java.util.Date;
import core.util.App;

import models.PersonaCaso;
import models.NoEjercicioAccionPenal;
import ldpaModels.User;
import com.typesafe.config.Config;

public class NoEjercicioAccionPenalDocumentRepository extends DocumentRepository{

    @Inject
    public NoEjercicioAccionPenalDocumentRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, NoEjercicioAccionPenal.class);
    }

    public NoEjercicioAccionPenal findById(Long id){
        return super.getEbeanServer().find(NoEjercicioAccionPenal.class).where().eq("id",Long.valueOf(id)).findUnique();
    }

    public HashMap<String,Object> F1_014(Long id, Config configuration) throws Exception{
        NoEjercicioAccionPenal  object = findById(id);
        User user = App.getUsuario(object.caso,configuration);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>();
        String [] fecha = App.getActualDate();

        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xHoraAtencion", object.caso.detenido ? object.horaAtencion : App.parseDateTimeToStringShort(new Date()));
        
        atributosDocumento.put("xHechoDelictivo", object.caso.getDelitoPrincipal() == null ? "" : object.caso.getDelitoPrincipal().nombre);
        atributosDocumento.put("xVictima", (object.heredar ? 
                                            App.getAllPersonasHerencia(object.caso.id,"Víctima",object.id,false) :
                                            App.getAllValuesVictimas(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO")));
        atributosDocumento.put("xImputado", (object.heredar ?
                                             App.getAllPersonasHerencia(object.caso.id,"Imputado",object.id,false) :
                                             App.getAllValuesImputados(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO")));
        atributosDocumento.put("xNarracionHechos",object.narracionHechos);
        atributosDocumento.put("xDatosPrueba",object.datosPrueba);
        atributosDocumento.put("xFechaHechoDelictivo",App.parseDateToString(object.fechaHechoDelictivo,"dd/MM/yyyy"));
        atributosDocumento.put("xHipotesisSobreseimiento", object.hipotesisSobreseimiento);
        atributosDocumento.put("xFraccionArticulo",object.fraccionArticulo);
        atributosDocumento.put("xReferirFundarMotivar327", object.hipotesisCnpp);
        atributosDocumento.put("xArticuloCPEMSanciona",object.articuloCpem);
        atributosDocumento.put("xNombreFiscal", object.nombreProcurador);
        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xNombreFiscalFirma", object.nombreProcurador);
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());
        atributosDocumento.put("dDocTitle","Determinación de no ejercicio de la acción penal");

        return atributosDocumento;
    }

    public HashMap<String,Object> F1_022(Long id, Config configuration) throws Exception{
        NoEjercicioAccionPenal  object = findById(id);
        User user = App.getUsuario(object.caso,configuration);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>();
        String [] fecha = App.getActualDate();

        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xFechaAtencion",object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xHoraAtencion",object.caso.detenido ? object.horaAtencion : App.parseDateTimeToStringShort(new Date()));
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());

        atributosDocumento.put("xAutoridadCompetente",object.autoridadCompetente);
        atributosDocumento.put("xCargoAutoridadCompetente",object.cargoAutoridadCompetente);
        atributosDocumento.put("xCausaIncompetencia",object.causaIncompetencia);
        atributosDocumento.put("xAmbitoHechos",object.ambitoHechos);
        
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());
        atributosDocumento.put("dDocTitle","Determinación de incompetencia");

        return atributosDocumento;
    }
}
