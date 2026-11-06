import java.io.File;
import java.io.IOException;

public class GestionMetadatos {

    public static void main(String[] args) {

        File archivo = new File("datos/prueba.txt");

        try {
            File carpeta = new File("datos");

            if (!carpeta.exists()) {
                carpeta.mkdir();
            }

            if (archivo.exists()) {
                System.out.println("El archivo ya existe.");
            } else {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado correctamente.");
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            }

            System.out.println("Nombre: " + archivo.getName());
            System.out.println("Ruta: " + archivo.getPath());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
