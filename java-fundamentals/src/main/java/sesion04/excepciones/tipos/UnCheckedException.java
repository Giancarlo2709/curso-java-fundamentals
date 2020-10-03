package sesion04.excepciones.tipos;

public class UnCheckedException {

    public static void main(String[] args) {
        Matematicas matematicas = new Matematicas();
        double resultado = matematicas.dividirUnChecked(5, 2);
        System.out.println("El resultado es: " + resultado);

        String[] nombres = {"Giancarlo", "Elvis"};

        try {
            System.out.println(nombres[1]);
        } catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("Indice del arreglo incorrecto, verifique!");
        }


    }
}
