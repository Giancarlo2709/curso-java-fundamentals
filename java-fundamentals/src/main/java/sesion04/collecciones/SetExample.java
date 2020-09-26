package sesion04.collecciones;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        setDemo();
        // calculateTimesSet();
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

    private static void calculateTimesSet() {
        final Set hashSet = new HashSet(1_000_000);
        final Long startHashSetTime = System.currentTimeMillis();
        for(int i=0; i < 1_000_000; i++) {
            hashSet.add(i);
        }
        final Long endHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));

        final Set treeSet = new TreeSet();
        final Long startTreeSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            treeSet.add(i);
        }
        final Long endTreeSetTime = System.currentTimeMillis();
        System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));

        final Set linkedHashSet = new LinkedHashSet(1_000_000);
        final Long startLinkedHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedHashSet.add(i);
        }
        final Long endLinkedHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
    }
}
