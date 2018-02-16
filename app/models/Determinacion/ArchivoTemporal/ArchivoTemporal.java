package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Lob;
import play.data.validation.Constraints;

@Entity
public class ArchivoTemporal extends BaseHerencia {

    @Column(columnDefinition="Varchar2(100 Char)")
    public String creadoPor;

    public Date fechaCreacion;

    @Lob
    @Column(columnDefinition = "CLOB")
    public String observaciones;

    @JsonIgnore
    @ManyToOne
    public Caso caso;

    @OneToMany(mappedBy = "archivoTemporal", targetEntity = DocArchivoTemporal.class)
    public List <DocArchivoTemporal> documentos;
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.creadoPor);
        hash = 29 * hash + Objects.hashCode(this.fechaCreacion);
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
        final ArchivoTemporal other = (ArchivoTemporal) obj;

        return (
            !Objects.equals(this.creadoPor, other.creadoPor) ||
            !Objects.equals(this.fechaCreacion, other.fechaCreacion) ||
            !Objects.equals(this.observaciones, other.observaciones) ||
            !Objects.equals(this.documentos, other.documentos) ||
            !Objects.equals(this.caso, other.caso)
        ) ? false : true;
    }
}