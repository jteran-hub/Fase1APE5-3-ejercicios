import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RegistroMaterias {

    public static void main(String[] args) {

        try {
            BufferedWriter escritor = new BufferedWriter(
                new FileWriter("materias.txt")
            );

            escritor.write("Programacion");
            escritor.newLine();

            escritor.write("Matematicas");
            escritor.newLine();

            escritor.write("Fisica");
            escritor.newLine();

            escritor.write("Algebra Lineal");
            escritor.newLine();

            escritor.write("Calculo Diferencial");
            escritor.newLine();

            escritor.close();

            System.out.println("Materias guardadas correctamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }
}
