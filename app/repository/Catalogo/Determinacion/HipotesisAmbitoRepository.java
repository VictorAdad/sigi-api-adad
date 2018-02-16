package repository;

import io.ebean.PagedList;
import io.ebean.ExpressionList;
import java.util.Map;
import java.util.List;
import javax.inject.Inject;
import models.HipotesisAmbito;
import play.db.ebean.EbeanConfig;

public class HipotesisAmbitoRepository extends BaseRepository{
    private static final String FIELD = "ambitoHechos";

    @Inject
    public HipotesisAmbitoRepository(EbeanConfig ebeanConfig) {
        super(ebeanConfig, HipotesisAmbito.class);
    }

    public List<HipotesisAmbito> list() {
        return super.list(super.getEbeanServer().find(HipotesisAmbito.class).where());
    }
}
