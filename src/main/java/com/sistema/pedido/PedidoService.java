package com.sistema.pedido;

import java.util.List;
import java.util.Optional;

import com.sistema.item.Item;
import com.sistema.item.ItemRepository;
import com.sistema.pedido.dto.PedidoDTOCreate;
import com.sistema.pedido.dto.PedidoDTOList;
import com.sistema.pedido.dto.mapper.PedidoDTOListMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;

@Service
@Transactional
public class PedidoService {

    @Autowired
    PedidoRepository repository;


    @Autowired
    PedidoDTOListMapper pedidoDTOListMapper;

    @Autowired
    ItemRepository itemRepository;




    public List<PedidoDTOList> listar() {

        return pedidoDTOListMapper.toDTOList(repository.findAll()) ;
    }


    public Pedido buscar(Long id) {
        Pedido resultado;

        Optional<Pedido> op = repository.findById(id);
        if (op.isPresent()){

            resultado = op.get();
        }
        else {
            throw  new RuntimeException("Pedido não localizado!");
        }

        return  resultado;
    }

    @Transactional
    public Pedido criar(@NotNull PedidoDTOCreate dto) {

        Pedido pedido = new Pedido();
        pedido.setCliente(dto.getCliente());
        pedido.setPedidoItem(dto.getItem());
        pedido.setTotalPedido(dto.getTotalPedido());
        repository.save(pedido);

        List<Item> items = dto.getItem();
        itemRepository.saveAll(items);

        return pedido;
}

    public Pedido alterar(@NotNull PedidoDTOList dto) {
        Pedido pedido = new Pedido();
        pedido.setId(dto.getId());
        pedido.setTotalPedido(dto.getTotalPedido());
        pedido.setCliente(dto.getCliente());


        return repository.save(pedido);
    }

    public void excluir(Long id) {

    repository.deleteById(id);

    }

}
