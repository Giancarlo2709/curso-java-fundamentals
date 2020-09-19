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
        validator.imprimirReglas();

        do {
            String passwordPropuesto = validator.getPasswordPropuesto();
            validator.cambiarPassword(passwordPropuesto);

            if(!validator.isValid()) {
                System.out.println(validator.getErrorMessage());
            }

        } while(!validator.isValid());

        System.out.println("El password ingresado es valido");

    }

    public String getPasswordPropuesto() {
        System.out.println("Ingresa tu nuevo password");
        return scanner.next();
    }

    public void imprimirReglas() {
        System.out.println("Tu nuevo password debe seguir los siguientes requerimientos");
        System.out.println("* Al menos 8 caracteres");
        System.out.println("* debe contener una letra mayuscula");
        System.out.println("* debe contener una caracter especial");
        System.out.println("* no debe contener el nombre de usuario");
        System.out.println("* no debe ser el mismo password anterior");
    }

    public void cambiarPassword(String nuevoPassword) {
        isValid = true;
        errorMessage = "";

        if (nuevoPassword.length() < 8) {
            isValid = false;
            errorMessage += "\n Tu password debe tener al menos 8 caracteres";
        }

        if (nuevoPassword.equals(nuevoPassword.toLowerCase())) {
            isValid = false;
            errorMessage += "\n Tu password debe incluir al menos una letra mayuscula";
        }

        if (nuevoPassword.matches("[a-zA-Z0-9]*")) {
            isValid = false;
            errorMessage += "\n Tu password debe incluir un caracter especial";
        }

        if (nuevoPassword.toUpperCase().contains(username.toUpperCase())) {
            isValid = false;
            errorMessage += "\n Tu password no debe contener el nombre del usuario";
        }

        if(nuevoPassword.equals(currentPassword)) {
            isValid = false;
            errorMessage += "\n Tu password debe ser diferente al actual";
        }

    }
}
