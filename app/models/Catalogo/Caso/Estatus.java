package models;

import javax.persistence.Entity;
import io.ebean.Finder;

@Entity
public class Estatus extends NameBaseModel implements BaseModel.Catalogo{
	public static final Finder<Long, Estatus> find = new Finder<>(Estatus.class);
}

