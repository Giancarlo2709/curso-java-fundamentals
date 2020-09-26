package sesion04.interfaces.animales;

public class AnimalExample {

    public static void main(String[] args) {
        Animal animal = new Pato();
        obtenerAnimal(animal);

        animal = new Perro();
        obtenerAnimal(animal);

        animal = new Pajaro();
        obtenerAnimal(animal);
        obtenerVuelo((Volador) animal);
    }

    private static void obtenerAnimal(Animal animal){
        animal.hacerSonido();
        animal.obtenerNumeroPatas();
    }

    private static void obtenerVuelo(Volador volador){
        volador.volar();
    }

}
