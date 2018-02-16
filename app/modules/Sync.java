package modules;

import javax.inject.Singleton;
import javax.inject.Inject;
import play.Configuration;
import play.Logger;
import repository.SyncRepository;

@Singleton
public class Sync{

    private Configuration configuration;

    @Inject
    public Sync(Configuration conf) 
    {
        Logger.debug("Se esta arrancando backend...");
        this.configuration = conf;
        
        try {
            initSync(this.configuration);
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }

    protected void initSync(Configuration config){
        SyncRepository startup = new SyncRepository(config);
        startup.init();
    }
}
