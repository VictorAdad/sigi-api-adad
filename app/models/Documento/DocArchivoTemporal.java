package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import play.data.validation.Constraints;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class DocArchivoTemporal extends DocumentBaseModel {

	@JsonIgnore
	@Constraints.Required(groups = SaveStep.class)
	@ManyToOne
	public ArchivoTemporal archivoTemporal;
}