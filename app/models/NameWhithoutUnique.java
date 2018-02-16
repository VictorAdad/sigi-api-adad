package models;

import javax.persistence.MappedSuperclass;
import javax.persistence.Column;
import play.data.validation.Constraints;

@MappedSuperclass
public class NameWhithoutUnique extends ActiveBaseModel {
    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(200 Char)")
    public String nombre;
}