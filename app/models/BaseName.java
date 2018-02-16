package models;

import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import play.data.validation.Constraints;
import com.fasterxml.jackson.annotation.JsonIgnore;

@MappedSuperclass
public class BaseName{

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(200 Char)")
    public String nombre;

    @Id
    @SequenceGenerator(name = "gen" ,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen")
    public Long id;

    @JsonIgnore
    @WhenCreated
    public Timestamp created;
    
    @JsonIgnore
    @Column(columnDefinition="NUMBER(1,0) default 1")
    public boolean activo;

    @JsonIgnore
    @WhenModified
    public Timestamp updated;

    @JsonIgnore
    public String createdBy;
    
    @JsonIgnore
    public String updatedBy;

    public static interface Catalogo{}
    public static interface SaveStep { }
    public static interface UpdateStep { }

}
