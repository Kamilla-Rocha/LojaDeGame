package com.LojaDeGame.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "tb_categoria")
public class Categoria {

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 5, max =100)
	private String nome;
	
	@NotNull
	@Size(min = 10, max =500)
	private String tipo;
	
	@NotNull
	@Size(min = 10, max =500)
	private String usuario;
	
	@NotNull
	@Size(min = 5, max =100)
	private String senha;
	
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL )
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	
	
}
