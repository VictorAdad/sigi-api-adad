package ldpaModels;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class SecurityGroup {

    @JsonIgnore
    private String entryDN;

    private String name;

    @JsonIgnore
    private ArrayList<User> members = new ArrayList<>();

    public SecurityGroup() {}

    public void setEntryDN(String entryDN) {
        this.entryDN = entryDN;
    }

    public String getEntryDN() {
        return entryDN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMembers(ArrayList<User> members) {
        this.members = members;
    }

    public ArrayList<User> getMembers() {
        return members;
    }
}
