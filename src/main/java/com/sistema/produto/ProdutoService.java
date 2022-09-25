package com.sistema.produto;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.produto.dto.ProdutoListDTO;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	public List<Produto> listar() {
		return repository.findAll();
	}

	public Produto buscar(Long id) {

		Produto resultado = null;

		Optional<Produto> op = repository.findById(id);
		if (op.isPresent()) {
			resultado = op.get();
		} else {
			resultado = new Produto();
			resultado.setNome("Produto não encontrado");
		}

		return resultado;
	}

	public Produto criar(ProdutoListDTO dto) {
		Produto produto = new Produto();
		produto.setNome(dto.getNome());
		produto.setDescricao(dto.getDescricao());
		produto.setPreco(dto.getPreco());

		Produto criado = repository.save(produto);

		return criado;
	}

	public Produto alterar(ProdutoListDTO dto) {
		Produto produto = new Produto();
		produto.setId(dto.getId());
		produto.setNome(dto.getNome());
		produto.setDescricao(dto.getDescricao());
		produto.setPreco(dto.getPreco());

		Produto alterado = repository.save(produto);

		return alterado;
	}

	public void excluir(Long id) {

		repository.deleteById(id);

	}
}
