package documentRepository;

import javax.inject.Inject;
import play.db.ebean.EbeanConfig;
import java.util.HashMap;
import core.util.App;

import java.util.Date;
import core.util.App;

import models.PersonaCaso;
import models.FacultadNoInvestigar;
import ldpaModels.User;
import play.Logger;
import com.typesafe.config.Config;

public class FacultadNoInvestigarDocumentRepository extends DocumentRepository{

    @Inject
    public FacultadNoInvestigarDocumentRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, FacultadNoInvestigar.class);
    }

    public FacultadNoInvestigar findById(Long id){
        return super.getEbeanServer().find(FacultadNoInvestigar.class).where().eq("id",Long.valueOf(id)).findUnique();
    }

    public HashMap<String,Object> F1_013(Long id, Config configuration){
        FacultadNoInvestigar  object = findById(id);
        User user = App.getUsuario(object.caso,configuration);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>();
        String [] fecha = App.getActualDate();

        Logger.debug("Object encontrado:"+object);

        atributosDocumento.put("xHechoDelictivo", object.caso.getDelitoPrincipal() == null ? "" : object.caso.getDelitoPrincipal().nombre);
        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xEstado","Estado de México");
        atributosDocumento.put("xPoblacion",user.getMunicipio() == null ? "" : user.getMunicipio());
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xHoraAtencion", object.caso.detenido ? object.horaAtencion : App.parseDateTimeToStringShort(new Date()));
        atributosDocumento.put("xDatosPrueba",object.datosPrueba);
        atributosDocumento.put("xNombreDenunciante", object.heredar ? object.nombreDenuncianteHeredar : object.nombreDenunciante);
        atributosDocumento.put("xOriginario",object.heredar ? object.originarioDenuncianteHeredar : object.originarioDenunciante);
        atributosDocumento.put("xEdad",object.heredar ? object.edadDenuncianteHeredar : object.edadDenunciante);
        atributosDocumento.put("xDomicilio",object.heredar ? object.domicilioDenuncianteHeredar : object.domicilioDenunciante);
        atributosDocumento.put("xNarracionHechos",object.heredarSintesisHechos ? object.sintesisHechos  : object.sintesisHechos);
        atributosDocumento.put("xMotivosAbstuvoInvestigar",object.motivosAbstuvoInvestigar);
        atributosDocumento.put("xMedioAlternativoSolucion",object.medioAlternativoSolucion);
        atributosDocumento.put("xObservaciones",object.observaciones);
        atributosDocumento.put("xVictima", (object.heredar ? 
                                            App.getAllPersonasHerencia(object.caso.id,"Víctima",object.id,false) :
                                            App.getAllValuesVictimas(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO")));
        atributosDocumento.put("xImputado", (object.heredar ?
                                             App.getAllPersonasHerencia(object.caso.id,"Imputado",object.id,false) :
                                             App.getAllValuesImputados(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO")));
        atributosDocumento.put("xIncisoArticulo",object.fraccion);
        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xSuperiorJerarquico",object.superiorJerarquico);
        atributosDocumento.put("xReceptorDeterminacion",object.destinatarioDeterminacion);
        atributosDocumento.put("dDocTitle","Determinación de abstenerse a investigar");
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase()); 
        
        return atributosDocumento;
    }
}