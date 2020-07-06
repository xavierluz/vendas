package com.xavierluzvendas.vendasmvc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xavierluzvendas.vendasmvc.domain.Categoria;
import com.xavierluzvendas.vendasmvc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	
	@Autowired
	CategoriaService categoriaService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> Get(@PathVariable Integer id) {
		
		Categoria categoria = this.categoriaService.Get(id);
		
		return ResponseEntity.ok().body(categoria);
	}

}
