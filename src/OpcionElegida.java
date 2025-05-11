import java.util.Scanner;

public class OpcionElegida {
    private ApiCaller apiCaller = new ApiCaller();

    public void procesar(int opcion, Scanner scanner) {
        try {
            System.out.println("¿Cuál es el monto a convertir?");
            double monto = Double.parseDouble(scanner.nextLine());

            switch (opcion) {
                case 1:
                    mostrarResultado("USD", "ARS", monto);
                    break;
                case 2:
                    mostrarResultado("ARS", "USD", monto);
                    break;
                case 3:
                    mostrarResultado("USD", "BRL", monto);
                    break;
                case 4:
                    mostrarResultado("BRL", "USD", monto);
                    break;
                case 5:
                    mostrarResultado("USD", "COP", monto);
                    break;
                case 6:
                    mostrarResultado("COP", "USD", monto);
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número válido");
        } catch (RuntimeException e) {
            System.out.println("Error al realizar la conversión: " + e.getMessage());
        }
    }

   private void mostrarResultado(String de, String a, double monto) {
    Monedas resultado = apiCaller.convertidor(monto, de, a);
    System.out.printf("Tu monto original de %.2f %s , tiene un valor de %.2f %s , con una tasa de cambio de %.4f%n",
            monto, de,
            resultado.conversion_result(), a,
            resultado.conversion_rate());
    }
}
