package models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Column;
import play.data.validation.Constraints;
@Entity
public class Rol extends BaseModel {

	@ManyToMany(mappedBy = "roles")
    public List<Usuario> usuarios;

    @Constraints.Required(groups = SaveStep.class)
	@Column(columnDefinition="Varchar2(3 Char)")
	public String clave;
}
