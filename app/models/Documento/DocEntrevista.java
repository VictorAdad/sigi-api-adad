package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import play.data.validation.Constraints;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class DocEntrevista extends DocumentBaseModel {

	@JsonIgnore
	@Constraints.Required(groups = SaveStep.class)
	@ManyToOne
	public Entrevista entrevista;
}