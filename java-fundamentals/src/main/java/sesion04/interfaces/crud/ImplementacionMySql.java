package sesion04.interfaces.crud;

public class ImplementacionMySql implements AccesoDatos, Logger {

    @Override
    public void insertar() {
        System.out.println("Insertar desde MySql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySql: " + MAX_REGISTRO);
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MySql");
    }

    @Override
    public void info() {
        System.out.println("************* MYSQL INFO **************");
    }

    @Override
    public void error() {
        System.out.println("************* MYSQL ERROR **************");
    }
}
