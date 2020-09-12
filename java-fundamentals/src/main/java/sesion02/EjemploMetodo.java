package sesion02;


import java.util.Scanner;

/*
Escriba un método que le pregunte a un usuario su nombre, luego lo saluda por su nombre.
 */
public class EjemploMetodo {

    private static Scanner scanner = new Scanner(System.in);
    private static int numero1;
    private static int numero2;

    public static void main(String[] args) {
        System.out.println("Ingresa tu nombre");
        String nombre1 = scanner.next();

        System.out.println("Hola, " + obtenerNombre(nombre1));

        System.out.println("Ingrese numero 1: ");

        numero1 = scanner.nextInt();//reserva un espacio en memoria, y guarda el valor en este espacio

        System.out.println("Ingrese numero 2: ");

        numero2 = scanner.nextInt();

        System.out.println("la suma es: " + calcularSuma());
        System.out.println("El producto es: " + calcularProducto(numero1, numero2));
    }

    public static String obtenerNombre(String nombre) {
        return nombre;
    }

    public static int calcularSuma() {
        return numero1 + numero2;
    }

    public static int calcularProducto(int numero1, int numero2) {
        return numero1 * numero2;
    }
}
