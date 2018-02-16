package models;

import io.ebean.Finder;
import io.ebean.SqlRow;
import io.ebean.SqlQuery;
import io.ebean.Ebean;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.net.ssl.ExtendedSSLSession;
import java.util.List;
import core.util.App;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.Logger;

 /**
  * Modelo de la entidad de PersonaCaso para la fiscalia
  * general de justicia del estado de mexico
  *
  * @author  Gibran Córdoba
  * @see     ManyToOne
  * @see     Constraints
  * @see     Entity
  * @see     Column
  * @see     Models
  * @since   1.0
  * @version 1.0
  */
@Entity
@Table(name="PERSONA_NIC")
public class PersonaCaso extends BaseModel {

    @Column(columnDefinition="NUMBER(1,0) default 0")
    public boolean detenido;

    // propiedades
    @Constraints.Required(groups = SaveStep.class)
    @Constraints.Max(10)
    @ManyToOne
    @JoinColumn(name="nic_id")
    public Caso caso;

    @Constraints.Required(groups = SaveStep.class)
    @Constraints.Max(10)
    @ManyToOne
    public Persona persona;

    @Constraints.Required(groups = SaveStep.class)
    @ManyToOne
    @Column(name="TIPO_INTERVINIENTE_ID")
    public TipoInterviniente tipoInterviniente;

    public Date fechaDetencion;

    public String horaDetencion;

    public Date fechaDeclaracion;

    @Constraints.Required(groups = SaveStep.class)
    @ManyToOne
    public TipoDetenido tipoDetenido;

    // Finder para uso de la super class y sus accesos mas sencillos
    public static final Finder<Long, PersonaCaso> find = new Finder<>(PersonaCaso.class);

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.detenido);
        hash = 61 * hash + Objects.hashCode(this.caso);
        hash = 61 * hash + Objects.hashCode(this.persona);
        hash = 61 * hash + Objects.hashCode(this.tipoInterviniente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final PersonaCaso other = (PersonaCaso) obj;
        return (
            !Objects.equals(this.detenido, other.detenido) ||
            !Objects.equals(this.caso, other.caso) ||
            !Objects.equals(this.persona, other.persona) ||
            !Objects.equals(this.tipoInterviniente, other.tipoInterviniente)
            ) ? false : true;

    }

    public static String getValuesByField(Long idCaso, String tipoInterviniente, String field){
        String sql = "";
        if (field.equals("PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO") && tipoInterviniente.equals("Víctima desconocida")){
            sql+= "SELECT REPLACE("+field+","+field+",'Identidad desconocida') as value FROM PERSONA_NIC ";
        }else if(field.equals("PERSONA.NOMBRE || ' ' || PERSONA.PATERNO || ' ' || PERSONA.MATERNO") && tipoInterviniente.equals("Imputado desconocido")){
            sql+= "SELECT REPLACE("+field+","+field+",'Quién Resulte Responsable') as value FROM PERSONA_NIC ";
        }else{
            sql+= "SELECT "+field+" as value FROM PERSONA_NIC ";
        }
        sql+= "JOIN NIC on NIC.ID = PERSONA_NIC.NIC_ID ";
        sql+= "JOIN PERSONA on PERSONA.ID = PERSONA_NIC.PERSONA_ID ";
        sql+= "JOIN TIPO_INTERVINIENTE on TIPO_INTERVINIENTE.ID = PERSONA_NIC.TIPO_INTERVINIENTE_ID ";
        sql+= "LEFT OUTER JOIN PAIS on PAIS.ID = PERSONA.PAIS_ID ";
        sql+= "LEFT OUTER JOIN SEXO on SEXO.ID = PERSONA.SEXO_ID ";
        sql+= "LEFT OUTER JOIN ESTADO_CIVIL on ESTADO_CIVIL.ID = PERSONA.ESTADO_CIVIL_ID ";
        sql+= "LEFT OUTER JOIN OCUPACION on OCUPACION.ID = PERSONA.OCUPACION_ID ";
        sql+= "LEFT OUTER JOIN ESCOLARIDAD on ESCOLARIDAD.ID = PERSONA.ESCOLARIDAD_ID ";
        sql+= "LEFT OUTER JOIN NACIONALIDAD_RELIGION on NACIONALIDAD_RELIGION.ID = PERSONA.NACIONALIDAD_RELIGION_ID ";
        sql+= "LEFT OUTER JOIN IDIOMA_IDENTIFICACION on IDIOMA_IDENTIFICACION.ID = PERSONA.IDIOMA_IDENTIFICACION_ID ";
        sql+= "WHERE TIPO_INTERVINIENTE.TIPO = :tipo and NIC.ID = :id ORDER BY PERSONA_NIC.ID";
        String values = "";
        SqlQuery sqlQuery = Ebean.createSqlQuery(sql);
        sqlQuery.setParameter("tipo", tipoInterviniente);
        sqlQuery.setParameter("id", idCaso);
        List<SqlRow> list = sqlQuery.findList();

        for(int i=0; i<list.size();i++){
            if(list.get(i).getString("value")!=null){

                values+= list.get(i).getString("value");
                values+=", ";
                // if(list.size()==2 && list.size()!=i+1){
                //     values+=" y ";
                // }else if(list.size()>2 && list.size()!=i+1){
                //     values+=", ";
                // }
            }
        }
        if(values.length()>0){
            values=values.substring(0, values.length()-2);
        }
        return values;
    }

    public static String getSpecificValuesByField(Long idCaso, Long idHerencia, String field){
        String sql = "";
        sql+= "SELECT DISTINCT Result FROM (SELECT "+field+" as Result FROM PERSONA_NIC ";
        sql+= "JOIN NIC on NIC.ID = PERSONA_NIC.NIC_ID ";
        sql+= "JOIN PERSONA on PERSONA.ID = PERSONA_NIC.PERSONA_ID ";
        sql+= "JOIN TIPO_INTERVINIENTE on TIPO_INTERVINIENTE.ID = PERSONA_NIC.TIPO_INTERVINIENTE_ID ";
        sql+= "LEFT OUTER JOIN PAIS on PAIS.ID = PERSONA.PAIS_ID ";
        sql+= "LEFT OUTER JOIN ESTADO on ESTADO.ID = PERSONA.ESTADO_ID ";
        sql+= "LEFT OUTER JOIN SEXO on SEXO.ID = PERSONA.SEXO_ID ";
        sql+= "LEFT OUTER JOIN ESTADO_CIVIL on ESTADO_CIVIL.ID = PERSONA.ESTADO_CIVIL_ID ";
        sql+= "LEFT OUTER JOIN OCUPACION on OCUPACION.ID = PERSONA.OCUPACION_ID ";
        sql+= "LEFT OUTER JOIN ESCOLARIDAD on ESCOLARIDAD.ID = PERSONA.ESCOLARIDAD_ID ";
        sql+= "LEFT OUTER JOIN NACIONALIDAD_RELIGION on NACIONALIDAD_RELIGION.ID = PERSONA.NACIONALIDAD_RELIGION_ID ";
        sql+= "LEFT OUTER JOIN IDIOMA_IDENTIFICACION on IDIOMA_IDENTIFICACION.ID = PERSONA.IDIOMA_IDENTIFICACION_ID ";
        sql+= "LEFT OUTER JOIN PERSONA_HERENCIA on PERSONA_HERENCIA.PERSONA_CASO_ID = PERSONA_NIC.PERSONA_ID ";
        sql+= "LEFT OUTER JOIN LOCALIZACION_PERSONA on LOCALIZACION_PERSONA.PERSONA_ID = PERSONA_NIC.PERSONA_ID ";
        sql+= "LEFT OUTER JOIN LOCALIZACION_PERSONA on LOCALIZACION_PERSONA.PERSONA_ID = PERSONA_NIC.PERSONA_ID ";
        sql+= "LEFT OUTER JOIN COLONIA on COLONIA.ID = LOCALIZACION_PERSONA.COLONIA_ID ";
        sql+= "LEFT OUTER JOIN MUNICIPIO on MUNICIPIO.ID = LOCALIZACION_PERSONA.MUNICIPIO_ID ";
        sql+= "LEFT OUTER JOIN ENTREVISTA on ENTREVISTA.CASO_ID = PERSONA_NIC.NIC_ID ";
        sql+= "WHERE NIC.ID = :id AND PERSONA_HERENCIA.ID = :idHerencia ORDER BY PERSONA_NIC.ID)";
        String values = "";
        SqlQuery sqlQuery = Ebean.createSqlQuery(sql);
        sqlQuery.setParameter("id", idCaso);
        sqlQuery.setParameter("idHerencia",idHerencia);
        List<SqlRow> list = sqlQuery.findList();

        for(int i=0; i<list.size();i++){
            if(list.get(i).getString("Result")!=null){

                values+= list.get(i).getString("Result");
                values+=", ";
            }
        }
        if(values.length()>0){
            values=values.substring(0, values.length()-2);
        }
        return values;
    }

    public static String getFechasNacimientoVictimas(Long id, String tipoInterviniente){
        String sVictimas="";
        List <PersonaCaso> victimas = PersonaCaso.find.query().where()
            .eq("tipoInterviniente.tipo",tipoInterviniente)
            .eq("caso.id",id)
            .findList();
        for(PersonaCaso victima : victimas){
            if(victima.persona.fechaNacimiento != null){
                sVictimas+=App.parseDate(victima.persona.fechaNacimiento);
                if(victimas.size()==2){
                    sVictimas+=" y ";
                }else if(victimas.size()>2){
                    sVictimas+=", ";
                }
            }
        }
        return sVictimas;
    }

    public static String getTelefonosVictimas(Long id, String tipoInterviniente){
        String sVictimas = "";
        List <PersonaCaso> victimas = PersonaCaso.find.query().where()
            .eq("tipoInterviniente.tipo",tipoInterviniente)
            .eq("caso.id",id)
            .findList();
        for(PersonaCaso victima : victimas){
            if(victima.persona.localizacionPersona != null)
                sVictimas+=getTelefonos(victima.persona.localizacionPersona);
        }
        if(!sVictimas.equals("")){
            sVictimas = sVictimas.replace(",, ", ", ");
            sVictimas = sVictimas.substring(0, sVictimas.length()-2);
        }
        return sVictimas;
    }

    public static String getTelefonos(List <LocalizacionPersona> localizaciones){
        String telefonos="";
        for(LocalizacionPersona localizacion :localizaciones){
            if (localizacion.telParticular != null)
                telefonos+=localizacion.telParticular+", ";
        }
        return telefonos;
    }

    public static String getMovilVictimas(Long id, String tipoInterviniente){
        String sVictimas="";
        List <PersonaCaso> victimas = PersonaCaso.find.query().where()
            .eq("tipoInterviniente.tipo",tipoInterviniente)
            .eq("caso.id",id)
            .findList();
        for (PersonaCaso victima: victimas) {
            if (victima.persona.localizacionPersona != null)
                sVictimas+=getMoviles(victima.persona.localizacionPersona);
        }
        if(!sVictimas.equals("")){
            sVictimas= sVictimas.replace(",, ", ", ");
            sVictimas=sVictimas.substring(0, sVictimas.length()-2);
        }
        return sVictimas;
    }

    public static String getMoviles(List <LocalizacionPersona> localizaciones){
        String moviles="";
        for (LocalizacionPersona localizacion : localizaciones){
            if ((localizacion.telMovil != null) && (!localizacion.telMovil.equals("")))
                moviles+=localizacion.telMovil+", ";
        }
        return moviles;
    }

    public static String getDomiciliosVictimas(Long id, String tipoInterviniente){
        String sVictimas="";

        List <PersonaCaso> victimas = PersonaCaso.find.query().where()
            .eq("tipoInterviniente.tipo",tipoInterviniente)
            .eq("caso.id",id)
            .findList();
        for (PersonaCaso victima : victimas ) {
            if (victima.persona.localizacionPersona != null)
                sVictimas+=getDomicilios(victima.persona.localizacionPersona);
        }
        return sVictimas;
    }

    public static String getDomicilios(List <LocalizacionPersona> localizaciones){
        String domicilios="";
        for (LocalizacionPersona localizacion : localizaciones) {
            if (localizacion.calle != null) {
                domicilios+=localizacion.calle+" ";
            }
            if (localizacion.noExterior != null){
                domicilios+=localizacion.noExterior+",";
            }
            if (localizacion.noInterior != null) {
                domicilios+=localizacion.noInterior+",";
            }
            if (localizacion.colonia != null) {
                domicilios+=localizacion.colonia.nombre+",";
            } else if(localizacion.pais!=null && !localizacion.pais.nombre.equals("MÉXICO")){
                domicilios+=localizacion.coloniaOtro+",";
            }
            if (localizacion.municipio != null) {
                domicilios+=localizacion.municipio.nombre+",";
            }else if(localizacion.pais!=null && !localizacion.pais.nombre.equals("MÉXICO")){
                domicilios+=localizacion.municipioOtro+",";
            }
            if (localizacion.estado != null) {
                domicilios+=localizacion.estado.nombre+",";
            }else if(localizacion.pais!=null && !localizacion.pais.nombre.equals("MÉXICO")){
                domicilios+=localizacion.estadoOtro+",";
            }
        }
        if(domicilios.length()>0){
            domicilios=domicilios.substring(0, domicilios.length()-1);
        }
        return domicilios;
    }
}
