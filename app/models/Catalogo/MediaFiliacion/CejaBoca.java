package models;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import play.data.validation.Constraints;

@Entity
public class CejaBoca extends BaseModel implements BaseModel.Catalogo{

    @Column(columnDefinition="Varchar2(30 Char)")
    public String direccionCeja;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String implantacionCeja;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String formaCeja;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String tamanioCeja;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String tamanioBoca;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String comisurasBoca;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 32 * hash + Objects.hashCode(this.direccionCeja);
        hash = 32 * hash + Objects.hashCode(this.implantacionCeja);
        hash = 32 * hash + Objects.hashCode(this.formaCeja);
        hash = 32 * hash + Objects.hashCode(this.tamanioCeja);
        hash = 32 * hash + Objects.hashCode(this.tamanioBoca);
        hash = 32 * hash + Objects.hashCode(this.comisurasBoca);
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

        final CejaBoca other =  (CejaBoca) obj;
        return (
            !Objects.equals(this.direccionCeja, other.direccionCeja) ||
            !Objects.equals(this.implantacionCeja, other.implantacionCeja) ||
            !Objects.equals(this.formaCeja, other.formaCeja) ||
            !Objects.equals(this.tamanioCeja, other.tamanioCeja) ||
            !Objects.equals(this.tamanioBoca, other.tamanioBoca) ||
            !Objects.equals(this.comisurasBoca, other.comisurasBoca)
            ) ? false : true;

    }
}