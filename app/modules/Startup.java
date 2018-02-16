package modules;

import java.util.List;
import javax.inject.Singleton;
import javax.inject.Inject;
import play.Logger;
import models.Agencia;
import ldpaModels.Ldap;
import ldpaModels.Agency;
import com.typesafe.config.Config;

@Singleton
public class Startup{

    // private Config configuration;

    @Inject
    public Startup(Config configuration) 
    {
        System.out.println("Iniciando...");
        System.out.println("");
        System.out.println("   $$$$$$\\  $$$$$$\\  $$$$$$\\  $$$$$$\\        $$$$$$\\  $$$$$$$\\ $$$$$$\\       ");
        System.out.println("  $$  __$$\\ \\_$$  _|$$  __$$\\ \\_$$  _|      $$  __$$\\ $$  __$$\\\\_$$  _|      ");
        System.out.println("  $$ /  \\__|  $$ |  $$ /  \\__|  $$ |        $$ /  $$ |$$ |  $$ | $$ |             ");
        System.out.println("  \\$$$$$$\\    $$ |  $$ |$$$$\\   $$ |$$$$$$\\ $$$$$$$$ |$$$$$$$  | $$ |           ");
        System.out.println("   \\____$$\\   $$ |  $$ |\\_$$ |  $$ |\\______|$$  __$$ |$$  ____/  $$ |           ");
        System.out.println("  $$\\   $$ |  $$ |  $$ |  $$ |  $$ |        $$ |  $$ |$$ |       $$ |              ");
        System.out.println("  \\$$$$$$  |$$$$$$\\ \\$$$$$$  |$$$$$$\\       $$ |  $$ |$$ |     $$$$$$\\         ");
        System.out.println("   \\______/ \\______| \\______/ \\______|      \\__|  \\__|\\__|     \\______|     ");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");                       
    
        createSequence(configuration);
    }

    public static void createSequence(Config configuration){
        Ldap ldap = new Ldap(configuration);
        List<Agency> agenciasLdap = ldap.getAllAgencies();
        for(Agency agencia : agenciasLdap){
            //Logger.error("Nombre de agencia ldap" + agencia.getName());
            Agencia.createSequence(agencia.getName());
        }
    }

}