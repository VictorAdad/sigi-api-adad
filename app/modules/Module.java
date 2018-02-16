package modules;

import com.google.inject.AbstractModule;
import modules.Sync;


public class Module extends AbstractModule {

    @Override
    public void configure() {
        bind(Startup.class).asEagerSingleton();
        bind(Sync.class).asEagerSingleton();
    }

}
