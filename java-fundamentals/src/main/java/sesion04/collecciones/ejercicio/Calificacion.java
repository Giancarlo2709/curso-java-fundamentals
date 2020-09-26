package sesion04.collecciones.ejercicio;

import java.util.HashMap;
import java.util.Map;

public class Calificacion {

    public static Map<String, Double> obtenerResultadosPrimeraCalificacion() {
        Map<String, Double> primeraCalificacionMap = new HashMap<>();

        primeraCalificacionMap.put("Giancarlo", 15.4);
        primeraCalificacionMap.put("Andre", 8.0);
        primeraCalificacionMap.put("Evelyn", 9.0);
        primeraCalificacionMap.put("Jerson", 11.0);
        primeraCalificacionMap.put("Karina", 7.0);
        primeraCalificacionMap.put("Michael", 12.0);
        primeraCalificacionMap.put("Naiky", 13.0);
        primeraCalificacionMap.put("Raquel", 6.0);
        primeraCalificacionMap.put("Rojana", 10.0);
        primeraCalificacionMap.put("Sarah", 15.0);
        primeraCalificacionMap.put("Sonia", 8.0);
        primeraCalificacionMap.put("Victorio", 9.0);
        return primeraCalificacionMap;
    }

    public static Map<String, Double> obtenerResultadosExamenRecuperacion() {
        Map<String, Double> primeraCalificacionMap = new HashMap<>();

        primeraCalificacionMap.put("Giancarlo", 8.0);
        primeraCalificacionMap.put("Andre", 14.0);
        primeraCalificacionMap.put("Evelyn", 15.0);
        primeraCalificacionMap.put("Jerson", 16.0);
        primeraCalificacionMap.put("Karina", 15.0);
        primeraCalificacionMap.put("Michael", 17.0);
        primeraCalificacionMap.put("Naiky", 18.0);
        primeraCalificacionMap.put("Raquel", 12.0);
        primeraCalificacionMap.put("Rojana", 15.0);
        primeraCalificacionMap.put("Sarah", 19.0);
        primeraCalificacionMap.put("Sonia", 18.0);
        primeraCalificacionMap.put("Victorio", 15.0);
        return primeraCalificacionMap;
    }
}
