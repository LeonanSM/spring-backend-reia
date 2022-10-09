package com.sistema.pedido;

import java.util.List;
import java.util.Optional;

import com.sistema.item.ItemRepository;
import com.sistema.pedido.dto.PedidoDTOCreate;
import com.sistema.pedido.dto.PedidoDTOList;
import com.sistema.pedido.dto.PedidoDTOShow;
import com.sistema.pedido.dto.mapper.PedidoDTOListMapper;
import com.sistema.pedido.dto.mapper.PedidoDTOShowMapper;
import com.sistema.pessoa.Pessoa;
import com.sistema.pessoa.PessoaService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;

@Service
@Transactional
public class PedidoService {

    @Autowired
    PedidoRepository repository;

    @Autowired
    PessoaService clienteService;


    @Autowired
    PedidoDTOListMapper pedidoDTOListMapper;
    PedidoDTOShowMapper pedidoDTOShowMapper;


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

        return resultado;
    }


    public PedidoDTOShow buscarListar(Long id) {

        Optional<Pedido> pedidoListar = repository.findById(id);

        PedidoDTOShow dtoShow = pedidoDTOShowMapper.toDTO(pedidoListar.get());

        return dtoShow;
    }



    @Transactional
    public Pedido criar(PedidoDTOCreate dto) {

       Pessoa cliente = clienteService.buscar(dto.getIdCliente());
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setTotalPedido(dto.getTotalPedido());
        repository.save(pedido);

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
