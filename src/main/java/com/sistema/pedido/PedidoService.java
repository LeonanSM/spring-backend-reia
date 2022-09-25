package com.sistema.pedido;

import java.util.List;

import com.sistema.pedido.dto.PedidoDTOListar;
import com.sistema.pedido.dto.PedidoConverte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository repository;


    @Autowired
    PedidoConverte pedidoConverte;



    @Transactional
    public List<PedidoDTOListar> listar() {

        // PedidoConverte pedidoConverte = new PedidoConverte();

        return pedidoConverte.toDTOList(repository.findAll());
    }

}
