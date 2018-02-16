package models;

import javax.persistence.Entity;
import play.data.validation.Constraints;
import javax.persistence.Column;
@Entity
public class Distrito extends NameBaseModel implements BaseModel.Catalogo{

	// @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(3 Char)")
	public String clave;

}
