package sesion02;

import java.util.Random;

public class MasSobreArreglos {

    public static void main(String[] args) {
        int[][] enteros = new int[2][3];

        Random random = new Random();

        for(int i = 0; i < 2; i++) {
            for(int j=0; j < 3; j++) {
                enteros[i][j] = random.nextInt(10) + 1;
            }
        }

        for(int i = 0; i < 2; i++) {
            // System.out.println("******** Fila " + i + " ********");
            for(int j=0; j < 3; j++) {
                System.out.print(enteros[i][j] + " | ");
            }
            System.out.println();
        }
    }

}
