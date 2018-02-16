package models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;

import play.data.validation.Constraints;

@Entity
public class ModalidadAmbito extends BaseModel implements BaseModel.Catalogo{

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(50 Char)")
    public String modalidad;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(50 Char)")
    public String ambito;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.modalidad);
        hash = 59 * hash + Objects.hashCode(this.ambito);
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
        final ModalidadAmbito other = (ModalidadAmbito) obj;
        return (
            !Objects.equals(this.modalidad, other.modalidad) ||
            !Objects.equals(this.ambito, other.ambito)
            ) ? false : true;
    }
}