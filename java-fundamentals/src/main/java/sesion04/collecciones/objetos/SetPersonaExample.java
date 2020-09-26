package sesion04.collecciones.objetos;

import javafx.scene.control.RadioMenuItem;

import java.util.*;

public class SetPersonaExample {

    public static void main(String[] args) {
        Map<Integer, String> suertudoMap = new HashMap<>();

        suertudoMap.put( 1, "Giancarlo");
        suertudoMap.put(2, "Andre");
        suertudoMap.put(3, "Evelyn");
        suertudoMap.put(4, "Jerson");
        suertudoMap.put(5, "Karina");
        suertudoMap.put(6, "Michael");
        suertudoMap.put(7, "Naiky");
        suertudoMap.put(8, "Raquel");
        suertudoMap.put(9, "Rojana");
        suertudoMap.put(10, "Sarah");
        suertudoMap.put(11, "Sonia");
        suertudoMap.put(12, "Victorio");

        Set<Persona> personas = new HashSet<>();
        personas.add(new Persona("Giancarlo Elvis", "Yarlequé Juárez", "43424342", 30));
        personas.add(new Persona("Elvis", "Yarlequé Juárez", "32323236", 28));
        personas.add(new Persona("Sarah", "Pacheco", "12345678", 25));
        personas.add(new Persona("Eduardo Oscar", "Gomez Victorio", "43424341", 29));

        System.out.println("size: " + personas.size());
        // personas.forEach(persona -> System.out.println(persona)); for()
        Random random = new Random();

        Integer suertudo = random.nextInt(12) + 1;

        System.out.println("El suertudo de la sesion es: " + suertudoMap.get(suertudo));

        System.out.println("******************* Java 7 *******************");
        for(Persona persona : personas) {
            if (persona.getEdad() >= 25) {
                System.out.println(persona);
            }
        }

        System.out.println("******************* Java 8 *******************");
        personas.forEach(persona -> {
            if (persona.getEdad() >= 30) {
                System.out.println(persona);
            }
        });


        try {
            System.out.println("La division es: " + (5/0));
        } catch(ArithmeticException ex) { // Exception
            System.out.println("No se puede dividir por cero");
        }


    }
}
