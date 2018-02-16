package core.error;

public class CustomFinderException extends Exception {

    public CustomFinderException() {}

    public CustomFinderException(String message) {
        super(message);
    }

    public CustomFinderException(Throwable cause) {
        super(cause);
    }

    public CustomFinderException(String message, Throwable cause) {
        super(message, cause);
    }

}
