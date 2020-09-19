package sesion03.poo.polimorfismo;

public class Zoologico {

    public static void main(String[] args) {
        Animal animal = new Gato("Michifu");

        gemir(animal);

        Animal animal2 = new Perro("Firulais");

        gemir(animal2);

        Animal animal1 = new Animal("Rocky");

        Perro rocky = new Perro("Rocky");
        rocky.gemido();
        rocky.buscar();

        Animal rocky2 = new Perro("Rocky 2");
        rocky2.gemido();
        ((Perro)rocky2).buscar();

        rocky2 = new Gato("Michifu");
        ((Gato) rocky2).rasguniar();
    }

    private static void gemir(Animal animal) {
        animal.gemido();
    }
}
