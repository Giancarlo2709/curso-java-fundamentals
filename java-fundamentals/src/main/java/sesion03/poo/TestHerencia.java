package sesion03.poo;

public class TestHerencia {

    public static void main(String[] args) {
        Empleado empleado = new Empleado();

        System.out.println(empleado.nombre);
        System.out.println(empleado.edad);
        System.out.println(empleado.getGenero());

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAncho(4);
        rectangulo.setLargo(3);

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLargo(4);

        System.out.println("Perimetro Rectangulo: " + rectangulo.calcularPerimetro());
        rectangulo.imprimir();

        System.out.println("Perimetro Cuadrado: " + cuadrado.calcularPerimetro());
        cuadrado.imprimir();
    }
}
