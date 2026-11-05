import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un mensaje:");
        String mensaje = teclado.nextLine();

        try (FileWriter archivo = new FileWriter("estudiantes.txt", true)) {

            archivo.write(mensaje + "\n");

            System.out.println("Informacion guardada correctamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        teclado.close();
    }
}
