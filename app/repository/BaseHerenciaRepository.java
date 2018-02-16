package repository;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import java.lang.reflect.Field;

import models.PersonaHerencia;
import models.PersonaCaso;
import models.Entrevista;
import models.Estatus;
import models.Caso;
import core.util.Response;
import play.db.ebean.EbeanConfig;
import io.ebean.Transaction;
import play.Logger;
import play.Logger.ALogger;
import play.mvc.Results;
import play.mvc.Result;
import play.libs.Json;

import io.ebean.SqlRow;
import io.ebean.SqlQuery;
import io.ebean.Ebean;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import models.Acuerdo;

public class BaseHerenciaRepository extends BaseRepository{
    private final ALogger logger = Logger.of(this.getClass());
    
    @Inject
    public BaseHerenciaRepository(EbeanConfig ebeanConfig, Class cls) {
        super(ebeanConfig, cls);
    }

    @Override
    public Result save(Object data) {
        Logger.debug("BaseHerenciaRepository->Save");
        ArrayList arrObject = (ArrayList) data;
        String className = this.getClazz().getSimpleName();

        Object object = arrObject.get(0);
        String personas = arrObject.get(1).toString();
        String[] ids = personas.replace("[","").replace("]","").replace(" ","").split(",");
        Transaction txn = ebeanServer.beginTransaction();
        boolean existenPersonas = false;
        Object obj = this.getClazz().cast(object);
        if (personas != "[]") {
            existenPersonas = true;
        }
        try {  
            Field field = obj.getClass().getDeclaredField("caso");    
            field.setAccessible(true);
            Caso value = (Caso)field.get(obj);
            if (object != null) {
                if (className.equals("Acuerdo")) {
                    if(!((Acuerdo)object).tipo.equals("Acuerdo Radicación")){
                        Acuerdo acuerdo = super.getEbeanServer().find(Acuerdo.class).where().eq("caso.id", ((Acuerdo)object).caso.id).eq("tipo", "Acuerdo Inicio").findUnique();
                        if (acuerdo != null) {
                            txn.rollback();
                            return null;
                        }
                    }
                    ebeanServer.update(((Acuerdo)object).caso);
                    String tipo = (((Acuerdo)object).tipo);
                    Estatus estatus = null;
                    if (tipo.equals("Acuerdo Inicio")) {
                        estatus = Estatus.find.query().where().eq("nombre", "NUC creado").findUnique();
                    } else {
                        estatus = Estatus.find.query().where().eq("nombre", "Actuaciones").findUnique();
                    }
                    Caso caso = Caso.find.byId(((Acuerdo)object).caso.id);
                    Logger.debug("NUC" + caso.nuc);
                    String sql="select SQ_GLOBAL.nextval as last_number from dual";
                    SqlRow sqlRow = Ebean.createSqlQuery(sql).findUnique();
                    String  last_num= sqlRow.getString("last_number");
                    caso.nuc = caso.nuc.replaceAll("NUCSEQ",StringUtils.leftPad(((last_num == null ? caso.id.toString() : last_num)),6,"0"));
                    caso.estatus = estatus;
                    caso.update();  
                } else if (className.equals("ArchivoTemporal") || 
                    className.equals("FacultadNoInvestigar") || 
                    className.equals("HipotesisAmbito") || 
                    className.equals("NoEjercicioAccionPenal")) {
                    Estatus estatus = Estatus.find.query().where().eq("nombre", "Cierre relativo").findUnique();
                    Caso caso = Caso.find.byId(value.id);
                    caso.estatus = estatus;
                    caso.update();
                } else if (className.equals("Entrevista") || 
                    className.equals("SolicitudPreAcuerdo") || 
                    className.equals("SolicitudPreInspeccion") ||
                    className.equals("SolicitudPrePericial") ||
                    className.equals("SolicitudPrePolicia") ||
                    className.equals("SolicitudPreRegistro") ||
                    className.equals("SolicitudPreReqInfo")) {
                    Estatus estatus = Estatus.find.query().where().eq("nombre", "Actuaciones").findUnique();
                    Caso caso = Caso.find.byId(value.id);
                    caso.estatus = estatus;
                    caso.update();
                } 

                if (existenPersonas) {
                    Logger.debug("Existen personas");
                    ebeanServer.save(object, txn);
                    ebeanServer.refresh(object);

                    Field fieldId = obj.getClass().getSuperclass().getSuperclass().getDeclaredField("id");
                    fieldId.setAccessible(true);
                    Object valueId = fieldId.get(obj);
                    for (int i = 0; i < ids.length; i++) {
                        PersonaCaso persona = PersonaCaso.find.byId(Long.valueOf(ids[i]));
                        if (persona != null) {
                            PersonaHerencia existente = PersonaHerencia.findExistente(persona, Long.parseLong(valueId.toString()), this.getClazz().getSimpleName());
                            
                            if(existente == null){
                                PersonaHerencia personaHerencia = new PersonaHerencia();
                                personaHerencia.personaCaso = persona;
                                personaHerencia.actuacion = Long.parseLong(valueId.toString());
                                personaHerencia.tipo = this.getClazz().getSimpleName();
                                personaHerencia.save();
                            }
                        }
                    }
                } else {
                    Logger.debug("No existen personas");
                    super.save(object);
                }
                txn.commit();   
            } 
        } catch (Exception e) {
            logger.error("Error al realizar la transaccion save", e);
            txn.rollback();
            return Results.badRequest(Response.createError("Exception",e.getMessage()));
        }
        txn.end();
        return Results.ok(Json.toJson(object));
    }
}