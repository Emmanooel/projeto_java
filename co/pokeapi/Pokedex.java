package co.pokeapi;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Pokedex {
    public static String Pokedex(String[] args) throws IOException, InterruptedException, IllegalStateException {
        HttpResponse<String> response;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://pokeapi.co/api/v2/pokemon?limit=20&offset=0"))
                    .build();

            response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());
        } catch (IOException | IllegalStateException  e) {
            throw new IOException("Invalid homepage id");
        }


        return response.body();
    }

}


