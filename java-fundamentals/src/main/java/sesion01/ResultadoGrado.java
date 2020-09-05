package sesion01;

import java.util.Scanner;

/*
 * IF-ELSE-IF
 * Muestre el grado de un estudiante en función a su puntaje en la prueba.
 * 60 < E
 * < 70 D
 * < 80 C
 * < 90 B
 * > 90 A
 *  */
public class ResultadoGrado {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el puntaje de la prueba");
        double puntaje = scanner.nextDouble();

        // '1', '2', 'a', 'b'
        char grado;

        if (puntaje < 60) {
            grado = 'E';
        } else if(puntaje < 70) {
            grado = 'D';
        } else if (puntaje < 80){
            grado = 'C';
        } else if(puntaje < 90) {
            grado = 'B';
        } else {
            grado = 'A';
        }

        System.out.println("Usted ha obtenido el grado: " + grado);
    }
}
