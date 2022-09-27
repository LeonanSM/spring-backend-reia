package com.sistema.pedido.dto;

import com.sistema.pedidoItem.PedidoItem;
import com.sistema.pessoa.Pessoa;

import java.util.List;

public class PedidoDTOCreate {

    private Pessoa cliente;

    private String totalPedido;

    private List<PedidoItem> pedidoItem;

    PedidoDTOCreate(){}

    public PedidoDTOCreate(Pessoa cliente, String totalPedido, List<PedidoItem> pedidoItem) {
        this.cliente = cliente;
        this.totalPedido = totalPedido;
        this.pedidoItem = pedidoItem;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public String getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(String totalPedido) {
        this.totalPedido = totalPedido;
    }

    public List<PedidoItem> getPedidoItem() {
        return pedidoItem;
    }

    public void setPedidoItem(List<PedidoItem> pedidoItem) {
        this.pedidoItem = pedidoItem;
    }
}
