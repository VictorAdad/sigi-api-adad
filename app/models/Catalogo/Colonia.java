package models;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Colonia extends BaseName implements BaseName.Catalogo{

    public String cp;

    @ManyToOne
	public Municipio municipio;

    @ManyToOne
    public Localidad localidad;

    // public Municipio getMunicipio(){
    //     Map<String,Long> municipio = new HashMap<>();
    //     this.municipio.nombre =null;
    //     if (municipio != null)
    //         municipio.put("id",this.municipio.id);
    //     return municipio;
    // }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 99 * hash + Objects.hashCode(this.municipio);
        hash = 99 * hash + Objects.hashCode(this.localidad);
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

        final Colonia other = (Colonia) obj;
        return (
            !Objects.equals(this.municipio, other.municipio) ||
            !Objects.equals(this.localidad, other.localidad) 
            ) ? false : true;
    }
}
