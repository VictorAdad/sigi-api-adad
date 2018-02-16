package models;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Municipio extends BaseName implements BaseName.Catalogo{

    @ManyToOne
	public Estado estado;
    
    // public Map<String,Long> getEstado(){
    //     Map<String,Long> estado = new HashMap<>();
    //     if (estado != null) 
    //         estado.put("id",this.estado.id);
    //     return estado;
    // }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 99 * hash + Objects.hashCode(this.estado);
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

        final Municipio other = (Municipio) obj;
        return (
            !Objects.equals(this.estado, other.estado)
            ) ? false : true;
    }
}
