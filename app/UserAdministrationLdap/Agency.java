package ldpaModels;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Agency {

    private String name;

    @JsonIgnore
    private String entryDN;

    public Agency() {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEntryDN(String entryDN) {
        this.entryDN = entryDN;
    }

    public String getEntryDN() {
        return entryDN;
    }
}
