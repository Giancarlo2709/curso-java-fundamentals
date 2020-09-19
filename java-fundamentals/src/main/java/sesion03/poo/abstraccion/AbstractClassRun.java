package sesion03.poo.abstraccion;

public class AbstractClassRun {

    public static void main(String[] args) {
        /*FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();

        figura = new Triangulo("Triangulo");
        figura.dibujar();*/

        FiguraGeometrica figura = new Rectangulo("Rectangulo", 4, 3);
        figura.dibujar();
        figura.calcularArea();

        figura = new Triangulo("Triangulo", 4, 3);
        figura.dibujar();
        figura.calcularArea();

    }
}
