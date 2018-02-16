package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import play.data.validation.Constraints;

@Entity
public class AliasNombrePersona extends BaseModel implements BaseModel.Catalogo{

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(6 Char)")
	public String tipo;

    @Column(columnDefinition="Varchar2(20 Char)")
    public String nombre;

	@JsonIgnore
	@ManyToOne
	public Persona persona;
}