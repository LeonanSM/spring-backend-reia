package com.sistema.controller;

import com.sistema.item.Item;
import com.sistema.item.ItemService;
import com.sistema.produto.Produto;
import com.sistema.produto.ProdutoService;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService service;

    @GetMapping("/listar")
    public List<Item> listar() {
        return service.listar();
    }
}