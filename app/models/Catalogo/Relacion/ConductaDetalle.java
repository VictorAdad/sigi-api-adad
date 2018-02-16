package models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;
import play.data.validation.Constraints;

@Entity
public class ConductaDetalle extends BaseModel implements BaseModel.Catalogo{

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(50 Char)")
    public String conducta;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(50 Char)")
    public String detalle;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 45 * hash + Objects.hashCode(this.conducta);
        hash = 45 * hash + Objects.hashCode(this.detalle);
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
        final ConductaDetalle other = (ConductaDetalle) obj;
        return (
            !Objects.equals(this.conducta, other.conducta) ||
            !Objects.equals(this.detalle, other.detalle)
            ) ? false : true;
    }
}