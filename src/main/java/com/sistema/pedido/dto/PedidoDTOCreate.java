package com.sistema.pedido.dto;

public class PedidoDTOCreate {

    private Long idCliente;

    private String totalPedido;


    public PedidoDTOCreate(){}

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(String totalPedido) {
        this.totalPedido = totalPedido;
    }


}
