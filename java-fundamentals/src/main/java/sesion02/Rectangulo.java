package sesion02;

public class Rectangulo {

    private double largo;
    private double ancho;

    public Rectangulo() {
    }

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return this.largo;
    }

    public double getAncho() {
        return this.ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea() {
        return largo * ancho;
    }

    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }

}
