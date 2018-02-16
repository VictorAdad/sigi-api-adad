package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import io.ebean.Transaction;
import java.util.List;
import javax.inject.Inject;
import models.DocNic;
import play.db.ebean.EbeanConfig;
import play.libs.Json;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class DocNicRepository extends BaseRepository{

    @Inject
    public DocNicRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, DocNic.class);
    }

    public PagedList<DocNic> pageByCase(Long id, int page, String sortBy, String order, String filter, int tr) {
        ExpressionList<DocNic>  exp = super.getEbeanServer().find(DocNic.class).where();
        exp.eq("caso.id", id);
        String[] fields = {"nameEcm"};
        return super.page(page, sortBy, order, filter, fields, tr, exp);
    }
}
