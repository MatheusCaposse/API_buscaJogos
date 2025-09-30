package br.com.AppMusic.service;

import br.com.AppMusic.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface JogoRepository extends JpaRepository<Jogo, Long> {

    @Query("SELECT j FROM Jogo j WHERE LOWER(j.nome) LIKE LOWER(CONCAT('%', :nomeJogo, '%'))")
    List<Jogo> buscarJogoPorNome(@Param("nomeJogo")String nomeJogo);
}
