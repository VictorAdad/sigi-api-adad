package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Lob;
import play.data.validation.Constraints;

@Entity
public class Entrevista extends BaseHerencia {

    @Lob
    @Column(columnDefinition = "CLOB")
    public String autoridadRealizaEntrevista;    

    @Lob
    @Column(columnDefinition = "CLOB")
    public String lugarRealizaEntrevista;

    @Column(columnDefinition="Varchar2(150 Char)")
    public String nombreEntrevistado;

    @ManyToOne
    public Sexo sexo;

    public Date fechaNacimiento;

    @Column(columnDefinition="Varchar2(3 Char)")
    public Integer edad;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String nacionalidad;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String originarioDe;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String estadoMigratorio;

    @ManyToOne
    public TipoInterviniente tipoInterviniente;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String tipoIdentificacion;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String emisorIdentificacion;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String noIdentificacion;

    @Column(columnDefinition="Varchar2(18 Char)")
    public String curp;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String rfc;

    @Column(columnDefinition="NUMBER(1,0) default 0")
    public boolean sabeLeerEscribir;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String gradoEscolaridad;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String ocupacion;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String lugarOcupacion;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String estadoCivil;

    @Column(precision = 10, scale = 2)
    public BigDecimal salarioSemanal;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String relacionEntrevistado;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String calle;

    @Column(columnDefinition="Varchar2(15 Char)")
    public String noExterior;

    @Column(columnDefinition="Varchar2(15 Char)")
    public String noInterior;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String colonia;

    @Column(columnDefinition="Varchar2(5 Char)")
    public String cp;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String municipio;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String estado;

    @Column(columnDefinition="Varchar2(20 Char)")
    public String noTelefonoParticular;

    @Column(columnDefinition="Varchar2(20 Char)")
    public String noTelefonoCelular;

    @Column(columnDefinition="Varchar2(40 Char)")
    @Constraints.Email
    public String correoElectronico;

    @Column(columnDefinition="NUMBER(1,0) default 0")
    public boolean tieneRepresentanteLegal;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String nombreRepresentanteLegal;

    @Column(columnDefinition="NUMBER(1,0) default 0")
    public boolean medioTecnologicoRegistro;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String medioTecnologicoUtilizado;

    @Column(columnDefinition="NUMBER(1,0) default 0")
    public boolean medioTecnicoRegistro;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String medioTecnicoUtilizado;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String narracionHechos;   

    @Lob
    @Column(columnDefinition = "CLOB")
    public String observaciones;

    // Atributos de herencia

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String edadHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String fechaNacimientoHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String cpHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String noTelefonoParticularHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String noTelefonoCelularHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String sexoHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String correoElectronicoHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String curpHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String rfcHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String calleHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String calidadIntervinienteHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String tipoIdentificacionHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String emisorIdentificacionHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String noIdentificacionHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String gradoEscolaridadHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String salarioHeredar;

    @Column(columnDefinition="Varchar2(1000 CHAR)")
    public String originarioDeHeredar;

    @Column(columnDefinition="Varchar2(1000 CHAR)")
    public String sabeLeerEscribirHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String nombreEntrevistadoHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String nacionalidadHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String ocupacionHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String estadoCivilHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String lugarOcupacionHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String noExteriorHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String noInteriorHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String coloniaHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String estadoHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String municipioHeredar;

    @JsonIgnore
    @Constraints.Required(groups = SaveStep.class)
    @ManyToOne
    public Caso caso;

    @OneToMany(mappedBy = "entrevista", targetEntity = DocEntrevista.class)
    public List <DocEntrevista> documentos;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.autoridadRealizaEntrevista);
        hash = 29 * hash + Objects.hashCode(this.lugarRealizaEntrevista);
        hash = 29 * hash + Objects.hashCode(this.nombreEntrevistado);
        hash = 29 * hash + Objects.hashCode(this.sexo);
        hash = 29 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 29 * hash + Objects.hashCode(this.edad);
        hash = 29 * hash + Objects.hashCode(this.nacionalidad);
        hash = 29 * hash + Objects.hashCode(this.originarioDe);
        hash = 29 * hash + Objects.hashCode(this.estadoMigratorio);
        hash = 29 * hash + Objects.hashCode(this.tipoInterviniente);
        hash = 29 * hash + Objects.hashCode(this.tipoIdentificacion);
        hash = 29 * hash + Objects.hashCode(this.emisorIdentificacion);
        hash = 29 * hash + Objects.hashCode(this.noIdentificacion);
        hash = 29 * hash + Objects.hashCode(this.curp);
        hash = 29 * hash + Objects.hashCode(this.rfc);
        hash = 29 * hash + Objects.hashCode(this.sabeLeerEscribir);
        hash = 29 * hash + Objects.hashCode(this.gradoEscolaridad);
        hash = 29 * hash + Objects.hashCode(this.ocupacion);
        hash = 29 * hash + Objects.hashCode(this.lugarOcupacion);
        hash = 29 * hash + Objects.hashCode(this.estadoCivil);
        hash = 29 * hash + Objects.hashCode(this.salarioSemanal);
        hash = 29 * hash + Objects.hashCode(this.relacionEntrevistado);
        hash = 29 * hash + Objects.hashCode(this.calle);
        hash = 29 * hash + Objects.hashCode(this.noExterior);
        hash = 29 * hash + Objects.hashCode(this.noInterior);
        hash = 29 * hash + Objects.hashCode(this.colonia);
        hash = 29 * hash + Objects.hashCode(this.cp);
        hash = 29 * hash + Objects.hashCode(this.municipio);
        hash = 29 * hash + Objects.hashCode(this.estado);
        hash = 29 * hash + Objects.hashCode(this.noTelefonoParticular);
        hash = 29 * hash + Objects.hashCode(this.noTelefonoCelular);
        hash = 29 * hash + Objects.hashCode(this.correoElectronico);
        hash = 29 * hash + Objects.hashCode(this.tieneRepresentanteLegal);
        hash = 29 * hash + Objects.hashCode(this.nombreRepresentanteLegal);
        hash = 29 * hash + Objects.hashCode(this.medioTecnologicoRegistro);
        hash = 29 * hash + Objects.hashCode(this.medioTecnologicoUtilizado);
        hash = 29 * hash + Objects.hashCode(this.medioTecnicoRegistro);
        hash = 29 * hash + Objects.hashCode(this.medioTecnicoUtilizado);
        hash = 29 * hash + Objects.hashCode(this.narracionHechos);
        hash = 29 * hash + Objects.hashCode(this.observaciones);
        hash = 29 * hash + Objects.hashCode(this.documentos);
        hash = 29 * hash + Objects.hashCode(this.edadHeredar);
        hash = 29 * hash + Objects.hashCode(this.fechaNacimientoHeredar);
        hash = 29 * hash + Objects.hashCode(this.cpHeredar);
        hash = 29 * hash + Objects.hashCode(this.noTelefonoParticularHeredar);
        hash = 29 * hash + Objects.hashCode(this.noTelefonoCelularHeredar);
        hash = 29 * hash + Objects.hashCode(this.sexoHeredar);
        hash = 29 * hash + Objects.hashCode(this.correoElectronicoHeredar);
        hash = 29 * hash + Objects.hashCode(this.curpHeredar);
        hash = 29 * hash + Objects.hashCode(this.rfcHeredar);
        hash = 29 * hash + Objects.hashCode(this.calleHeredar);
        hash = 29 * hash + Objects.hashCode(this.calidadIntervinienteHeredar);
        hash = 29 * hash + Objects.hashCode(this.tipoIdentificacionHeredar);
        hash = 29 * hash + Objects.hashCode(this.emisorIdentificacionHeredar);
        hash = 29 * hash + Objects.hashCode(this.noIdentificacionHeredar);
        hash = 29 * hash + Objects.hashCode(this.gradoEscolaridadHeredar);
        hash = 29 * hash + Objects.hashCode(this.salarioHeredar);
        hash = 29 * hash + Objects.hashCode(this.originarioDeHeredar);
        hash = 29 * hash + Objects.hashCode(this.sabeLeerEscribirHeredar);
        hash = 29 * hash + Objects.hashCode(this.estadoHeredar);
        hash = 29 * hash + Objects.hashCode(this.municipioHeredar);
        hash = 29 * hash + Objects.hashCode(this.caso);
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
        final Entrevista other = (Entrevista) obj;

        return (
            !Objects.equals(this.autoridadRealizaEntrevista, other.autoridadRealizaEntrevista)||
            !Objects.equals(this.lugarRealizaEntrevista, other.lugarRealizaEntrevista)||
            !Objects.equals(this.nombreEntrevistado, other.nombreEntrevistado)||
            !Objects.equals(this.sexo, other.sexo)||
            !Objects.equals(this.fechaNacimiento, other.fechaNacimiento)||
            !Objects.equals(this.edad, other.edad)||
            !Objects.equals(this.nacionalidad, other.nacionalidad)||
            !Objects.equals(this.originarioDe, other.originarioDe)||
            !Objects.equals(this.estadoMigratorio, other.estadoMigratorio)||
            !Objects.equals(this.tipoInterviniente, other.tipoInterviniente)||
            !Objects.equals(this.tipoIdentificacion, other.tipoIdentificacion)||
            !Objects.equals(this.emisorIdentificacion, other.emisorIdentificacion)||
            !Objects.equals(this.noIdentificacion, other.noIdentificacion)||
            !Objects.equals(this.curp, other.curp)||
            !Objects.equals(this.rfc, other.rfc)||
            !Objects.equals(this.sabeLeerEscribir, other.sabeLeerEscribir)||
            !Objects.equals(this.gradoEscolaridad, other.gradoEscolaridad)||
            !Objects.equals(this.ocupacion, other.ocupacion)||
            !Objects.equals(this.lugarOcupacion, other.lugarOcupacion)||
            !Objects.equals(this.estadoCivil, other.estadoCivil)||
            !Objects.equals(this.salarioSemanal, other.salarioSemanal)||
            !Objects.equals(this.relacionEntrevistado, other.relacionEntrevistado)||
            !Objects.equals(this.calle, other.calle)||
            !Objects.equals(this.noExterior, other.noExterior)||
            !Objects.equals(this.noInterior, other.noInterior)||
            !Objects.equals(this.colonia, other.colonia)||
            !Objects.equals(this.cp, other.cp)||
            !Objects.equals(this.municipio, other.municipio)||
            !Objects.equals(this.estado, other.estado)||
            !Objects.equals(this.noTelefonoParticular, other.noTelefonoParticular)||
            !Objects.equals(this.noTelefonoCelular, other.noTelefonoCelular)||
            !Objects.equals(this.correoElectronico, other.correoElectronico)||
            !Objects.equals(this.tieneRepresentanteLegal, other.tieneRepresentanteLegal)||
            !Objects.equals(this.nombreRepresentanteLegal, other.nombreRepresentanteLegal)||
            !Objects.equals(this.medioTecnologicoRegistro, other.medioTecnologicoRegistro)||
            !Objects.equals(this.medioTecnologicoUtilizado, other.medioTecnologicoUtilizado)||
            !Objects.equals(this.medioTecnicoRegistro, other.medioTecnicoRegistro)||
            !Objects.equals(this.medioTecnicoUtilizado, other.medioTecnicoUtilizado)||
            !Objects.equals(this.narracionHechos, other.narracionHechos)||
            !Objects.equals(this.observaciones, other.observaciones)||
            !Objects.equals(this.documentos, other.documentos)||
            !Objects.equals(this.edadHeredar, other.edadHeredar)||
            !Objects.equals(this.fechaNacimientoHeredar, other.fechaNacimientoHeredar)||
            !Objects.equals(this.cpHeredar, other.cpHeredar)||
            !Objects.equals(this.noTelefonoParticularHeredar, other.noTelefonoParticularHeredar)||
            !Objects.equals(this.noTelefonoCelularHeredar, other.noTelefonoCelularHeredar)||
            !Objects.equals(this.sexoHeredar, other.sexoHeredar)||
            !Objects.equals(this.correoElectronicoHeredar, other.correoElectronicoHeredar)||
            !Objects.equals(this.curpHeredar, other.curpHeredar)||
            !Objects.equals(this.rfcHeredar, other.rfcHeredar)||
            !Objects.equals(this.calleHeredar, other.calleHeredar)||
            !Objects.equals(this.calidadIntervinienteHeredar, other.calidadIntervinienteHeredar)||
            !Objects.equals(this.tipoIdentificacionHeredar, other.tipoIdentificacionHeredar)||
            !Objects.equals(this.emisorIdentificacionHeredar, other.emisorIdentificacionHeredar)||
            !Objects.equals(this.noIdentificacionHeredar, other.noIdentificacionHeredar)||
            !Objects.equals(this.gradoEscolaridadHeredar, other.gradoEscolaridadHeredar)||
            !Objects.equals(this.salarioHeredar, other.salarioHeredar)||
            !Objects.equals(this.originarioDeHeredar, other.originarioDeHeredar)||
            !Objects.equals(this.sabeLeerEscribirHeredar, other.sabeLeerEscribirHeredar)||
            !Objects.equals(this.estadoHeredar, other.estadoHeredar)||
            !Objects.equals(this.municipioHeredar, other.municipioHeredar)||
            !Objects.equals(this.caso, other.caso)
        ) ? false : true;
    }
}
