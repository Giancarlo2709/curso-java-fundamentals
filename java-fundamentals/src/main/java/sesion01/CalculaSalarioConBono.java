package sesion01;

import java.util.Scanner;

/*
Todos los vendedores reciben un pago de S/1000 por semana.
Los vendedores que superen las 10 ventas obtienen un bono adicional de S/250.
 */
public class CalculaSalarioConBono {

    static double sueldoFijo = 1000;
    static int cuota = 10;
    static double bono = 250;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¿Cuantas ventas hizo el empleado esta semana?");
        int numeroVentas = scanner.nextInt();
        double salarioTotal = sueldoFijo;

        if (numeroVentas > cuota) {
            salarioTotal = salarioTotal + bono;
        }

        //Imprimir el resultado
        System.out.println("El pago del empleado es S/ " + salarioTotal);
    }
}
