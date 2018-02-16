package models;

import javax.persistence.Entity;
import play.data.validation.Constraints;
import javax.persistence.Column;
@Entity
public class Turno extends BaseModel implements BaseModel.Catalogo{

	@Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(20 Char)")
	public String nombre;

	// @Constraints.Required(groups = SaveStep.class)
	public Agencia agencia;

	@Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(20 Char)")
	public String clave;
}
