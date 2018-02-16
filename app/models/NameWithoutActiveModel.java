package models;

import javax.persistence.MappedSuperclass;
import javax.persistence.Column;
import play.data.validation.Constraints;

@MappedSuperclass
public class NameWithoutActiveModel extends BaseModel {
    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(100 Char)")
    public String nombre;
}
