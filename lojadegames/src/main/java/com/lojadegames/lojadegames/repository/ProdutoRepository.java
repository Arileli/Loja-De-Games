package com.lojadegames.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojadegames.lojadegames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto,Long>{
	List <Produto> findAllByEstiloContainingIgnoreCase(String estilo);

	
	

}
