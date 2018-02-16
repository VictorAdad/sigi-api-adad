package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Column;

import play.data.validation.Constraints;

@Entity
public class TrataPersona extends BaseModel {

    @Column(columnDefinition="Varchar2(100 Char)")
    public String estadoOrigenOtro;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(100 Char)")
    public String municipioOrigenOtro;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String estadoDestinoOtro;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String municipioDestinoOtro;

    @Constraints.Required(groups = SaveStep.class)
    @ManyToOne
    public Pais paisOrigen;

    @Constraints.Required(groups = SaveStep.class)
    @ManyToOne
    public Pais paisDestino;

    @ManyToOne
    public Estado estadoOrigen;

    @ManyToOne
    public Estado estadoDestino;

    @ManyToOne
    public Municipio municipioOrigen;

    @ManyToOne
    public Municipio municipioDestino;

    @Constraints.Required(groups = SaveStep.class)
    @ManyToOne
    public TipoTransportacion tipoTransportacion;

    // @JsonIgnore
    // @ManyToOne
    // public DetalleDelito detalleDelito;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 32 * hash + Objects.hashCode(this.estadoOrigenOtro);
        hash = 32 * hash + Objects.hashCode(this.municipioOrigenOtro);
        hash = 32 * hash + Objects.hashCode(this.estadoDestinoOtro);
        hash = 32 * hash + Objects.hashCode(this.municipioDestinoOtro);
        hash = 32 * hash + Objects.hashCode(this.paisOrigen);
        hash = 32 * hash + Objects.hashCode(this.paisDestino);
        hash = 32 * hash + Objects.hashCode(this.estadoOrigen);
        hash = 32 * hash + Objects.hashCode(this.estadoDestino);
        hash = 32 * hash + Objects.hashCode(this.municipioOrigen);
        hash = 32 * hash + Objects.hashCode(this.municipioDestino);
        hash = 32 * hash + Objects.hashCode(this.tipoTransportacion);
        // hash = 32 * hash + Objects.hashCode(this.detalleDelito);
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
        final TrataPersona other = (TrataPersona) obj;
        return (
            !Objects.equals(this.estadoOrigenOtro, other.estadoOrigenOtro) ||
            !Objects.equals(this.municipioOrigenOtro, other.municipioOrigenOtro) ||
            !Objects.equals(this.estadoDestinoOtro, other.estadoDestinoOtro) ||
            !Objects.equals(this.municipioDestinoOtro, other.municipioDestinoOtro) ||
            !Objects.equals(this.paisOrigen, other.paisOrigen) ||
            !Objects.equals(this.paisDestino, other.paisDestino) ||
            !Objects.equals(this.estadoOrigen, other.estadoOrigen) ||
            !Objects.equals(this.estadoDestino, other.estadoDestino) ||
            !Objects.equals(this.municipioOrigen, other.municipioOrigen) ||
            !Objects.equals(this.municipioDestino, other.municipioDestino) ||
            !Objects.equals(this.tipoTransportacion, other.tipoTransportacion)
            // !Objects.equals(this.detalleDelito, other.detalleDelito)
            ) ? false : true;
    }
}