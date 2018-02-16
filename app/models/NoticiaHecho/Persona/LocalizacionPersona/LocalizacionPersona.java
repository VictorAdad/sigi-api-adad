package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.ebean.Finder;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Lob;
import play.data.validation.Constraints;

 /**
  * Modelo de la entidad de LocalizacionPersona para la fiscalia
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
public class LocalizacionPersona extends BaseModel {

    @ManyToOne
    public Pais pais;

    @ManyToOne
    public Estado estado;

    @ManyToOne
    public Municipio municipio;

    @ManyToOne
    public Colonia colonia;

    @ManyToOne
    public Localidad localidad;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String calle;

    @Column(columnDefinition="Varchar2(15 Char)")
    public String noExterior;

    @Column(columnDefinition="Varchar2(15 Char)")
    public String noInterior;

    @Column(columnDefinition="Varchar2(5 Char)")
    public String cp;

    @ManyToOne
    public TipoDomicilio tipoDomicilio;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String referencias;

    @Column(columnDefinition="Varchar2(20 Char)")
    public String telParticular;

    @Column(columnDefinition="Varchar2(20 Char)")
    public String telTrabajo;

    @Column(columnDefinition="Varchar2(5 Char)")
    public Integer extension;

    @Column(columnDefinition="Varchar2(20 Char)")
    public String telMovil;

    @Column(columnDefinition="Varchar2(20 Char)")
    public String fax;

    @Column(columnDefinition="Varchar2(20 Char)")
    public String otroMedioContacto;

    @Column(columnDefinition="Varchar2(25 Char)")
    @Constraints.Email
    public String correo;

    @Column(columnDefinition="Varchar2(20 Char)")
    public String tipoRecidencia;

    @JsonIgnore
    @ManyToOne
    @Constraints.Required(groups = SaveStep.class)
    public Persona persona;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String estadoOtro;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String municipioOtro;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String coloniaOtro;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String localidadOtro;

    // Finder para uso de la super class y sus accesos mas sencillos
    public static final Finder<Long, LocalizacionPersona> find = new Finder<>(LocalizacionPersona.class);

    @Override
    public int hashCode() {
        int hash = 3;
        // hash = 69 * hash + Objects.hashCode(this.pais);
        // hash = 69 * hash + Objects.hashCode(this.estado);
        // hash = 69 * hash + Objects.hashCode(this.municipio);
        // hash = 69 * hash + Objects.hashCode(this.colonia);
        // hash = 69 * hash + Objects.hashCode(this.localidad);
        // hash = 69 * hash + Objects.hashCode(this.calle);
        // hash = 69 * hash + Objects.hashCode(this.noExterior);
        // hash = 69 * hash + Objects.hashCode(this.noInterior);
        // hash = 69 * hash + Objects.hashCode(this.cp);
        // hash = 69 * hash + Objects.hashCode(this.tipoDomicilio);
        // hash = 69 * hash + Objects.hashCode(this.referencias);
        // hash = 69 * hash + Objects.hashCode(this.telParticular);
        // hash = 69 * hash + Objects.hashCode(this.telTrabajo);
        // hash = 69 * hash + Objects.hashCode(this.extension);
        // hash = 69 * hash + Objects.hashCode(this.telMovil);
        // hash = 69 * hash + Objects.hashCode(this.fax);
        // hash = 69 * hash + Objects.hashCode(this.otroMedioContacto);
        // hash = 69 * hash + Objects.hashCode(this.correo);
        // hash = 69 * hash + Objects.hashCode(this.tipoRecidencia);
        // hash = 69 * hash + Objects.hashCode(this.persona);
        // hash = 69 * hash + Objects.hashCode(this.estadoOtro);
        // hash = 69 * hash + Objects.hashCode(this.municipioOtro);
        // hash = 69 * hash + Objects.hashCode(this.coloniaOtro);
        // hash = 69 * hash + Objects.hashCode(this.localidadOtro);
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

        final LocalizacionPersona other = (LocalizacionPersona) obj;
        return (
            !Objects.equals(this.pais, other.pais) ||
            !Objects.equals(this.estado, other.estado) ||
            !Objects.equals(this.municipio, other.municipio) ||
            !Objects.equals(this.colonia, other.colonia) ||
            !Objects.equals(this.localidad, other.localidad) ||
            !Objects.equals(this.calle, other.calle) ||
            !Objects.equals(this.noExterior, other.noExterior) ||
            !Objects.equals(this.noInterior, other.noInterior) ||
            !Objects.equals(this.cp, other.cp) ||
            !Objects.equals(this.tipoDomicilio, other.tipoDomicilio) ||
            !Objects.equals(this.referencias, other.referencias) ||
            !Objects.equals(this.telParticular, other.telParticular) ||
            !Objects.equals(this.telTrabajo, other.telTrabajo) ||
            !Objects.equals(this.extension, other.extension) ||
            !Objects.equals(this.telMovil, other.telMovil) ||
            !Objects.equals(this.fax, other.fax) ||
            !Objects.equals(this.otroMedioContacto, other.otroMedioContacto) ||
            !Objects.equals(this.correo, other.correo) ||
            !Objects.equals(this.tipoRecidencia, other.tipoRecidencia) ||
            !Objects.equals(this.persona, other.persona) ||
            !Objects.equals(this.estadoOtro, other.estadoOtro) ||
            !Objects.equals(this.municipioOtro, other.municipioOtro) ||
            !Objects.equals(this.coloniaOtro, other.coloniaOtro) ||
            !Objects.equals(this.localidadOtro, other.localidadOtro)
            ) ? false : true;
    }
}
