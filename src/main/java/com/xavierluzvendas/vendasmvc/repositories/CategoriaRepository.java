package com.xavierluzvendas.vendasmvc.repositories;

import com.xavierluzvendas.vendasmvc.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
