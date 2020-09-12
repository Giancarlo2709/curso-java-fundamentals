package sesion02;


import java.util.Scanner;

/*
Escriba un método que le pregunte a un usuario su nombre, luego lo saluda por su nombre.
 */
public class EjemploMetodo {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresa tu nombre");
        String nombre1 = scanner.next();

        System.out.println("Hola, " + obtenerNombre(nombre1));

        int numero1 = 5;
        int numero2 = 6;

        System.out.println("la suma es: " + calcularSuma(numero1, numero2));
    }

    public static String obtenerNombre(String nombre) {
        return nombre;
    }

    public static int calcularSuma(int numero1, int numero2) {
        return numero1 + numero2;
    }
}
