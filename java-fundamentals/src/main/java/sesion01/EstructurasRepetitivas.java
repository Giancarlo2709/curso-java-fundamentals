package sesion01;

import java.util.Scanner;

public class EstructurasRepetitivas {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        Inicialización
        Condición
        Bloque de sentencias
        Actualización
         */

        /*// inicializacion
        while (condicion) {
            // Bloque se sentencia
            // actualizacion
        }*/


        int numeros = 10;

        int i = 11;
        while (i <= numeros) {
            System.out.println(i);
            i = i  + 1;
        }

        /*// inicializacion
        do {
            //bloque de sentencias
            //actualizacion
        } while(condicion);*/


        System.out.println("****** Do While******");
        int a = 1;
        do {
            System.out.println(a);
            a = a + 1; // a++;
        } while (a <= numeros);

        System.out.println("****** FOR ******");

        /* for (inicializacion; condicion; actualizacion){
            // bloque de sentencias
        }*/

        for (int c = 1; c <= numeros ; c++) {
            System.out.println(c);
        }

        // ForEach

        String[] nombres = new String[3]; // 5 elementos
        // for(TipoDeDato nombreVariable : coleccion) {
        //Bloque de sentencias
        // }
        nombres[0] = "Giancarlo";
        nombres[1] = "Elvis";
        nombres[2] = "Yarlequé";

        System.out.println(" ********** ForEach **********");

        for (String miNombre : nombres) {
            System.out.println(miNombre);
        }

    }
}
