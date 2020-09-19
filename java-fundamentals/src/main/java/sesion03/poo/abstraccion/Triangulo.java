package sesion03.poo.abstraccion;

public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Triangulo(String tipoFigura, double base, double altura) {
        super(tipoFigura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un: " + this.getClass().getSimpleName());
    }

    @Override
    public void calcularArea() {
        double area = (base * altura) / 2;
        System.out.println("El area del " + this.getClass().getSimpleName() + " es: " + area);
    }
}
