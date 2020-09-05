package sesion01;

import java.util.Scanner;

/*
 * IF ELSE
Se espera que todos los vendedores realicen al menos 10 ventas por semana.
Para aquellos que lo hacen, reciben un mensaje de felicitación.
Para aquellos que no lo hacen, se les informa cuántas ventas les faltaron.
 */
public class CalculadoraVenta {

    static int cuota = 10;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el numero de ventas que realizó esta semana");
        int numeroVentas = scanner.nextInt();

        if (numeroVentas >= 10) {
            System.out.println("Felicidades! Usted llego a la meta de ventas");
        } else {
            int numeroDeVentasFaltantes = cuota - numeroVentas;
            System.out.println("LO sentimos Usted no llego a la meta, le faltó " + numeroDeVentasFaltantes + " ventas");
        }

    }
}
