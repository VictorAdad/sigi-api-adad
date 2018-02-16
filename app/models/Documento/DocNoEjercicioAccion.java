package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import play.data.validation.Constraints;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class DocNoEjercicioAccion extends DocumentBaseModel {

	@JsonIgnore
	@Constraints.Required(groups = SaveStep.class)
	@ManyToOne
	public NoEjercicioAccionPenal noEjercicioAccionPenal;
}