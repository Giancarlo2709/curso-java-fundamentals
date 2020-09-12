package sesion02;

public class ErroresComunesEnArreglos {

    public static void main(String[] args) {
        /*int[] enteros = new int[3];// 0, 1, 2
        System.out.println(enteros[4]);
        for(int i= 0; i <= enteros.length; i++) {
            System.out.println(enteros[i]);
        }*/

        Usuario[] usuarios = new Usuario[3];
        usuarios[0] = new Usuario("Giancarlo");
        usuarios[1] = new Usuario("Ashley");
        usuarios[2] = new Usuario("Ana");

        for(Usuario user : usuarios) {
            System.out.println(user.getNombre());
        }
    }
}
