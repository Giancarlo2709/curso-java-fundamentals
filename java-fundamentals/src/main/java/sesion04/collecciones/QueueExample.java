package sesion04.collecciones;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        queueDemo();
    }

    public static void queueDemo() {
        Queue frutas3 = new LinkedList();
        frutas3.add("manzana");
        frutas3.add("limon");
        frutas3.add("platano");
        frutas3.add("naranja");
        frutas3.add("limon");

        System.out.println(frutas3.size());
        System.out.println(frutas3);

        for (Object item: frutas3) {
            System.out.println("Object: " + item);
        }

        /*
         * Recupera y elimina el encabezado de esta cola
         */
        System.out.println("remove: " + frutas3.remove());
        System.out.println("frutas: " + frutas3);

        /*
         * Este método se utiliza para ver el encabezado de la cola sin eliminarlo.
         * Devuelve Null si la cola está vacía.
         */
        System.out.println("peek: " + frutas3.peek());
        System.out.println();
    }
}
