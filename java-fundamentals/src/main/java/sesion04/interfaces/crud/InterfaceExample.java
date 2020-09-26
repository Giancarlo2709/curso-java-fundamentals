package sesion04.interfaces.crud;

public class InterfaceExample {

    public static void main(String[] args) {

        System.out.println("************* MYSQL **************");
        AccesoDatos accesoDatos = new ImplementacionMySql();
        operacionesBasicasBaseDatos(accesoDatos);

        System.out.println("************* ORACLE **************");
        accesoDatos = new ImplementacionOracle();
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
}
