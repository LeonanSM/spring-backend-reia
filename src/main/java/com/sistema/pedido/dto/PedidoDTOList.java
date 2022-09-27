package com.sistema.pedido.dto;

import com.sistema.pedidoItem.PedidoItem;
import com.sistema.pessoa.Pessoa;

import java.util.ArrayList;
import java.util.List;


public class PedidoDTOList {

    private String tipo = "ListaDTO";
    private Long id;
    private String cliente;
    private Long idCliente;
    private String totalPedido;
    private List<PedidoItem> pedidoItem;

    public PedidoDTOList(Pessoa cliente, String totalPedido) {

        this.cliente = cliente.getNome();
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

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
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

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
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
