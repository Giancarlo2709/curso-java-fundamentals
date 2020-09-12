package sesion02;

public class CalculaArea {

    public static void main(String[] args) {

        CalculaArea calculaArea = new CalculaArea();

        Rectangulo cocina = new Rectangulo(15,10);
        Rectangulo banio = new Rectangulo(3,3);

        System.out.println("El area total es: " + calculaArea.calcularAreaTotal(cocina, banio));

    }

    private double calcularAreaTotal(Rectangulo cocina, Rectangulo banio) {
        return cocina.calcularArea() + banio.calcularArea();
    }
}
