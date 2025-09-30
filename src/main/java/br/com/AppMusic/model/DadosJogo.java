package br.com.AppMusic.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosJogo(String external,
                        String cheapest,
                        String thumb) {
}
