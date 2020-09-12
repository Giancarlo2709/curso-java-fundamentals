package sesion02;

import org.junit.Assert;
import org.junit.Test;

public class EjemploMetodoTest {

    @Test
    public void obtenerNombreTest() {
        String nombreActual = EjemploMetodo.obtenerNombre("Giancarlo");
        String nombreEsperado = "Giancarlo";

        Assert.assertEquals("nombre incorrecto", nombreEsperado, nombreActual);
    }

}
