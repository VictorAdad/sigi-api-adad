import play.http.HttpErrorHandler;
import play.mvc.*;
import play.libs.Json;
import play.mvc.Http.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import javax.inject.Singleton;
import core.error.ErrorInfo;
import play.Logger;

@Singleton
public class ErrorHandler implements HttpErrorHandler {
    public CompletionStage<Result> onClientError(RequestHeader request, int statusCode, String message) {
        return CompletableFuture.completedFuture(
                Results.status(statusCode,Json.parse("{\"message\":\"Resource not found\",\"estatus\":\"404\"}" + message))
        );
    }

    public CompletionStage<Result> onServerError(RequestHeader request, Throwable exception) {
        ErrorInfo info =new ErrorInfo();
        info.setUri(request.uri());
        info.setMetodo(request.method());
        info.setMessage(ErrorInfo.getMessages(exception.getMessage()));
        info.setLog(ErrorInfo.parseToJson(exception.getMessage()));
        return CompletableFuture.completedFuture(
                Results.internalServerError(Json.toJson(info))
        );
    }
}
