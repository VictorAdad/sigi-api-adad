package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import core.util.App;
import io.ebean.Finder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import play.Logger;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import play.data.format.Formats;
import play.data.validation.Constraints;

@Entity
public class Lugar extends BaseModel {

    @ManyToOne
    @Constraints.Required(groups = SaveStep.class)
    public DetalleLugar detalleLugar;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(500 Char)")
    public String calle;

    @Column(columnDefinition="Varchar2(15 Char)")
    public String noInterior;

    @Column(columnDefinition="Varchar2(15 Char)")
    public String noExterior;

    @Constraints.Required(groups = SaveStep.class)
    @Lob
    @Column(columnDefinition = "CLOB")
    public String referencias;    

    @ManyToOne
    @Constraints.Required(groups = SaveStep.class)
    public Pais pais;

    @ManyToOne
    // @Constraints.Required(groups = SaveStep.class)
    public Estado estado;

    @ManyToOne
    // @Constraints.Required(groups = SaveStep.class)
    public Municipio municipio;

    @ManyToOne
    // @Constraints.Required(groups = SaveStep.class)
    public Colonia colonia;

    @Column(columnDefinition="Varchar2(5 Char)")
    public String cp;


    @Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss.sss")
    @Constraints.Required(groups = SaveStep.class)
    public Date fecha;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String descripcionLugar;  

    @Lob
    @Column(columnDefinition = "CLOB")
    public String referenciasGeograficas;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String notas;

    @ManyToOne
    public Localidad localidad;

    @Column(columnDefinition="Varchar2(100 CHAR)")
    public String localidadOtro;

    @JsonIgnore
    @ManyToOne
    @Constraints.Required(groups = SaveStep.class)
    @JoinColumn(name="nic_id")
    public Caso caso;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String estadoOtro;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String municipioOtro;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String coloniaOtro;

    @Column(precision = 13, scale = 8)
    public BigDecimal longitud;

    @Column(precision = 13, scale = 8)
    public BigDecimal latitud;

    // Finder para uso de la super class y sus accesos mas sencillos
    public static final Finder<Long, Lugar> find = new Finder<>(Lugar.class);

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.detalleLugar);
        hash = 73 * hash + Objects.hashCode(this.calle);
        hash = 73 * hash + Objects.hashCode(this.noInterior);
        hash = 73 * hash + Objects.hashCode(this.noExterior);
        hash = 73 * hash + Objects.hashCode(this.referencias);
        hash = 73 * hash + Objects.hashCode(this.pais);
        hash = 73 * hash + Objects.hashCode(this.estado);
        hash = 73 * hash + Objects.hashCode(this.municipio);
        hash = 73 * hash + Objects.hashCode(this.colonia);
        hash = 73 * hash + Objects.hashCode(this.cp);
        hash = 73 * hash + Objects.hashCode(this.fecha);
        hash = 73 * hash + Objects.hashCode(this.descripcionLugar);
        hash = 73 * hash + Objects.hashCode(this.referenciasGeograficas);
        hash = 73 * hash + Objects.hashCode(this.notas);
        hash = 73 * hash + Objects.hashCode(this.caso);
        hash = 73 * hash + Objects.hashCode(this.estadoOtro);
        hash = 73 * hash + Objects.hashCode(this.municipioOtro);
        hash = 73 * hash + Objects.hashCode(this.coloniaOtro);
        hash = 73 * hash + Objects.hashCode(this.localidad);
        hash = 73 * hash + Objects.hashCode(this.localidadOtro);
        hash = 73 * hash + Objects.hashCode(this.longitud);
        hash = 73 * hash + Objects.hashCode(this.latitud);
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
        final Lugar other = (Lugar) obj;
        return (
            !Objects.equals(this.detalleLugar, other.detalleLugar) ||
            !Objects.equals(this.calle, other.calle) ||
            !Objects.equals(this.noInterior, other.noInterior) ||
            !Objects.equals(this.noExterior, other.noExterior) ||
            !Objects.equals(this.referencias, other.referencias) ||
            !Objects.equals(this.pais, other.pais) ||
            !Objects.equals(this.estado, other.estado) ||
            !Objects.equals(this.municipio, other.municipio) ||
            !Objects.equals(this.colonia, other.colonia) ||
            !Objects.equals(this.cp, other.cp) ||
            !Objects.equals(this.fecha, other.fecha) ||
            !Objects.equals(this.descripcionLugar, other.descripcionLugar) ||
            !Objects.equals(this.referenciasGeograficas, other.referenciasGeograficas) ||
            !Objects.equals(this.notas, other.notas) ||
            !Objects.equals(this.caso, other.caso) ||
            !Objects.equals(this.estadoOtro, other.estadoOtro) ||
            !Objects.equals(this.municipioOtro, other.municipioOtro) ||
            !Objects.equals(this.coloniaOtro, other.coloniaOtro) ||
            !Objects.equals(this.localidad, other.localidad) ||
            !Objects.equals(this.localidadOtro, other.localidadOtro) ||
            !Objects.equals(this.longitud, other.longitud) ||
            !Objects.equals(this.latitud, other.latitud)
            ) ? false : true;
    }

    public static String getLugares(Long id, String detalleLugar){
          String sLugares="";
        List <Lugar> lugares = Lugar.find.query().where()
            .eq("detalleLugar.tipoLugar",detalleLugar)
            .eq("caso.id",id)
            .findList();
        for (Lugar lugar : lugares) {
            if (lugar.calle != null) {
                sLugares+="Calle "+lugar.calle+" ";
            }
            if (lugar.noExterior != null){
                sLugares+="No. Exterior "+lugar.noExterior+" ";
            }
            if (lugar.noInterior != null){
                sLugares+="No. Interior "+lugar.noInterior+" ";
            }
            if (lugar.colonia != null) {
                sLugares+="Colonia "+lugar.colonia.nombre+" ";
            }else if(lugar.coloniaOtro != null){
                sLugares+="Colonia "+lugar.coloniaOtro+" ";
            }
            if (lugar.cp != null) {
                sLugares+="C.P. "+lugar.cp+" ";
            }
            if (lugar.municipio != null) {
                sLugares+="Localidad/Ciudad "+lugar.municipio.nombre+", ";
            } else if(lugar.municipioOtro != null){
                sLugares+="Localidad/Ciudad "+lugar.municipioOtro+", ";
            }
            if (lugar.estado != null) {
                sLugares+=lugar.estado.nombre+" ";
            } else if(lugar.estadoOtro != null){ 
                sLugares+=lugar.estadoOtro+" ";
            }
            if (lugar.pais != null) {
                sLugares+=lugar.pais.nombre+", ";
            }
        }
        if (sLugares.length()>0){
            sLugares=sLugares.substring(0, sLugares.length()-2);
        }
        return sLugares;  
    }
}
