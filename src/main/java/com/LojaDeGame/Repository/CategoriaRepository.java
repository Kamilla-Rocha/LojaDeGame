package com.LojaDeGame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LojaDeGame.model.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);
 
}
