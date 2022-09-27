package com.sistema.controller;

import com.sistema.pessoa.PessoaService;
import com.sistema.pessoa.dto.PessoaDTOList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @GetMapping("/listar")
    public List<PessoaDTOList> listar(){
        return service.listar();
    }
}
