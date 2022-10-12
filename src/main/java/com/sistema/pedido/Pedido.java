package com.sistema.pedido;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sistema.item.Item;
import com.sistema.pessoa.Pessoa;
import java.util.List;


@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonManagedReference
	private Pessoa cliente;

	@OneToMany(mappedBy = "pedido", fetch = FetchType.EAGER)
	private List<Item> itens;


	private String totalPedido;

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

	public List<Item> getItem() {
		return itens;
	}

	public void setItem(List<Item> itens) {
		this.itens = itens;
	}
}
