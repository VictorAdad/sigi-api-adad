package models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;
import play.data.validation.Constraints;

@Entity
public class CalibreMecanismo extends BaseModel implements BaseModel.Catalogo{

    @Column(columnDefinition="Varchar2(40 Char)")
    public String mecanismo;

    @Column(columnDefinition="Varchar2(40 Char)")
    public String calibre;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 712 * hash + Objects.hashCode(this.mecanismo);
        hash = 712 * hash + Objects.hashCode(this.calibre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;

     	final CalibreMecanismo other = (CalibreMecanismo) obj;

     	if (this == obj && obj.getClass() == getClass()) {
     	    return (
     	    	Objects.equals(this.mecanismo, other.mecanismo) ||
     	    	Objects.equals(this.calibre, other.calibre)
     	    );
     	}
        return false;
    }
}
