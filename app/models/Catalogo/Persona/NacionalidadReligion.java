package models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;
import play.data.validation.Constraints;

@Entity
public class NacionalidadReligion extends BaseModel implements BaseModel.Catalogo{

    @Column(columnDefinition="Varchar2(50 Char)")
    public String religion;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String nacionalidad;

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 82 * hash + Objects.hashCode(this.religion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NameBaseModel) {
            final NacionalidadReligion other = (NacionalidadReligion) obj;
            if (this == obj && obj.getClass() == getClass()) {
                return (
                    super.equals(this) &&
                    (
                        Objects.equals(this.religion, other.religion)
                    )
                );
            }
        }
        return false;
    }
}
