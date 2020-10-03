package reforzamiento.poo;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public abstract class SeleccionFutbol {

    private Integer id;
    protected String nombre;
    protected String apellidos;
    protected LocalDate fechaNacimiento;

    public SeleccionFutbol(Integer id, String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public abstract void concentrarse();

    public abstract void viajar();

    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        long dias =  DAYS.between(fechaNacimiento, fechaActual);

        return (int)dias/365;
    }
}
