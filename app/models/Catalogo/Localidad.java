package models;

import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;
import java.sql.Timestamp;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import play.data.validation.Constraints;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Localidad extends BaseName implements BaseName.Catalogo{
    
    @ManyToOne
    public Municipio municipio;

    // public Map<String,Long> getMunicipio(){
    //     Map<String,Long> municipio = new HashMap<>();
    //     municipio.put("id",this.municipio.id);
    //     return municipio;
    // }

    // public void setMunicipio(Municipio municipio){
    //     this.municipio = municipio;
    // }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 99 * hash + Objects.hashCode(this.municipio);
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

        final Localidad other = (Localidad) obj;
        return (
            !Objects.equals(this.municipio, other.municipio)
            ) ? false : true;
    }
}
