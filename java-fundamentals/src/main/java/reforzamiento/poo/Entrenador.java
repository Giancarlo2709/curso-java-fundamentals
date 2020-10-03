package reforzamiento.poo;

import java.time.LocalDate;

public class Entrenador extends SeleccionFutbol {

    private String idFederación;

    public Entrenador(Integer id, String nombre, String apellidos, LocalDate fechaNacimiento, String idFederación) {
        super(id, nombre, apellidos, fechaNacimiento);
        this.idFederación = idFederación;
    }

    public String getIdFederación() {
        return idFederación;
    }

    public void setIdFederación(String idFederación) {
        this.idFederación = idFederación;
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
