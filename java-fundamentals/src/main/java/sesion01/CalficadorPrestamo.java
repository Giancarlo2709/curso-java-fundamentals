package sesion01;

import java.util.Scanner;

/*
Para calificar para un préstamo, una persona debe ganar al menos S/3,000 y haber trabajado en su
trabajo actual durante al menos 2 años.
 */
public class CalficadorPrestamo {

    static Scanner scanner = new Scanner(System.in);
    static double montoMinimo = 3000;
    static int periodoTrabajoMinimo = 2;

    public static void main(String[] args) {

        System.out.println("Ingrese el sueldo del trabajador");
        double sueldo = scanner.nextDouble();

        System.out.println("Ingrese el periodo de trabajo actual");
        int periodoTrabajoActual = scanner.nextInt();

        if (estaCalificadoAlPrestamo(sueldo, periodoTrabajoActual)) {
            System.out.println("Felicidades! has aplicado al prestamo");
        } else {
            System.out.println("Lo Siento!, usted no ha aplicado al prestamo, se requiere un salario " +
            "minimo de " + montoMinimo + " y un periodo de trabajo minimo de " + periodoTrabajoMinimo + " años");
        }
    }

    public static boolean estaCalificadoAlPrestamo(double sueldo, int periodoTrabajoActual) {
        boolean resultado = false;

        if (sueldo >= montoMinimo && periodoTrabajoActual >= periodoTrabajoMinimo) {
            resultado = true;
        }

        return resultado;
    }
}
