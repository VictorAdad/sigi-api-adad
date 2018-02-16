package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class EfectoViolencia extends BaseModel {

    @ManyToOne
    public EfectoDetalle efectoDetalle;

    @JsonIgnore
    @ManyToOne
    public DetalleDelito detalleDelito;


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.efectoDetalle);
		hash = 29 * hash + Objects.hashCode(this.detalleDelito);

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
        final EfectoViolencia other = (EfectoViolencia) obj;

        return (
            !Objects.equals(this.efectoDetalle, other.efectoDetalle) ||
			!Objects.equals(this.detalleDelito, other.detalleDelito)
        ) ? false : true;
    }
}