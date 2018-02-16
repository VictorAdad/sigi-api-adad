package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.Lob;
import play.data.validation.Constraints;
import java.util.List;

@Entity
public class Arma extends BaseModel {

    @Lob
    @Column(columnDefinition = "CLOB")
    public String notas;

    @Column(columnDefinition="Varchar2(50 CHAR)")
    public String serie;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String matricula;

    @JsonIgnore
    @ManyToOne
    @Constraints.Required(groups = SaveStep.class)
    @JoinColumn(name="nic_id")
    public Caso caso;

    @ManyToOne
    public ClaseArma claseArma;

    @ManyToOne
    public CalibreMecanismo calibreMecanismo;


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 549 * hash + Objects.hashCode(this.notas);
        hash = 549 * hash + Objects.hashCode(this.serie);
        hash = 549 * hash + Objects.hashCode(this.matricula);
        hash = 549 * hash + Objects.hashCode(this.caso);
        hash = 549 * hash + Objects.hashCode(this.claseArma);
        hash = 549 * hash + Objects.hashCode(this.calibreMecanismo);
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
        final Arma other = (Arma) obj;

        return (
            !Objects.equals(this.notas, other.notas) ||
            !Objects.equals(this.serie, other.serie) ||
            !Objects.equals(this.matricula, other.matricula) ||
            !Objects.equals(this.caso, other.caso) ||
            !Objects.equals(this.claseArma, other.claseArma) ||
            !Objects.equals(this.calibreMecanismo, other.calibreMecanismo) 
        ) ? false : true;
    }
}