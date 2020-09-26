package sesion04.excepciones.tipos;

public class Matematicas {

    public double dividir(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("El argumento b no puede ser 0");
        }
        return a / b;
    }

    public double dividirUnChecked(double a, double b) {
        if (b == 0) {
            throw new RuntimeException("El argumento b no puede ser 0");
        }

        return a / b;
    }
}
