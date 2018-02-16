package models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;

import play.data.validation.Constraints;

@Entity
public class HipotesisAmbito extends BaseModel implements BaseModel.Catalogo {

    @Column(columnDefinition="Varchar2(2000 Char)")
    public String hipotesisSobreseimiento;

    @Column(columnDefinition="Varchar2(2000 Char)")
    public String ambitoHechos;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 44 * hash + Objects.hashCode(this.hipotesisSobreseimiento);
        hash = 44 * hash + Objects.hashCode(this.ambitoHechos);
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
        final HipotesisAmbito other = (HipotesisAmbito) obj;

        return (
            !Objects.equals(this.hipotesisSobreseimiento, other.hipotesisSobreseimiento)||
            !Objects.equals(this.ambitoHechos, other.ambitoHechos)
        ) ? false : true;
    }
}