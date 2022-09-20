package com.sistema.produto.dto;

public class ProdutoListDTO {

	private Long id;
	private String nome;
	private String descricao;
	private String preco;

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

	public String getDescricao() {
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

	@Override
	public String toString() {
		return String.format("id: %d - nome: %s - descricao: %s - preco: %s", this.id, this.nome, this.descricao,
				this.preco);
	}

}
