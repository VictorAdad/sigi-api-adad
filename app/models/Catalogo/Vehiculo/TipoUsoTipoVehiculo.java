package models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;
import play.data.validation.Constraints;

@Entity
public class TipoUsoTipoVehiculo extends BaseModel implements BaseModel.Catalogo{

    @Column(columnDefinition="Varchar2(50 Char)")
    public String tipoUso;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String datosTomadosDe;

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 70 * hash + Objects.hashCode(this.tipoUso);
        hash = 70 * hash + Objects.hashCode(this.datosTomadosDe);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BaseModel) {
            final TipoUsoTipoVehiculo other = (TipoUsoTipoVehiculo) obj;
            if (this == obj && obj.getClass() == getClass()) {
                return (
                    super.equals(this) &&
                    (
                        Objects.equals(this.tipoUso, other.tipoUso) ||
                        Objects.equals(this.datosTomadosDe, other.datosTomadosDe)
                    )
                );
            }
        }
        return false;
    }
}
