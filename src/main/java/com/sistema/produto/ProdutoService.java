package com.sistema.produto;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.produto.dto.ProdutoDTOList;

@Service
public class ProdutoService {

	@Autowired
	public ProdutoRepository repository;

	public List<Produto> listar() {
		return repository.findAll();
	}

	public Produto buscar(Long id) {

		Produto resultado;

		Optional<Produto> op = repository.findById(id);
		if (op.isPresent()) {
			resultado = op.get();
		} else {
			resultado = new Produto();
			resultado.setNome("Produto não encontrado");
		}

		return resultado;
	}

	public Produto criar(ProdutoDTOList dto) {
		Produto produto = new Produto();
		produto.setNome(dto.getNome());
		produto.setGrupo(dto.getDescricao());
		produto.setPreco(dto.getPreco());

		return repository.save(produto);
	}

	public Produto alterar(ProdutoDTOList dto) {
		Produto produto = new Produto();
		produto.setId(dto.getId());
		produto.setNome(dto.getNome());
		produto.setGrupo(dto.getDescricao());
		produto.setPreco(dto.getPreco());

		return repository.save(produto);
	}

	public void excluir(Long id) {

		repository.deleteById(id);

	}
}
