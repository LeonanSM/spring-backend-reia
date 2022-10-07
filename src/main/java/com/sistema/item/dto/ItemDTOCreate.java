package com.sistema.item.dto;

import com.sistema.pedido.Pedido;
import com.sistema.produto.Produto;

public class ItemDTOCreate {

    private Long id;
    private String preco;
    private Pedido pedido;
    private Long idProduto;
    private String desCricao;
    private Produto produto;

    ItemDTOCreate(){}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public String getDesCricao() {
        return desCricao;
    }

    public void setDesCricao(String desCricao) {
        this.desCricao = desCricao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
