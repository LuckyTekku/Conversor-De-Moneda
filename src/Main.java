import java.io.IOException;
import java.util.Scanner;
import java.io.IOException;
import java.util.Scanner;

/**
 * Clase principal que maneja el conversor de monedas.
 * Permite al usuario seleccionar diferentes opciones de conversión.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mostrarMenu menu = new mostrarMenu();
        OpcionElegida proceso = new OpcionElegida();

        System.out.println("Bienvenido al conversor de monedas");

        int opcion;
        do {
            menu.mostrar();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            if(opcion != 7) { // Solo procesar si no es salir
                proceso.procesar(opcion, scanner);
            }

        } while (opcion != 7);

        System.out.println("Gracias por usar el programa");
        scanner.close();
    }
}