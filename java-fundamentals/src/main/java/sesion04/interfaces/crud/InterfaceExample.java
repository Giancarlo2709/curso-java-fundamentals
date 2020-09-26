package sesion04.interfaces.crud;

public class InterfaceExample {

    public static void main(String[] args) {

        Logger logger = new ImplementacionMySql();
        operacionesLogging(logger);
        AccesoDatos accesoDatos = new ImplementacionMySql();
        operacionesBasicasBaseDatos(accesoDatos);

        /* logger = new ImplementacionOracle(); */
        accesoDatos = new ImplementacionOracle();
        operacionesLogging((Logger) accesoDatos);
        operacionesBasicasBaseDatos(accesoDatos);

        System.out.println("************* MONGODB **************");
        accesoDatos = new ImplementacionMongoDB();
        operacionesBasicasBaseDatos(accesoDatos);
    }

    private static void operacionesBasicasBaseDatos(AccesoDatos accesoDatos) {
        accesoDatos.insertar();
        accesoDatos.listar();
        accesoDatos.actualizar();
        accesoDatos.eliminar();
    }

    private static void operacionesLogging(Logger logger) {
        logger.info();
        logger.error();
    }
}
