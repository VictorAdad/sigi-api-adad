package models;

import java.util.Objects;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import play.data.validation.Constraints;
import play.data.format.Formats;
import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Lob;

@Entity
public class SolicitudPreInspeccion extends BaseHerencia {

    // @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.sss", timezone = "GMT-6")
    @Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss.sss")
    public Date fechaHoraInspeccion;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String adscripcion;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String descripcion;

    @ManyToOne
    @Constraints.Required(groups = SaveStep.class)
    @JoinColumn(name="nic_id")
    public Caso caso;

    @OneToMany(mappedBy = "solicitudPreInspeccion", targetEntity = DocSolPreInspeccion.class)
    public List <DocSolPreInspeccion> documentos;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 834 * hash + Objects.hashCode(this.fechaHoraInspeccion);
        hash = 834 * hash + Objects.hashCode(this.adscripcion);
        hash = 834 * hash + Objects.hashCode(this.descripcion);
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
        final SolicitudPreInspeccion other = (SolicitudPreInspeccion) obj;
        return (
            !Objects.equals(this.fechaHoraInspeccion, other.fechaHoraInspeccion) ||
            !Objects.equals(this.adscripcion, other.adscripcion) ||
            !Objects.equals(this.descripcion, other.descripcion) ||
            !Objects.equals(this.documentos, other.documentos) ||
            !Objects.equals(this.caso, other.caso)
            ) ? false : true;
    }
}