package core.error;

public class TemplateEngineException extends Exception {

    public TemplateEngineException() {}

    public TemplateEngineException(String message) {
        super(message);
    }

    public TemplateEngineException(Throwable cause) {
        super(cause);
    }

    public TemplateEngineException(String message, Throwable cause) {
        super(message, cause);
    }

}