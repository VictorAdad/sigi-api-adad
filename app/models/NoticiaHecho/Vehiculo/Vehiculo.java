package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import javax.persistence.Lob;
import play.data.validation.Constraints;

@Entity
public class Vehiculo extends BaseModel {


    @Column(columnDefinition="Varchar2(50 Char)")
    public String tarjetaCirculacion;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String noEconomico;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(4 Char)")
    public Integer modelo;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(15 Char)")
    public String placas;

    @Column(columnDefinition="Varchar2(15 Char)")
    public String placasAdicionales;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String registroFederalVehiculo;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(35 Char)")
    public String noSerie;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(40 Char)")
    public String noMotor;

    @Column(columnDefinition="Varchar2(40 Char)")
    public String factura;

    @Column(columnDefinition="Varchar2(40 Char)")
    public String noPoliza;

    @Column(precision = 10, scale = 2)
    public BigDecimal valorEstimado;

    @Column(columnDefinition="Varchar2(40 Char)")
    public String pedimentoImportancion;

    @Column(columnDefinition="NUMBER(1,0) default 0")
    public boolean llevaCarga;

    @Column(columnDefinition="NUMBER(1,0) default 0")
    public boolean alterado;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String seniasParticulares;    

    @Lob
    @Column(columnDefinition = "CLOB")
    public String notas;

    @Column(columnDefinition="Varchar2(20 Char)")
    public String situacion;

    @ManyToOne
    // @Constraints.Required(groups = SaveStep.class)
    public MotivoColorClase motivoRegistroColorClase;

    @ManyToOne
    // @Constraints.Required(groups = SaveStep.class)
    public MarcaSubMarca marcaSubmarca;

    @ManyToOne
    // @Constraints.Required(groups = SaveStep.class)
    public TipoUsoTipoVehiculo tipoUsoTipoVehiculo;

    @ManyToOne
    public Estado estadoOrigenPlacas;

    @ManyToOne
    public ProcedenciaAseguradora procedenciaAseguradora;

    @JsonIgnore
    @ManyToOne
    @Constraints.Required(groups = SaveStep.class)
    public Caso caso;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 239 * hash + Objects.hashCode(this.tarjetaCirculacion);
        hash = 239 * hash + Objects.hashCode(this.noEconomico);
        hash = 239 * hash + Objects.hashCode(this.modelo);
        hash = 239 * hash + Objects.hashCode(this.estadoOrigenPlacas);
        hash = 239 * hash + Objects.hashCode(this.placas);
        hash = 239 * hash + Objects.hashCode(this.placasAdicionales);
        hash = 239 * hash + Objects.hashCode(this.registroFederalVehiculo);
        hash = 239 * hash + Objects.hashCode(this.noSerie);
        hash = 239 * hash + Objects.hashCode(this.noMotor);
        hash = 239 * hash + Objects.hashCode(this.factura);
        hash = 239 * hash + Objects.hashCode(this.noPoliza);
        hash = 239 * hash + Objects.hashCode(this.valorEstimado);
        hash = 239 * hash + Objects.hashCode(this.pedimentoImportancion);
        hash = 239 * hash + Objects.hashCode(this.llevaCarga);
        hash = 239 * hash + Objects.hashCode(this.alterado);
        hash = 239 * hash + Objects.hashCode(this.seniasParticulares);
        hash = 239 * hash + Objects.hashCode(this.notas);
        hash = 239 * hash + Objects.hashCode(this.motivoRegistroColorClase);
        hash = 239 * hash + Objects.hashCode(this.marcaSubmarca);
        hash = 239 * hash + Objects.hashCode(this.tipoUsoTipoVehiculo);
        hash = 239 * hash + Objects.hashCode(this.procedenciaAseguradora);
        hash = 239 * hash + Objects.hashCode(this.estadoOrigenPlacas);
        hash = 239 * hash + Objects.hashCode(this.situacion);
        hash = 239 * hash + Objects.hashCode(this.caso);
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
        final Vehiculo other = (Vehiculo) obj;

        return (
            !Objects.equals(this.tarjetaCirculacion, other.tarjetaCirculacion) ||
            !Objects.equals(this.noEconomico, other.noEconomico) ||
            !Objects.equals(this.modelo, other.modelo) ||
            !Objects.equals(this.estadoOrigenPlacas, other.estadoOrigenPlacas) ||
            !Objects.equals(this.placas, other.placas) ||
            !Objects.equals(this.placasAdicionales, other.placasAdicionales) ||
            !Objects.equals(this.registroFederalVehiculo, other.registroFederalVehiculo) ||
            !Objects.equals(this.noSerie, other.noSerie) ||
            !Objects.equals(this.noMotor, other.noMotor) ||
            !Objects.equals(this.factura, other.factura) ||
            !Objects.equals(this.noPoliza, other.noPoliza) ||
            !Objects.equals(this.valorEstimado, other.valorEstimado) ||
            !Objects.equals(this.pedimentoImportancion, other.pedimentoImportancion) ||
            !Objects.equals(this.llevaCarga, other.llevaCarga) ||
            !Objects.equals(this.alterado, other.alterado) ||
            !Objects.equals(this.seniasParticulares, other.seniasParticulares) ||
            !Objects.equals(this.notas, other.notas) ||
            !Objects.equals(this.motivoRegistroColorClase, other.motivoRegistroColorClase) ||
            !Objects.equals(this.marcaSubmarca, other.marcaSubmarca) ||
            !Objects.equals(this.tipoUsoTipoVehiculo, other.tipoUsoTipoVehiculo) ||
            !Objects.equals(this.procedenciaAseguradora, other.procedenciaAseguradora) ||
            !Objects.equals(this.estadoOrigenPlacas, other.estadoOrigenPlacas) ||
            !Objects.equals(this.situacion, other.situacion) ||
            !Objects.equals(this.caso, other.caso)
        ) ? false : true;
    }
}