package sesion02;

public class EjecutaRectangulo {

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(18, 15);
        Rectangulo rectangulo2 = new Rectangulo();
        rectangulo2.setLargo(15);
        rectangulo2.setAncho(10);

        System.out.println("Largo1: " + rectangulo1.getLargo());
        System.out.println("Ancho1: " + rectangulo1.getAncho());

        System.out.println("Largo2: " + rectangulo2.getLargo());
        System.out.println("Ancho2: " + rectangulo2.getAncho());
    }
}
