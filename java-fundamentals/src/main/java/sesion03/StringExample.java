package sesion03;

public class StringExample {

    public static void main(String[] args) {
        String nombre = new String("Giancarlo");
        String nombre2 = "giancarlo";

        if (!nombre.isEmpty()) {
            System.out.println("Hola " + nombre);
        } else {
            System.out.println("por favor ingrese un nombre");
        }
    }
}
