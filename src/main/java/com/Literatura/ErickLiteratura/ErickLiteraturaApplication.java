package com.Literatura.ErickLiteratura;

import com.Literatura.ErickLiteratura.principal.Principal;
import com.Literatura.ErickLiteratura.repository.AutorRepository;
import com.Literatura.ErickLiteratura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ErickLiteraturaApplication implements CommandLineRunner {

	@Autowired
	private LibroRepository repository1;
	@Autowired
	private AutorRepository repository2;
	public static void main(String[] args) {
		SpringApplication.run(ErickLiteraturaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository1, repository2);
		principal.muestraMenu();
	}
}
