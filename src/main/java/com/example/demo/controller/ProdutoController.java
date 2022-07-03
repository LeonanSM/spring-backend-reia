package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProdutoDTO;
import com.example.demo.entity.Produto;
import com.example.demo.service.ProdutoService;

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
	public Produto criar(@RequestBody ProdutoDTO dto) {

		return service.criar(dto);
	}

	@PutMapping("/alterar")
	public Produto alterar(@RequestBody ProdutoDTO dto) {

		return service.alterar(dto);
	}

	@DeleteMapping("/excluir")
	public void excluir(@RequestParam Long id) {

		service.excluir(id);
	}
}
