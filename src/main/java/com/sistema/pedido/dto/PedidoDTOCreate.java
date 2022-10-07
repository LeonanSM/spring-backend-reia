package com.sistema.pedido.dto;

import com.sistema.item.Item;
import com.sistema.pessoa.Pessoa;

import java.util.List;

public class PedidoDTOCreate {

    private Pessoa cliente;

    private String totalPedido;

    private List<Item> item;

    PedidoDTOCreate(){}

    public PedidoDTOCreate(Pessoa cliente, String totalPedido, List<Item> item) {
        this.cliente = cliente;
        this.totalPedido = totalPedido;
        this.item = item;
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

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
}
