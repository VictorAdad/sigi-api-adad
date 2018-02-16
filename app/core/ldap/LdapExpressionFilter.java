package core.ldap;

import java.util.Hashtable;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.LdapContext;

import java.util.Map;
import java.util.TreeMap;

public class LdapExpressionFilter{

    private Map<String, String> exp = new TreeMap<>();

    private String query = "";

    public LdapExpressionFilter(){}

    public LdapExpressionFilter(Map<String, String> exp){
        this.exp = exp;
    }

    public String build(){
        return this.getExpression();
    }

    public LdapExpressionFilter eq(String key, String value){
        this.exp.put("eq", key+"="+value);
        return this;
    }

    public LdapExpressionFilter ne(String key, String value){
        this.exp.put("ne", key+"="+value);
        return this;
    }

    public LdapExpressionFilter like(String key, String value){
        this.exp.put("like", key+"~="+value);
        return this;
    }

    public LdapExpressionFilter or(String key, String value){
        this.exp.put("or", key+"="+value);
        return this;
    }

    public String getExpression(){
        for (Map.Entry<String, String> entry : this.exp.entrySet()){
            this.query += this.queryBuilder(entry);
        }
        return "";
    }

    private String queryBuilder(Map.Entry<String, String> entry){
        String val = "(";
        switch(entry.getKey()){
            case "eq":
                val += "("+entry.getValue()+")"; 
            case "ne":
                val += "("+entry.getValue()+")";
            case "like":
                val += "("+entry.getValue()+")"; 
            case "or":
                val += "(|"+entry.getValue()+")"; 
        }
        val += ")";
        return val;
    }
}
