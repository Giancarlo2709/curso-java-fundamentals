package sesion01;

import java.util.Scanner;

/*
* WHILE LOOP:
* Cada empleado de la tienda gana S/ 15 por hora. Escribe un programa que permita al empleado ingresar mas de 40 horas
* para ingresar la cantidad de horas trabajadas por semana. No permita horas extra.
*/
public class ValidacionEntradaPagoBruto {

    public static void main(String[] args) {

        int tarifa = 15;
        int maxHoras = 40;

        System.out.println("¿Cuantas horas trabajaste a la semana?");
        Scanner scanner = new Scanner(System.in);

        double horasLaboradas = scanner.nextDouble();

        while(horasLaboradas > maxHoras || horasLaboradas < 1) {
            System.out.println("Entrada invalida, Sus horas deben estar entre 1 y 40. Intentelo nuevamente");
            System.out.println("¿Cuantas horas trabajaste a la semana?");
            horasLaboradas = scanner.nextDouble();
        }

        double pagoBruto = tarifa * horasLaboradas;
        System.out.println("El pago bruto es: " + pagoBruto);
    }
}
