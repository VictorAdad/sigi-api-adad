package models;

import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import play.data.validation.Constraints;
import javax.persistence.Lob;

@Entity
public class SolicitudPrePericial extends BaseHerencia {

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(100 Char)")
    public String tipo;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String hechosNarrados;

    @Column(columnDefinition="Varchar2(2000 Char)")
    public String hechosDenunciados;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String noOficio;

    @Column(columnDefinition="Varchar2(150 Char)")
    public String directorInstituto;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String finalidad;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String plazoDias;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String apercibimiento;    

    @Lob
    @Column(columnDefinition = "CLOB")
    public String observaciones;

    @Column(columnDefinition="Varchar2(150 Char)")
    public String medicoLegista;

    @Column(columnDefinition="Varchar2(150 Char)")
    public String realizadoA;

    @ManyToOne
    public TipoExamen tipoExamen;

    @ManyToOne
    public PeritoMateria peritoMateria;

    @ManyToOne
    @Constraints.Required(groups = SaveStep.class)
    @JoinColumn(name="nic_id")
    public Caso caso;

    @OneToMany(mappedBy = "solicitudPrePericial", targetEntity = DocSolPrePericial.class)
    public List <DocSolPrePericial> documentos;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.tipo);
        hash = 29 * hash + Objects.hashCode(this.hechosNarrados);
        hash = 29 * hash + Objects.hashCode(this.hechosDenunciados);
        hash = 29 * hash + Objects.hashCode(this.noOficio);
        hash = 29 * hash + Objects.hashCode(this.directorInstituto);
        hash = 29 * hash + Objects.hashCode(this.peritoMateria);
        hash = 29 * hash + Objects.hashCode(this.finalidad);
        hash = 29 * hash + Objects.hashCode(this.plazoDias);
        hash = 29 * hash + Objects.hashCode(this.apercibimiento);
        hash = 29 * hash + Objects.hashCode(this.observaciones);
        hash = 29 * hash + Objects.hashCode(this.medicoLegista);
        hash = 29 * hash + Objects.hashCode(this.realizadoA);
        hash = 29 * hash + Objects.hashCode(this.tipoExamen);
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
        final SolicitudPrePericial other = (SolicitudPrePericial) obj;
        return (
            !Objects.equals(this.tipo, other.tipo) ||
            !Objects.equals(this.hechosNarrados, other.hechosNarrados) ||
            !Objects.equals(this.hechosDenunciados, other.hechosDenunciados) ||
            !Objects.equals(this.noOficio, other.noOficio) ||
            !Objects.equals(this.directorInstituto, other.directorInstituto) ||
            !Objects.equals(this.peritoMateria, other.peritoMateria) ||
            !Objects.equals(this.finalidad, other.finalidad) ||
            !Objects.equals(this.plazoDias, other.plazoDias) ||
            !Objects.equals(this.apercibimiento, other.apercibimiento) ||
            !Objects.equals(this.observaciones, other.observaciones) ||
            !Objects.equals(this.medicoLegista, other.medicoLegista) ||
            !Objects.equals(this.realizadoA, other.realizadoA) ||
            !Objects.equals(this.tipoExamen, other.tipoExamen) ||
            !Objects.equals(this.documentos, other.documentos) ||
            !Objects.equals(this.caso, other.caso)
        ) ? false : true;
    }
}