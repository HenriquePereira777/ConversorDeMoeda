package Modelos;

import java.util.Map;

public class Conversao {

    private Map<String, Double> taxas;

    // recebe os dados da API

    public Conversao(ConversaoResponse response) {
        this.taxas = response.getConversion_rates();
    }

    public double converter(double valor, String moedaOrigem, String moedaDestino) {

        Double taxaOrigem = taxas.get(moedaOrigem);
        Double taxaDestino = taxas.get(moedaDestino);

        if (taxaOrigem == null || taxaDestino == null) {
            throw new IllegalArgumentException("Moeda inválida.");
        }

        return valor / taxaOrigem * taxaDestino;
    }
}
