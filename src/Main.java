import Modelos.Conversao;
import Modelos.ConversaoResponse;

import Modelos.Menu;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner leitura = new Scanner(System.in);
            HttpClient client = HttpClient.newHttpClient();

            String chave = "e426e6b45c69d07728862dac";
            String moeda = "USD";
            String endereco =
                    "https://v6.exchangerate-api.com/v6/" + chave + "/latest/" + moeda;

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();

            ConversaoResponse dados =
                    gson.fromJson(json, ConversaoResponse.class);

            if ("error".equals(dados.getResult())) {
                System.out.println("Erro da API: " + dados.getError_type());
                return;
            }
            int opcao = -1;
            Conversao conversao = new Conversao(dados);
            Menu menu = new Menu();

            while (opcao != 0) {
                opcao = menu.mostrarMenu(leitura);


                String moedaOrigem = "";
                String moedaDestino = "";

                switch (opcao) {
                    case 1 -> {
                        moedaOrigem = "USD";
                        moedaDestino = "BRL";
                    }
                    case 2 -> {
                        moedaOrigem = "EUR";
                        moedaDestino = "BRL";
                    }
                    case 3 -> {
                        moedaOrigem = "ARS";
                        moedaDestino = "BRL";
                    }
                    case 4 -> {
                        moedaOrigem = "BRL";
                        moedaDestino = "USD";
                    }
                    case 5 -> {
                        moedaOrigem = "USD";
                        moedaDestino = "EUR";
                    }
                    case 6 -> {
                        moedaOrigem = "BRL";
                        moedaDestino = "EUR";
                    }
                    case 0 -> {
                        System.out.println("Encerrando...");
                        return;
                    }
                    default -> {
                        System.out.println("Opção inválida.");
                        continue;
                    }
                }

                System.out.println("Digite seu valor: ");
                double valor = leitura.nextDouble();
                leitura.nextLine();


                double resultado = conversao.converter(valor, moedaOrigem, moedaDestino);

                System.out.println("Valor convertido: " + resultado);


            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
