package sesion04.interfaces.animales;

public class Pajaro implements Animal,Volador{
    @Override
    public void hacerSonido() {
        System.out.println("Sonido");
    }

    @Override
    public void obtenerNumeroPatas() {
        System.out.println("Tengo dos patas");
    }

    @Override
    public void volar() {
        System.out.println("Estoy volando");
    }
}

