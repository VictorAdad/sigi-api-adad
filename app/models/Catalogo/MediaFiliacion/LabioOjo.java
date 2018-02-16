package models;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;
import play.data.validation.Constraints;

@Entity
public class LabioOjo extends BaseModel implements BaseModel.Catalogo{

    @Column(columnDefinition="Varchar2(30 Char)")
    public String espesorLabio;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String alturaNasoLabialLabio;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String prominenciaLabio;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String colorOjo;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String formaOjo;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String tamanioOjo;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 75 * hash + Objects.hashCode(this.espesorLabio);
        hash = 75 * hash + Objects.hashCode(this.alturaNasoLabialLabio);
        hash = 75 * hash + Objects.hashCode(this.prominenciaLabio);
        hash = 75 * hash + Objects.hashCode(this.colorOjo);
        hash = 75 * hash + Objects.hashCode(this.formaOjo);
        hash = 75 * hash + Objects.hashCode(this.tamanioOjo);
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

        final LabioOjo other =  (LabioOjo) obj;
        return (
            !Objects.equals(this.espesorLabio, other.espesorLabio) ||
            !Objects.equals(this.alturaNasoLabialLabio, other.alturaNasoLabialLabio) ||
            !Objects.equals(this.prominenciaLabio, other.prominenciaLabio) ||
            !Objects.equals(this.colorOjo, other.colorOjo) ||
            !Objects.equals(this.formaOjo, other.formaOjo) ||
            !Objects.equals(this.tamanioOjo, other.tamanioOjo)
            ) ? false : true;

    }
}