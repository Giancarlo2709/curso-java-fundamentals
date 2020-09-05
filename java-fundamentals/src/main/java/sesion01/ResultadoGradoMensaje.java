package sesion01;

import java.util.Scanner;


/*
Segun el grado, decirle en que rango esta su puntaje
 */
public class ResultadoGradoMensaje {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("es un numero 1");
                break;
            case 2:
                System.out.println("es un numero 2");
                break;
            case 3:
                System.out.println("es un numero 3");
                break;
            default:
                System.out.println("es cualquier otro numero");
        }*/

        System.out.println("Ingrese el grado al que pertenece");
        String grado = scanner.next(); // A, B, C, D, E

        String mensaje = "";

        char grado2 = grado.charAt(0);// A

        switch (grado2) {
            case 'A' :
                mensaje = "¡Excelente trabajo!, su puntaje es más de 90";
                break;
            case 'B':
                mensaje = "¡Gran Trabajo!, su puntaje es menor a 90 y mayor a 80";
                break;
            case 'C':
                mensaje = "¡Buen Trabajo!, su puntaje es menor a 80 y mayor a 70";
                break;
            case 'D':
                mensaje ="¡Necesitas esforzarte un poco más!, su puntaje es menor a 70";
                break;
            case 'E':
                mensaje = "¡No Puede ser!, su puntaje es menor a 60";
                break;
            default:
                mensaje = "grado incorrecto";
        }

        System.out.println(mensaje);


    }
}
