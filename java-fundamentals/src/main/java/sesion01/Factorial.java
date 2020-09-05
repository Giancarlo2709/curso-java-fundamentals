package sesion01;

import java.util.Scanner;

/*
dado un numero en consola, imprimir su factorial
 */
public class Factorial {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el numero:");
        int numero = scanner.nextInt(); // 3

        // !5 = 1 * 2 * 3 * 4 * 5
        // !6 = 1 * 2 * 3 * 4 * 5 * 6

        long factorial = 1;
        int inicializacion = 1;
        while (inicializacion <= numero) {
            factorial = factorial * inicializacion;
            inicializacion = inicializacion + 1; // 2
        }

        /*  inicializacion   factorial
            1                1 * 1 = 1
            2                1 * 2 = 2
            3                2 * 3 = 6
            4
         */

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
