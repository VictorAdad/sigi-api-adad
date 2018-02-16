package core.error;
import play.Logger;
public class ErrorInfo {

    private String metodo;

    private String uri;

    private String message;

    private String log;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String errorMessage(String message) {
        return null;
    }

    public static String parseToJson(String data){
        int begin = data.indexOf("{");
        int end = data.lastIndexOf("}");
        end = end + 1;
        data = data.substring(begin, end);
        return data;
    }

    public static String getMessages(String message){
        return null;
    }
}