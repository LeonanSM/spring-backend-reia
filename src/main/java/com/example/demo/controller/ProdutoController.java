package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	private static String[] ar = { "Carro", "Caminhao", "Cheve", "Moto" };

	@GetMapping("/lista")
	public List<String> lista() {

		return Arrays.asList(ar);
	}

	@PostMapping("/criar")
	public String criar(@RequestBody ProdutoForm form) {

		System.out.println(form);
		return form.getNome() + " Criado";
	}

	@PutMapping("/alterar")
	public String alterar(@RequestBody ProdutoForm form) {

		System.out.println(form);
		return form.getNome() + " Alterado";
	}
}

class ProdutoForm {

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
