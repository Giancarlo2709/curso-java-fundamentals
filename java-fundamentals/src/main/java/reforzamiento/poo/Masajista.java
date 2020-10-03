package reforzamiento.poo;

import java.time.LocalDate;

public class Masajista extends SeleccionFutbol {

    private Integer aniosExperiencia;

    public Masajista(Integer id, String nombre, String apellidos, LocalDate fechaNacimiento, Integer aniosExperiencia) {
        super(id, nombre, apellidos, fechaNacimiento);
        this.aniosExperiencia = aniosExperiencia;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("En la concentración verifico que nadie se lesione");
    }

    @Override
    public void viajar() {
        System.out.println("Como soy masajista me envian en la clase B");
    }
}
