public class mostrarMenu {
    private final String[] opciones = {
            "Dólar => Peso Argentino",
            "Peso Argentino => Dólar",
            "Dólar => Real Brasileño",
            "Real Brasileño => Dólar",
            "Dólar => Peso Colombiano",
            "Peso Colombiano => Dólar",
            "Salir"
    };

    public void mostrar() {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        for (int i = 0; i < opciones.length; i++) {
            System.out.printf("%d. %s\n", i + 1, opciones[i]);
        }
        System.out.println("======================");
    }

    public int getTotalOpciones() {
        return opciones.length;
    }
}