package br.com.AppJogo.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ApiJogos {
    public String fazerBusca(){
        Scanner l = new Scanner(System.in);

        System.out.println("Digite o nome do jogo que deseja buscar: ");
        String nomeJogo = l.nextLine();
        final String URL = "https://www.cheapshark.com/api/1.0/games?title=";

        String endereco = URL + nomeJogo.replace(" ", "+");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response;

        try{
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String json = response.body();
        return json;
    }
}
