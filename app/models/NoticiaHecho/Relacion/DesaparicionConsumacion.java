package models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;
import play.data.validation.Constraints;

@Entity
public class DesaparicionConsumacion extends BaseModel implements BaseModel.Catalogo{

    @Column(columnDefinition="Varchar2(50 Char)")
    public String consumacion;

    @Column(columnDefinition="Varchar2(40 Char)")
    public String tipoDesaparicion;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String relacionAcusado;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.consumacion);
        hash = 59 * hash + Objects.hashCode(this.tipoDesaparicion);
        hash = 59 * hash + Objects.hashCode(this.relacionAcusado);
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
        final DesaparicionConsumacion other = (DesaparicionConsumacion) obj;
        return (
            !Objects.equals(this.consumacion, other.consumacion) ||
            !Objects.equals(this.tipoDesaparicion, other.tipoDesaparicion) ||
            !Objects.equals(this.relacionAcusado, other.relacionAcusado)
            ) ? false : true;
    }
}