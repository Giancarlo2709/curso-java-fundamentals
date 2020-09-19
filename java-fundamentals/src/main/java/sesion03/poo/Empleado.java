package sesion03.poo;

public class Empleado extends Persona {

    private String idEmpleado;
    private String cargo;

    public Empleado() {
        super("Giancarlo", 30, "Masculino");
        System.out.println("COnstructor por defecto de la subclase");
    }


}
