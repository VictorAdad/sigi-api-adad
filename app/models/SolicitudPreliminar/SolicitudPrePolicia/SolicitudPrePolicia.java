package models;

import java.util.Objects;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import play.data.validation.Constraints;
import javax.persistence.Lob;

@Entity
public class SolicitudPrePolicia extends BaseHerencia {

    @Column(columnDefinition="Varchar2(100 Char)")
    public String noOficio;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String nombreComisario;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String actuacionesSolicitadas;

    @ManyToOne
    @Constraints.Required(groups = SaveStep.class)
    @JoinColumn(name="nic_id")
    public Caso caso;

    @OneToMany(mappedBy = "solicitudPrePolicia", targetEntity = DocSolPrePolicia.class)
    public List <DocSolPrePolicia> documentos;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 834 * hash + Objects.hashCode(this.noOficio);
        hash = 834 * hash + Objects.hashCode(this.nombreComisario);
        hash = 834 * hash + Objects.hashCode(this.actuacionesSolicitadas);
        hash = 834 * hash + Objects.hashCode(this.documentos);
        hash = 834 * hash + Objects.hashCode(this.caso);
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
        final SolicitudPrePolicia other = (SolicitudPrePolicia) obj;
        return (
            !Objects.equals(this.noOficio, other.noOficio) ||
            !Objects.equals(this.nombreComisario, other.nombreComisario) ||
            !Objects.equals(this.actuacionesSolicitadas, other.actuacionesSolicitadas) ||
            !Objects.equals(this.documentos, other.documentos) ||
            !Objects.equals(this.caso, other.caso)
            ) ? false : true;
    }
}