package com.LojaDeGame.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LojaDeGame.Repository.ProdutoRepository;
import com.LojaDeGame.model.Produto;



@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {
	
	
	private ProdutoRepository repository;
	
	@GetMapping
	 public ResponseEntity<List<Produto>> GetAll(){
			return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	 public ResponseEntity<Produto> GetById(@PathVariable long id){
			return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	
	}
	
	 @PostMapping
	public ResponseEntity<List<Produto>> GetByNome (@PathVariable String nome) {
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
			
	 }
	 
	 @PutMapping
	 public ResponseEntity<Produto> put (@RequestBody Produto produto){
			return ResponseEntity.status(HttpStatus.OK).body(repository.save(produto));
		
	 }
	 
	 @DeleteMapping("/{id}")
	 public void delete(@PathVariable long id) {
			repository.deleteById(id);
		
	 }
		
		
		
		
			
}
