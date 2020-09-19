package sesion03.poo.polimorfismo;

public class Gato  extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    protected void gemido() {
        //super.gemido();

        System.out.println("Hola me llamo " + nombre + " miau!");
    }

    public void rasguniar() {
        System.out.println("Yo soy un " + this.getClass().getSimpleName() + " y me gusta rasguniar ");
    }
}
