package core.ldap;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.LdapContext;
import com.typesafe.config.Config;

public class LdapService{

    private LdapConnector conn;

    private NamingEnumeration<SearchResult> currentResponse;

    private int level = SearchControls.OBJECT_SCOPE;

    private String[] attrs = {};

    private String filter;

    private Config configuration;

    public LdapService(Config configuration){
        conn = new LdapConnector(configuration);
    }

    public LdapService(LdapConnector conn){
        this.conn = conn;
    }

    public LdapService(LdapConnector conn, int level){
        this.conn = conn;
        this.level = level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public int getLevel(){
        return this.level;
    }


    public void setAttrs(String[] attrs){
        this.attrs = attrs;
    }

    public String[] getAttrs(){
        return this.attrs;
    }

    public NamingEnumeration<SearchResult> search(String baseDN, String filterParam){
        play.Logger.debug("search baseDN: "+baseDN);
        play.Logger.debug("search filter: "+filterParam);
        play.Logger.debug("search level: "+level);
        play.Logger.debug("search attr: "+this.attrs);
        try{
            LdapContext ctx = conn.connect().getContext();

            SearchControls cons = new SearchControls();
            //nivel de búsqueda
            cons.setSearchScope(level);
            //atributos a retornar de los objectos encontrados
            cons.setReturningAttributes(this.attrs);

            String currentFilter = (!filterParam.equals("")) ? filterParam : this.filter;

            this.currentResponse = ctx.search(baseDN, currentFilter, cons);

        }catch(NamingException ne){
            System.out.println("Error searching information: "+ne.toString());
        }finally{
           conn.close();
        }

        return this.currentResponse;
    }


    public NamingEnumeration<SearchResult> search(String baseDN){
        play.Logger.debug("search baseDN: "+baseDN);
        play.Logger.debug("search level: "+level);
        play.Logger.debug("search attr: "+this.attrs);
        try{
            LdapContext ctx = conn.connect().getContext();

            SearchControls cons = new SearchControls();
            //nivel de búsqueda
            cons.setSearchScope(level);
            //atributos a retornar de los objectos encontrados
            cons.setReturningAttributes(this.attrs);

            this.currentResponse = ctx.search(baseDN, "(objectClass=*)", cons);

        }catch(NamingException ne){
            System.out.println("Error searching information: "+ne.toString());
        }finally{
           conn.close();
        }

        return this.currentResponse;
    }
}
