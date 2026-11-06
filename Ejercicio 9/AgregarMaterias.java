import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AgregarMaterias {

    public static void main(String[] args) {

        try {
            BufferedWriter escritor = new BufferedWriter(
                new FileWriter("materias.txt", true)
            );

            escritor.write("Estadistica");
            escritor.newLine();

            escritor.write("Estructura de Datos");
            escritor.newLine();

            escritor.close();

            System.out.println("Nuevas materias agregadas correctamente.");

        } catch (IOException e) {
            System.out.println("Error al agregar materias: " + e.getMessage());
        }
    }
}
