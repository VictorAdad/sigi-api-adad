package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import io.ebean.Model;

@Entity
@Table(name="Arma_Tipo_Relacion")
public class ArmaTipoRelacionPersona extends BaseModel {

    @ManyToOne
    public Arma arma;

    @JsonIgnore
    @ManyToOne
    public TipoRelacionPersona tipoRelacionPersona;

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    public TipoRelacionPersona getTipoRelacionPersona() {
        return tipoRelacionPersona;
    }

    public void setTipoRelacionPersona(TipoRelacionPersona tipoRelacionPersona) {
        this.tipoRelacionPersona = tipoRelacionPersona;
    }

}