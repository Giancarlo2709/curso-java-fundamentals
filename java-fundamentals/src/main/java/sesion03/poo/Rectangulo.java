package sesion03.poo;

public class Rectangulo {

    protected double largo;
    protected double ancho;
    protected double lados = 4;

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }

    public void imprimir() {
        System.out.println("Yo soy un rectangulo");
    }
}
