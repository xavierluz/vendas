package com.xavierluzvendas.vendasmvc.repositories;

import com.xavierluzvendas.vendasmvc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
