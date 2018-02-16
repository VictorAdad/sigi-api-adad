package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import play.data.validation.Constraints;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class DocNic extends DocumentBaseModel {

	@JsonIgnore
	@Constraints.Required(groups = SaveStep.class)
	@JoinColumn(name="nic_id")
	@ManyToOne
	public Caso caso;
}