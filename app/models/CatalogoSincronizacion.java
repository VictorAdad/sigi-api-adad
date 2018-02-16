package models;

import io.ebean.Finder;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Column;
import play.data.validation.Constraints;
import core.util.ClassFinder;
import play.Logger;
import play.Logger.ALogger;
import java.util.UUID;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.InstantiationException;
import java.lang.IllegalAccessException;
import java.util.UUID;

@Entity
public class CatalogoSincronizacion extends BaseModel {

    private static final ALogger logger = Logger.of("models.CatalogoSincronizacion");

    public static String[] toSync = new String[]{
        "Catalogo"
    };

    @Column(columnDefinition="Varchar2(100 Char)")
    public String nombreCatalogo;

    @Column(columnDefinition="Varchar2(40 Char)")
    public String uuid;

    public static final Finder<Long, CatalogoSincronizacion> find = new Finder<>(CatalogoSincronizacion.class);

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nombreCatalogo);
        hash = 29 * hash + Objects.hashCode(this.uuid);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CatalogoSincronizacion other = (CatalogoSincronizacion) obj;

        return (
            !Objects.equals(this.nombreCatalogo, other.nombreCatalogo) ||
            !Objects.equals(this.uuid, other.uuid)
        ) ? false : true;
    }

    public static void loadContent(boolean active){
        if (!active){
            logger.warn("La Syncronizacion de Catalogos de la Tabla de Sincronización esta desactivada");
        }else{
            //Se realiza la sincronizacion de la tabla con todos los objects
            List<Class<?>> clazzes = ClassFinder.find("models");
            // logger.debug("Numero de Clases Encontradas en models: "+ClassFinder.counter(clazzes));
            // logger.debug("Lista de Clases: "+ClassFinder.print(clazzes));
            // 
            
            //Buscar Clases a Sincronizar
            clazzes = getClassestoSync(clazzes);

            logger.debug("Lista de Clases filtradas: "+ClassFinder.print(clazzes));


            CatalogoSincronizacion sc = null;
            for (Class cls: clazzes) {
                if (!cls.isInterface()) {  
                    sc = new CatalogoSincronizacion();
                    CatalogoSincronizacion obj = get(cls);

                    if (obj == null) {
                        sc.nombreCatalogo = cls.getSimpleName();
                        sc.uuid = UUID.randomUUID().toString();
                        sc.save();
                    }
                }
            }
        }
    }

    private static List<Class<?>> getClassestoSync(List<Class<?>> clazzes){
        Iterator<Class<?>> iter = clazzes.iterator();
        while (iter.hasNext()) {
            Class<?> val = iter.next();
            try{
                if (!val.isInterface()) {    
                    if(!interfaceExist(val)){
                        iter.remove();
                    }
                }
            }catch(Exception e){
                logger.error("Error Exception: "+e);
            }
        }
        return clazzes;
    }


    public static void sync(Class<?> clz){
        String name = clz.getSimpleName();
        
        if(interfaceExist(clz)){
            CatalogoSincronizacion catSinc = get(clz);
            if (catSinc != null) {
                catSinc.uuid = UUID.randomUUID().toString();
                catSinc.update();
            }
        }else{
            // Poner mensaje en consola de que no es una clase de sincronización
            logger.warn("Esta clase no esta permitida en la Sync");
        }
    }


    private static CatalogoSincronizacion get(Class clz){
        String modelString = clz.getSimpleName();
        CatalogoSincronizacion obj = CatalogoSincronizacion.find.query().where()
            .eq("nombreCatalogo", modelString)
            .findUnique();

        return obj;
    }

    private static boolean interfaceExist(Class clz){
        Class<?>[] impl = clz.getInterfaces();
        boolean isAvaliable = false;
        if (impl.length > 0) {
            for (Class cls: impl) {
                for (String className: toSync) {
                    if (!isAvaliable) {
                        if (cls.getSimpleName().equals(className)) {
                            isAvaliable = true;
                            
                        }
                    }
                }
            }
        }

        logger.debug("isAvaliable interface: "+isAvaliable);

        return isAvaliable;
    }
}
