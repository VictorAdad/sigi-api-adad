package models;

import io.ebean.Finder;
import io.ebean.Ebean;
import io.ebean.SqlRow;
import io.ebean.SqlQuery;
import io.ebean.CallableSql;
import io.ebean.Transaction;
import java.util.List;
import javax.persistence.Entity;
import play.Logger;
import play.data.validation.Constraints;
import javax.persistence.Column;
import java.text.Normalizer;
@Entity
public class Agencia extends BaseModel implements BaseModel.Catalogo{

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(200 Char)")
    public String nombre;

    // @Constraints.Required(groups = SaveStep.class)
    public Fiscalia fiscalia;

    // @Constrain ts.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(30 Char)")
    public String clave;

    @Column(columnDefinition="Varchar2(100 Char)")
    public String secuencia;

    // Finder para uso de la super class y sus accesos mas sencillos
    public static final Finder<Long, Agencia> find = new Finder<>(Agencia.class);

    public static Boolean createSequence(String nombreAgencia){

        Agencia agency = Agencia.find.query().where().eq("nombre", nombreAgencia).findUnique();
        Transaction txn = Ebean.beginTransaction();
        if (agency == null) {
            Agencia agencia = new Agencia();
            try{
                String cadenaNormalize = Normalizer.normalize(nombreAgencia, Normalizer.Form.NFD);   
                String cadenaSinAcentos = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
                agencia.nombre = cadenaSinAcentos.replaceAll("[^\\dA-Za-z' ']", "").replace(' ','_').toUpperCase();
                agencia.save();
                agencia.refresh();
                Logger.debug("Guardando la nueva agencia");
                // agencia = agencia.replaceAll("[^\\dB-DF-HJ-NP-TV-Zb-df-hj-np-tv-z' ']", "").replace(' ','_');
                String sql="SELECT SEQUENCE_NAME FROM user_sequences WHERE sequence_name='"+"SEQ_AGENCIA_"+agencia.id+"'";
                SqlQuery sqlQuery = Ebean.createSqlQuery(sql);
                List<SqlRow> list = sqlQuery.findList();
                try{
                    if (list.size() == 0){
                        Logger.debug("Guardando la secuencia SEQ_AGENCIA_"+agencia.id);
                        String sqlProcedure = "call SP_CREAR_SECUENCIA(?)";
                        CallableSql cs = Ebean.createCallableSql(sqlProcedure);
                        cs.setParameter(1, agencia.id);
                        Ebean.execute(cs);

                        agencia.secuencia = "SEQ_AGENCIA_"+agencia.id;
                        agencia.update();
                    }
                }catch (Exception e) {
                    Logger.error("Error al crear el sequence de " + agencia, e);
                }
                txn.commit();
                return true;
            } catch(Exception e) {
                Logger.error("Error al guardar la agencia " + nombreAgencia, e);
                txn.rollback();
                return false;
            }
        }
        txn.end();
        return false;
    }
}
