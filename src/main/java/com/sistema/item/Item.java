package com.sistema.item;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sistema.pedido.Pedido;
import com.sistema.produto.Produto;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;


	@OneToOne(fetch = FetchType.EAGER)
	@JsonBackReference
	@JoinColumn(nullable = true)
	private Produto produto;


	private String descricao;

	@Column(nullable = false)
	private String preco;
	
	@ManyToOne()
	@JsonBackReference
	private Pedido pedido;

	public Item(){};

	public Item(Long id, Produto produto, String preco, Pedido pedido) {
		this.id = id;
		this.produto = produto;
		this.preco = preco;
		this.pedido = pedido;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getDescricao() {
		this.descricao=produto.getNome();
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}


}
