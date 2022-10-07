package com.sistema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.produto.Produto;
import com.sistema.produto.ProdutoService;
import com.sistema.produto.dto.ProdutoDTOList;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService service;

	@GetMapping("/listar")
	public List<Produto> listar() {
		return service.listar();
	}

	@GetMapping("/buscar")
	public Produto buscar(@RequestParam Long id) {
		return service.buscar(id);
	}

	@PostMapping("/criar")
	public Produto criar(@RequestBody @Validated ProdutoDTOList dto) {

		return service.criar(dto);
	}

	@PutMapping("/alterar")
	public Produto alterar(@RequestBody ProdutoDTOList dto) {

		return service.alterar(dto);
	}

	@DeleteMapping("/excluir")
	public void excluir(@RequestParam Long id) {

		service.excluir(id);
	}
}
