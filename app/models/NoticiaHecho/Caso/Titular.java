package models;

import io.ebean.Finder;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import ldpaModels.Ldap;
import ldpaModels.User;
import play.data.validation.Constraints;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.typesafe.config.Config;

@Entity
@Table(name="Titulares")
public class Titular extends BaseModel {

	@Constraints.Required(groups = SaveStep.class)
	public Date fechaAsignacion;

	@ManyToOne
	@Constraints.Required(groups = SaveStep.class)
	public Caso caso;

	@Constraints.Required(groups = SaveStep.class)
	public String userNamePropietario;

	@Constraints.Required(groups = SaveStep.class)
	public String userNameAsignado;

	@Constraints.Required(groups = SaveStep.class)
	public String userNameAsignacion;

	public boolean vigente;

	public static User getPropietarioTitular(Config configuration,Long id){
		Titular titular = Titular.find.query().where().eq("id",id).findUnique();
		if(titular!=null){
			Ldap ldap = new Ldap(configuration);
			return ldap.getUsers(titular.userNameAsignado).size() > 0 ? ldap.getUsers(titular.userNameAsignado).get(0) : null;
		}
		return null;
	}

	public User getPropietario(Config configuration){
		Ldap ldap = new Ldap(configuration);

		return ldap.getUsers(this.userNamePropietario).size() > 0 ? ldap.getUsers(this.userNamePropietario).get(0) : null;
	}

	// Finder para uso de la super class y sus accesos mas sencillos
    public static final Finder<Long, Titular> find = new Finder<>(Titular.class);

}

