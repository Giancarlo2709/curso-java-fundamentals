package sesion04.interfaces.animales;

public class Pato implements Animal {

    @Override
    public void hacerSonido() {
        System.out.println("Cua cua");
    }

    @Override
    public void obtenerNumeroPatas() {
        System.out.println("Tengo 2 patas");
    }
}
