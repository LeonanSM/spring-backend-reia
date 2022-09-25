package com.sistema.pedido.dto;

import com.sistema.pedido.Pedido;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("spring")
public class PedidoConverte {
    public PedidoConverte(){}

    public PedidoDTOListar toDTO(Pedido pedido){

        PedidoDTOListar pedidoDTO = new PedidoDTOListar();

        pedidoDTO.setEntidade(pedido.getEntidade());
        pedidoDTO.setTotalPedido(pedido.getTotalPedido());

        return pedidoDTO;
    }

    public List<PedidoDTOListar> toDTOList(List<Pedido> dtos){

        List<PedidoDTOListar> listaPedidoDTO = new ArrayList<>();
        for (Pedido pedido: dtos) {
            listaPedidoDTO.add( toDTO(pedido));
        }


        return listaPedidoDTO;
    }
}
//revisar