package sesion04.excepciones.personalizadas;

public class NoOvertimeAllowedException extends Exception {

    private String message;

    public NoOvertimeAllowedException(String message) {
        super(message);
    }
}
