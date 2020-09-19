package sesion03.poo;

public class Gato  extends Animal{

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    protected void gemido() {
        //super.gemido();

        System.out.println("Hola me llamo " + nombre + " miau!");
    }
}
