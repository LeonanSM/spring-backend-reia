package com.sistema.controller;

import java.util.List;

import com.sistema.pedido.Pedido;
import com.sistema.pedido.dto.PedidoDTOList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sistema.pedido.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping("/listar")
    public List<PedidoDTOList> listar(){
        return service.listar();
    }


}
