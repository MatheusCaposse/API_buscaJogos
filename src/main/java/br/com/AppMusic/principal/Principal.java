package br.com.AppMusic.principal;
import br.com.AppMusic.model.DadosJogo;
import br.com.AppMusic.model.Jogo;
import br.com.AppMusic.service.ApiJogos;
import br.com.AppMusic.service.ConverteDados;
import br.com.AppMusic.service.JogoRepository;

import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void limparTela(){
        for(int i = 0; i<50; i++){
            System.out.println();
        }
    }

    JogoRepository repository;
    public Principal(JogoRepository repository){
        this.repository = repository;
    }
    ApiJogos api = new ApiJogos();
    ConverteDados converteDados = new ConverteDados();
    Scanner l = new Scanner(System.in);



    public void exibeMenu(){
        int opcao = -1;
        limparTela();

        while(opcao!=0){

            System.out.println("""
                --------------- App Music ---------------
               
                1 - Buscar jogo
                2 - Ver jogos salvos
                3 - Pesquisar jogo por nome
                4 - Pesquisa sobre o jogo
                
                0 - Sair
                
                -----------------------------------------
                
                """);

            opcao = l.nextInt();

            limparTela();

            switch (opcao){
                case(1):
                    buscarJogo();
                    break;
                case(2):
                    buscarJogoSalvo();
                case(3):

                case(4):

                case(0):
                    break;
            }
        }
    }

    private void buscarJogo() {
        String response = api.fazerBusca();
        List<DadosJogo> dados = converteDados.converterLista(response, DadosJogo.class );
        Jogo jogoNovo = new Jogo(dados.get(0));
        repository.save(jogoNovo);
    }

    private void buscarJogoSalvo() {
        List<Jogo> jogosSalvos = repository.findAll();

        if (!jogosSalvos.isEmpty()){
            jogosSalvos.forEach(System.out::println);
        } else {
            System.out.println("Ainda nao possui nenhum jogo salvo! ");
        }
    }

}
