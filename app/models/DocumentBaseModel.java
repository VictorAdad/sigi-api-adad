package models;

import javax.persistence.MappedSuperclass;
import javax.persistence.Column;

import play.data.validation.Constraints;

@MappedSuperclass
public class DocumentBaseModel extends BaseModel {

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(300 Char)")
    public String uuidEcm;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(300 Char)")
    public String pathEcm;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(300 Char)")
    public String nameEcm;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(300 Char)")
    public String contentType;

	@Column(columnDefinition="NUMBER(1,0) default 0")
	public boolean compartido;

    @Constraints.Required(groups = SaveStep.class)
    @Constraints.MaxLength(10)
    public String extension;

    @Constraints.Required(groups = SaveStep.class)
    @Constraints.MaxLength(10)
    public String tipo;

}