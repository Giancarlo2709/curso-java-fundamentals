package reforzamiento.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SeleccionPeruana {

    private static List<SeleccionFutbol> seleccionados = new ArrayList<>();

    public static void main(String[] args) {
        SeleccionFutbol entrenador = new Entrenador(1, "Ricardo", "Garecca", LocalDate.of(1950, 9, 31), "FPF0001");
        SeleccionFutbol paoloGuerero = new Futbolista(2, "Paolo", "Guerrero", LocalDate.of(1995, 6, 21), "Delantero", 9);
        SeleccionFutbol masajista1 = new Masajista(3, "José", "Hurtado", LocalDate.of(1998, 7, 31), 5);

        seleccionados.add(entrenador);
        seleccionados.add(paoloGuerero);
        seleccionados.add(masajista1);



    }

    private static void imprimirCaracteristicas(SeleccionFutbol seleccionFutbol) {
        if (seleccionFutbol instanceof Entrenador) {
            System.out.println("Soy un entrenador y mis datos son : ");
            imprimirDatosComunes(seleccionFutbol);
            ((Entrenador) seleccionFutbol).dirigirPartido();
            ((Entrenador) seleccionFutbol).dirigirEntranamiento();
        } else if(seleccionFutbol instanceof  Futbolista) {
            System.out.println("Soy un futbolista y mis datos son: ");
            imprimirDatosComunes(seleccionFutbol);
            ((Futbolista) seleccionFutbol).jugarPartido();
            ((Futbolista) seleccionFutbol).entrenar();
        } else if(seleccionFutbol instanceof  Masajista) {
            System.out.println("Soy un masajista y mis datos son: ");
            imprimirDatosComunes(seleccionFutbol);
            ((Masajista) seleccionFutbol).darMasaje();
        }
    }

    private static void imprimirDatosComunes(SeleccionFutbol seleccionFutbol) {
        System.out.println("Id: " + seleccionFutbol.getId() +  " Nombre: " + seleccionFutbol.getNombre() + " Apellidos: "
                + seleccionFutbol.getApellidos() + " Edad: " + seleccionFutbol.calcularEdad());
        System.out.println("Concentración");
        seleccionFutbol.concentrarse();
        System.out.println("Viaje");
        seleccionFutbol.viajar();
    }
}
