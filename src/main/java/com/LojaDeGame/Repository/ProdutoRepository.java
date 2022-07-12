package com.LojaDeGame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LojaDeGame.model.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List <Produto> findAllByNomeContainingIgnoreCase(String nome);
	
}
