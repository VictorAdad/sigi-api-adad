package models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;

import play.data.validation.Constraints;

@Entity
public class DetalleLugar extends BaseModel implements BaseModel.Catalogo{

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(40 Char)")
    public String tipoLugar;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(50 Char)")
    public String tipoZona;

    @Column(columnDefinition="Varchar2(15 Char)")
    public String dia;

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 70 * hash + Objects.hashCode(this.tipoLugar);
        hash = 70 * hash + Objects.hashCode(this.tipoZona);
        hash = 70 * hash + Objects.hashCode(this.dia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BaseModel) {
            final DetalleLugar other = (DetalleLugar) obj;
            if (this == obj && obj.getClass() == getClass()) {
                return (
                    super.equals(this) &&
                    (
                        Objects.equals(this.tipoLugar, other.tipoLugar) ||
                        Objects.equals(this.tipoZona, other.tipoZona) ||
                        Objects.equals(this.dia, other.dia)
                    )
                );
            }
        }
        return false;
    }

}
