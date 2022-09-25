package com.sistema.pedido.dto.mapper;

import com.sistema.pedido.Pedido;
import com.sistema.pedido.dto.PedidoDTOListar;
import org.hibernate.boot.jaxb.mapping.spi.Adapter10;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

public class PedidoConverte {

    PedidoConverte(){}
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