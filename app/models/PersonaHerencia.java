package models;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import io.ebean.Finder;

@Entity
public class PersonaHerencia extends BaseModel {

    public static final Finder<Long, PersonaHerencia> find = new Finder<>(PersonaHerencia.class);

    @Column(columnDefinition="Varchar2(100 Char)")
    public String tipo;

    public Long actuacion;

    @ManyToOne
    public PersonaCaso personaCaso;
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 99 * hash + Objects.hashCode(this.tipo);
        hash = 99 * hash + Objects.hashCode(this.actuacion);
        hash = 99 * hash + Objects.hashCode(this.personaCaso);
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

        final PersonaHerencia other = (PersonaHerencia) obj;
        return (
            !Objects.equals(this.tipo, other.tipo) ||
            !Objects.equals(this.actuacion, other.actuacion) ||
            !Objects.equals(this.personaCaso, other.personaCaso)
            ) ? false : true;

    }

    public static PersonaHerencia findExistente(PersonaCaso persona, Long actuacion, String tipo){
        
        return find.query().where()
            .eq("personaCaso", persona)
            .eq("actuacion", actuacion)
            .eq("tipo", tipo)
            .setMaxRows(1)
            .findUnique();
    }

    public static PersonaHerencia findExistenteByTipos(PersonaCaso persona, Long actuacion, String[] tipos){
        return find.query().where()
            .eq("personaCaso", persona)
            .eq("actuacion", actuacion)
            .in("personaCaso.tipoInterviniente.tipo", tipos)
            .setMaxRows(1)
            .findUnique();
    }
}