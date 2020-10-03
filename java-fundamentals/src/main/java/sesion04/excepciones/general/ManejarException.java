package sesion04.excepciones.general;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejarException {

    public static void main(String[] args) {

        crearNuevoArchivo();
        // numerosManejarExcepciones();
        try {
            crearNuevoArchivoReintentar();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void crearNuevoArchivo(){

        File file = new File("resources/noexiste.txt");

        try {
            file.createNewFile();
        }

        catch (IOException e){
            //System.out.println("El directorio no existe " +e.getMessage());
            System.out.println("El directorio no existe");
            e.printStackTrace();
        }
    }

    public static void numerosManejarExcepciones(){
        File file = new File ("numeros.txt");
        Scanner fileReader = null;
        try {

            fileReader = new Scanner(file);
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }

        catch (FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }
        /*catch (InputMismatchException e){
            e.printStackTrace();
        }*/
        finally {
            fileReader.close();
        }


    }

    public static void crearNuevoArchivoReintentar() throws IOException{
        File file = new File("archivo.txt");
        file.createNewFile();
    }
}
