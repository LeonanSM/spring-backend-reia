package com.sistema.item;

import com.sistema.item.dto.ItemDTOCreate;
import com.sistema.produto.Produto;
import com.sistema.produto.dto.ProdutoDTOList;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private ItemRepository repository;
    public List<Item> listar() {
        return repository.findAll();
    }

    public Item buscar(Long id) {

        Item resultado;

        Optional<Item> op = repository.findById(id);
        if (op.isPresent()) {
            resultado = op.get();
        } else {
            resultado = new Item();
            resultado.setDescricao("Produto não encontrado");
        }

        return resultado;
    }

    public Item criar(ItemDTOCreate dto) {
        Item item = new Item();
        item.setDescricao(dto.getDesCricao());
        item.setPreco(dto.getPreco());

        return repository.save(item);
    }

    public Item alterar(ProdutoDTOList dto) {
        Item item = new Item();
        item.setId(dto.getId());
        item.setDescricao(dto.getDescricao());
        item.setPreco(dto.getPreco());

        return repository.save(item);
    }

    public void excluir(Long id) {

        repository.deleteById(id);

    }
}
