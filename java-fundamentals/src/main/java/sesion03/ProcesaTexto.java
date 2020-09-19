package sesion03;

public class ProcesaTexto {

    public static void main(String[] args) {
        contarPalabras("Esto es un texto");
        revertirCadena("quiero una manzana");
    }

    /*
    Escriba un método que cuente el número de palabras en una cadena y las imprima
    individualmente en una nueva línea.
     */

    private static void contarPalabras(String texto) {
        String textoSplit = "hola,mundo,que,tal";

        for(String split : textoSplit.split(",")) {
            System.out.println("split : " + split);
        }

        String[] palabras = texto.split(" ");

        int numeroDePalabras = palabras.length;

        System.out.println("Numero de palabras: " + numeroDePalabras);

        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    /*
    Escriba un método que imprima un String al revés. Por ejemplo, si se da ”quiero una manzana",
    imprime "anaznam anu oreiuq".
     */
    private static void revertirCadena(String texto) {
        for(int i = texto.length() -1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
        System.out.println();
    }
}
