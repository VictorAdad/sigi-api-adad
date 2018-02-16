package models;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import play.data.validation.Constraints;

@Entity
public class ComplexionPielSangre extends BaseModel implements BaseModel.Catalogo{

    @Column(columnDefinition="Varchar2(30 Char)")
    public String tipoComplexion;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String colorPiel;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String tipoSangre;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String factorRHSangre;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 75 * hash + Objects.hashCode(this.tipoComplexion);
        hash = 75 * hash + Objects.hashCode(this.colorPiel);
        hash = 75 * hash + Objects.hashCode(this.tipoSangre);
        hash = 75 * hash + Objects.hashCode(this.factorRHSangre);
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

        final ComplexionPielSangre other =  (ComplexionPielSangre) obj;
        return (
            !Objects.equals(this.tipoComplexion, other.tipoComplexion) ||
            !Objects.equals(this.colorPiel, other.colorPiel) ||
            !Objects.equals(this.tipoSangre, other.tipoSangre) ||
            !Objects.equals(this.factorRHSangre, other.factorRHSangre)
            ) ? false : true;

    }
}