package documentRepository;

import javax.inject.Inject;
import java.util.Date;
import core.util.App;
import models.PersonaCaso;
import javax.inject.Inject;
import models.Predenuncia;
import play.db.ebean.EbeanConfig;
import java.util.HashMap;
import java.util.Date;
import models.PersonaCaso;
import play.Logger;
import ldpaModels.User;
import com.typesafe.config.Config;

public class PredenunciaDocumentRepository extends DocumentRepository{

    @Inject
    public PredenunciaDocumentRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Predenuncia.class);
    }

    public Predenuncia findById(Long id){
        return super.getEbeanServer().find(Predenuncia.class).where().eq("id",Long.valueOf(id)).findUnique();
    }

    public String getValuesAsString(String stringOfendidos, String stringVictimas){
        String values="";
        if(stringVictimas.equals("")){
            values= stringOfendidos;
        }else if(stringOfendidos.equals("")){
            values= stringVictimas;
        }else{
            values= stringOfendidos+", "+stringVictimas;
        }
        return values;
    }

    public HashMap<String,Object> F1_003(Long id, Config configuration){
        Predenuncia  object = findById(id);
        User user = App.getUsuario(object.caso,configuration);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>() ;

        Logger.debug("Entrando al método F1_003 con ID:"+ id);
        Logger.debug("Object encontrado:"+object);

        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xFolioDocumento",object.noFolioConstancia);
        atributosDocumento.put("xVictima", object.heredar ? 
                                            App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(), "PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO") : 
                                            App.getAllValuesVictimas(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO"));
        atributosDocumento.put("xHoraAtencion", object.caso.detenido ? object.horaAtencion : App.parseDateTimeToStringShort(new Date()));
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xHablaEspaniol", object.hablaEspaniol == true ? "Sí" : "No");
        atributosDocumento.put("xIdiomaLengua",object.lenguaIdioma == null ? "" : object.lenguaIdioma);
        atributosDocumento.put("xInterprete",object.nombreInterprete);
        atributosDocumento.put("xComprendioDerechos", object.compredioDerechos == true ? "Sí" : "No");
        atributosDocumento.put("xCopiaDerechos", object.proporcionoCopia == true ? "Sí" : "No");
        atributosDocumento.put("xSeIdentificaCon",  object.heredar ? 
                                                    App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"IDIOMA_IDENTIFICACION.IDENTIFICACION") : 
                                                    App.getAllValuesVictimas(object.caso.id,"IDIOMA_IDENTIFICACION.IDENTIFICACION"));
        atributosDocumento.put("xFolioVictima",  object.heredar ? 
                                                    App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"PERSONA.FOLIO_IDENTIFICACION") : 
                                                    App.getAllValuesVictimas(object.caso.id,"PERSONA.FOLIO_IDENTIFICACION"));
        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());

        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase()); 
        
        atributosDocumento.put("xVictimaFirma", object.heredar ? 
                                                    App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO").toUpperCase() : 
                                                    App.getAllValuesVictimas(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO").toUpperCase());
        atributosDocumento.put("xSeIdentificaConFirma", object.heredar ? 
                                                        App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"IDIOMA_IDENTIFICACION.IDENTIFICACION") : 
                                                        App.getAllValuesVictimas(object.caso.id,"IDIOMA_IDENTIFICACION.IDENTIFICACION").toUpperCase());
        atributosDocumento.put("xFolioVictimaFirma", object.heredar ? 
                                                        App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"PERSONA.FOLIO_IDENTIFICACION") : 
                                                        App.getAllValuesVictimas(object.caso.id,"PERSONA.FOLIO_IDENTIFICACION").toUpperCase());

        atributosDocumento.put("dDocTitle","Lectura de derechos de la víctima");
        return atributosDocumento;
    }

    public HashMap<String,Object> F1_004(Long id, Config configuration){
        Predenuncia  object = findById(id);
        User user = App.getUsuario(object.caso,configuration);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>() ;

        //Datos del formato
        Logger.debug("NIC:"+ object.caso.nic);
        Logger.debug("NUC:"+ object.caso.nuc);
        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xHoraAtencion", object.caso.detenido ? object.horaAtencion : App.parseDateTimeToStringShort(new Date()));
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));

        //Datos de quien hace la predenuncia
        atributosDocumento.put("xCalidadUsuarioPersona", object.heredar ? object.calidadPersonaHeredar : object.calidadPersona);
        atributosDocumento.put("xTipoPersona", object.heredar ? object.tipoPersonaHeredar : object.tipoPersona == null ? "" : object.tipoPersona.nombre);
        atributosDocumento.put("xNombreUsuario", object.heredar ? 
                                                    App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO") : 
                                                    App.getAllValuesVictimas(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO"));
        atributosDocumento.put("xOriginario", object.heredar ? App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"PAIS.NOMBRE") :  App.getAllValuesVictimas(object.caso.id,"PAIS.NOMBRE"));
        atributosDocumento.put("xSexo", object.heredar ? App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"SEXO.NOMBRE") : App.getAllValuesVictimas(object.caso.id,"SEXO.NOMBRE"));
        atributosDocumento.put("xFechaNacimiento",object.heredar ? App.getFechasNacimientoByHerencia(object.getPersonasHerencia()) : getValuesAsString(PersonaCaso.getFechasNacimientoVictimas(object.caso.id, "Ofendido"),PersonaCaso.getFechasNacimientoVictimas(object.caso.id, "Víctima")));
        atributosDocumento.put("xCURP", object.heredar ? App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"PERSONA.CURP") : App.getAllValuesVictimas(object.caso.id,"CURP"));
        atributosDocumento.put("xOcupacion", object.heredar ? App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"OCUPACION.NOMBRE") : App.getAllValuesVictimas(object.caso.id,"OCUPACION.NOMBRE"));
        atributosDocumento.put("xReligion", object.heredar ? App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"NACIONALIDAD_RELIGION.RELIGION") : App.getAllValuesVictimas(object.caso.id,"NACIONALIDAD_RELIGION.RELIGION"));
        atributosDocumento.put("xNumeroTelefonico",object.heredar ? App.getTelefonosByHerencia(object.getPersonasHerencia()) : getValuesAsString(PersonaCaso.getTelefonosVictimas(object.caso.id, "Ofendido"),PersonaCaso.getTelefonosVictimas(object.caso.id, "Víctima")));
        atributosDocumento.put("xSeIdentificaCon", object.heredar ? App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"IDIOMA_IDENTIFICACION.IDENTIFICACION") : App.getAllValuesVictimas(object.caso.id,"IDIOMA_IDENTIFICACION.IDENTIFICACION"));
        atributosDocumento.put("xEdad",object.heredar ? App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"PERSONA.EDAD") : App.getAllValuesVictimas(object.caso.id,"EDAD"));
        atributosDocumento.put("xDomicilio",object.heredar ? App.getDomiciliosByHerencia(object.getPersonasHerencia()) : getValuesAsString(PersonaCaso.getDomiciliosVictimas(object.caso.id, "Ofendido"),PersonaCaso.getDomiciliosVictimas(object.caso.id, "Víctima")));
        atributosDocumento.put("xRFC", object.heredar ? App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"PERSONA.RFC") : App.getAllValuesVictimas(object.caso.id,"RFC"));
        atributosDocumento.put("xEstadoCivil", object.heredar ? App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"ESTADO_CIVIL.NOMBRE") : App.getAllValuesVictimas(object.caso.id,"ESTADO_CIVIL.NOMBRE"));
        atributosDocumento.put("xEscolaridad", object.heredar ? App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"ESCOLARIDAD.NOMBRE") : App.getAllValuesVictimas(object.caso.id,"ESCOLARIDAD.NOMBRE"));
        atributosDocumento.put("xNacionalidad", object.heredar ? App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"NACIONALIDAD_RELIGION.NACIONALIDAD") : App.getAllValuesVictimas(object.caso.id,"NACIONALIDAD_RELIGION.NACIONALIDAD"));
        atributosDocumento.put("xNumeroMovil",object.heredar ? App.getMovilesByHerencia(object.getPersonasHerencia()) : getValuesAsString(PersonaCaso.getMovilVictimas(object.caso.id, "Ofendido"),PersonaCaso.getMovilVictimas(object.caso.id, "Víctima")));
        atributosDocumento.put("xFolioIdentificacion", object.heredar ? App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"PERSONA.FOLIO_IDENTIFICACION") : App.getAllValuesVictimas(object.caso.id,"PERSONA.FOLIO_IDENTIFICACION"));

        //Datos de la predenuncia
        atributosDocumento.put("xHechosNarrados",object.hechosNarrados);
        atributosDocumento.put("xConclusionHechos",object.conclusion);
        atributosDocumento.put("xLugarHechos", object.heredar ? object.lugarHechosHeredar : object.lugarHechos);
        atributosDocumento.put("xCanalizacion",object.canalizacion == true ? "Sí" : "No");
        atributosDocumento.put("xInstitucionCanalizacion",object.institucion);
        atributosDocumento.put("xMotivoCanalizacion",object.motivoCanalizacion);
        atributosDocumento.put("xFechaCanalizacion",object.fechaCanalizacion == null ? "" : App.parseDate(object.fechaCanalizacion));
        atributosDocumento.put("xHoraCanalizacion",object.fechaCanalizacion == null ? "" : App.parseDateToString(object.fechaCanalizacion, "HH:mm"));
        atributosDocumento.put("xNombreCausoHecho",object.nombreCausante);
        atributosDocumento.put("xDomicilioHechos",object.domicilioCausante);
        atributosDocumento.put("xObservaciones",object.observaciones);
        atributosDocumento.put("xPersonaRegistro",user.getDisplayName() == null ? "" : user.getDisplayName());

        atributosDocumento.put("xCargoEmisor", user.getCargo() == null ? "" : user.getCargo());
        atributosDocumento.put("xNombreEmisor",user.getDisplayName() == null ? "" : user.getDisplayName());
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());

        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xNombreEmisorFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase()); 

        atributosDocumento.put("dDocTitle","Registro presecial");

        return atributosDocumento;
    }

    public HashMap<String,Object> F1_005(Long id, Config configuration){
        Predenuncia  object = findById(id);
        User user = App.getUsuario(object.caso,configuration);
        HashMap<String,Object> atributosDocumento = new HashMap<String,Object>();

        Logger.debug("Entrando al método F1_005 con ID:"+ id);
        Logger.debug("Object encontrado:"+object);

        Logger.debug("NUC:"+object.caso.nuc);

        atributosDocumento.put("xNIC", object.caso.nic);
        atributosDocumento.put("xNUC", object.caso.nuc);
        atributosDocumento.put("xImputado",  object.heredar ? App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO") : App.getAllValuesVictimas(object.caso.id,"PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO"));
        atributosDocumento.put("xAdscripcionEmisor",user.getAdscripcion() == null ? "" : user.getAdscripcion());
        atributosDocumento.put("xHoraAtencion", object.caso.detenido ? object.horaAtencion : App.parseDateTimeToStringShort(new Date()));
        atributosDocumento.put("xFechaAtencion", object.caso.detenido ? App.parseDateLocaleToString(object.fechaAtencion) : App.parseDateLocaleToString(new Date()));
        atributosDocumento.put("xEdad", object.heredar ? App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"PERSONA.EDAD") : App.getAllValuesVictimas(object.caso.id,"EDAD"));
        atributosDocumento.put("xSexo", object.heredar ? App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"SEXO.NOMBRE") : App.getAllValuesVictimas(object.caso.id,"SEXO.NOMBRE"));
        play.Logger.debug("Domicilio:"+getValuesAsString(PersonaCaso.getDomiciliosVictimas(object.caso.id, "Ofendido"),PersonaCaso.getDomiciliosVictimas(object.caso.id, "Víctima")));
        atributosDocumento.put("xDomicilio",object.heredar ? App.getDomiciliosByHerencia(object.getPersonasHerencia()) : getValuesAsString(PersonaCaso.getDomiciliosVictimas(object.caso.id, "Ofendido"),PersonaCaso.getDomiciliosVictimas(object.caso.id, "Víctima")));
        atributosDocumento.put("xCalidadUsuarioPersona", object.heredar ? object.calidadPersonaHeredar : object.calidadPersona);
        atributosDocumento.put("xEstadoCivil", object.heredar ? App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"ESTADO_CIVIL.NOMBRE") : App.getAllValuesVictimas(object.caso.id,"ESTADO_CIVIL.NOMBRE"));
        atributosDocumento.put("xOcupacion", object.heredar ? App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"OCUPACION.NOMBRE") : App.getAllValuesVictimas(object.caso.id,"OCUPACION.NOMBRE"));
        atributosDocumento.put("xEscolaridad", object.heredar ? App.getValuesByHerencia(object.caso.id,object.getPersonasHerencia(),"ESCOLARIDAD.NOMBRE") : App.getAllValuesVictimas(object.caso.id,"ESCOLARIDAD.NOMBRE"));
        atributosDocumento.put("xNumeroTelefonico",object.heredar ? App.getTelefonosByHerencia(object.getPersonasHerencia()) : getValuesAsString(PersonaCaso.getTelefonosVictimas(object.caso.id, "Ofendido"),PersonaCaso.getTelefonosVictimas(object.caso.id, "Víctima")));
        atributosDocumento.put("xObservaciones", object.observaciones);
        atributosDocumento.put("xOrientadorJuridico", object.quienRegistro);
        atributosDocumento.put("xTelefonoLlamando",object.noTelefonico);
        atributosDocumento.put("xTipoLineaTelefonica",object.tipoLinea == null ? "" : object.tipoLinea.nombre );
        atributosDocumento.put("xLugarLlamada",object.lugarLlamada);
        atributosDocumento.put("xNarracionHechos",object.hechosNarrados);
        atributosDocumento.put("xAsesoria", object.comunicado);
        atributosDocumento.put("xHoraConclusionLlamada",object.horaConclusionLlamada);
        atributosDocumento.put("xDuracionLlamada", object.duracionLlamada);

        atributosDocumento.put("xCargoEmisorFirma", user.getCargo() == null ? "" : user.getCargo().toUpperCase());
        atributosDocumento.put("xOrientadorJuridicoFirma", user.getDisplayName() == null ? "" : user.getDisplayName().toUpperCase());
        atributosDocumento.put("xAdscripcionEmisorFirma", user.getAdscripcion() == null ? "" : user.getAdscripcion().toUpperCase()); 

        atributosDocumento.put("dDocTitle","Registro de recepción de llamada");

        return atributosDocumento;
    }
    
}

