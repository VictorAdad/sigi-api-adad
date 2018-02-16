package models;

import javax.persistence.Entity;
import play.data.validation.Constraints;
import javax.persistence.Column;
@Entity
public class Fiscalia extends BaseModel implements BaseModel.Catalogo{

	@Column(columnDefinition="Varchar2(200 Char)")
	public String nombre;

	// @Constraints.Required(groups = SaveStep.class)
	public Distrito distrito;

	// @Constraints.Required(groups = SaveStep.class)
	@Column(columnDefinition="Varchar2(3 Char)")
	public String clave;
}
