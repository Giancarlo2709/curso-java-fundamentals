package sesion03.poo.abstraccion;

public class Rectangulo extends FiguraGeometrica {

    private double ancho;
    private double largo;

    public Rectangulo(String figura, double ancho, double largo) {
        super(figura);
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public void dibujar() {
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del " + this.getClass().getSimpleName() + " es: " + (largo * ancho));
    }
}
