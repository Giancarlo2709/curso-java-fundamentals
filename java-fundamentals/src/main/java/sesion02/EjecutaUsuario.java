package sesion02;

public class EjecutaUsuario {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Usuario usuario2 = new Usuario("Giancarlo");
        Usuario usuario3 = new Usuario("Giancarlo", "Yarlequé");
        Usuario usuario4 = new Usuario("Giancarlo", "Yarlequé", 30);

        System.out.println("Usuario edad: " + usuario4.getEdad());
    }
}
