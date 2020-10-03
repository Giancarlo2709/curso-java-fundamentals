package reforzamiento;

import reforzamiento.poo.Futbolista;
import reforzamiento.poo.SeleccionFutbol;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, Futbolista> mapasFutbolistas = new HashMap<>();
        mapasFutbolistas.put(1, new Futbolista(3, "José", "Hurtado", LocalDate.of(1978, 7, 31), "Aguatero", 99));
        mapasFutbolistas.put(2, new Futbolista(2, "Paolo", "Guerrero", LocalDate.of(1995, 6, 21), "Delantero", 9));

        for (Map.Entry<Integer, Futbolista> futbolista : mapasFutbolistas.entrySet()) {
            System.out.println("*******************************************");
            System.out.println("Hola soy el key: " + futbolista.getKey());
            imprimirDatosComunes(futbolista.getValue());
        }

        // A partir de Java 8
        System.out.println("****************** Con java 8 ******************" );
        mapasFutbolistas.forEach((key, value) -> {
            System.out.println("*******************************************");
            System.out.println("Hola soy el key: " + key);
            imprimirDatosComunes(value);
        });

    }

    private static void imprimirDatosComunes(Futbolista seleccionFutbol) {
        System.out.println("Id: " + seleccionFutbol.getId() +  " Nombre: " + seleccionFutbol.getNombre() + " Apellidos: "
                + seleccionFutbol.getApellidos() + " Fecha Nacimiento: " + seleccionFutbol.getFechaNacimiento()  +
                " Edad: " + seleccionFutbol.calcularEdad());
        System.out.println("Concentración");
        seleccionFutbol.concentrarse();
        System.out.println("Viaje");
        seleccionFutbol.viajar();
    }
}
