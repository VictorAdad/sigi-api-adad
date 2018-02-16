package ldpaModels;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {

    private String uid;

    private String displayName;

    private String estado;

    private String municipio;

    private String cargo;

    private String adscripcion;

    private String email;

    private String agenciaAcronimo;

    @JsonIgnore
    private String userPassword;

    private ArrayList<SecurityGroup> groups = new ArrayList<>();

    public User() {}

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public void setGroups(ArrayList<SecurityGroup> groups) {
        this.groups = groups;
    }

    public ArrayList<SecurityGroup> getGroups() {
        return groups;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }


    public void setAdscripcion(String adscripcion) {
        this.adscripcion = adscripcion;
    }

    public String getAdscripcion() {
        return adscripcion;
    }

    public void setAgenciaAcronimo(String agenciaAcronimo) {
        this.agenciaAcronimo = agenciaAcronimo;
    }

    public String getAgenciaAcronimo() {
        return agenciaAcronimo;
    }
}
