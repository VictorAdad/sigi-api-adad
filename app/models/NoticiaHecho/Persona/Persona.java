package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.ebean.Finder;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import java.math.BigDecimal;

import play.data.validation.Constraints;

@Entity
public class Persona extends BaseModel {

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(100 Char)")
    public String nombre;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(100 Char)")
    public String paterno;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String materno;

    // @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(3 Char)")
    public String edad;

    @Column(columnDefinition="Varchar2(18 Char)")
    public String curp;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String razonSocial;

    @Column(columnDefinition="Varchar2(15 Char)")
    public String rfc;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String numHijos;

    public Date fechaNacimiento;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String lugarTrabajo;

    @Column(precision = 10, scale = 2)
    public BigDecimal ingresoMensual;

    @Column(columnDefinition="Varchar2(10 Char)")
    public String tipoPersona;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String autoridadEmisora;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String folioIdentificacion;

    @Column(columnDefinition="Varchar2(200 Char)")
    public String estadoNacimientoOtro;

    @Column(columnDefinition="Varchar2(200 Char)")
    public String municipioNacimientoOtro;

    @ManyToOne
    public NacionalidadReligion nacionalidadReligion;

    @ManyToOne
    public IdiomaIdentificacion idiomaIdentificacion;

    @ManyToOne
    public Pais pais;

    @ManyToOne
    public Estado estado;

    @ManyToOne
    public Municipio municipio;

    @ManyToOne
    public Interprete interprete;

    @ManyToOne
    public Sexo sexo;

    @ManyToOne
    public Escolaridad escolaridad;

    @Constraints.Required(groups = SaveStep.class)
    @ManyToOne
    public Ocupacion ocupacion;

    @ManyToOne
    public EstadoCivil estadoCivil;

    @ManyToOne
    public GrupoEtnico grupoEtnico;

    @ManyToOne
    public Alfabetismo alfabetismo;

    @ManyToOne
    public Adiccion adiccion;

    @OneToOne(
        mappedBy     = "persona",
        targetEntity = MediaFiliacion.class,
        cascade      = CascadeType.ALL
    )
    public MediaFiliacion mediaFiliacion;

    @OneToMany(
        mappedBy     = "persona",
        targetEntity = LocalizacionPersona.class,
        cascade      = CascadeType.ALL
    )
    public List <LocalizacionPersona> localizacionPersona;

    @JsonIgnore
    @OneToMany(
        mappedBy     = "persona",
        targetEntity = PersonaCaso.class,
        cascade      = CascadeType.ALL
    )
    public List<PersonaCaso> personaCaso;

    @OneToMany(
        mappedBy     = "persona",
        targetEntity = AliasNombrePersona.class,
        cascade      = CascadeType.ALL
    )
    public List<AliasNombrePersona> aliasNombrePersona;

    @Transient
    public Long personaCasoId;

    public static final Finder<Long, Persona> find = new Finder<>(Persona.class);

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + Objects.hashCode(this.paterno);
        hash = 83 * hash + Objects.hashCode(this.materno);
        hash = 83 * hash + Objects.hashCode(this.edad);
        hash = 83 * hash + Objects.hashCode(this.curp);
        hash = 83 * hash + Objects.hashCode(this.razonSocial);
        hash = 83 * hash + Objects.hashCode(this.rfc);
        hash = 83 * hash + Objects.hashCode(this.numHijos);
        hash = 83 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 83 * hash + Objects.hashCode(this.lugarTrabajo);
        hash = 83 * hash + Objects.hashCode(this.ingresoMensual);
        hash = 83 * hash + Objects.hashCode(this.tipoPersona);
        hash = 83 * hash + Objects.hashCode(this.autoridadEmisora);
        hash = 83 * hash + Objects.hashCode(this.folioIdentificacion);
        hash = 83 * hash + Objects.hashCode(this.nacionalidadReligion);
        hash = 83 * hash + Objects.hashCode(this.idiomaIdentificacion);
        hash = 83 * hash + Objects.hashCode(this.pais);
        hash = 83 * hash + Objects.hashCode(this.estado);
        hash = 83 * hash + Objects.hashCode(this.municipio);
        hash = 83 * hash + Objects.hashCode(this.interprete);
        hash = 83 * hash + Objects.hashCode(this.sexo);
        hash = 83 * hash + Objects.hashCode(this.escolaridad);
        hash = 83 * hash + Objects.hashCode(this.ocupacion);
        hash = 83 * hash + Objects.hashCode(this.estadoCivil);
        hash = 83 * hash + Objects.hashCode(this.grupoEtnico);
        hash = 83 * hash + Objects.hashCode(this.alfabetismo);
        hash = 83 * hash + Objects.hashCode(this.adiccion);
        hash = 83 * hash + Objects.hashCode(this.localizacionPersona);
        hash = 83 * hash + Objects.hashCode(this.estadoNacimientoOtro);
        hash = 83 * hash + Objects.hashCode(this.municipioNacimientoOtro);
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

        final Persona other = (Persona) obj;
        return (
            !Objects.equals(this.nombre, other.nombre) ||
            !Objects.equals(this.paterno, other.paterno) ||
            !Objects.equals(this.materno, other.materno) ||
            !Objects.equals(this.edad, other.edad) ||
            !Objects.equals(this.curp, other.curp) ||
            !Objects.equals(this.razonSocial, other.razonSocial) ||
            !Objects.equals(this.rfc, other.rfc) ||
            !Objects.equals(this.numHijos, other.numHijos) ||
            !Objects.equals(this.fechaNacimiento, other.fechaNacimiento) ||
            !Objects.equals(this.lugarTrabajo, other.lugarTrabajo) ||
            !Objects.equals(this.ingresoMensual, other.ingresoMensual) ||
            !Objects.equals(this.tipoPersona, other.tipoPersona) ||
            !Objects.equals(this.autoridadEmisora, other.autoridadEmisora) ||
            !Objects.equals(this.folioIdentificacion, other.folioIdentificacion) ||
            !Objects.equals(this.nacionalidadReligion, other.nacionalidadReligion) ||
            !Objects.equals(this.idiomaIdentificacion, other.idiomaIdentificacion) ||
            !Objects.equals(this.pais, other.pais) ||
            !Objects.equals(this.estado, other.estado) ||
            !Objects.equals(this.municipio, other.municipio) ||
            !Objects.equals(this.interprete, other.interprete) ||
            !Objects.equals(this.sexo, other.sexo) ||
            !Objects.equals(this.escolaridad, other.escolaridad) ||
            !Objects.equals(this.ocupacion, other.ocupacion) ||
            !Objects.equals(this.estadoCivil, other.estadoCivil) ||
            !Objects.equals(this.grupoEtnico, other.grupoEtnico) ||
            !Objects.equals(this.alfabetismo, other.alfabetismo) ||
            !Objects.equals(this.adiccion, other.adiccion) ||
            !Objects.equals(this.estadoNacimientoOtro, other.estadoNacimientoOtro) ||
            !Objects.equals(this.municipioNacimientoOtro, other.municipioNacimientoOtro) ||
            !Objects.equals(this.localizacionPersona, other.localizacionPersona)
            ) ? false : true;

    }
}
