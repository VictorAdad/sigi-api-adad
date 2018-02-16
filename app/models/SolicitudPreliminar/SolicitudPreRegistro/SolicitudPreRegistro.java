package models;

import java.util.Objects;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import play.data.validation.Constraints;
import javax.persistence.Lob;

@Entity
public class SolicitudPreRegistro extends BaseHerencia {

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
    public String contenidoConstancia;

    @Column(columnDefinition="Varchar2(20 Char)")
    public String noTelefonico;

    @Column(columnDefinition="Varchar2(150 Char)")
    public String atencionLlamada;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String observaciones;

    @Column(columnDefinition="Varchar2(200 Char)")
    public String tipo;

    @ManyToOne
    @Constraints.Required(groups = SaveStep.class)
    @JoinColumn(name="nic_id")
    public Caso caso;

    @OneToMany(mappedBy = "solicitudPreRegistro", targetEntity = DocSolPreRegistro.class)
    public List <DocSolPreRegistro> documentos;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.contenidoConstancia);
        hash = 29 * hash + Objects.hashCode(this.fundamentoLegal);
        hash = 29 * hash + Objects.hashCode(this.contenidoAcuerdo);
        hash = 29 * hash + Objects.hashCode(this.finalidad);
        hash = 29 * hash + Objects.hashCode(this.plazo);
        hash = 29 * hash + Objects.hashCode(this.apercibimiento);
        hash = 29 * hash + Objects.hashCode(this.senialar);
        hash = 29 * hash + Objects.hashCode(this.noTelefonico);
        hash = 29 * hash + Objects.hashCode(this.atencionLlamada);
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
        final SolicitudPreRegistro other = (SolicitudPreRegistro) obj;
        return (
            !Objects.equals(this.contenidoConstancia, other.contenidoConstancia) ||
            !Objects.equals(this.fundamentoLegal, other.fundamentoLegal)||
            !Objects.equals(this.contenidoAcuerdo, other.contenidoAcuerdo)||
            !Objects.equals(this.finalidad, other.finalidad)||
            !Objects.equals(this.plazo, other.plazo)||
            !Objects.equals(this.apercibimiento, other.apercibimiento)||
            !Objects.equals(this.senialar, other.senialar)||
            !Objects.equals(this.noTelefonico, other.noTelefonico) ||
            !Objects.equals(this.atencionLlamada, other.atencionLlamada) ||
            !Objects.equals(this.observaciones, other.observaciones) ||
            !Objects.equals(this.documentos, other.documentos) ||
            !Objects.equals(this.caso, other.caso)
        ) ? false : true;
    }
}