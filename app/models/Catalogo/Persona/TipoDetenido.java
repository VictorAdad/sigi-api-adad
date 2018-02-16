package models;

import java.util.Objects;
import javax.persistence.Entity;
import play.data.validation.Constraints;
import javax.persistence.Column;
@Entity
public class TipoDetenido extends BaseModel implements BaseModel.Catalogo{

	@Column(columnDefinition="Varchar2(50 Char)")
	public String tipoDetencion;

	@Column(columnDefinition="Varchar2(50 Char)")
	public String tipoReincidencia;

	@Column(columnDefinition="Varchar2(100 Char)")
	public String cereso;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 423 * hash + Objects.hashCode(this.tipoDetencion);
        hash = 423 * hash + Objects.hashCode(this.tipoReincidencia);
        hash = 423 * hash + Objects.hashCode(this.cereso);
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
        final TipoDetenido other = (TipoDetenido) obj;

        return (
            !Objects.equals(this.tipoDetencion, other.tipoDetencion) ||
            !Objects.equals(this.tipoReincidencia, other.tipoReincidencia)   ||
            !Objects.equals(this.cereso, other.cereso)
        ) ? false : true;
    }
}
