package sesion03.poo;

public class Cuadrado extends Rectangulo {

    @Override
    public double calcularPerimetro() {
        return lados * largo;
    }

    public void imprimir() {
        System.out.println("Yo soy un " + this.getClass().getSimpleName());
    }
}
