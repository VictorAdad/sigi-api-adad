package models;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class ActiveBaseModel extends BaseModel {
    @Column(columnDefinition="NUMBER(1,0) default 1")
    public boolean activo;
}