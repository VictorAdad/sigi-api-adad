package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.Lob;
import play.data.validation.Constraints;

@Entity
public class NoEjercicioAccionPenal extends BaseHerencia {

    @Lob
    @Column(columnDefinition = "CLOB")
    public String narracionHechos;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String datosPrueba;

    public Date fechaHechoDelictivo;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String articuloCpem;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String hipotesisCnpp;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String fraccionArticulo;

    @Column(columnDefinition="Varchar2(250 Char)")
    public String hipotesisSobreseimiento;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String nombreProcurador;

    @Column(columnDefinition="Varchar2(20 Char)")
    public String ambitoHechos;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String autoridadCompetente;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String causaIncompetencia;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String cargoAutoridadCompetente;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String observaciones;

    @ManyToOne
    public Caso caso;

    @ManyToOne
    public HipotesisAmbito hipotesisAmbito;

    @OneToMany(mappedBy = "noEjercicioAccionPenal", targetEntity = DocNoEjercicioAccion.class)
    public List <DocNoEjercicioAccion> documentos;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 44 * hash + Objects.hashCode(this.narracionHechos);
        hash = 44 * hash + Objects.hashCode(this.datosPrueba);
        hash = 44 * hash + Objects.hashCode(this.fechaHechoDelictivo);
        hash = 44 * hash + Objects.hashCode(this.articuloCpem);
        hash = 44 * hash + Objects.hashCode(this.hipotesisCnpp);
        hash = 44 * hash + Objects.hashCode(this.fraccionArticulo);
        hash = 44 * hash + Objects.hashCode(this.hipotesisSobreseimiento);
        hash = 44 * hash + Objects.hashCode(this.nombreProcurador);
        hash = 44 * hash + Objects.hashCode(this.ambitoHechos);
        hash = 44 * hash + Objects.hashCode(this.autoridadCompetente);
        hash = 44 * hash + Objects.hashCode(this.causaIncompetencia);
        hash = 44 * hash + Objects.hashCode(this.cargoAutoridadCompetente);
        hash = 44 * hash + Objects.hashCode(this.observaciones);
        hash = 44 * hash + Objects.hashCode(this.hipotesisAmbito);
        hash = 44 * hash + Objects.hashCode(this.caso);
        hash = 44 * hash + Objects.hashCode(this.documentos);
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
        final NoEjercicioAccionPenal other = (NoEjercicioAccionPenal) obj;

        return (
            !Objects.equals(this.narracionHechos, other.narracionHechos)||
            !Objects.equals(this.datosPrueba, other.datosPrueba)||
            !Objects.equals(this.fechaHechoDelictivo, other.fechaHechoDelictivo)||
            !Objects.equals(this.articuloCpem, other.articuloCpem)||
            !Objects.equals(this.hipotesisCnpp, other.hipotesisCnpp)||
            !Objects.equals(this.fraccionArticulo, other.fraccionArticulo)||
            !Objects.equals(this.hipotesisSobreseimiento, other.hipotesisSobreseimiento)||
            !Objects.equals(this.nombreProcurador, other.nombreProcurador)||
            !Objects.equals(this.ambitoHechos, other.ambitoHechos)||
            !Objects.equals(this.autoridadCompetente, other.autoridadCompetente)||
            !Objects.equals(this.causaIncompetencia, other.causaIncompetencia)||
            !Objects.equals(this.cargoAutoridadCompetente, other.cargoAutoridadCompetente)||
            !Objects.equals(this.observaciones, other.observaciones)||
            !Objects.equals(this.hipotesisAmbito, other.hipotesisAmbito)||
            !Objects.equals(this.documentos, other.documentos)||
            !Objects.equals(this.caso, other.caso)
        ) ? false : true;
    }
}