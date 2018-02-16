package models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;
import play.data.validation.Constraints;

@Entity
public class MotivoColorClase extends BaseModel implements BaseModel.Catalogo{

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(30 Char)")
    public String motivoRegistro;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String clase;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(30 Char)")
    public String color;

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 70 * hash + Objects.hashCode(this.motivoRegistro);
        hash = 70 * hash + Objects.hashCode(this.clase);
        hash = 70 * hash + Objects.hashCode(this.color);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BaseModel) {
            final MotivoColorClase other = (MotivoColorClase) obj;
            if (this == obj && obj.getClass() == getClass()) {
                return (
                    super.equals(this) &&
                    (
                        Objects.equals(this.motivoRegistro, other.motivoRegistro) ||
                        Objects.equals(this.clase, other.clase) ||
                        Objects.equals(this.color, other.color)
                    )
                );
            }
        }
        return false;
    }
}
