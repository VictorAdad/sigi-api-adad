package models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;
import play.data.validation.Constraints;

@Entity
public class IdiomaIdentificacion extends NameBaseModel implements BaseModel.Catalogo{

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(30 Char)")
    public String hablaEspaniol;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String lenguaIndigena;

    @Column(columnDefinition="Varchar2(40 Char)")
    public String familiaLinguistica;

    @Column(columnDefinition="Varchar2(40 Char)")
    public String identificacion;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 81 * hash + Objects.hashCode(this.hablaEspaniol);
        hash = 81 * hash + Objects.hashCode(this.lenguaIndigena);
        hash = 81 * hash + Objects.hashCode(this.familiaLinguistica);
        hash = 81 * hash + Objects.hashCode(this.identificacion);
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

        final IdiomaIdentificacion other = (IdiomaIdentificacion) obj;
        return (
            !Objects.equals(this.hablaEspaniol, other.hablaEspaniol) ||
            !Objects.equals(this.lenguaIndigena, other.lenguaIndigena) ||
            !Objects.equals(this.familiaLinguistica, other.familiaLinguistica) ||
            !Objects.equals(this.identificacion, other.identificacion)
            ) ? false : true;

    }
}
