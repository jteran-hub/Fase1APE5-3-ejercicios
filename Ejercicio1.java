import java.io.File;
import java.io.IOException;

public class Ejercicio1 {

    public static void main(String[] args) {

        File archivo = new File("curso.txt");

        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado correctamente.");
            } else {
                System.out.println("El archivo ya existe.");
            }

            System.out.println("Nombre del archivo: " + archivo.getName());
            System.out.println("Ubicacion: " + archivo.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }
}
