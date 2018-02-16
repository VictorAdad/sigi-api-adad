package models;

import io.ebean.Finder;

import javax.persistence.Entity;

@Entity
public class Pais extends BaseName implements BaseName.Catalogo{

    // Finder para uso de la super class y sus accesos mas sencillos
    public static final Finder<Long, Pais> find = new Finder<>(Pais.class);
}
