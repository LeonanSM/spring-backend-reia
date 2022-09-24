package com.sistema.pedido;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

	@Autowired
    PedidoRepository repository;
	
	public List<Pedido> listar() {
	return repository.findAll() ;
    }
	
	// verificar metodo
}
