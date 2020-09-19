package sesion03;

public class TipoDeDatos {

    public static void main(String[] args) {
        byte miPrimeraVariable = -128; // [-128, 127]
        short miPrimerShort = -32768; // [-32768, 32767]
        int miPrimerInt = -2147483648; //[-2147483648, 2147483647]
        long miPrimerLong = 4; // [-9223372036854775808, 9223372036854775807]

        // 1, activo, 2: cancelado, 3:eliminado, etc....
        byte status = 3;

        float miPrimerfloat = 3.42f;
        double miPrimerDouble = 3.43;

        char miPrimerCaracter = 'a';

        boolean isValid = true;

        suma();

    }

    private static void suma() {
        short miByte = 5;
        short miShort = 10;

        System.out.println(5 + 10);
    }
}
