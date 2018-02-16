package ldpaModels;

import core.ldap.LdapConnector;
import core.ldap.LdapService;

import java.util.List;
import java.util.ArrayList;
import ldpaModels.User;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchResult;
import play.Logger;
import com.typesafe.config.Config;

public class Ldap {

    private LdapConnector conn;

    private Config configuration;

    private String baseDomain;

    private String baseFGJEMDN;

    private String claseAgencia;

    private String memberAgencia;

    public Ldap(Config configuration) {
        configuration = configuration;
        conn = new LdapConnector(configuration);
        baseDomain = configuration.getString("Evomatik.ldap.baseDomain");
        baseFGJEMDN = configuration.getString("Evomatik.ldap.baseFGJEMDN");
        claseAgencia = configuration.getString("Evomatik.ldap.claseAgencia");
        memberAgencia = configuration.getString("Evomatik.ldap.memberAgencia");
    }

    public String getObject(String filter){
        play.Logger.debug("element to find: "+filter);
        String dn = "";
        try{
            LdapService LS = new LdapService(this.conn, 2);
            LS.setAttrs(new String[]{
                "entryDN"
            });

            NamingEnumeration<SearchResult> answer = LS.search(
                this.baseFGJEMDN+","+this.baseDomain,
                filter
            );
            if(answer.hasMore()) {
                Attributes attrs = answer.next().getAttributes();
                play.Logger.debug("entry found: "+attrs.get("entryDN").get().toString());
                dn = attrs.get("entryDN").get().toString();
            }else{
                play.Logger.error("No se pudo encontrar el objecto: {}", filter);
            }
        }catch(NamingException ne){
            play.Logger.error("Error al obtener campos de registro de ldap", ne);
        }

        return dn;
    }

    public List<String> getAgenciesByFicalia(String fiscalia){

        List<String> list = new ArrayList<>();
        String fis = this.getObject("ou="+fiscalia);
        if (!fis.equals("")) {
            LdapService LS = new LdapService(this.conn, 1);
            LS.setAttrs(new String[]{
                "cn", "ou", "entryDN"
            });
            NamingEnumeration<SearchResult> answerFiscalia = LS.search(fis, "(objectClass=*)" );
            try{
                while(answerFiscalia.hasMore()){
                    Attributes attrsFiscalia = answerFiscalia.next().getAttributes();
                    play.Logger.error("agencia: "+attrsFiscalia.get("entryDN").get().toString());
                    if (attrsFiscalia.get("ou") != null) {
                        list.add(attrsFiscalia.get("ou").get().toString());
                    }else if(attrsFiscalia.get("cn") != null) {
                        list.add(attrsFiscalia.get("cn").get().toString());
                    }
                }
            }catch(NamingException ne){
                play.Logger.error("Error al obtener campos de registro de ldap", ne);
            }
        }

        return list;
    }

    public List<User> getMembers(String name) {

        List<User> list = new ArrayList<>();
        String fis = this.getObject("(cn="+name.trim().replaceAll("%20", "")+")");
        if (!fis.equals("")) {
            LdapService LS = new LdapService(this.conn, 2);
            LS.setAttrs(new String[]{
                "entryDN", memberAgencia
            });

            NamingEnumeration<SearchResult> answer = LS.search(fis, "cn="+name.replaceAll("%20", "") );

            try{
                while(answer.hasMore()){
                    Attributes attrs = answer.next().getAttributes();
                    Logger.debug("Members entry DN: "+attrs.get("entryDN").get().toString());
                    String[] members = attrs.get(memberAgencia).get().toString().split(";");

                    LS = new LdapService(this.conn, 1);
                    LS.setAttrs(new String[]{
                        "cn", "ou", "Estado", "Adscripcion", "Roles", "Municipio", "Cargo","entryDN","uid","userPassword"
                    });
                    NamingEnumeration<SearchResult> answerUsuario = null;
                    User user = null;
                    for (String member: members) {
                        Logger.debug("Member to find DN: "+member);
                        answerUsuario = LS.search("ou=People,"+this.baseDomain, "("+member.split(",",2)[0]+")" );
                        while(answerUsuario.hasMore()){
                            user = new User();
                            Attributes attrsUsuario = answerUsuario.next().getAttributes();
                            Logger.debug("Usuario DN: "+attrsUsuario.get("entryDN").get().toString());
                            user.setUid(attrsUsuario.get("uid").get().toString());
                            if(attrsUsuario.get("cn") != null){
                                user.setDisplayName(attrsUsuario.get("cn").get().toString());
                            }

                            if(attrsUsuario.get("Adscripcion") != null){
                                user.setAdscripcion(attrsUsuario.get("Adscripcion").get().toString());
                            }

                            if(attrsUsuario.get("Estado") != null){
                                user.setEstado(attrsUsuario.get("Estado").get().toString());
                            }

                            if(attrsUsuario.get("Municipio") != null){
                                user.setMunicipio(attrsUsuario.get("Municipio").get().toString());
                            }

                            if(attrsUsuario.get("Cargo") != null){
                                user.setCargo(attrsUsuario.get("Cargo").get().toString());
                            }

                            if(attrsUsuario.get("Roles") != null){
                                String[] roles = attrsUsuario.get("Roles").get().toString().split(",");
                                SecurityGroup sg = null;
                                ArrayList<SecurityGroup> groups = new ArrayList<>();
                                for (String rol: roles) {
                                    sg = new SecurityGroup();
                                    sg.setName(rol);
                                    groups.add(sg);
                                }
                                user.setGroups(groups);
                            }

                            list.add(user);
                        }
                    }
                }
            }catch(NamingException ne){
                play.Logger.error("Error al obtener campos de registro de ldap", ne);
            }
        }

        return list;
    }

    public List<User> getUsers(String usuario){

        User user = null;
        List<User> list = new ArrayList<>();
        LdapService LS = new LdapService(this.conn, 1);
        LS.setAttrs(new String[]{
            "cn", "ou", "Estado", "Adscripcion", "Roles", "Municipio", "Cargo","entryDN","uid","userPassword", "mail", "agenciaCompleto", "agenciaAcronimo"
        });
        NamingEnumeration<SearchResult> answerUsuario = LS.search("ou=People,"+this.baseDomain, "(uid="+usuario+")" );
        try{
            while(answerUsuario.hasMore()){
                user = new User();
                Attributes attrsUsuario = answerUsuario.next().getAttributes();
                Logger.debug("Usuario DN: "+attrsUsuario.get("entryDN").get().toString());
                Logger.debug("Attributes: {}", attrsUsuario);
                user.setUid(attrsUsuario.get("uid").get().toString());
                user.setUserPassword(attrsUsuario.get("UserPassword").get().toString());
                if(attrsUsuario.get("cn") != null){
                    user.setDisplayName(attrsUsuario.get("cn").get().toString());
                }

                if(attrsUsuario.get("agenciaCompleto") != null){
                    user.setAdscripcion(attrsUsuario.get("agenciaCompleto").get().toString());
                }

                if(attrsUsuario.get("Estado") != null){
                    user.setEstado(attrsUsuario.get("Estado").get().toString());
                }

                if(attrsUsuario.get("Municipio") != null){
                    user.setMunicipio(attrsUsuario.get("Municipio").get().toString());
                }

                if(attrsUsuario.get("Cargo") != null){
                    user.setCargo(attrsUsuario.get("Cargo").get().toString());
                }

                if(attrsUsuario.get("mail") != null){
                    user.setEmail(attrsUsuario.get("mail").get().toString());
                }

                if(attrsUsuario.get("agenciaAcronimo") != null){
                    user.setAgenciaAcronimo(attrsUsuario.get("agenciaAcronimo").get().toString());
                }
                list.add(user);
            }
        }catch(NamingException ne){
            play.Logger.error("Error al obtener campos de registro de ldap", ne);
        }

        return list;
    }


    public List<Agency> getAllAgencies(){

        Agency agency = null;
        List<Agency> list = new ArrayList<>();
        LdapService LS = new LdapService(this.conn, 2);
        LS.setAttrs(new String[]{
            "cn", "entryDN"
        });
        NamingEnumeration<SearchResult> answerUsuario = LS.search(this.baseFGJEMDN+","+this.baseDomain, "(objectClass="+claseAgencia+")");
        try{
            while(answerUsuario.hasMore()){
                agency = new Agency();
                Attributes attrsUsuario = answerUsuario.next().getAttributes();
                Logger.debug("Agencia DN: "+attrsUsuario.get("entryDN").get().toString());
                agency.setName(attrsUsuario.get("cn").get().toString());
                agency.setEntryDN(attrsUsuario.get("entryDN").get().toString());
                list.add(agency);
            }
        }catch(NamingException ne){
            play.Logger.error("Error al obtener campos de registro de ldap", ne);
        }

        return list;
    }

}
