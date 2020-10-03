package reforzamiento.poo;

public class InvalidCustomDateTimeException extends Exception {

    private String message;

    public InvalidCustomDateTimeException(String message) {
        super(message);
    }

}
