package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import io.ebean.Model;

@Entity
@Table(name="Lugar_Tipo_Relacion")
public class LugarTipoRelacionPersona extends BaseModel {

    @ManyToOne
    public Lugar lugar;

    @JsonIgnore
    @ManyToOne
    public TipoRelacionPersona tipoRelacionPersona;

    public LugarTipoRelacionPersona(TipoRelacionPersona tipoRelacionPersona) {
        this.tipoRelacionPersona = tipoRelacionPersona;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public TipoRelacionPersona getTipoRelacionPersona() {
        return tipoRelacionPersona;
    }

    public void setTipoRelacionPersona(TipoRelacionPersona tipoRelacionPersona) {
        this.tipoRelacionPersona = tipoRelacionPersona;
    }
}
