package models;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import play.data.validation.Constraints;

@Entity
public class Cabello extends BaseModel implements BaseModel.Catalogo{

    @Column(columnDefinition="Varchar2(30 Char)")
    public String cantidad;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String color;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String forma;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String calvicie;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String implantacion;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.cantidad);
        hash = 89 * hash + Objects.hashCode(this.color);
        hash = 89 * hash + Objects.hashCode(this.forma);
        hash = 89 * hash + Objects.hashCode(this.calvicie);
        hash = 89 * hash + Objects.hashCode(this.implantacion);
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

        final Cabello other =  (Cabello) obj;
        return (
            !Objects.equals(this.cantidad, other.cantidad) ||
            !Objects.equals(this.color, other.color) ||
            !Objects.equals(this.forma, other.forma) ||
            !Objects.equals(this.calvicie, other.calvicie) ||
            !Objects.equals(this.implantacion, other.implantacion)
            ) ? false : true;

    }
}