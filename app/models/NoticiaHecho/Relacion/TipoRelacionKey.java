package models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TipoRelacionKey implements Serializable {

    public Long caso;

    public Long personaCaso;

    public Long detalleDelito;

    public Long personaCasoRelacionada;

    public Long getCaso() {
        return caso;
    }

    public void setCaso(Long caso) {
        this.caso = caso;
    }

    public Long getPersonaCaso() {
        return personaCaso;
    }

    public void setPersonaCaso(Long personaCaso) {
        this.personaCaso = personaCaso;
    }

    public Long getDetalleDelito() {
        return detalleDelito;
    }

    public void setDetalleDelito(Long detalleDelito) {
        this.detalleDelito = detalleDelito;
    }

    public Long getPersonaCasoRelacionada() {
        return personaCasoRelacionada;
    }

    public void setPersonaCasoRelacionada(Long personaCasoRelacionada) {
        this.personaCasoRelacionada = personaCasoRelacionada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TipoRelacionKey)) return false;

        TipoRelacionKey that = (TipoRelacionKey) o;

        if (caso != null ? !caso.equals(that.caso) : that.caso != null) return false;
        if (personaCaso != null ? !personaCaso.equals(that.personaCaso) : that.personaCaso != null) return false;
        return personaCasoRelacionada != null ? personaCasoRelacionada.equals(that.personaCasoRelacionada) : that.personaCasoRelacionada == null;
    }

    @Override
    public int hashCode() {
        int result = caso != null ? caso.hashCode() : 0;
        result = 31 * result + (personaCaso != null ? personaCaso.hashCode() : 0);
        result = 31 * result + (personaCasoRelacionada != null ? personaCasoRelacionada.hashCode() : 0);
        return result;
    }
}
