package com.sistema.pessoa;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.*;
import com.sistema.pedido.Pedido;

@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nome;

	@Column
	private String cpf;

	@OneToMany(mappedBy = "cliente")
	@JsonManagedReference
	@JsonIgnore
	@Transient
	private List<Pedido> pedido;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
