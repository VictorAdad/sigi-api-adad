package models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;
import play.data.validation.Constraints;

@Entity
public class ViolenciaGenero extends BaseModel implements BaseModel.Catalogo{

    @Column(columnDefinition="Varchar2(50 Char)")
    public String delincuenciaOrganizada;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String violenciaGenero;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String victimaTrata;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String victimaAcoso;

    @Column(columnDefinition="Varchar2(200 Char)")
    public String ordenProteccion;


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.delincuenciaOrganizada);
        hash = 59 * hash + Objects.hashCode(this.violenciaGenero);
        hash = 59 * hash + Objects.hashCode(this.victimaTrata);
        hash = 59 * hash + Objects.hashCode(this.victimaAcoso);
        hash = 59 * hash + Objects.hashCode(this.ordenProteccion);
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
        final ViolenciaGenero other = (ViolenciaGenero) obj;
        return (
            !Objects.equals(this.delincuenciaOrganizada, other.delincuenciaOrganizada) ||
            !Objects.equals(this.violenciaGenero, other.violenciaGenero) ||
            !Objects.equals(this.victimaTrata, other.victimaTrata) ||
            !Objects.equals(this.victimaAcoso, other.victimaAcoso) ||
            !Objects.equals(this.ordenProteccion, other.ordenProteccion)
            ) ? false : true;
    }
}