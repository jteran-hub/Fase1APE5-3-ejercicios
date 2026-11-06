import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class RegistroEstudiantes {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        try {
            BufferedWriter escritor = new BufferedWriter(
                new FileWriter("estudiantes.txt")
            );

            for (int i = 1; i <= 3; i++) {

                System.out.println("ESTUDIANTE " + i);

                System.out.print("Ingrese el nombre: ");
                String nombre = entrada.nextLine();

                System.out.print("Ingrese la calificacion: ");
                double calificacion = entrada.nextDouble();
                entrada.nextLine();

                escritor.write("Nombre: " + nombre);
                escritor.newLine();

                escritor.write("Calificacion: " + calificacion);
                escritor.newLine();

                System.out.println("Estudiante registrado.");
                System.out.println("----------------------");
            }

            escritor.close();

            System.out.println("Datos guardados correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }

        entrada.close();
    }
}
