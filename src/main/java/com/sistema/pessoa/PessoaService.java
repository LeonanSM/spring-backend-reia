package com.sistema.pessoa;

import com.sistema.pessoa.dto.PessoaDTOList;
import com.sistema.pessoa.dto.mapper.PessoaDTOListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    @Autowired
    private PessoaDTOListMapper mapperList;

    public List<PessoaDTOList> listar() {

        return mapperList.toDTO(repository.findAll());
    }

    public Pessoa buscar(Long id) {

        Pessoa resultado;

        Optional<Pessoa> op = repository.findById(id);
        if (op.isPresent()) {
            resultado = op.get();
        } else {
            resultado = new Pessoa();
            resultado.setNome("Produto não encontrado");
        }

        return resultado;
    }
}