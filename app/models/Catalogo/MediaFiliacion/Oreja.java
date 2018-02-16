package models;


import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;
import play.data.validation.Constraints;

@Entity
public class Oreja extends BaseModel implements BaseModel.Catalogo{

    @Column(columnDefinition="Varchar2(30 Char)")
    public String forma;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String helixOriginal;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String helixSuperior;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String helixPosterior;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String helixAdherencia;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String lobuloContorno;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String lobuloAdherencia;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String lobuloParticularidad;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String lobuloDimension;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 99 * hash + Objects.hashCode(this.forma);
        hash = 99 * hash + Objects.hashCode(this.helixOriginal);
        hash = 99 * hash + Objects.hashCode(this.helixSuperior);
        hash = 99 * hash + Objects.hashCode(this.helixPosterior);
        hash = 99 * hash + Objects.hashCode(this.helixAdherencia);
        hash = 99 * hash + Objects.hashCode(this.lobuloContorno);
        hash = 99 * hash + Objects.hashCode(this.lobuloAdherencia);
        hash = 99 * hash + Objects.hashCode(this.lobuloParticularidad);
        hash = 99 * hash + Objects.hashCode(this.lobuloDimension);
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

        final Oreja other = (Oreja) obj;
        return (
            !Objects.equals(this.forma, other.forma) ||
            !Objects.equals(this.helixOriginal, other.helixOriginal) ||
            !Objects.equals(this.helixSuperior, other.helixSuperior) ||
            !Objects.equals(this.helixPosterior, other.helixPosterior) ||
            !Objects.equals(this.helixAdherencia, other.helixAdherencia) ||
            !Objects.equals(this.lobuloContorno, other.lobuloContorno) ||
            !Objects.equals(this.lobuloAdherencia, other.lobuloAdherencia) ||
            !Objects.equals(this.lobuloParticularidad, other.lobuloParticularidad) ||
            !Objects.equals(this.lobuloDimension, other.lobuloDimension)
            ) ? false : true;

    }
}
