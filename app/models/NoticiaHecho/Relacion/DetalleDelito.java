
package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.ebean.Finder;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class DetalleDelito extends BaseModel {

 	@Column(name="violencia_genero", columnDefinition="NUMBER(1,0) default 0")
	public boolean tieneViolenciaGenero;

	@Column(columnDefinition="NUMBER(1,0) default 0")
	public boolean flagrancia;

    @ManyToOne
    public ModalidadDelito modalidadDelito;

    @ManyToOne
    public FormaComision formaComision;

    @ManyToOne
    public ConcursoDelito concursoDelito;

    @ManyToOne
    public ClasificacionDelitoOrden clasificacionDelitoOrden;

    @ManyToOne
    public DelitoCaso delitoCaso;

    @ManyToOne
    public ElementoComision elementoComision;

    @ManyToOne
    public ClasificacionDelito clasificacionDelito;

    @ManyToOne
    public FormaAccion formaAccion;

    @ManyToOne
    public DesaparicionConsumacion desaparicionConsumacion;

    @ManyToOne
    public GradoParticipacion gradoParticipacion;

    @ManyToOne
    public FormaConducta formaConducta;

    @ManyToOne
    public ViolenciaGenero violenciaGenero;

    @OneToMany(
        // mappedBy     = "detalleDelito",
        // targetEntity = HostigamientoAcoso.class
        cascade = CascadeType.ALL
    )
    public List<HostigamientoAcoso> hostigamientoAcoso;

    @OneToMany(
        // mappedBy     = "detalleDelito",
        // targetEntity = TrataPersona.class,
        cascade = CascadeType.ALL
    )
    public List<TrataPersona> trataPersona;

    @OneToMany(
        mappedBy     = "detalleDelito",
        targetEntity = EfectoViolencia.class,
        cascade = CascadeType.ALL
    )
    public List<EfectoViolencia> efectoViolencia;

    @JsonIgnore
    @OneToOne(
        mappedBy     = "detalleDelito",
        targetEntity = TipoRelacionPersona.class
    )
    public TipoRelacionPersona tipoRelacionPersona;

    public static final Finder<Long, DetalleDelito> find = new Finder<>(DetalleDelito.class);

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.tieneViolenciaGenero);
        hash = 29 * hash + Objects.hashCode(this.violenciaGenero);
		hash = 29 * hash + Objects.hashCode(this.flagrancia);
        hash = 29 * hash + Objects.hashCode(this.modalidadDelito);
        hash = 29 * hash + Objects.hashCode(this.formaComision);
        hash = 29 * hash + Objects.hashCode(this.concursoDelito);
        hash = 29 * hash + Objects.hashCode(this.clasificacionDelitoOrden);
        hash = 29 * hash + Objects.hashCode(this.delitoCaso);
        hash = 29 * hash + Objects.hashCode(this.elementoComision);
        hash = 29 * hash + Objects.hashCode(this.clasificacionDelito);
        hash = 29 * hash + Objects.hashCode(this.formaAccion);
        hash = 29 * hash + Objects.hashCode(this.desaparicionConsumacion);
        hash = 29 * hash + Objects.hashCode(this.gradoParticipacion);
        hash = 29 * hash + Objects.hashCode(this.formaConducta);
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
        final DetalleDelito other = (DetalleDelito) obj;

        return (
            !Objects.equals(this.tieneViolenciaGenero, other.tieneViolenciaGenero) ||
            !Objects.equals(this.violenciaGenero, other.violenciaGenero) ||
			!Objects.equals(this.flagrancia, other.flagrancia) ||
            !Objects.equals(this.modalidadDelito, other.modalidadDelito) ||
            !Objects.equals(this.formaComision, other.formaComision) ||
            !Objects.equals(this.concursoDelito, other.concursoDelito) ||
            !Objects.equals(this.clasificacionDelitoOrden, other.clasificacionDelitoOrden) ||
            !Objects.equals(this.delitoCaso, other.delitoCaso) ||
            !Objects.equals(this.elementoComision, other.elementoComision) ||
            !Objects.equals(this.clasificacionDelito, other.clasificacionDelito) ||
            !Objects.equals(this.formaAccion, other.formaAccion) ||
            !Objects.equals(this.desaparicionConsumacion, other.desaparicionConsumacion) ||
            !Objects.equals(this.gradoParticipacion, other.gradoParticipacion) ||
            !Objects.equals(this.formaConducta, other.formaConducta)
        ) ? false : true;
    }
}