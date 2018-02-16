package core.util;

import play.Logger;
import java.io.File;
import java.io.IOException;

public class Directory {

    public static File createDirectory(String path){
        File dir = new File(path);
        if (!dir.exists()) {  //se comprueba si la ruta existe o no
            Logger.debug("El directorio " + dir.getName() + " no existe");
            if (dir.mkdir()) { //se crea la ruta. Si se ha creado correctamente
                Logger.debug("Directorio creado");
                return dir;
            } else {
                Logger.error("No se ha podido crear " + dir.getName());
                return null;
            }
        } else {  //si la ruta existe devolvemos el fichero
            return dir;
        }
    }

    public static File createFile(File path, String fileName){
        File f = new File(path, fileName);
        try{
            if (!f.exists()) {  //se comprueba si el fichero existe o no
                Logger.debug("Fichero " + f.getName() + " no existe");
                if (!path.exists()) {  //se comprueba si la ruta existe o no
                    Logger.debug("El directorio " + path.getName() + " no existe");
                    if (path.mkdir()) { //se crea la ruta. Si se ha creado correctamente
                        Logger.debug("Directorio creado");
                        if (f.createNewFile()) {  //se crea el fichero. Si se ha creado correctamente
                            Logger.debug("Fichero " + f.getName() + " creado");
                            return f;
                        } else {
                            Logger.error("No se ha podido crear " + f.getName());
                            return null;
                        }
                    } else {
                        Logger.error("No se ha podido crear " + path.getName());
                        return null;
                    }
                } else {  //si la ruta existe creamos el fichero
                    if (f.createNewFile()) {
                        Logger.debug("Fichero " + f.getName() + " creado");
                        return f;
                    } else {
                        Logger.debug("No se ha podido crear " + f.getName());
                        return null;
                    }
                }

            } else { //el fichero existe. Mostramos el tamaño
                return f;
            }
        }catch(IOException ioe){
            Logger.error("Error excepcion encontrada: " + ioe.getMessage());
            ioe.printStackTrace();
        }catch(Exception e){
            Logger.error("Error excepcion encontrada: " + e.getMessage());
            e.printStackTrace();
        }
        return f;
    }

    public static boolean delete(File file){
        if(file.exists()){
            Logger.debug(file.getAbsolutePath());
            if(file.delete()){
                Logger.debug("Fichero eliminado");
                return true;
            }  else{
                Logger.debug("No se ha podido eliminar");
                return false;
            }
        }  else{
            Logger.warn("El fichero " + file.getAbsolutePath() + " no existe");
            return false;
        }
    }
}