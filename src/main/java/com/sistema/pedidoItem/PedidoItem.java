package com.sistema.pedidoItem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.sistema.pedido.Pedido;

@Entity
public class PedidoItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false, unique = true)
	private String descricao;
	
	@Column(nullable = false)
	private String preco;
	
	@ManyToOne()
	private Pedido pedido;
}
