import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiCaller {
    private static final String API_KEY = "tu_api_key_aqui"; // Reemplaza con tu API key real

    public Monedas convertidor(double monto, String ISOorigen, String ISOdestino) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + "8afa1fba3bcf1d15077c6bab" +
                "/pair/" + ISOorigen + "/" + ISOdestino + "/" + monto);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() != 200) {
                throw new RuntimeException("Error en la API: " + response.body());
            }

            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException("Error al conectar con el servicio de conversión: " + e.getMessage());
        }
    }
}