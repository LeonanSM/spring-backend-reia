package com.sistema.pedido;

import java.util.List;

import com.sistema.pedido.dto.PedidoDTOListar;
import com.sistema.pedido.dto.mapper.PedidoConverte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository repository;


    @Autowired
    final PedidoConverte pedidoConverte;

    public PedidoService(PedidoConverte pedidoConverte) {
        this.pedidoConverte = pedidoConverte;
    }


    public List<PedidoDTOListar> listar() {

        // List<Pedido> pedido = repository.findAll();

        return pedidoConverte.toDTOList(repository.findAll());
    }

}
