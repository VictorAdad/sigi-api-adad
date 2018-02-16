package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;
import java.util.List;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import play.data.format.Formats;
import play.data.validation.Constraints;
import javax.persistence.Lob;
import io.ebean.Finder;

@Entity
public class Predenuncia extends BaseHerencia {

    @Column(columnDefinition="Varchar2(20 Char)")
    public String tipo;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String noFolioConstancia;

    @Column(columnDefinition="NUMBER(1,0) default 0")
    public boolean hablaEspaniol;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String lenguaIdioma;

    @Column(columnDefinition="Varchar2(150 Char)")
    public String nombreInterprete;

    @Column(columnDefinition="NUMBER(1,0) default 0")
    public boolean compredioDerechos;

    @Column(columnDefinition="NUMBER(1,0) default 0")
    public boolean proporcionoCopia;

    @Column(columnDefinition="Varchar2(200 Char)")
    public String calidadPersona;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String lugarHechos;   

    @Lob
    @Column(columnDefinition = "CLOB")
    public String hechosNarrados;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String conclusion;    

    @Column(columnDefinition="NUMBER(1,0) default 0")
    public boolean canalizacion;

    @Column(columnDefinition="Varchar2(200 Char)")
    public String institucion;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String motivoCanalizacion; 

    @Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss.sss")
    public Date fechaCanalizacion;

    @Column(columnDefinition="Varchar2(200 Char)")
    public String domicilioCausante;

    @Column(columnDefinition="Varchar2(150 Char)")
    public String nombreCausante;

    @Column(columnDefinition="Varchar2(150 Char)")
    public String quienRegistro;

    @Column(columnDefinition="Varchar2(20 Char)")
    public String noTelefonico;

    @Column(columnDefinition="Varchar2(200 Char)")
    public String lugarLlamada;

    @Lob
    @Column(columnDefinition = "CLOB")
    
    public String comunicado;

    public String horaConclusionLlamada;

    @Column(columnDefinition="Varchar2(20 Char)")
    public String duracionLlamada;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String observaciones; 

    @ManyToOne
    public TipoPersona tipoPersona;

    @ManyToOne
    public TipoLinea tipoLinea;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String tipoPersonaHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String calidadPersonaHeredar;  

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String lugarHechosHeredar;    

    @JsonIgnore
    @ManyToOne
    public Caso caso;

    @OneToMany(mappedBy = "predenuncia", targetEntity = DocPredenuncia.class)
    public List <DocPredenuncia> documentos;

    public static final Finder<Long, Predenuncia> find = new Finder<>(Predenuncia.class);

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 834 * hash + Objects.hashCode(this.tipo);
        hash = 834 * hash + Objects.hashCode(this.noFolioConstancia);
        hash = 834 * hash + Objects.hashCode(this.hablaEspaniol);
        hash = 834 * hash + Objects.hashCode(this.lenguaIdioma);
        hash = 834 * hash + Objects.hashCode(this.nombreInterprete);
        hash = 834 * hash + Objects.hashCode(this.compredioDerechos);
        hash = 834 * hash + Objects.hashCode(this.proporcionoCopia);
        hash = 834 * hash + Objects.hashCode(this.calidadPersona);
        hash = 834 * hash + Objects.hashCode(this.lugarHechos);
        hash = 834 * hash + Objects.hashCode(this.hechosNarrados);
        hash = 834 * hash + Objects.hashCode(this.conclusion);
        hash = 834 * hash + Objects.hashCode(this.canalizacion);
        hash = 834 * hash + Objects.hashCode(this.institucion);
        hash = 834 * hash + Objects.hashCode(this.motivoCanalizacion);
        hash = 834 * hash + Objects.hashCode(this.fechaCanalizacion);
        hash = 834 * hash + Objects.hashCode(this.domicilioCausante);
        hash = 834 * hash + Objects.hashCode(this.nombreCausante);
        hash = 834 * hash + Objects.hashCode(this.quienRegistro);
        hash = 834 * hash + Objects.hashCode(this.noTelefonico);
        hash = 834 * hash + Objects.hashCode(this.lugarLlamada);
        hash = 834 * hash + Objects.hashCode(this.comunicado);
        hash = 834 * hash + Objects.hashCode(this.horaConclusionLlamada);
        hash = 834 * hash + Objects.hashCode(this.duracionLlamada);
        hash = 834 * hash + Objects.hashCode(this.observaciones);
        hash = 834 * hash + Objects.hashCode(this.tipoPersona);
        hash = 834 * hash + Objects.hashCode(this.tipoLinea);
        hash = 834 * hash + Objects.hashCode(this.tipoPersonaHeredar);
        hash = 834 * hash + Objects.hashCode(this.calidadPersonaHeredar);
        hash = 834 * hash + Objects.hashCode(this.lugarHechosHeredar);
        hash = 834 * hash + Objects.hashCode(this.caso);
        hash = 834 * hash + Objects.hashCode(this.documentos);
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
        final Predenuncia other = (Predenuncia) obj;
        return (
            !Objects.equals(this.tipo, other.tipo) ||
            !Objects.equals(this.noFolioConstancia, other.noFolioConstancia) ||
            !Objects.equals(this.hablaEspaniol, other.hablaEspaniol) ||
            !Objects.equals(this.lenguaIdioma, other.lenguaIdioma) ||
            !Objects.equals(this.nombreInterprete, other.nombreInterprete) ||
            !Objects.equals(this.compredioDerechos, other.compredioDerechos) ||
            !Objects.equals(this.proporcionoCopia, other.proporcionoCopia) ||
            !Objects.equals(this.calidadPersona, other.calidadPersona) ||
            !Objects.equals(this.lugarHechos, other.lugarHechos) ||
            !Objects.equals(this.hechosNarrados, other.hechosNarrados) ||
            !Objects.equals(this.conclusion, other.conclusion) ||
            !Objects.equals(this.canalizacion, other.canalizacion) ||
            !Objects.equals(this.institucion, other.institucion) ||
            !Objects.equals(this.motivoCanalizacion, other.motivoCanalizacion) ||
            !Objects.equals(this.fechaCanalizacion, other.fechaCanalizacion) ||
            !Objects.equals(this.domicilioCausante, other.domicilioCausante) ||
            !Objects.equals(this.nombreCausante, other.nombreCausante) ||
            !Objects.equals(this.quienRegistro, other.quienRegistro) ||
            !Objects.equals(this.noTelefonico, other.noTelefonico) ||
            !Objects.equals(this.lugarLlamada, other.lugarLlamada) ||
            !Objects.equals(this.comunicado, other.comunicado) ||
            !Objects.equals(this.horaConclusionLlamada, other.horaConclusionLlamada) ||
            !Objects.equals(this.duracionLlamada, other.duracionLlamada) ||
            !Objects.equals(this.observaciones, other.observaciones) ||
            !Objects.equals(this.tipoPersona, other.tipoPersona) ||
            !Objects.equals(this.tipoLinea, other.tipoLinea) ||
            !Objects.equals(this.tipoPersonaHeredar, other.tipoPersonaHeredar) ||
            !Objects.equals(this.calidadPersonaHeredar, other.calidadPersonaHeredar) ||
            !Objects.equals(this.lugarHechosHeredar, other.lugarHechosHeredar) ||
            !Objects.equals(this.caso, other.caso) ||
            !Objects.equals(this.documentos, other.documentos)
            ) ? false : true;
    }
}