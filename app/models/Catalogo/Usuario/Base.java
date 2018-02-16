package models;

import javax.persistence.Entity;
import play.data.validation.Constraints;

@Entity
public class Base extends BaseModel implements BaseModel.Catalogo{

	public String nombre;

	// @Constraints.Required(groups = SaveStep.class)
	public Subdireccion subdireccion;
}
