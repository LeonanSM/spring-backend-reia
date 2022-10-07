package com.sistema.controller;

import java.util.List;

import com.sistema.pedido.Pedido;
import com.sistema.pedido.dto.PedidoDTOCreate;
import com.sistema.pedido.dto.PedidoDTOList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.sistema.pedido.PedidoService;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping("/listar")
    public List<PedidoDTOList> listar(){
        return service.listar();
    }

    @GetMapping("/buscar")
    public Pedido buscar(@RequestParam Long id) {
        return service.buscar(id);
    }

    @PostMapping("/criar")
    public Pedido criar(@RequestBody @Validated PedidoDTOCreate dto) {

        return service.criar(dto);
    }


        @PutMapping("/alterar")
        public Pedido alterar(@RequestBody PedidoDTOList dto) {

            return service.alterar(dto);
        }


    @DeleteMapping("/excluir")
    public void excluir(@RequestParam Long id) {

        service.excluir(id);
    }
}
