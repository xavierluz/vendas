package com.xavierluzvendas.vendasmvc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xavierluzvendas.vendasmvc.domain.Categoria;
import com.xavierluzvendas.vendasmvc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repositorio;
	
	public Categoria Get(Integer id) {
		Optional<Categoria> categoria = this.repositorio.findById(id);
		
		return categoria.orElse(null);
	}
}
