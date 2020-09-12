package sesion02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class TicketLoteria2 {

    private static int numeroDeElementos = 6;
    private static int max = 20;

    public static void main(String[] args) {
        Integer[] tickets = generarNumeros();
        boolean encontrado = busquedaSecuencial(tickets, 5);
        // boolean encontradoBinario = busquedaBinaria(tickets, 5);

        Arrays.sort(tickets, Collections.reverseOrder());
        System.out.println(encontrado);
        // System.out.println(encontradoBinario);

        imprimirTickets(tickets);
    }

    public static Integer[] generarNumeros() {
        Integer[] tickets = new Integer[numeroDeElementos];
        Random random = new Random();

        for (int i = 0; i < numeroDeElementos; i++) {
            tickets[i] = random.nextInt(max) + 1;
        }

        return tickets;
    }

    public static boolean busquedaSecuencial(Integer[] array, int datoABuscar) {
        /*for(int numero : array) {
            if (numero == datoABuscar){
                return true;
            }
        }*/

        for(int i = 0; i < array.length; i++) {
            if (array[i] == datoABuscar){
                return true;
            }
        }

        return false;
    }

    public static boolean busquedaBinaria(int[] array, int datoABuscar) {
        Arrays.sort(array, array.length -1, 0);

        int index = Arrays.binarySearch(array, datoABuscar);

        if (index >= 0) {
            return true;
        }

        return false;

    }

    public static void imprimirTickets(Integer[] tickets) {
        for(int j = 0; j < tickets.length ; j++) {
            System.out.print(tickets[j] + " | ");
        }
    }
}
