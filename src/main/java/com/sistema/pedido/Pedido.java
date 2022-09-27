package com.sistema.pedido;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sistema.pedidoItem.PedidoItem;
import com.sistema.pessoa.Pessoa;

import java.util.List;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JsonManagedReference
	private Pessoa cliente;
	
	private String totalPedido;

	@OneToMany(mappedBy = "pedido", cascade = CascadeType.PERSIST)
	@JsonManagedReference
	private List<PedidoItem> pedidoItem;
	


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
