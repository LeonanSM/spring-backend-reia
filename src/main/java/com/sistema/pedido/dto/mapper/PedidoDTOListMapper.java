package com.sistema.pedido.dto.mapper;

import com.sistema.pedido.Pedido;
import com.sistema.pedido.dto.PedidoDTOList;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("spring-pedido-list")
public class PedidoDTOListMapper {
    public PedidoDTOListMapper(){}

    public PedidoDTOList toDTO(Pedido pedido){

        PedidoDTOList pedidoDTO = new PedidoDTOList();

        pedidoDTO.setId(pedido.getId());
        pedidoDTO.setCliente(pedido.getCliente());
        pedidoDTO.setIdCliente(pedido.getCliente().getId());
        pedidoDTO.setTotalPedido(pedido.getTotalPedido());



        return pedidoDTO;
    }

    public List<PedidoDTOList> toDTOList(List<Pedido> dtos){

        List<PedidoDTOList> listaPedidoDTO = new ArrayList<>(dtos.size());
        for (Pedido pedido: dtos) {
            listaPedidoDTO.add( toDTO(pedido));
        }


        return listaPedidoDTO;
    }

    public Pedido toEntity(PedidoDTOList dto){

        Pedido pedido = new Pedido();

        pedido.setId(dto.getId());
        pedido.setCliente(dto.getCliente());
        pedido.setTotalPedido(dto.getTotalPedido());



        return pedido;
    }



}