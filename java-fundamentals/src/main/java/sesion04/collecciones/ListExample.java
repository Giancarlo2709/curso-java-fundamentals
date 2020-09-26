package sesion04.collecciones;

import java.util.ArrayList;
import java.util.List;

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
    }
}
