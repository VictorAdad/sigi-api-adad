package repository;

import javax.inject.Inject;
import play.db.ebean.EbeanConfig;
import java.util.List;
import java.util.ArrayList;
import ldpaModels.User;
import ldpaModels.Agency;
import ldpaModels.Ldap;
import com.typesafe.config.Config;

public class LdapRepository {

    private Ldap ldap;

    @Inject
    public LdapRepository(Config configuration) {
        ldap = new Ldap(configuration);
    }

    public List<String> getAgencies(String name){
        return this.ldap.getAgenciesByFicalia(name);
    }

    public List<User> getMembers(String name){
        return this.ldap.getMembers(name);
    }

	public List<User> getUsers(String name){
        return this.ldap.getUsers(name);
    }

    public List<Agency> getAllAgencies(){
        return this.ldap.getAllAgencies();
    }

}
