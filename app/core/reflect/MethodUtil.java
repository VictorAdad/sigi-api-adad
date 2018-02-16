package core.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import play.Logger;
import play.Logger.ALogger;

public class MethodUtil{

    private static final ALogger logger = Logger.of(new MethodUtil().getClass());

    /**
    *
    * Este metodo solo es por si se llegase a necesitas
    * es la misma funcionalidad que mandar a llamar directo el metodo
    * de la clase Method
    *
    * @see Method
    */
    public static Object invoker(Object object, Method method, Object[] paramsNames){
        logger.debug("MethodUtil@invoker(method, paramsNames) => ("+method+", "+paramsNames+")");
        
        Object obj = null;
        try {
            obj = method.invoke(object, paramsNames);
        }catch (IllegalAccessException aie) {
            logger.error("Metodo no es accesible", aie);
        }catch (IllegalArgumentException iarge) {
            logger.error("Metodo no es una instancia de la clase o los argumentos no son correctos", iarge);
        }catch (InvocationTargetException ite) {
            logger.error("Metodo arrojo una excepción", ite);
        }catch (NullPointerException npe) {
            logger.error("Objeto especificado es nulo", npe);
        }catch (ExceptionInInitializerError eiie) {
            logger.error("Error en la inicializacion del objeto", eiie);
        }
        return obj;
    }

    public static Method getMethod(Object object, String methodName, Class<?>[] paramTypes){
        logger.debug("MethodUtil@getMethod(methodName, paramTypes) => ("+methodName+", "+paramTypes+")");
        Method method = null;
        try{
            method = object.getClass().getMethod(methodName, paramTypes);
        }catch(NoSuchMethodException nsme){
            logger.error("No se encontro el metodo a ejecutar", nsme);
        }catch(NullPointerException npe){
            logger.error("Error nombre no es correcto", npe);
        }
        return method;
    }

    public static Class<?>[] getTypes(Object[] values){
        Class<?>[] parameters = new Class<?>[values.length];
        for (int i=0; i < values.length; i++) {
            logger.debug("Type found: "+values[i].getClass());
            if (values[i] instanceof Integer) {
                parameters[i] = Integer.TYPE;
            } else{
                parameters[i] = values[i].getClass();
            }
        }
        return parameters;
    }
}
