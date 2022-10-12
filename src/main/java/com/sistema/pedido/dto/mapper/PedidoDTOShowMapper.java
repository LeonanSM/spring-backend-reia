package com.sistema.pedido.dto.mapper;

import com.sistema.item.Item;
import com.sistema.pedido.Pedido;
import com.sistema.pedido.dto.PedidoDTOShow;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("spring-pedidoshow")
public class PedidoDTOShowMapper {
    public PedidoDTOShowMapper(){}

    public PedidoDTOShow toDTO(Pedido pedido){

        PedidoDTOShow pedidoDTO = new PedidoDTOShow();

        pedidoDTO.setId(pedido.getId());
        pedidoDTO.setCliente(pedido.getCliente())
        ;pedidoDTO.setTotalPedido(pedido.getTotalPedido());



        return pedidoDTO;
    }

    public Pedido toEntity(PedidoDTOShow dto){

        Pedido pedido = new Pedido();

        pedido.setId(dto.getId());
        pedido.setCliente(dto.getCliente());
        pedido.setTotalPedido(dto.getTotalPedido());



        return pedido;
    }


    public List<PedidoDTOShow> toDTOList(List<Pedido> dtos){

        List<PedidoDTOShow> listaPedidoDTO = new ArrayList<>(dtos.size());
        for (Pedido pedido: dtos) {
            listaPedidoDTO.add( toDTO(pedido));
        }


        return listaPedidoDTO;
    }

}