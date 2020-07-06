package com.xavierluzvendas.vendasmvc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.xavierluzvendas.vendasmvc.domain.Categoria;
import com.xavierluzvendas.vendasmvc.repositories.CategoriaRepository;

@SpringBootApplication
public class VendasmvcApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(VendasmvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria categoria1 = new Categoria(null, "Informática");
		Categoria categoria2 = new Categoria(null, "Escritório");

		this.categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2));
	}

}
