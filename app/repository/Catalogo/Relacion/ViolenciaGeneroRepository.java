package repository;

import io.ebean.PagedList;
import java.util.List;
import javax.inject.Inject;
import models.ViolenciaGenero;
import play.db.ebean.EbeanConfig;

public class ViolenciaGeneroRepository extends BaseRepository{
    private static final String FIELD = "delincuenciaOrganizada";

    @Inject
    public ViolenciaGeneroRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, ViolenciaGenero.class);
    }

    public PagedList<ViolenciaGenero> page(int page, int pageSize, String sortBy, String order, String filter) {
        String[] fields = {FIELD};
        return super.page(page, pageSize, sortBy, order, filter, fields);
    }

    public List<ViolenciaGenero> list() {
        return super.list(super.getEbeanServer().find(ViolenciaGenero.class).where());
    }
}
