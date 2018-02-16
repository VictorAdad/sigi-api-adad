package repository;

import io.ebean.PagedList;
import java.util.concurrent.CompletionStage;
import java.util.List;
import play.Logger;
import io.ebean.RawSqlBuilder;
import io.ebean.RawSql;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import javax.inject.Inject;
import models.Delito;
import play.db.ebean.EbeanConfig;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class DelitoRepository extends BaseRepository{

    private DatabaseExecutionContext executionContext;

    @Inject
    public DelitoRepository(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        super(ebeanConfig, Delito.class);
        this.executionContext = executionContext;
    }

    public PagedList<Delito> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {"nombre"};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public CompletionStage<List<Delito>> getByName(String name) {
        // name = Normalizer.normalize(name, Form.NFD)
            // .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        String sql = "SELECT id, nombre FROM DELITO WHERE instr( lower( convert( nombre, 'US7ASCII' ) ), lower( convert('"+name+"', 'US7ASCII' ) ) ) > 0 or instr( lower( nombre ), lower('"+name+"')) > 0";
        RawSql consulta = RawSqlBuilder.parse(sql)
            .columnMapping("id","id")
            .columnMapping("nombre","nombre")
            .create();
        List<Delito> delitos = ebeanServer.find(Delito.class)
            .setRawSql(consulta)
            .setParameter("nombre", name)
            .findList();
        return supplyAsync(() ->
            delitos
        , executionContext);
    }

    public List<Delito> list() {
        return super.list(super.getEbeanServer().find(Delito.class).where());
    }
}
