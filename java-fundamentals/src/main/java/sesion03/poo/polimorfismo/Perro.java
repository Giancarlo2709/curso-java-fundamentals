package sesion03.poo.polimorfismo;

import sesion03.poo.polimorfismo.Animal;

public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    protected void gemido() {
        //super.gemido();

        System.out.println("Hola me llamo " + nombre + " guau!");
    }

    public void buscar() {
        System.out.println("Buscar es divertido!");
    }

}
