package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.ebean.Finder;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import play.data.validation.Constraints;

@Entity
public class DelitoCaso extends BaseModel {

    public static interface Started { }
    public static interface Get extends Started { }
    
    @Column(columnDefinition="NUMBER(1,0) default 0")
    public boolean principal;

    @JsonIgnore
    @ManyToOne
    @Constraints.Required(groups = SaveStep.class)
    @JoinColumn(name="nic_id")
    public Caso caso;

    @ManyToOne
    @Constraints.Required(groups = SaveStep.class)
    public Delito delito;

    // Finder para uso de la super class y sus accesos mas sencillos
    public static final Finder<Long, DelitoCaso> find = new Finder<>(DelitoCaso.class);

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.principal);
        hash = 71 * hash + Objects.hashCode(this.caso);
        hash = 71 * hash + Objects.hashCode(this.delito);
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

        final DelitoCaso other = (DelitoCaso) obj;
        return (
            !Objects.equals(this.principal, other.principal) ||
            !Objects.equals(this.caso, other.caso) ||
            !Objects.equals(this.delito, other.delito)
            ) ? false : true;

    }
}
