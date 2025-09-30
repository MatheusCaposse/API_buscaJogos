package br.com.AppMusic.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Jogos")
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nome;

    private Double preco;
    private String tumb;

    public Jogo (){}

    public Jogo (DadosJogo dados){
        nome = dados.external();
        preco = Double.parseDouble(dados.cheapest());
        tumb = dados.thumb();
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + "| Preco: R$" + String.format("%.1f", preco *5.12) ;
    }
}
