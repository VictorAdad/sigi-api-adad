package core.ldap;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;
import com.typesafe.config.Config;

import java.util.Hashtable;

public class LdapConnector{

    private  LdapContext ctx;

    private String host;

    private int port;

    private String securityPrincipal;

    private String passWord;

    private String securityAuthentication;
    
    private Hashtable<String, String> env = new Hashtable<String, String>();

    public LdapConnector(Config configuration) {
        host = configuration.getString("Evomatik.ldap.host");
        port = configuration.getInt("Evomatik.ldap.port"); 
        securityPrincipal = configuration.getString("Evomatik.ldap.securityPrincipal"); 
        passWord = configuration.getString("Evomatik.ldap.password"); 
        securityAuthentication = configuration.getString("Evomatik.ldap.securityAuthentication"); 
    }

    public LdapConnector(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public LdapConnector(String host, int port, String secure, String pass) {
        this.host = host;
        this.port = port;
        this.securityPrincipal = secure;
        this.passWord = pass;
    }

    public void setContext(LdapContext ctx){
        this.ctx = ctx;
    }

    public LdapContext getContext(){
        return this.ctx;
    }

    public void setHost(String host){
        this.host = host;
    }

    public String getHost(){
        return this.host;
    }

    public void setPort(int port){
        this.port = port;
    }

    public int getPort(){
        return this.port;
    }

    public LdapConnector connect() throws NamingException{
        try{
            env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
            env.put(Context.PROVIDER_URL, "ldap://"+this.host+":"+this.port); //IP and port of LDAP
            env.put(Context.SECURITY_AUTHENTICATION, securityAuthentication);
            env.put(Context.SECURITY_PRINCIPAL, this.securityPrincipal); // replace with user DN
            env.put(Context.SECURITY_CREDENTIALS, this.passWord);

            this.ctx = new InitialLdapContext(env, null);
        }catch(NamingException ne){
            System.out.println("Error init connection... error: "+ne.toString());
        }
        return this;
    }

    public void close(){
        try{
            this.ctx.close();
        }catch(NamingException ne){
            System.out.println("Error closing connection... error: "+ne.toString());
        }
    }
}
