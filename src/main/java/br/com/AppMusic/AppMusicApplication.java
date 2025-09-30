package br.com.AppMusic;

import br.com.AppMusic.principal.Principal;
import br.com.AppMusic.service.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AppMusicApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppMusicApplication.class, args);
	}

	@Autowired
	JogoRepository repository;

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository);
		principal.exibeMenu();
	}


}
