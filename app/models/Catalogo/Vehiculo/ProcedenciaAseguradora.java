package models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;
import play.data.validation.Constraints;

@Entity
public class ProcedenciaAseguradora extends BaseModel implements BaseModel.Catalogo{

    @Column(columnDefinition="Varchar2(50 Char)")
    public String procedencia;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String aseguradora;

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 70 * hash + Objects.hashCode(this.procedencia);
        hash = 70 * hash + Objects.hashCode(this.aseguradora);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BaseModel) {
            final ProcedenciaAseguradora other = (ProcedenciaAseguradora) obj;
            if (this == obj && obj.getClass() == getClass()) {
                return (
                    super.equals(this) &&
                    (
                        Objects.equals(this.procedencia, other.procedencia) ||
                        Objects.equals(this.aseguradora, other.aseguradora)
                    )
                );
            }
        }
        return false;
    }
}
