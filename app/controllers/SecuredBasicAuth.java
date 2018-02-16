package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.typesafe.config.Config;

import play.*;
import play.mvc.*;
import java.util.concurrent.CompletionStage;
import play.libs.F;
import models.Usuario;
import java.util.Base64;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.nio.charset.Charset;
import org.mindrot.jbcrypt.BCrypt;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.*;
import play.Logger;
import static java.util.concurrent.CompletableFuture.supplyAsync;
import javax.inject.Inject;


public class SecuredBasicAuth extends play.mvc.Action.Simple {

    private final Config config;

    private HttpExecutionContext httpExecutionContext;

    private final WSClient ws;

    @Inject
    public SecuredBasicAuth(
        Config config,
        HttpExecutionContext httpExecutionContext,
        WSClient ws) {
        this.config = config;
        this.httpExecutionContext = httpExecutionContext;
        this.ws  = ws;
    }

    public CompletionStage<Result> call(Http.Context ctx) {

        boolean active = config.getBoolean("oam.active");
        Logger.debug("SecuredBasicAuth: {}", active);

        JsonNode json = null;

        if(active){
            try{
                final String[] token = ctx.request().headers().get("SIGI-Token");
                
                WSRequest request = ws.url(config.getString("oam.host")+"/info?access_token="+token[0])
                .addHeader("X-OAUTH-IDENTITY-DOMAIN-NAME", config.getString("oam.domainName"));

                CompletionStage<JsonNode> response  = request.get().thenApply(r -> r.getBody(WSBodyReadables.instance.json()));

                json = response.toCompletableFuture().get();
            }catch(Exception e){
                return supplyAsync(() -> Results.unauthorized("unauthorized"), httpExecutionContext.current() );
            }

            if(json != null)
                return delegate.call(ctx);

            return supplyAsync(() -> Results.unauthorized("unauthorized"), httpExecutionContext.current() );
        }else{
            return delegate.call(ctx);
        }
    }



    // Respaldo de codigo para conectarse a base
    //
    // public F.Promise<Result> call(Http.Context ctx) throws Throwable {
    //     String[] credentials = getBasicTokenFromHeader(ctx);
    //     if (credentials != null) {
    //         Usuario user = Usuario.find.where().eq("userName", credentials[0]).findUnique();
    //         List<String> access = play.Configuration.root().getStringList("Evomatik.ws.accessControl");
    //         List<Usuario> usersAccess = new ArrayList<Usuario>();

    //         if (access.size() != 0) {
    //             for (String userNameAccess: access) {
    //                 Usuario userFound = Usuario.find.where().eq("userName", userNameAccess).findUnique();
    //                 if (userFound != null) {
    //                     usersAccess.add(userFound);
    //                 }
    //             }
    //             if (usersAccess.size() != 0) {
    //                 for (Usuario userCheck: usersAccess) {
    //                     if (user != null && BCrypt.checkpw(credentials[1], user.getPassword()) && user.getActivo() == true) {
    //                         if ( (userCheck != null && user.getUserName().equals(userCheck.getUserName())) ) {
    //                             ctx.request().setUsername(user.getUserName());
    //                             return delegate.call(ctx);
    //                         }
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     Result unauthorized = Results.unauthorized("unauthorized");
    //     return F.Promise.pure(unauthorized);
    // }

    private String[] getBasicTokenFromHeader(Http.Context ctx) {
        final String[] authorization = ctx.request().headers().get("Authorization");
        if (authorization != null && authorization[0].startsWith("Basic")) {
            // Authorization: Basic base64credentials
            String base64Credentials = authorization[0].substring("Basic".length()).trim();
            String credentials = new String(Base64.getDecoder().decode(base64Credentials),Charset.forName("UTF-8"));
            // credentials = username:password
            final String[] values = credentials.split(":",2);
            return values;
        }
        return null;
    }
}
