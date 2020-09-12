package ejercicios.sesion01;

import java.util.Scanner;

public class CambioPorUnJuegoSol {

    public static void main(String args[]){

        double unCentimo = 0.01;
        double cincoCentimos= 0.05;
        double diezCentimo = 0.10;
        double veinteCincoCentimo = 0.25;
        int sol = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a 'Cambio por un Sol'! " +
                "Su meta es ingresar suficiente cambio para hacer exactamente S/1.00");

        System.out.println("Ingresar sus monedas de un céntimo:");
        int numDeUnCentimo = scanner.nextInt();

        System.out.println("Ingresar sus monedas de cinco céntimos:");
        int numDeCincoCentimo = scanner.nextInt();

        System.out.println("Ingresar sus monedas de diez céntimos:");
        int numDeDiezCentimo = scanner.nextInt();

        System.out.println("Ingresar sus monedas de un 25 céntimos:");
        int numDeVeinteCincoCentimo = scanner.nextInt();

        scanner.close();

        double total = numDeUnCentimo * unCentimo + numDeCincoCentimo * cincoCentimos + numDeDiezCentimo * diezCentimo + numDeVeinteCincoCentimo * veinteCincoCentimo;

        if(total < sol){
            double montoCorto = sol - total;

            // Forma de hacer la impresión decimal con solo 2 decimales
            System.out.println("Lo siento, perdiste! Te falta " + String.format("%.2f", montoCorto) + " céntimos.");
        }
        else if(total > sol){
            double montoExcedido = total - sol;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Lo siento, perdiste! Te has excedido en " + String.format("%.2f", montoExcedido) + " céntimos.");
        }
        else{
            System.out.println("¡Muy bien! ¡Es exactamente S/1.00! !Ganaste!");
        }
    }
}
