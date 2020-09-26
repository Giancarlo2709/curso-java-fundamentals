package sesion04.collecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        setDemo();
    }

    public static void setDemo() {
        Set<String> frutas = new HashSet<>(5);

        frutas.add("manzana");
        frutas.add("limon");
        frutas.add("platano");
        frutas.add("naranja");
        frutas.add("limon");
        frutas.add("pera");
        frutas.add("guayaba");
        frutas.add("guayaba");

        System.out.println("******************* Begin SET *******************");

        System.out.println(frutas.size());
        System.out.println(frutas);

        System.out.println("******** Iterator *******");

        // Recorriendo Set
        // Recorriendo con un iterator
        Iterator iterator = frutas.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("******** For Each *******");

        // Recorriendo con un forEach
        for(String fruta : frutas) {
            System.out.println(fruta);
        }

        System.out.println("******* ForEach Java 8 ******");

        // Usando Java 8
        frutas.forEach(x -> System.out.println(x));

        System.out.println("******* ForEach Java 8 Method Reference ******");

        frutas.forEach(System.out::println);

        System.out.println("******************* END SET *******************");
    }
}
