package models;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Estado extends BaseName implements BaseName.Catalogo{

    @ManyToOne
	public Pais pais;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 99 * hash + Objects.hashCode(this.pais);
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

        final Estado other = (Estado) obj;
        return (
            !Objects.equals(this.pais, other.pais)
            ) ? false : true;
    }
}
