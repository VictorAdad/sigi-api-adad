package models;

import io.ebean.Finder;

import javax.persistence.Entity;

@Entity
public class TipoDomicilio extends NameBaseModel implements BaseModel.Catalogo{

    // Finder para uso de la super class y sus accesos mas sencillos
    public static final Finder<Long, TipoDomicilio> find = new Finder<>(TipoDomicilio.class);
}
