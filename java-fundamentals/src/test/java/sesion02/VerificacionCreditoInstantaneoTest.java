package sesion02;

import org.junit.Assert;
import org.junit.Test;

public class VerificacionCreditoInstantaneoTest {

    @Test
    public void obtenerCalificaTest(){
        boolean califica =VerificacionCreditoInstantaneo.esUsuarioCalificado(25000,800);
        boolean esperado=true;
        Assert.assertEquals(califica,esperado);
    }

    @Test
    public void usuarioCalificaParaElPrestamo(){
        boolean resultadoActual= VerificacionCreditoInstantaneo.esUsuarioCalificado(25000,700);
        Assert.assertTrue(resultadoActual);
        Double salarioRequerido = VerificacionCreditoInstantaneo.salarioRequerido;
        Double salarioEsperado = 25000.0;
        Assert.assertEquals(salarioEsperado,salarioRequerido);
        Assert.assertEquals(700,VerificacionCreditoInstantaneo.scoreCrediticioRequerido);

    }




}
