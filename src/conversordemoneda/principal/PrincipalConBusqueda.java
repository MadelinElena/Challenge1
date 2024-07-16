package conversordemoneda.principal;

import conversordemoneda.calculos.ConversorDeMoneda;
import conversordemoneda.calculos.Moneda;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);

        while (true) {
            System.out.println("******************************************************************************");
            System.out.println(" Sea bienvenido al conversor de moneda:");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Salir");
            System.out.print("Elija una opción valida: ");
            int opcion = lectura.nextInt();
            if (opcion == 7) {
                break;
            }

            System.out.print("Ingrese el valor desea convertir: ");
            double valor = lectura.nextDouble();

            String baseCurrency = opcion % 2 == 0 ? Moneda.getCodigoMoneda(opcion) : "USD";
            String targetCurrency = opcion % 2 == 0 ? "USD" : Moneda.getCodigoMoneda(opcion);

            if (targetCurrency == null || baseCurrency == null) {
                System.out.println("Opción no válida.");
                continue;
            }

            String apiUrl = "https://v6.exchangerate-api.com/v6/e9c5c4b6b2c067e368e59738/latest/" + baseCurrency;
            double tasaDeCambio = -1;
            try {
                tasaDeCambio = obtenerTasaDeCambio(apiUrl, targetCurrency);
            } catch (IOException | InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
                continue;
            }

            if (tasaDeCambio != -1) {
                ConversorDeMoneda conversor = new ConversorDeMoneda(tasaDeCambio);
                double resultado = conversor.convertir(valor);
                System.out.printf("El valor convertido es: %.2f %s\n", resultado, targetCurrency);
            }
        }
        System.out.println("Gracias por usar el conversor de moneda!");
    }

    private static double obtenerTasaDeCambio(String apiUrl, String targetCurrency) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiUrl)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
        return conversionRates.get(targetCurrency).getAsDouble();
    }
}
