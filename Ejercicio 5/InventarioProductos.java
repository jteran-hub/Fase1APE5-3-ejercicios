import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class InventarioProductos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        try {
            BufferedWriter escritor = new BufferedWriter(
                new FileWriter("productos.txt", true)
            );

            String respuesta;

            do {
                System.out.println("REGISTRO DE PRODUCTOS");

                System.out.print("Ingrese el nombre del producto: ");
                String nombre = entrada.nextLine();

                System.out.print("Ingrese el precio: ");
                double precio = entrada.nextDouble();

                System.out.print("Ingrese la cantidad: ");
                int cantidad = entrada.nextInt();

                entrada.nextLine();

                double total = precio * cantidad;

                escritor.write("Producto: " + nombre);
                escritor.newLine();

                escritor.write("Precio: " + precio);
                escritor.newLine();

                escritor.write("Cantidad: " + cantidad);
                escritor.newLine();

                escritor.write("Total: " + total);
                escritor.newLine();

                escritor.write("----------------------");
                escritor.newLine();

                System.out.println("Producto registrado.");
                System.out.println("Total: " + total);

                System.out.print("¿Desea registrar otro producto? (si/no): ");
                respuesta = entrada.nextLine();

            } while (respuesta.equalsIgnoreCase("si"));

            escritor.close();

            System.out.println("Productos guardados correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }

        entrada.close();
    }
}
