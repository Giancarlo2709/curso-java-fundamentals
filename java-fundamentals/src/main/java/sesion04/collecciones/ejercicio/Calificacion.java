package sesion04.collecciones.ejercicio;

import java.util.HashMap;
import java.util.Map;

public class Calificacion {

    public static Map<String, Double> obtenerResultadosPrimeraCalificacion() {
        Map<String, Double> primeraCalificacionMap = new HashMap<>();

        primeraCalificacionMap.put("Giancarlo", 15.4);
        // agregar a los demas estudiantes
        return primeraCalificacionMap;
    }

    public static Map<String, Double> obtenerResultadosExamenRecuperacion() {
        Map<String, Double> primeraCalificacionMap = new HashMap<>();

        primeraCalificacionMap.put("Giancarlo", 16.4);
        // agregar a los demas estudiantes
        return primeraCalificacionMap;
    }
}
