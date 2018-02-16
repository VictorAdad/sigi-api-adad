package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.data.validation.Constraints;

@Entity
public class Relacion extends BaseModel {

    @Column(columnDefinition="Varchar2(100 Char)")
    public String tipo;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(100 Char)")
    public String modalidad;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(100 Char)")
    public String delito;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String arma;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String vehiculo;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(100 Char)")
    public String formaComision;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(100 Char)")
    public String imputado;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(100 Char)")
    public String victima;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(100 Char)")
    public String lugar;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String concursoDelito;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String clasificacionDelitoOrden;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(100 Char)")
    public String elementosComision;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String clasificacion;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(100 Char)")
    public String formaAccion;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String consumacion;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String gradoParticipacion;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String relacionAcusadoOfendido;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String formaConducta;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String tipoDesaparicion;

    @Column(columnDefinition="NUMBER(1,0) default 0")
    public Boolean violenciaGenero;

    @Column(columnDefinition="NUMBER(1,0) default 0")
    public Boolean flagrancia;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="nic_id")
    public Caso caso;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.tipo);
        hash = 59 * hash + Objects.hashCode(this.modalidad);
        hash = 59 * hash + Objects.hashCode(this.delito);
        hash = 59 * hash + Objects.hashCode(this.arma);
        hash = 59 * hash + Objects.hashCode(this.vehiculo);
        hash = 59 * hash + Objects.hashCode(this.formaComision);
        hash = 59 * hash + Objects.hashCode(this.imputado);
        hash = 59 * hash + Objects.hashCode(this.victima);
        hash = 59 * hash + Objects.hashCode(this.lugar);
        hash = 59 * hash + Objects.hashCode(this.concursoDelito);
        hash = 59 * hash + Objects.hashCode(this.clasificacionDelitoOrden);
        hash = 59 * hash + Objects.hashCode(this.elementosComision);
        hash = 59 * hash + Objects.hashCode(this.clasificacion);
        hash = 59 * hash + Objects.hashCode(this.formaAccion);
        hash = 59 * hash + Objects.hashCode(this.consumacion);
        hash = 59 * hash + Objects.hashCode(this.gradoParticipacion);
        hash = 59 * hash + Objects.hashCode(this.relacionAcusadoOfendido);
        hash = 59 * hash + Objects.hashCode(this.formaConducta);
        hash = 59 * hash + Objects.hashCode(this.tipoDesaparicion);
        hash = 59 * hash + Objects.hashCode(this.violenciaGenero);
        hash = 59 * hash + Objects.hashCode(this.flagrancia);
        hash = 59 * hash + Objects.hashCode(this.caso);
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
        final Relacion other = (Relacion) obj;
        return (
            !Objects.equals(this.tipo, other.tipo) ||
            !Objects.equals(this.modalidad, other.modalidad) ||
            !Objects.equals(this.delito, other.delito) ||
            !Objects.equals(this.arma, other.arma) ||
            !Objects.equals(this.vehiculo, other.vehiculo) ||
            !Objects.equals(this.formaComision, other.formaComision) ||
            !Objects.equals(this.imputado, other.imputado) ||
            !Objects.equals(this.victima, other.victima) ||
            !Objects.equals(this.lugar, other.lugar) ||
            !Objects.equals(this.concursoDelito, other.concursoDelito) ||
            !Objects.equals(this.clasificacionDelitoOrden, other.clasificacionDelitoOrden) ||
            !Objects.equals(this.elementosComision, other.elementosComision) ||
            !Objects.equals(this.clasificacion, other.clasificacion) ||
            !Objects.equals(this.formaAccion, other.formaAccion) ||
            !Objects.equals(this.consumacion, other.consumacion) ||
            !Objects.equals(this.gradoParticipacion, other.gradoParticipacion) ||
            !Objects.equals(this.relacionAcusadoOfendido, other.relacionAcusadoOfendido) ||
            !Objects.equals(this.formaConducta, other.formaConducta) ||
            !Objects.equals(this.tipoDesaparicion, other.tipoDesaparicion) ||
            !Objects.equals(this.violenciaGenero, other.violenciaGenero) ||
            !Objects.equals(this.flagrancia, other.flagrancia) ||
            !Objects.equals(this.caso, other.caso)
            ) ? false : true;
    }
}