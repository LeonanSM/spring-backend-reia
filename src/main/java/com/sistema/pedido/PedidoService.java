package com.sistema.pedido;

import java.util.List;

import com.sistema.pedido.dto.PedidoDTOList;
import com.sistema.pedido.dto.mapper.PedidoDTOListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PedidoService {

    @Autowired
    PedidoRepository repository;


    @Autowired
    PedidoDTOListMapper pedidoDTOListMapper;




    public List<PedidoDTOList> listar() {

        return pedidoDTOListMapper.toDTOList(repository.findAll()) ;
    }


}
