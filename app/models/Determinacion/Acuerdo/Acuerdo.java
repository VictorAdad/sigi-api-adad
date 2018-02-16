package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import java.util.List;
import play.data.validation.Constraints;
import javax.persistence.Lob;

@Entity
public class Acuerdo extends BaseHerencia {

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(50 Char)")
    public String tipo;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String nombrePersonaAcepta;

    @ManyToOne
    public PresentoLlamada presentoLlamada;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String manifesto;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String sintesisHechos;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String observaciones;

    @JsonIgnore
    @ManyToOne
    public Caso caso;

    @OneToMany(mappedBy = "acuerdo", targetEntity = DocAcuerdo.class)
    public List <DocAcuerdo> documentos;


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.tipo);
        hash = 29 * hash + Objects.hashCode(this.nombrePersonaAcepta);
        hash = 29 * hash + Objects.hashCode(this.presentoLlamada);
        hash = 29 * hash + Objects.hashCode(this.manifesto);
        hash = 29 * hash + Objects.hashCode(this.sintesisHechos);
        hash = 29 * hash + Objects.hashCode(this.observaciones);
        hash = 29 * hash + Objects.hashCode(this.caso);
        hash = 29 * hash + Objects.hashCode(this.documentos);
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
        final Acuerdo other = (Acuerdo) obj;

        return (
            !Objects.equals(this.tipo, other.tipo) ||
            !Objects.equals(this.nombrePersonaAcepta, other.nombrePersonaAcepta) ||
            !Objects.equals(this.presentoLlamada, other.presentoLlamada) ||
            !Objects.equals(this.manifesto, other.manifesto) ||
            !Objects.equals(this.sintesisHechos, other.sintesisHechos) ||
            !Objects.equals(this.observaciones, other.observaciones) ||
            !Objects.equals(this.documentos, other.documentos) ||
            !Objects.equals(this.caso, other.caso)
        ) ? false : true;
    }
}