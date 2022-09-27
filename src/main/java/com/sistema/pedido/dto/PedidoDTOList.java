package com.sistema.pedido.dto;

import com.sistema.pedidoItem.PedidoItem;
import com.sistema.pessoa.Pessoa;

import java.util.ArrayList;
import java.util.List;


public class PedidoDTOList {

    private String tipo = "ListaDTO";
    private Long id;
    private Pessoa cliente;
    private String totalPedido;
    private List<PedidoItem> pedidoItem;

    public PedidoDTOList(Pessoa cliente, String totalPedido) {

        this.cliente = cliente;
        this.totalPedido = totalPedido;
    }

    public PedidoDTOList() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
