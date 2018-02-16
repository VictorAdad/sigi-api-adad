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
public class SolicitudPreAcuerdo extends BaseHerencia {

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(40 Char)")
    public String tipo;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String fundamentoLegal;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String contenidoAcuerdo;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String finalidad;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String plazo;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String apercibimiento;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String senialar;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String observaciones;

    @Column(columnDefinition="Varchar2(2000 Char)")
    public String noOficioAtencion;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String cargoAdscripcionAtencion;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String necesidades;    

    @Lob
    @Column(columnDefinition = "CLOB")
    public String ubicacionAtencion;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String autoridadJuridico;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String cargoAdscripcionJuridico;    

    @Lob
    @Column(columnDefinition = "CLOB")
    public String ubicacionJuridico;

    @ManyToOne
    // @Constraints.Required(groups = SaveStep.class)
    @JoinColumn(name="denuncia_querella_id")
    public DenunciaQuerella denunciaQuerella;

    @ManyToOne
    // @Constraints.Required(groups = SaveStep.class)
    @JoinColumn(name="victima_quellerante_id")
    public VictimaQuerellante victimaQuerellante;

    @ManyToOne
    @Constraints.Required(groups = SaveStep.class)
    @JoinColumn(name="nic_id")
    public Caso caso;

    @OneToMany(mappedBy = "solicitudPreAcuerdo", targetEntity = DocSolPreAcuerdo.class)
    public List <DocSolPreAcuerdo> documentos;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 834 * hash + Objects.hashCode(this.fundamentoLegal);
        hash = 834 * hash + Objects.hashCode(this.contenidoAcuerdo);
        hash = 834 * hash + Objects.hashCode(this.finalidad);
        hash = 834 * hash + Objects.hashCode(this.plazo);
        hash = 834 * hash + Objects.hashCode(this.apercibimiento);
        hash = 834 * hash + Objects.hashCode(this.senialar);
        hash = 834 * hash + Objects.hashCode(this.observaciones);
        hash = 834 * hash + Objects.hashCode(this.noOficioAtencion);
        hash = 834 * hash + Objects.hashCode(this.cargoAdscripcionAtencion);
        hash = 834 * hash + Objects.hashCode(this.necesidades);
        hash = 834 * hash + Objects.hashCode(this.ubicacionAtencion);
        hash = 834 * hash + Objects.hashCode(this.autoridadJuridico);
        hash = 834 * hash + Objects.hashCode(this.cargoAdscripcionJuridico);
        hash = 834 * hash + Objects.hashCode(this.ubicacionJuridico);
        hash = 834 * hash + Objects.hashCode(this.denunciaQuerella);
        hash = 834 * hash + Objects.hashCode(this.victimaQuerellante);
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
        final SolicitudPreAcuerdo other = (SolicitudPreAcuerdo) obj;
        return (
            !Objects.equals(this.fundamentoLegal, other.fundamentoLegal) ||
            !Objects.equals(this.contenidoAcuerdo, other.contenidoAcuerdo) ||
            !Objects.equals(this.finalidad, other.finalidad) ||
            !Objects.equals(this.plazo, other.plazo) ||
            !Objects.equals(this.apercibimiento, other.apercibimiento) ||
            !Objects.equals(this.senialar, other.senialar) ||
            !Objects.equals(this.observaciones, other.observaciones) ||
            !Objects.equals(this.noOficioAtencion, other.noOficioAtencion) ||
            !Objects.equals(this.cargoAdscripcionAtencion, other.cargoAdscripcionAtencion) ||
            !Objects.equals(this.necesidades, other.necesidades) ||
            !Objects.equals(this.ubicacionAtencion, other.ubicacionAtencion) ||
            !Objects.equals(this.autoridadJuridico, other.autoridadJuridico) ||
            !Objects.equals(this.cargoAdscripcionJuridico, other.cargoAdscripcionJuridico) ||
            !Objects.equals(this.ubicacionJuridico, other.ubicacionJuridico) ||
            !Objects.equals(this.denunciaQuerella, other.denunciaQuerella) ||
            !Objects.equals(this.victimaQuerellante, other.victimaQuerellante) ||
            !Objects.equals(this.documentos, other.documentos) ||
            !Objects.equals(this.caso, other.caso)
            ) ? false : true;
    }
}