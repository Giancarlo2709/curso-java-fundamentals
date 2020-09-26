package sesion04.collecciones.objetos;

import java.util.HashSet;
import java.util.Set;

public class SetPersonaExample {

    public static void main(String[] args) {
        Set<Persona> personas = new HashSet<>();
        personas.add(new Persona("Giancarlo Elvis", "Yarlequé Juárez", "43424342"));
        personas.add(new Persona("Elvis", "Yarlequé Juárez", "32323236"));
        personas.add(new Persona("Sarah", "Pacheco", "12345678"));
        personas.add(new Persona("Eduardo Oscar", "Gomez Victorio", "43424342"));

        System.out.println("size: " + personas.size());
        // personas.forEach(persona -> System.out.println(persona));




    }
}
