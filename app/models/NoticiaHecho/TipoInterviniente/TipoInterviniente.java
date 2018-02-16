package models;

import io.ebean.Finder;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import play.data.validation.Constraints;

 /**
  * Modelo de la entidad de TipoInterviniente para la fiscalia
  * general de justicia del estado de mexico
  *
  * @author  Gibran Córdoba
  * @see     ManyToOne
  * @see     Constraints
  * @see     Entity
  * @see     Column
  * @see     Models
  * @since   1.0
  * @version 1.0
  */
@Entity
public class TipoInterviniente extends BaseModel implements BaseModel.Catalogo {

    // propiedades
    //
    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(35 Char)")
    @ManyToOne
    public String tipo;

    // Finder para uso de la super class y sus accesos mas sencillos
    public static final Finder<Long, TipoInterviniente> find = new Finder<>(TipoInterviniente.class);

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.tipo);
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

        final TipoInterviniente other = (TipoInterviniente) obj;
        return (
            !Objects.equals(this.tipo, other.tipo)
            ) ? false : true;

    }
}
