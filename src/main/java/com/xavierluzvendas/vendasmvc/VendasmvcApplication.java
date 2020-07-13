package com.xavierluzvendas.vendasmvc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.xavierluzvendas.vendasmvc.domain.Categoria;
import com.xavierluzvendas.vendasmvc.domain.Produto;
import com.xavierluzvendas.vendasmvc.repositories.CategoriaRepository;
import com.xavierluzvendas.vendasmvc.repositories.ProdutoRepository;

@SpringBootApplication
public class VendasmvcApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(VendasmvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria categoria1 = new Categoria(null, "Informática");
		Categoria categoria2 = new Categoria(null, "Escritório");

		Produto produto1 = new Produto(null,"Computador",2000.00);
		Produto produto2 = new Produto(null,"Impressora",800.00);
		Produto produto3 = new Produto(null,"Mouse",80.00);
		
		categoria1.getProdutos().add(produto1);
		categoria1.getProdutos().add(produto2);
		categoria1.getProdutos().add(produto3);
		categoria2.getProdutos().add(produto2);
		
		produto1.getCategorias().add(categoria1);		
		produto2.getCategorias().add(categoria1);
		produto2.getCategorias().add(categoria2);
		produto3.getCategorias().add(categoria1);
		
		this.categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2));
		this.produtoRepository.saveAll(Arrays.asList(produto1,produto2,produto3));
	}

}
