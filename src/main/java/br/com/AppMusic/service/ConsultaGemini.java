package br.com.AppMusic.service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class ConsultaGemini {
    private static final String CHAVE = System.getenv("APIKEY_GEMINI");
    public static String obterInfoJogo(String texto) {
        Client client = Client.builder().apiKey(CHAVE).build();;

        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.0-flash",
                        "Me fale brevemento um pouco sobre o seguinte jogo, nao quero mais nada alem disso, apenas um texto breve descrevendo o jogo: (quebre linha a cada 90 caracteres)" + texto,
                        null);

        return response.text();
    }
}