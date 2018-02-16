package models;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.MappedSuperclass;
import javax.persistence.Column;
import play.data.validation.Constraints;
import java.util.List;
import java.util.Date;
import play.libs.Json;

@MappedSuperclass
public class BaseHerencia extends BaseModel {
	@Column(columnDefinition="NUMBER(1,0) default 0")
    public boolean heredar;

    @Column(columnDefinition="NUMBER(1,0) default 0")
    public boolean heredarSintesisHechos;

    @ManyToOne
    public Arma arma;

    @ManyToOne
    public Lugar lugar;

    @ManyToOne
    public DelitoCaso delito;

    @ManyToOne
    public Vehiculo vehiculo; 

    public Date fechaAtencion;

    public String horaAtencion;
    
    @JsonProperty("personas")
    public JsonNode getPersonasHerencia(){
        List<PersonaHerencia> personasHerencia = PersonaHerencia.find.query().where()
        .eq("actuacion", this.id)
        .eq("tipo", this.getClass().getSimpleName()).findList();
        ObjectNode obj = Json.newObject();
        ArrayNode arr = obj.arrayNode();
        ObjectNode personaCaso = Json.newObject();
        for (PersonaHerencia peronsaHerencia : personasHerencia) {
            obj.put("id", peronsaHerencia.id);
            personaCaso.put("id", peronsaHerencia.personaCaso.id);
            obj.put("personaCaso", personaCaso);
            arr.add(obj);
            obj = Json.newObject();
            personaCaso = Json.newObject();
        }
        return arr;
    }
}