package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.ebean.Finder;

import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import play.data.validation.Constraints;

@Entity
public class Delito extends ActiveBaseModel implements BaseModel.Catalogo{

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(500 Char)")
    public String nombre;

    @JsonIgnore
    @OneToMany(mappedBy = "delito", targetEntity = DelitoCaso.class)
    public List <DelitoCaso> delitosCasos;

    // Finder para uso de la super class y sus accesos mas sencillos
    public static final Finder<Long, Delito> find = new Finder<>(Delito.class);

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 63 * hash + Objects.hashCode(this.nombre);
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

        final Delito other = (Delito) obj;
        return (
            !Objects.equals(this.nombre, other.nombre) ||
            !Objects.equals(this.delitosCasos, other.delitosCasos)
            ) ? false : true;

    }
}
