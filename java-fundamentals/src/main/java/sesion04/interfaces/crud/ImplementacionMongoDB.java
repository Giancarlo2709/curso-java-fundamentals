package sesion04.interfaces.crud;

public class ImplementacionMongoDB implements AccesoDatos {


    @Override
    public void insertar() {
        System.out.println("Insertar en MongoDB");
    }

    @Override
    public void listar() {
        System.out.println("Listar en MongoDB");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar en MongoDB");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar en MongoDB");
    }
}
