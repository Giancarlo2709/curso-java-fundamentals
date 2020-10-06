package reforzamiento.poo;

import java.time.LocalDate;

public class Entrenador extends SeleccionFutbol {

    private String idFederacion;

    public Entrenador(Integer id, String nombre, String apellidos, LocalDate fechaNacimiento, String idFederacion) {
        super(id, nombre, apellidos, fechaNacimiento);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("Soy entrenador y dirijo la concentración");
    }

    @Override
    public void viajar() {
        System.out.println("Soy entrenador y también viajo en clase A");
    }

    public void dirigirPartido() {
        System.out.println("Hoy toca dirigir partido");
    }

    public void dirigirEntranamiento() {
        System.out.println("Hoy toca dirigir entrenamiento");
    }
}
