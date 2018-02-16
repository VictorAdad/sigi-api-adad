package models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;
import play.data.validation.Constraints;

@Entity
public class MarcaSubMarca extends BaseModel implements BaseModel.Catalogo{

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(50 Char)")
    public String marca;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String tipoVehiculo;
    
    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(50 Char)")
    public String submarca;

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 70 * hash + Objects.hashCode(this.marca);
        hash = 70 * hash + Objects.hashCode(this.tipoVehiculo);
        hash = 70 * hash + Objects.hashCode(this.submarca);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BaseModel) {
            final MarcaSubMarca other = (MarcaSubMarca) obj;
            if (this == obj && obj.getClass() == getClass()) {
                return (
                    super.equals(this) &&
                    (
                        Objects.equals(this.marca, other.marca) ||
                        Objects.equals(this.tipoVehiculo, other.tipoVehiculo) ||
                        Objects.equals(this.submarca, other.submarca)
                    )
                );
            }
        }
        return false;
    }
}
