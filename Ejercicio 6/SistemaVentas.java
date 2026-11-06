import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class SistemaVentas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double totalAcumulado = 0;

        try {
            BufferedWriter escritor = new BufferedWriter(
                new FileWriter("ventas.txt", true)
            );

            while (true) {

                System.out.println("SISTEMA DE VENTAS");
                System.out.print("Ingrese el nombre del producto (o fin para terminar): ");

                String nombre = entrada.nextLine();

                if (nombre.equalsIgnoreCase("fin")) {
                    break;
                }

                System.out.print("Ingrese el precio: ");
                double precio = entrada.nextDouble();

                System.out.print("Ingrese la cantidad: ");
                int cantidad = entrada.nextInt();

                entrada.nextLine();

                double subtotal = precio * cantidad;
                double descuento = 0;

                if (subtotal >= 100) {
                    descuento = subtotal * 0.10;
                }

                double total = subtotal - descuento;

                totalAcumulado += total;

                escritor.write("Producto: " + nombre);
                escritor.newLine();

                escritor.write("Precio: " + precio);
                escritor.newLine();

                escritor.write("Cantidad: " + cantidad);
                escritor.newLine();

                escritor.write("Subtotal: " + subtotal);
                escritor.newLine();

                escritor.write("Descuento: " + descuento);
                escritor.newLine();

                escritor.write("Total a pagar: " + total);
                escritor.newLine();

                escritor.write("----------------------");
                escritor.newLine();

                System.out.println("Subtotal: " + subtotal);
                System.out.println("Descuento: " + descuento);
                System.out.println("Total a pagar: " + total);
                System.out.println("----------------------");
            }

            escritor.write("TOTAL ACUMULADO DE VENTAS: " + totalAcumulado);
            escritor.newLine();
            escritor.write("======================");
            escritor.newLine();

            escritor.close();

            System.out.println("Ventas guardadas correctamente.");
            System.out.println("Total acumulado: " + totalAcumulado);

        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }

        entrada.close();
    }
}
