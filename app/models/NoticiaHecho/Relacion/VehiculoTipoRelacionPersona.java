package models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import io.ebean.Model;

@Entity
@Table(name="Vehiculo_Tipo_Relacion")
public class VehiculoTipoRelacionPersona extends BaseModel {

    @ManyToOne
    public Vehiculo vehiculo;
    
    @JsonIgnore
    @ManyToOne
    public TipoRelacionPersona tipoRelacionPersona;
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public TipoRelacionPersona getTipoRelacionPersona() {
        return tipoRelacionPersona;
    }

    public void setTipoRelacionPersona(TipoRelacionPersona tipoRelacionPersona) {
        this.tipoRelacionPersona = tipoRelacionPersona;
    }

}