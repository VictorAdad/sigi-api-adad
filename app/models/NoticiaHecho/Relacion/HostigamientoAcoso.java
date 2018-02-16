package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.data.validation.Constraints;

@Entity
public class HostigamientoAcoso extends BaseModel {

    @Constraints.Required(groups = SaveStep.class)
    @ManyToOne
    public ModalidadAmbito modalidadAmbito;

    @Constraints.Required(groups = SaveStep.class)
    @ManyToOne
    public ConductaDetalle conductaDetalle;

    @Constraints.Required(groups = SaveStep.class)
    @ManyToOne
    public Persona testigo;

    // @JsonIgnore
    // @ManyToOne
    // public DetalleDelito detalleDelito;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 65 * hash + Objects.hashCode(this.modalidadAmbito);
        hash = 65 * hash + Objects.hashCode(this.conductaDetalle);
        hash = 65 * hash + Objects.hashCode(this.testigo);
        // hash = 65 * hash + Objects.hashCode(this.detalleDelito);
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
        final HostigamientoAcoso other = (HostigamientoAcoso) obj;
        return (
            !Objects.equals(this.modalidadAmbito, other.modalidadAmbito) ||
            !Objects.equals(this.conductaDetalle, other.conductaDetalle) ||
            !Objects.equals(this.testigo, other.testigo)
            // !Objects.equals(this.detalleDelito, other.detalleDelito)
            ) ? false : true;
    }
}