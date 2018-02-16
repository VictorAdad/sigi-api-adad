package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.persistence.Lob;
import play.data.validation.Constraints;

@Entity
public class FacultadNoInvestigar extends BaseHerencia {

    @Lob
    @Column(columnDefinition = "CLOB")
    public String sintesisHechos;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String datosPrueba;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String motivosAbstuvoInvestigar;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String medioAlternativoSolucion;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String destinatarioDeterminacion;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String superiorJerarquico;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String observaciones;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String nombreDenunciante;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String originarioDenunciante;

    @Column(columnDefinition="Number(3)")
    public String edadDenunciante;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String domicilioDenunciante;
    
    @Column(columnDefinition="Varchar2(200 Char)")
    public String fraccion;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String edadDenuncianteHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String nombreDenuncianteHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String originarioDenuncianteHeredar;

    @Column(columnDefinition="Varchar2(1000 Char)")
    public String domicilioDenuncianteHeredar;

    @JsonIgnore
    @ManyToOne
    public Caso caso;

    @OneToMany(mappedBy = "facultadNoInvestigar", targetEntity = DocFacultadNoInvestigar.class)
    public List <DocFacultadNoInvestigar> documentos;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.sintesisHechos);
        hash = 29 * hash + Objects.hashCode(this.datosPrueba);
        hash = 29 * hash + Objects.hashCode(this.motivosAbstuvoInvestigar);
        hash = 29 * hash + Objects.hashCode(this.medioAlternativoSolucion);
        hash = 29 * hash + Objects.hashCode(this.destinatarioDeterminacion);
        hash = 29 * hash + Objects.hashCode(this.superiorJerarquico);
        hash = 29 * hash + Objects.hashCode(this.observaciones);
        hash = 29 * hash + Objects.hashCode(this.caso);
        hash = 29 * hash + Objects.hashCode(this.documentos);
        hash = 29 * hash + Objects.hashCode(this.nombreDenunciante);
        hash = 29 * hash + Objects.hashCode(this.originarioDenunciante);
        hash = 29 * hash + Objects.hashCode(this.edadDenunciante);
        hash = 29 * hash + Objects.hashCode(this.domicilioDenunciante);
        hash = 29 * hash + Objects.hashCode(this.fraccion);
        hash = 29 * hash + Objects.hashCode(this.edadDenuncianteHeredar);
        hash = 29 * hash + Objects.hashCode(this.nombreDenuncianteHeredar);
        hash = 29 * hash + Objects.hashCode(this.originarioDenuncianteHeredar);
        hash = 29 * hash + Objects.hashCode(this.domicilioDenuncianteHeredar);

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
        final FacultadNoInvestigar other = (FacultadNoInvestigar) obj;

        return (
            !Objects.equals(this.sintesisHechos, other.sintesisHechos) ||
            !Objects.equals(this.datosPrueba, other.datosPrueba) ||
            !Objects.equals(this.motivosAbstuvoInvestigar, other.motivosAbstuvoInvestigar) ||
            !Objects.equals(this.medioAlternativoSolucion, other.medioAlternativoSolucion) ||
            !Objects.equals(this.destinatarioDeterminacion, other.destinatarioDeterminacion) ||
            !Objects.equals(this.superiorJerarquico, other.superiorJerarquico) ||
            !Objects.equals(this.observaciones, other.observaciones) ||
            !Objects.equals(this.documentos, other.documentos) ||
            !Objects.equals(this.nombreDenunciante, other.nombreDenunciante) ||
            !Objects.equals(this.originarioDenunciante, other.originarioDenunciante) ||
            !Objects.equals(this.edadDenunciante, other.edadDenunciante) ||
            !Objects.equals(this.domicilioDenunciante, other.domicilioDenunciante) ||
            !Objects.equals(this.fraccion, other.fraccion) ||
            !Objects.equals(this.edadDenuncianteHeredar, other.edadDenuncianteHeredar) ||
            !Objects.equals(this.nombreDenuncianteHeredar, other.nombreDenuncianteHeredar) ||
            !Objects.equals(this.originarioDenuncianteHeredar, other.originarioDenuncianteHeredar) ||
            !Objects.equals(this.domicilioDenuncianteHeredar, other.domicilioDenuncianteHeredar) ||
            !Objects.equals(this.caso, other.caso)
        ) ? false : true;
    }
}