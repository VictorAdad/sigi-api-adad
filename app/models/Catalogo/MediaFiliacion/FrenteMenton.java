package models;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;
import play.data.validation.Constraints;

@Entity
public class FrenteMenton extends BaseModel implements BaseModel.Catalogo{

    @Column(columnDefinition="Varchar2(30 Char)")
    public String alturaFrente;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String inclinacionFrente;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String anchoFrente;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String tipoMenton;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String formaMenton;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String inclinacionMenton;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 75 * hash + Objects.hashCode(this.alturaFrente);
        hash = 75 * hash + Objects.hashCode(this.inclinacionFrente);
        hash = 75 * hash + Objects.hashCode(this.anchoFrente);
        hash = 75 * hash + Objects.hashCode(this.tipoMenton);
        hash = 75 * hash + Objects.hashCode(this.formaMenton);
        hash = 75 * hash + Objects.hashCode(this.inclinacionMenton);
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

        final FrenteMenton other =  (FrenteMenton) obj;
        return (
            !Objects.equals(this.alturaFrente, other.alturaFrente) ||
            !Objects.equals(this.inclinacionFrente, other.inclinacionFrente) ||
            !Objects.equals(this.anchoFrente, other.anchoFrente) ||
            !Objects.equals(this.tipoMenton, other.tipoMenton) ||
            !Objects.equals(this.formaMenton, other.formaMenton) ||
            !Objects.equals(this.inclinacionMenton, other.inclinacionMenton)
            ) ? false : true;

    }
}