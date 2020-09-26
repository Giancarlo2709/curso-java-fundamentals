package sesion04.interfaces.animales;

public class Perro implements Animal {

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }

    @Override
    public void obtenerNumeroPatas() {
        System.out.println("Tengo 4 patas");
    }
}
