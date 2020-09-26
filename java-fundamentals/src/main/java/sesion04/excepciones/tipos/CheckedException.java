package sesion04.excepciones.tipos;

public class CheckedException {

    public static void main(String[] args) {
        Matematicas matematicas = new Matematicas();
        primeraForma(matematicas);
        // segundaForma(matematicas);
    }

    private static void primeraForma(Matematicas matematicas) {
        try {
            double resultado = matematicas.dividir(5, 0);
            System.out.println("El resultado es: " + resultado);
        } catch (Exception e) {
            System.out.println("No se puede dividir por cero");
        }
    }

    private static void segundaForma(Matematicas matematicas) throws Exception {
        double resultado = matematicas.dividir(5, 2);
    }
}
