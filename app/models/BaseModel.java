package models;

import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;
import io.ebean.Model;

import java.sql.Timestamp;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

@MappedSuperclass
public class BaseModel extends Model {

    public static interface Catalogo{}

    @Id
    @SequenceGenerator(name = "gen" ,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen")
    public Long id;

    @WhenCreated
    public Timestamp created;

    @WhenModified
    public Timestamp updated;

    public String createdBy;

    public String updatedBy;

    public static interface SaveStep { }
    public static interface UpdateStep { }
}
