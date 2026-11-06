import java.io.File;
import java.io.IOException;

public class GestionTemporal {

    public static void main(String[] args) {

        File carpeta = new File("datos");
        File archivo = new File("datos/temporal.txt");

        try {
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

            boolean confirmarBorrado = true;

            if (confirmarBorrado) {

                boolean eliminado = archivo.delete();

                System.out.println("Resultado de la eliminacion: " + eliminado);

            } else {
                System.out.println("El archivo no fue eliminado.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
