package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import io.ebean.Transaction;
import io.ebean.Ebean;
import io.ebean.SqlRow;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.CompletionStage;
import java.util.HashMap;
import java.util.List;
import java.text.Normalizer;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import models.Agencia;
import models.Arma;
import models.Caso;
import models.Delito;
import models.DelitoCaso;
import models.DocAcuerdo;
import models.DocArchivoTemporal;
import models.DocEntrevista;
import models.DocFacultadNoInvestigar;
import models.DocNic;
import models.DocNoEjercicioAccion;
import models.DocPredenuncia;
import models.DocSolPreAcuerdo;
import models.DocSolPreInspeccion;
import models.DocSolPrePericial;
import models.DocSolPrePolicia;
import models.DocSolPreRegistro;
import models.DocSolPreReqInfo;
import models.Entrevista;
import models.Estatus;
import models.Lugar;
import models.Acuerdo;
import models.PersonaCaso;
import models.Predenuncia;
import models.SolicitudPrePericial;
import models.SolicitudPrePolicia;
import models.TipoRelacionPersona;
import models.Vehiculo;
import models.Titular;
import ldpaModels.User;
import org.apache.commons.lang3.StringUtils;
import play.db.ebean.EbeanConfig;
import play.libs.Json;
import play.Logger.ALogger;
import play.Logger;
import com.typesafe.config.Config;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class CasoRepository extends BaseRepository {

    private static final String CASEIDENTIFIER = "caso.id";
    private final ALogger logger = Logger.of(this.getClass());

    private Config configuration;

    @Inject
    public CasoRepository(EbeanConfig ebeanConfig, Config configuration) {
        super(ebeanConfig, Caso.class);
        this.configuration = configuration;
    }

    public PagedList<Caso> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {"titulo"};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public PagedList<Caso> pageByTitular(int page, String sortBy, String order, String filter, int tr, String userName) {
        ExpressionList<Caso>  exp = super.getEbeanServer().find(Caso.class).where();
        exp.eq("titulares.userNameAsignado", userName);
        String[] fields = {"nic", "nuc", "titulo", "personasCasos.persona.nombre"};
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }

    public PagedList<Caso> pageByFiscalia(int page, String sortBy, String order, String filter, int tr, String fiscalia) {
        ExpressionList<Caso>  exp = super.getEbeanServer().find(Caso.class).where();
        exp.eq("fiscalia", fiscalia);
        String[] fields = {"nic", "nuc", "titulo", "personasCasos.persona.nombre"};
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }

    public Object save(Object data, Long idDelito) throws PersistenceException, NullPointerException{
        Object object = data;
        Transaction txn = ebeanServer.beginTransaction();
        try {
            ebeanServer.save(object);
            
            DelitoCaso delitoCaso = new DelitoCaso();
            delitoCaso.caso = Caso.find.byId(((Caso)object).id);
            Estatus estatus = Estatus.find.query().where().eq("nombre", "Noticia de hechos").findUnique();
            Caso caso = new Caso();
            caso = Caso.find.byId(((Caso)object).id);
            // Generación del nic con el consecutivo de agencia
            User user = Titular.find.query().where().eq("caso.id",caso.id).eq("vigente",true).findUnique().getPropietario(configuration);
            //sequence nombre de la secuencia de base 
            String sequence = (user.getAdscripcion());
            String cadenaNormalize = Normalizer.normalize(sequence, Normalizer.Form.NFD);   
            String cadenaSinAcentos = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
            sequence=cadenaSinAcentos.replaceAll("[^\\dA-Za-z' ']", "").replace(' ','_').toUpperCase();
            Agencia agencia = Agencia.find.query().where().eq("nombre", sequence).findUnique();
            // sequence = sequence.replaceAll("[^\\dB-DF-HJ-NP-TV-Zb-df-hj-np-tv-z' ']", "").replace(' ','_');
            String sql = "SELECT "+agencia.secuencia+".nextval as consecutivo FROM dual";
            SqlRow sqlRow = Ebean.createSqlQuery(sql).findUnique();
            String consecutivo = sqlRow.getString("consecutivo");
            caso.nic = delitoCaso.caso.nic.replaceAll("NICID",StringUtils.leftPad(((consecutivo == null ? ((Caso)object).id.toString() : consecutivo)),5,"0"));
            
            caso.estatus = estatus;
            caso.update();

            delitoCaso.delito = Delito.find.byId(idDelito);
            delitoCaso.principal = true;
            delitoCaso.save();

            ebeanServer.refresh(object);
            txn.commit();
        } catch (PersistenceException e) {
            logger.error("Error while trying to save object registry in database", e);
            logger.error("Data: {}", Json.toJson(object));
            txn.rollback();
            throw new PersistenceException();
        } catch (NullPointerException e) {
            logger.error("Error while trying to save object registry in database", e);
            logger.error("Data: {}", Json.toJson(object));
            txn.rollback();
            throw new NullPointerException();
        }
        txn.end();
        return object;
    }

    public HashMap<String,Object> getAll(Long id) {
        logger.debug("CasoRepository@getAll... ");
        HashMap<String, Object> list = new HashMap<String, Object>();
        Object obj = ebeanServer.find(Caso.class).setId(id).findUnique();
        if (obj != null) {
            logger.debug("Object Found: "+Json.prettyPrint(Json.toJson(obj)));
        }else{
            logger.error("Object not Found :(");
        }
        List<DelitoCaso> delitoCasos = ebeanServer.find(DelitoCaso.class)
            .where()
            .eq("caso.id",id)
            .findList();
        List<PersonaCaso> personaCasos = ebeanServer.find(PersonaCaso.class)
            .where()
            .eq("caso.id",id)
            .findList();
        List<Arma> armas = ebeanServer.find(Arma.class)
            .where()
            .eq("caso.id",id)
            .findList();
        List<Lugar> lugares = ebeanServer.find(Lugar.class)
            .where()
            .eq("caso.id",id)
            .findList();
        List<Vehiculo> vehiculos = ebeanServer.find(Vehiculo.class)
            .where()
            .eq("caso.id",id)
            .findList();
        List<TipoRelacionPersona> tipoRelacionPersonas = ebeanServer.find(TipoRelacionPersona.class)
            .where()
            .eq("caso.id",id)
            .findList();
        List<Entrevista> entrevistas = ebeanServer.find(Entrevista.class)
            .where()
            .eq("caso.id",id)
            .findList();
        Predenuncia predenuncias = ebeanServer.find(Predenuncia.class)
            .where()
            .eq("caso.id",id)
            .findUnique();
        Acuerdo acuerdos = ebeanServer.find(Acuerdo.class)
            .where()
            .eq("caso.id",id)
            .eq("tipo", "Acuerdo Inicio")
            .findUnique();
        List<SolicitudPrePericial> solicitudPrePericiales = ebeanServer.find(SolicitudPrePericial.class)
            .where()
            .eq("caso.id",id)
            .findList();
        List<SolicitudPrePolicia> solicitudPrePolicias = ebeanServer.find(SolicitudPrePolicia.class)
            .where()
            .eq("caso.id",id)
            .findList();
        JsonNode titulares = Json.toJson(ebeanServer.find(Titular.class)
            .where()
            .eq("caso.id",id)
            .findList());
        for (JsonNode titular : titulares) {
            User propietario = Titular.getPropietarioTitular(configuration,titular.get("id").longValue());
            ((ObjectNode) titular).put("propietario", Json.toJson(propietario));
        }
        
        list.put("id",((Caso)obj).id);
        list.put("created",((Caso)obj).created);
        list.put("createdBy",((Caso)obj).createdBy);
        list.put("titulo",((Caso)obj).titulo);
        list.put("descripcion",((Caso)obj).descripcion);
        list.put("nic",((Caso)obj).nic);
        list.put("nicCreated",((Caso)obj).nicCreated);
        list.put("nicCreatedBy",((Caso)obj).nicCreatedBy);
        list.put("nuc",((Caso)obj).nuc);
        list.put("nucCreated",((Caso)obj).nucCreated);
        list.put("detenido",((Caso)obj).detenido);
        list.put("estatus",((Caso)obj).estatus);
        list.put("agencia",((Caso)obj).agencia);
        list.put("delitoPrincipal",((Caso)obj).getDelitoPrincipal());
        list.put("hasRelacionVictimaImputado",((Caso)obj).getHasRelacionVictimaImputado());
        list.put("hasPredenuncia",((Caso)obj).getHasPredenuncia());
        list.put("hasAcuerdoInicio",((Caso)obj).getHasAcuerdoInicio());
        list.put("delitoCaso",delitoCasos);
        list.put("personaCasos",personaCasos);
        list.put("armas",armas);
        list.put("lugares",lugares);
        list.put("vehiculos",vehiculos);
        list.put("tipoRelacionPersonas",tipoRelacionPersonas);
        list.put("entrevistas",entrevistas);
        list.put("predenuncias",predenuncias);
        list.put("solicitudPrePericiales",solicitudPrePericiales);
        list.put("solicitudPrePolicias",solicitudPrePolicias);
        list.put("acuerdoInicio",acuerdos);
        list.put("currentTitular", ((Caso)obj).currentTitular());
        list.put("titulares",titulares);



        return list;
    }

    public HashMap<String,Object> getDocuments(Long id) {
        logger.debug("CasoRepository@getDocuments... ");
        HashMap<String, Object> list = new HashMap<String, Object>();
        List<DocNic> docNic = ebeanServer.find(DocNic.class)
            .where()
            .eq("caso.id",id)
            .findList();
        List<DocAcuerdo> docAcuerdo = ebeanServer.find(DocAcuerdo.class)
            .where()
            .eq("acuerdo.caso.id",id)
            .findList();
        List<DocArchivoTemporal> docArchivoTemporal = ebeanServer.find(DocArchivoTemporal.class)
            .where()
            .eq("archivoTemporal.caso.id",id)
            .findList();
        List<DocEntrevista> docEntrevista = ebeanServer.find(DocEntrevista.class)
            .where()
            .eq("entrevista.caso.id",id)
            .findList();
        List<DocFacultadNoInvestigar> docFacultadNoInvestigar = ebeanServer.find(DocFacultadNoInvestigar.class)
            .where()
            .eq("facultadNoInvestigar.caso.id",id)
            .findList();
        List<DocNoEjercicioAccion> docNoEjercicioAccion = ebeanServer.find(DocNoEjercicioAccion.class)
            .where()
            .eq("noEjercicioAccionPenal.caso.id",id)
            .findList();
        List<DocPredenuncia> docPredenuncia = ebeanServer.find(DocPredenuncia.class)
            .where()
            .eq("predenuncia.caso.id",id)
            .findList();
        List<DocSolPreAcuerdo> docSolPreAcuerdo = ebeanServer.find(DocSolPreAcuerdo.class)
            .where()
            .eq("solicitudPreAcuerdo.caso.id",id)
            .findList();
        List<DocSolPreInspeccion> docSolPreInspeccion = ebeanServer.find(DocSolPreInspeccion.class)
            .where()
            .eq("solicitudPreInspeccion.caso.id",id)
            .findList();
        List<DocSolPrePericial> docSolPrePericial = ebeanServer.find(DocSolPrePericial.class)
            .where()
            .eq("solicitudPrePericial.caso.id",id)
            .findList();
        List<DocSolPrePolicia> docSolPrePolicia = ebeanServer.find(DocSolPrePolicia.class)
            .where()
            .eq("solicitudPrePolicia.caso.id",id)
            .findList();
        List<DocSolPreRegistro> docSolPreRegistro = ebeanServer.find(DocSolPreRegistro.class)
            .where()
            .eq("solicitudPreRegistro.caso.id",id)
            .findList();
        List<DocSolPreReqInfo> docSolPreReqInfo = ebeanServer.find(DocSolPreReqInfo.class)
            .where()
            .eq("solicitudPreReqInfo.caso.id",id)
            .findList();
        if (list != null) {
            logger.debug("Object Found: "+Json.prettyPrint(Json.toJson(list)));
        }else{
            logger.error("Object not Found :(");
        }
        list.put("DocNic",docNic);
        list.put("DocAcuerdo",docAcuerdo);
        list.put("DocArchivoTemporal",docArchivoTemporal);
        list.put("DocEntrevista",docEntrevista);
        list.put("DocFacultadNoInvestigar",docFacultadNoInvestigar);
        list.put("DocNoEjercicioAccion",docNoEjercicioAccion);
        list.put("DocPredenuncia",docPredenuncia);
        list.put("DocSolPreAcuerdo",docSolPreAcuerdo);
        list.put("DocSolPreInspeccion",docSolPreInspeccion);
        list.put("DocSolPrePericial",docSolPrePericial);
        list.put("DocSolPrePolicia",docSolPrePolicia);
        list.put("DocSolPreRegistro",docSolPreRegistro);
        list.put("DocSolPreReqInfo",docSolPreReqInfo);
        return list;
    }
}
