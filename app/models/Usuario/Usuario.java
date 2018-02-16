package models;

import java.util.Objects;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.Column;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

import play.data.validation.Constraints;

@Entity
public class Usuario extends BaseModel {

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(100 Char)")
    public String nombre;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(100 Char)")
    public String paterno;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String materno;

    @Column(columnDefinition="Varchar2(12 Char)")
    public String contrasenia;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(20 Char)")
    public String username;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(20 Char)")
    public String numContacto;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(40 Char)")
    public String email;

    @Column(columnDefinition="Varchar2(30 Char)")
    public String numGafete;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String cargo;

    @Column(columnDefinition="NUMBER(1,0) default 0")
    public boolean inhabilitar;

    @Constraints.Required(groups = SaveStep.class)
    @ManyToOne
    public Sexo sexo;

    @ManyToOne
    public Distrito distrito;

    @ManyToOne
    public Fiscalia fiscalia;

    @ManyToOne
    public Agencia agencia;

    @ManyToOne
    public Subdireccion subdireccion;

    @ManyToOne
    public Base base;

    @ManyToOne
    public Municipio municipio;

    @Constraints.Required(groups = SaveStep.class)
    @ManyToOne
    public Turno turno;

    @ManyToMany
    @JoinTable(name="UsuarioRol",
    joinColumns=@JoinColumn(name="usuario",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name="rol", referencedColumnName="id"))
    public List<Rol> roles;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 232 * hash + Objects.hashCode(this.nombre);
        hash = 232 * hash + Objects.hashCode(this.paterno);
        hash = 232 * hash + Objects.hashCode(this.materno);
        hash = 232 * hash + Objects.hashCode(this.contrasenia);
        hash = 232 * hash + Objects.hashCode(this.username);
        hash = 232 * hash + Objects.hashCode(this.numContacto);
        hash = 232 * hash + Objects.hashCode(this.turno);
        hash = 232 * hash + Objects.hashCode(this.email);
        hash = 232 * hash + Objects.hashCode(this.numGafete);
        hash = 232 * hash + Objects.hashCode(this.cargo);
        hash = 232 * hash + Objects.hashCode(this.inhabilitar);
        hash = 232 * hash + Objects.hashCode(this.sexo);
        hash = 232 * hash + Objects.hashCode(this.distrito);
        hash = 232 * hash + Objects.hashCode(this.fiscalia);
        hash = 232 * hash + Objects.hashCode(this.agencia);
        hash = 232 * hash + Objects.hashCode(this.subdireccion);
        hash = 232 * hash + Objects.hashCode(this.base);
        hash = 232 * hash + Objects.hashCode(this.municipio);
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
        final Usuario other = (Usuario) obj;

        return (
            !Objects.equals(this.nombre, other.nombre) ||
            !Objects.equals(this.paterno, other.paterno) ||
            !Objects.equals(this.materno, other.materno) ||
            !Objects.equals(this.contrasenia, other.contrasenia) ||
            !Objects.equals(this.username, other.username) ||
            !Objects.equals(this.numContacto, other.numContacto) ||
            !Objects.equals(this.turno, other.turno) ||
            !Objects.equals(this.email, other.email) ||
            !Objects.equals(this.numGafete, other.numGafete) ||
            !Objects.equals(this.cargo, other.cargo) ||
            !Objects.equals(this.inhabilitar, other.inhabilitar) ||
            !Objects.equals(this.sexo, other.sexo) ||
            !Objects.equals(this.distrito, other.distrito) ||
            !Objects.equals(this.fiscalia, other.fiscalia) ||
            !Objects.equals(this.agencia, other.agencia) ||
            !Objects.equals(this.subdireccion, other.subdireccion) ||
            !Objects.equals(this.base, other.base) ||
            !Objects.equals(this.municipio, other.municipio)
        ) ? false : true;
    }
}
