package sesion04.collecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ListExample {

    public static void main(String[] args) {
        listDemo();
    }

    private static void listDemo() {
        List<String> frutas2 = new ArrayList<>();

        frutas2.add("manzana");
        frutas2.add("limon");
        frutas2.add("platano");
        frutas2.add("naranja");
        frutas2.add("limon");
        frutas2.add("pera");
        frutas2.add("guayaba");
        frutas2.add("guayaba");

        System.out.println(frutas2.get(2));
        System.out.println(frutas2.size());
        System.out.println(frutas2);
        System.out.println();

        System.out.println("***** Iterator ***** ");
        Iterator iterator = frutas2.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(" ***** ForEach ***** ");
        for(String fruta: frutas2) {
            System.out.println(fruta);
        }

        System.out.println(" ***** Lambda Java 8 (Consumer) ***** ");
        frutas2.forEach(x -> System.out.println(x));

        System.out.println(" ***** Java 8 (Method Reference) ***** ");
        frutas2.forEach(System.out::println);

        System.out.println("Transformacion con Java 8");
        frutas2.stream()
                .map(x -> x.substring(2)) // Transformando mi coleccion de String a Integer
                .forEach(x -> System.out.println("4 primeros Caracteres: " + x)); // Recorriendo e imprimiendo

        System.out.println("Transformacion con Java 7");
        for(String fruta: frutas2) {
            int longitud = fruta.length();
            System.out.println("Longitudes: " + longitud);
        }
    }
}
