package sesion04.collecciones;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        mapDemo();
    }

    public static void mapDemo() {
        Map<String, Integer> frutaCalorias = new HashMap<>();
        frutaCalorias.put("manzana", 95);
        frutaCalorias.put("limon", 20);
        frutaCalorias.put("platano", 105);
        frutaCalorias.put("naranja", 45);
        frutaCalorias.put("limon", 17);

        System.out.println(frutaCalorias.size());
        System.out.println(frutaCalorias);

        System.out.println(frutaCalorias.get("limon"));
        System.out.println(frutaCalorias.entrySet());

        System.out.println();


        System.out.println("**** Recorriendo con Java Version Menor a 8 **************** ");
        // Recorriendo Mapas Java 7
        for (Map.Entry<String, Integer> entry : frutaCalorias.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "; Valor: " + entry.getValue());
        }

        System.out.println();

        System.out.println("**** Recorriendo con Java a 8 **************** ");
        // Recorriendo Mapas con Java 8
        frutaCalorias.forEach(
                (key,value) -> System.out.println("Fruta: " + key + "; Calorias: " + value)
        );

    }
}
