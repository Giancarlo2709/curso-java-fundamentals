package reforzamiento;

import java.util.Scanner;

/*
 *Escribir una calculadora, donde yo pueda solicitar al usuario, que seleccione un menu, donde
 * 0: salir
 * 1: sumar
 * 2: restar
 * 3: multiplicar
 * 4: dividir
 * El programa debe solicitar la opcion a ejecutar (1, 2, 3, 4)
 * luego según la acción debe solicitar el ingreso de dos numeros
 * hacer el calculo de dichos numeros.
 * el programa debe salir cuando elija la opcion 0
 */
public class DoWhileExample {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0;

        do {
            System.out.println("Seleccione una opción: ");
            System.out.println("0. Salir");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");

            opcion = scanner.nextInt();

            switch(opcion) {
                case 0:
                    System.out.println("Gracias por usar nuestro sistema de calculadora. Lo esperamos pronto");
                    break;
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                default:
                    System.out.println("Ingrese una opcion válida");
            }

        } while (opcion != 0);

    }

    public static void sumar() {
        System.out.println("Ingrese primer número");
        int a = scanner.nextInt();
        System.out.println("Ingrese segundo número");
        int b = scanner.nextInt();
        System.out.println("La suma es: " + (a + b));
    }

    public static void restar() {
        System.out.println("Ingrese primer número");
        int a = scanner.nextInt();
        System.out.println("Ingrese segundo número");
        int b = scanner.nextInt();
        System.out.println("La diferencia es: " + (a - b));
    }

    public static void multiplicar() {
        System.out.println("Ingrese primer número");
        int a = scanner.nextInt();
        System.out.println("Ingrese segundo número");
        int b = scanner.nextInt();
        System.out.println("El producto es: " + (a * b));
    }

    public static void dividir() {
        System.out.println("Ingrese primer número");
        int a = scanner.nextInt();
        System.out.println("Ingrese segundo número");
        int b = scanner.nextInt();

        try {
            System.out.println("La división es: " + (a / b));
        } catch(Exception e) {
            System.out.println("No se puede dividir por cero");
        }
    }
}
