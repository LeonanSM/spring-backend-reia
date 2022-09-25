package com.sistema.pedido.dto;

import com.sistema.entidade.Entidade;
import jdk.nashorn.internal.objects.annotations.Getter;


public class PedidoDTOListar {

    private String tipo = "ListaDTO";
    private Entidade entidade;
    private String totalPedido;

    public PedidoDTOListar(Entidade entidade, String totalPedido) {

        this.entidade = entidade;
        this.totalPedido = totalPedido;
    }

    public PedidoDTOListar() {

    }


    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
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
}
