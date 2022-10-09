package com.sistema.pedido;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sistema.item.Item;
import com.sistema.pessoa.Pessoa;
import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.List;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonBackReference
	private Pessoa cliente;


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
}
/*
* @OneToMany(mappedBy = "pedido", cascade = CascadeType.PERSIST)
	@JsonManagedReference
	private List<Item> item;
*/