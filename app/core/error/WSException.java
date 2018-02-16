package core.error;

public class WSException extends Exception {

    public WSException() {}

    public WSException(String message) {
        super(message);
    }

    public WSException(Throwable cause) {
        super(cause);
    }

    public WSException(String message, Throwable cause) {
        super(message, cause);
    }

}