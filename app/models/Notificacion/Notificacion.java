package models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import java.util.Date;


@Entity
public class Notificacion extends BaseModel {

    @Column(columnDefinition="Varchar2(100 Char)")
    public String username;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String titulo;

    @Column(columnDefinition="Varchar2(300 Char)")
    public String contenido;

    @Column(columnDefinition="Varchar2(20 Char)")
    public String tipo;

    public Date fecha;

    @Column(columnDefinition="NUMBER(1,0) default 0")
    public boolean leido;

    @ManyToOne
    @JoinColumn(name="nic_id")
    public Caso caso;

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 549 * hash + Objects.hashCode(this.username);
        hash = 549 * hash + Objects.hashCode(this.titulo);
        hash = 549 * hash + Objects.hashCode(this.contenido);
        hash = 549 * hash + Objects.hashCode(this.tipo);
        hash = 549 * hash + Objects.hashCode(this.fecha);
        hash = 549 * hash + Objects.hashCode(this.leido);
        hash = 549 * hash + Objects.hashCode(this.caso);
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
        final Notificacion other = (Notificacion) obj;

        return (
            !Objects.equals(this.username, other.username) ||
            !Objects.equals(this.titulo, other.titulo) ||
            !Objects.equals(this.contenido, other.contenido) ||
            !Objects.equals(this.tipo, other.tipo) ||
            !Objects.equals(this.fecha, other.fecha) ||
            !Objects.equals(this.leido, other.leido) ||
            !Objects.equals(this.caso, other.caso) 
        ) ? false : true;
    }
}