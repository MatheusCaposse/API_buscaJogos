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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getTumb() {
        return tumb;
    }

    public void setTumb(String tumb) {
        this.tumb = tumb;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + "| Preco: R$" + String.format("%.1f", preco *5.12) ;
    }
}
