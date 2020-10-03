package sesion04.excepciones.personalizadas;

public class HorasPermitidas {

    static int horas = 50;

    public static void main(String[] args) throws Exception {
        if (horas > 48) {
            throw new NoOvertimeAllowedException("Horas extras no estan permitidas");
        }
    }
}
