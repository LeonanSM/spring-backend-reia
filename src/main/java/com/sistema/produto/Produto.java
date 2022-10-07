package com.sistema.produto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sistema.item.Item;

import javax.persistence.*;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String nome;
	private String grupo;
	private String preco;



	@JsonBackReference
	@Transient
	private Item item;

	Produto(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public Item getPedidoItem() {
		return item;
	}

	public void setPedidoItem(Item item) {
		this.item = item;
	}
}
