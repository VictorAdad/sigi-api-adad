package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.ebean.Finder;
import io.ebean.Model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class TipoRelacionPersona extends BaseModel {

    public String tipo;

    @JsonIgnore
    @ManyToOne
    public Caso caso;

    @ManyToOne
    public PersonaCaso personaCaso;

    @OneToOne
    public DetalleDelito detalleDelito;

    @ManyToOne
    public PersonaCaso personaCasoRelacionada;

    @OneToMany
    public List<LugarTipoRelacionPersona> lugarTipoRelacionPersona;

    @OneToMany
    public List<ArmaTipoRelacionPersona> armaTipoRelacionPersona;

    @OneToMany
    public List<VehiculoTipoRelacionPersona> vehiculoTipoRelacionPersona;

    // public HashMap<String, Object> getPersonaCaso(){
    //     HashMap<String, Object> hash = new HashMap<String, Object>();
    //     if(this.personaCaso != null){
    //         hash.put("id", this.personaCaso.id);
    //     }
    //     return hash;
    // }

    // public HashMap<String, Object> getPersonaCasoRelacionada(){
    //     HashMap<String, Object> hash = new HashMap<String, Object>();
    //     if(this.personaCasoRelacionada != null){
    //         hash.put("id", this.personaCasoRelacionada.id);
    //     }
    //     return hash;
    // }

    public static final Finder<Long, Caso> find = new Finder<>(Caso.class);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TipoRelacionPersona)) return false;

        TipoRelacionPersona that = (TipoRelacionPersona) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (caso != null ? !caso.equals(that.caso) : that.caso != null) return false;
        if (personaCaso != null ? !personaCaso.equals(that.personaCaso) : that.personaCaso != null) return false;
        if (detalleDelito != null ? !detalleDelito.equals(that.detalleDelito) : that.detalleDelito != null)
            return false;
        return personaCasoRelacionada != null ? personaCasoRelacionada.equals(that.personaCasoRelacionada) : that.personaCasoRelacionada == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (caso != null ? caso.hashCode() : 0);
        result = 31 * result + (personaCaso != null ? personaCaso.hashCode() : 0);
        result = 31 * result + (detalleDelito != null ? detalleDelito.hashCode() : 0);
        result = 31 * result + (personaCasoRelacionada != null ? personaCasoRelacionada.hashCode() : 0);
        return result;
    }
}