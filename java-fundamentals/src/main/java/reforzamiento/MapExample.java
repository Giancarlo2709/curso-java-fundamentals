package reforzamiento;

import reforzamiento.poo.Futbolista;
import reforzamiento.poo.Masajista;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, Futbolista> mapasFutbolistas = new HashMap<>();
        mapasFutbolistas.put(1, new Futbolista(3, "José", "Hurtado", LocalDate.of(1978, 7, 31), "Aguatero", 99));
        mapasFutbolistas.put(2, new Futbolista(2, "Paolo", "Guerrero", LocalDate.of(1995, 6, 21), "Delantero", 9));



    }
}
