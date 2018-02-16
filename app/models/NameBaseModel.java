package models;

import javax.persistence.MappedSuperclass;
import javax.persistence.Column;
import play.data.validation.Constraints;

@MappedSuperclass
public class NameBaseModel extends ActiveBaseModel {
    @Constraints.Required(groups = SaveStep.class)
    @Column(unique=true, columnDefinition="Varchar2(200 Char)")
    public String nombre;
}