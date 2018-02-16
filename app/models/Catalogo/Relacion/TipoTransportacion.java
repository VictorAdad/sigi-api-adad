package models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;
import play.data.validation.Constraints;

@Entity
public class TipoTransportacion extends BaseModel implements BaseModel.Catalogo{

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(50 Char)")
    public String tipo;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(50 Char)")
    public String transportacion;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.tipo);
        hash = 59 * hash + Objects.hashCode(this.transportacion);
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
        final TipoTransportacion other = (TipoTransportacion) obj;
        return (
            !Objects.equals(this.tipo, other.tipo) ||
            !Objects.equals(this.transportacion, other.transportacion)
            ) ? false : true;
    }
}