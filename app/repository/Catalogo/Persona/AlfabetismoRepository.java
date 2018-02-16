package repository;

import io.ebean.ExpressionList;
import io.ebean.PagedList;
import java.util.Map;
import javax.inject.Inject;
import models.Alfabetismo;
import play.db.ebean.EbeanConfig;

public class AlfabetismoRepository extends BaseRepository{

	private static final String FIELD = "nombre";

    @Inject
    public AlfabetismoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, Alfabetismo.class);
    }

    public PagedList<Alfabetismo> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public Map<String, String> options() {
        ExpressionList<Alfabetismo>  exp = super.getEbeanServer().find(Alfabetismo.class).where();
        exp.orderBy(FIELD);
        return super.options(exp, "id", FIELD);
    }

}
