package sesion01;


import java.util.Scanner;

// Esta es una clase
/*
1. El primer paso es que obtendríamos la cantidad de horas trabajadas.
2. Luego, obtenemos la tarifa de pago por hora.
3. Luego, multiplicamos las horas y la tasa de pago.
4. Finalmente, mostraríamos el resultado.
 */
public class CalculaSalarioBruto {
    // declarar variables, TipodeDato nombreVariable
    static Scanner scanner = new Scanner(System.in);

    // este es un metodo que calcula el salario bruto de un empleado
    public static void main(String[] args) {

        System.out.println("Ingrese horas trabajadas");
        int horas = scanner.nextInt();

        System.out.println("Ingrese su tarifa de pago");
        double tarifa = scanner.nextDouble();

       // + , - , *, /
        // double salario = horas * tarifa;
        double salario = obtenerSalario(horas, tarifa);

        System.out.println("El salario bruto calculado es: " + salario);

        /* System.out.println("Ingrese su nombre");
        String nombre = scanner.next();

        System.out.println("ingrese su edad");
        int edad = scanner.nextInt();

        System.out.println("Hola " + nombre + " su edad es " + edad);*/
    }

    public static double obtenerSalario(int horas, double tarifa) {
        return horas * tarifa;
    }

}
