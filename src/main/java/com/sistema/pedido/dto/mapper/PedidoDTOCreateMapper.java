package com.sistema.pedido.dto.mapper;

import com.sistema.pedido.Pedido;
import com.sistema.pedido.dto.PedidoDTOCreate;

public class PedidoDTOCreateMapper {

    public Pedido toEntity(PedidoDTOCreate pedidoDTOCreate){

        Pedido pedido = new Pedido();

        pedido.setCliente(pedido.getCliente());
        pedido.setTotalPedido(pedidoDTOCreate.getTotalPedido());

        return pedido;


    }
}
