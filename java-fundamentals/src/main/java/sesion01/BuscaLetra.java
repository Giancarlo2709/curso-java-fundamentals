package sesion01;

import java.util.Scanner;

/*
 * LOOP BREAK
 * Busque una cadena para determinar si contiene la letra "A".
 */
public class BuscaLetra {

    public static void main(String[] args) {
        System.out.println("Ingrese un texto");
        Scanner scanner = new Scanner(System.in);// Esto es un texto

        String texto = scanner.next();

        boolean letraEncontrada = false;

        int posicionEncontrada = -1;

        for(int i = 0; i < texto.length(); i++) {
            char letraActual = texto.charAt(i);
            if (letraActual == 'A' || letraActual == 'a') {
                posicionEncontrada = i;
                letraEncontrada = true;
                break;
            }
        }

        if (letraEncontrada == true) {
            System.out.println("Este texto contiene la letra 'A' en la posicion " + (posicionEncontrada + 1) );
        } else {
            System.out.println("Este texto no contiene la letra 'A'");
        }

    }
}
