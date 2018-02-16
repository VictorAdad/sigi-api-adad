package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import play.data.validation.Constraints;
import javax.persistence.CascadeType;
import javax.persistence.Lob;

@Entity
public class MediaFiliacion extends BaseModel {

    @Column(columnDefinition="NUMBER(1,0) default 0")
    public boolean usaAnteojos;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String cicatrices;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String tatuajes;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String lunares;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String disminucionesFisicas;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String protesis;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String otras;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String estatura;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String peso;

    @JsonIgnore
    @OneToOne(cascade= CascadeType.ALL)
    public Persona persona;

    @ManyToOne(cascade= CascadeType.ALL)
    public Oreja orejaDerecha;

    @ManyToOne(cascade= CascadeType.ALL)
    public Oreja orejaIzquierda;

    @ManyToOne
    public ComplexionPielSangre complexionPielSangre;

    @ManyToOne(cascade= CascadeType.ALL)
    public CaraNariz caraNariz;

    @ManyToOne
    public FrenteMenton frenteMenton;

    @ManyToOne
    public CejaBoca cejaBoca;

    @ManyToOne
    public Cabello cabello;

    @ManyToOne
    public LabioOjo labioOjo;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 99 * hash + Objects.hashCode(this.usaAnteojos);
        hash = 99 * hash + Objects.hashCode(this.cicatrices);
        hash = 99 * hash + Objects.hashCode(this.tatuajes);
        hash = 99 * hash + Objects.hashCode(this.lunares);
        hash = 99 * hash + Objects.hashCode(this.disminucionesFisicas);
        hash = 99 * hash + Objects.hashCode(this.protesis);
        hash = 99 * hash + Objects.hashCode(this.otras);
        hash = 99 * hash + Objects.hashCode(this.estatura);
        hash = 99 * hash + Objects.hashCode(this.peso);
        hash = 99 * hash + Objects.hashCode(this.persona);
        hash = 99 * hash + Objects.hashCode(this.orejaDerecha);
        hash = 99 * hash + Objects.hashCode(this.orejaIzquierda);
        hash = 99 * hash + Objects.hashCode(this.complexionPielSangre);
        hash = 99 * hash + Objects.hashCode(this.caraNariz);
        hash = 99 * hash + Objects.hashCode(this.frenteMenton);
        hash = 99 * hash + Objects.hashCode(this.cejaBoca);
        hash = 99 * hash + Objects.hashCode(this.cabello);
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

        final MediaFiliacion other = (MediaFiliacion) obj;
        return (
            !Objects.equals(this.usaAnteojos, other.usaAnteojos) ||
            !Objects.equals(this.cicatrices, other.cicatrices) ||
            !Objects.equals(this.tatuajes, other.tatuajes) ||
            !Objects.equals(this.lunares, other.lunares) ||
            !Objects.equals(this.disminucionesFisicas, other.disminucionesFisicas) ||
            !Objects.equals(this.protesis, other.protesis) ||
            !Objects.equals(this.otras, other.otras) ||
            !Objects.equals(this.estatura, other.estatura) ||
            !Objects.equals(this.peso, other.peso) ||
            !Objects.equals(this.persona, other.persona) ||
            !Objects.equals(this.orejaDerecha, other.orejaDerecha) ||
            !Objects.equals(this.orejaIzquierda, other.orejaIzquierda) ||
            !Objects.equals(this.complexionPielSangre, other.complexionPielSangre) ||
            !Objects.equals(this.caraNariz, other.caraNariz) ||
            !Objects.equals(this.frenteMenton, other.frenteMenton) ||
            !Objects.equals(this.cejaBoca, other.cejaBoca) ||
            !Objects.equals(this.cabello, other.cabello)
            ) ? false : true;

    }
}