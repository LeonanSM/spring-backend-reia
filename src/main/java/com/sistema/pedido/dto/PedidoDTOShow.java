package com.sistema.pedido.dto;

import com.sistema.item.Item;
import com.sistema.pessoa.Pessoa;

import java.util.List;


public class PedidoDTOShow {

    private String tipo = "ListaDTO";
    private Long id;
    private Pessoa cliente;
    private Long idCliente;
    private String totalPedido;
    private List<Item> item;

    public PedidoDTOShow(Pessoa cliente, String totalPedido) {

        this.cliente = cliente;
        this.totalPedido = totalPedido;
    }

    public PedidoDTOShow() {

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

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public void setTotalPedido(String totalPedido) {
        this.totalPedido = totalPedido;
    }

    public List<Item> getPedidoItem() {
        return item;
    }

    public void setPedidoItem(List<Item> item) {
        this.item = item;
    }
}
