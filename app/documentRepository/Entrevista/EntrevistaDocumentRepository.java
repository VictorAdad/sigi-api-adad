package documentRepository;
import javax.inject.Inject;
import java.util.Date;
import java.math.BigDecimal;

import core.util.App;
import models.PersonaCaso;
import models.Entrevista;
import ldpaModels.User;
import play.db.ebean.EbeanConfig;
import java.util.HashMap;
import play.Logger;

import java.text.SimpleDateFormat;
import com.typesafe.config.Config;

public class EntrevistaDocumentRepository extends DocumentRepository{

    @Inject
    public EntrevistaDocumentRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Entrevista.class);
    }

    public Entrevista findById(Long id){
        return super.getEbeanServer().find(Entrevista.class).where().eq("id",Long.valueOf(id)).findUnique();
    }

    public HashMap<String,Object> F1_008(Long id, Config configuration) throws Exception{
        Entrevista  object = findById(id);
        User user = App.getUsuario(object.caso,configuration);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>();
        String [] fecha =App.getActualDate();

        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xHoraAtencion", object.caso.detenido ? object.horaAtencion : App.parseDateTimeToStringShort(new Date()));
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xOriginario", object.heredar ? object.originarioDeHeredar : object.originarioDe == null ? "" : object.originarioDe);
        atributosDocumento.put("xEdad", object.heredar ? object.edadHeredar : object.edad == null ? "" : String.valueOf(object.edad));
        atributosDocumento.put("xSexo",object.heredar ? object.sexoHeredar : object.sexo == null ? "" : object.sexo.nombre);
        atributosDocumento.put("xCalidadUsuarioPersona",object.heredar ? object.calidadIntervinienteHeredar : object.tipoInterviniente == null ? "" :  object.tipoInterviniente.tipo);
        atributosDocumento.put("xFechaNacimiento", object.heredar ? object.fechaNacimientoHeredar : object.fechaNacimiento==null ? "" : App.parseDate(object.fechaNacimiento));
        atributosDocumento.put("xRFC",object.heredar ? object.rfcHeredar : object.rfc);
        atributosDocumento.put("xCURP",object.heredar ? object.curpHeredar : object.curp);
        atributosDocumento.put("xEstadoCivil", object.heredar ? object.estadoCivilHeredar : object.estadoCivil);
        atributosDocumento.put("xOcupacion",object.heredar ? object.ocupacionHeredar : object.ocupacion);
        atributosDocumento.put("xNacionalidad",object.heredar ? object.nacionalidadHeredar : object.nacionalidad);
        atributosDocumento.put("xNumeroTelefonico", object.heredar ?  object.noTelefonoParticularHeredar : object.noTelefonoParticular);
        atributosDocumento.put("xNumeroMovil", object.heredar ? object.noTelefonoCelularHeredar : object.noTelefonoCelular);
        atributosDocumento.put("xNarracionHechos", object.narracionHechos);        
        atributosDocumento.put("xNombreAutoridadEntrevista", object.autoridadRealizaEntrevista);
        atributosDocumento.put("xLugarEntrevista", object.lugarRealizaEntrevista);
        atributosDocumento.put("xNombreEntrevistado", object.heredar ? object.nombreEntrevistadoHeredar : object.nombreEntrevistado);
        atributosDocumento.put("xEstadoMigratorio", object.estadoMigratorio);
        atributosDocumento.put("xNumeroIdentificacion", object.heredar ? object.noIdentificacionHeredar : object.noIdentificacion);
        atributosDocumento.put("xSabeLeerEscribir", object.heredar ? object.sabeLeerEscribirHeredar : object.sabeLeerEscribir == true ? "Sí" : "No");
        atributosDocumento.put("xLugarOcupacion", object.heredar ? object.lugarOcupacionHeredar : object.lugarOcupacion);
        atributosDocumento.put("xSalarioSemanal", object.salarioSemanal == null ? "" : String.valueOf(object.salarioSemanal));
        atributosDocumento.put("xRelacionEntrevistadoPartes", object.relacionEntrevistado);
        atributosDocumento.put("xDomicilio", makeDireccion(object));
        atributosDocumento.put("xTipoIdentificacion",object.heredar ? object.tipoIdentificacionHeredar : object.tipoIdentificacion);
        atributosDocumento.put("xEmisorIdentificacion",object.heredar ? object.emisorIdentificacionHeredar : object.emisorIdentificacion);
        atributosDocumento.put("xEscolaridad",object.heredar ? object.gradoEscolaridadHeredar : object.gradoEscolaridad);
        atributosDocumento.put("xSalario",object.heredar ? object.salarioHeredar : object.salarioSemanal == null ? "" : String.valueOf(object.salarioSemanal.multiply(new BigDecimal("4"))));  
        atributosDocumento.put("xCorreoElectronico", object.heredar ? object.correoElectronicoHeredar : object.correoElectronico);
        atributosDocumento.put("xRepresentanteLegal", object.tieneRepresentanteLegal == true ? "Sí" : "No");
        atributosDocumento.put("xNombreRepresentanteLegal", object.nombreRepresentanteLegal);
        atributosDocumento.put("xUsoMedioTecnologico", object.medioTecnologicoRegistro == true ? "Sí" : "No");
        atributosDocumento.put("xMedioTecnologico", object.medioTecnologicoUtilizado);
        atributosDocumento.put("xUsoMedioTecnico", object.medioTecnicoRegistro == true ? "Sí" : "No");
        atributosDocumento.put("xMedioTecnico", object.medioTecnicoUtilizado);
        atributosDocumento.put("xPoblacion", user.getMunicipio() == null ? "" : user.getMunicipio());
        atributosDocumento.put("xEstado", object.estado);
        atributosDocumento.put("xNombreEntrevistadoFirma", object.heredar ? object.nombreEntrevistadoHeredar == null ? "" : object.nombreEntrevistadoHeredar.toUpperCase() : object.nombreEntrevistado == null ? "" : object.nombreEntrevistado.toUpperCase());
        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase());
        atributosDocumento.put("dDocTitle","Entrevista");

        return atributosDocumento;
    }
    
    public String makeDireccion(Entrevista object){
        String text = "";
        text += object.heredar ? object.calleHeredar != null ? object.calleHeredar+" " : "" : object.calle != null ? object.calle+" " : ""; 
        text += object.heredar ? object.noExteriorHeredar != null ? object.noExteriorHeredar+" " : "" : object.noExterior != null ? object.noExterior+" " : "";
        text += object.heredar ? object.noInteriorHeredar != null ? object.noInteriorHeredar+" " : "" : object.noInterior != null ? object.noInterior+" " : ""; 
        text += object.heredar ? object.coloniaHeredar != null ? object.coloniaHeredar+" " : "" : object.colonia != null ? object.colonia+" " : ""; 
        text += object.heredar ? object.cpHeredar != null ? object.cpHeredar+" " : "" : object.cp != null ? object.cp+" " : ""; 
        text += object.heredar ? object.estadoHeredar != null ? object.estadoHeredar+" " : "" : object.estado != null ? object.estado+" " : "";
        text += object.heredar ? object.municipioHeredar != null ? object.municipioHeredar : "" : object.municipio != null ? object.municipio : "";
        return text;
    }
}
