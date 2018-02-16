package models;
import java.util.List;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import play.data.validation.Constraints;

@Entity
public class SolicitudPreReqInfo extends BaseHerencia {

    @Column(columnDefinition="Varchar2(100 Char)")
    public String noOficio;

    public Date fechaReq;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String autoridadReq;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String cargoTurnoAdscripcion;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String domicilioAutoridad;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String infoRequerida;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String plazoDias;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String apercibimiento;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String observaciones;

    @ManyToOne
    @Constraints.Required(groups = SaveStep.class)
    @JoinColumn(name="nic_id")
    public Caso caso;

    @OneToMany(mappedBy = "solicitudPreReqInfo", targetEntity = DocSolPreReqInfo.class)
    public List <DocSolPreReqInfo> documentos;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 340 * hash + Objects.hashCode(this.noOficio);
        hash = 340 * hash + Objects.hashCode(this.fechaReq);
        hash = 340 * hash + Objects.hashCode(this.autoridadReq);
        hash = 340 * hash + Objects.hashCode(this.cargoTurnoAdscripcion);
        hash = 340 * hash + Objects.hashCode(this.domicilioAutoridad);
        hash = 340 * hash + Objects.hashCode(this.infoRequerida);
        hash = 340 * hash + Objects.hashCode(this.plazoDias);
        hash = 340 * hash + Objects.hashCode(this.apercibimiento);
        hash = 340 * hash + Objects.hashCode(this.observaciones);
        hash = 340 * hash + Objects.hashCode(this.caso);
        hash = 340 * hash + Objects.hashCode(this.documentos);
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
        final SolicitudPreReqInfo other = (SolicitudPreReqInfo) obj;
        return (
            !Objects.equals(this.noOficio, other.noOficio)||
            !Objects.equals(this.fechaReq, other.fechaReq)||
            !Objects.equals(this.autoridadReq, other.autoridadReq)||
            !Objects.equals(this.cargoTurnoAdscripcion, other.cargoTurnoAdscripcion)||
            !Objects.equals(this.domicilioAutoridad, other.domicilioAutoridad)||
            !Objects.equals(this.infoRequerida, other.infoRequerida)||
            !Objects.equals(this.plazoDias, other.plazoDias)||
            !Objects.equals(this.apercibimiento, other.apercibimiento)||
            !Objects.equals(this.observaciones, other.observaciones)||
            !Objects.equals(this.documentos, other.documentos)||
            !Objects.equals(this.caso, other.caso)
        ) ? false : true;
    }
}