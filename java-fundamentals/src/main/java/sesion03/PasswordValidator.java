package sesion03;

import java.util.Scanner;

public class PasswordValidator {

    private String username;
    private String currentPassword;

    private boolean isValid;
    private String errorMessage;

    private static Scanner scanner = new Scanner(System.in);

    public PasswordValidator(String username, String currentPassword) {
        this.username = username;
        this.currentPassword = currentPassword;
    }

    public boolean isValid() {
        return isValid;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public static PasswordValidator login() {
        System.out.println("Ingresa tu usuario");
        String username = scanner.next();

        System.out.println("Ingresa tu password");
        String password = scanner.next();

        return new PasswordValidator(username, password);
    }

    public static void main(String[] args) {
        PasswordValidator validator = login();


    }

    public String getPasswordPropuesto() {
        System.out.println("Ingresa tu nuevo password");
        return scanner.next();
    }

    public void imprimirReglas() {
        System.out.println("Tu nuevo password debe seguir los siguientes requerimientos");
    }
}
