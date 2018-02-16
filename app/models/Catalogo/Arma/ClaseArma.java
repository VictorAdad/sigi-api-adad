package models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;

import play.data.validation.Constraints;

@Entity
public class ClaseArma extends BaseModel implements BaseModel.Catalogo{

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(50 Char)")
    public String claseArma;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String tipo;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String subtipo;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.claseArma);
        hash = 29 * hash + Objects.hashCode(this.tipo);
        hash = 29 * hash + Objects.hashCode(this.subtipo);
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
        final ClaseArma other = (ClaseArma) obj;

        return (
            !Objects.equals(this.claseArma, other.claseArma) ||
            !Objects.equals(this.tipo, other.tipo)   ||
            !Objects.equals(this.subtipo, other.subtipo)
        ) ? false : true;
    }
}
