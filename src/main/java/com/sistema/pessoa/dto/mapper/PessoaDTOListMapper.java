package com.sistema.pessoa.dto.mapper;

import com.sistema.pessoa.Pessoa;
import com.sistema.pessoa.dto.PessoaDTOList;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("spring-pessoa")
public class PessoaDTOListMapper {

    public String nome;

    public String cpf;

    public PessoaDTOListMapper() {
    }

    public PessoaDTOList toDTO(Pessoa pessoa){

        PessoaDTOList pessoaDTOList = new PessoaDTOList();

        pessoaDTOList.setNome(pessoa.getNome());
        pessoaDTOList.setCpf(pessoa.getCpf());

        return pessoaDTOList;
    }

    public List<PessoaDTOList> toDTO(List<Pessoa> dtos){

        List<PessoaDTOList> listaPessoaDTO = new ArrayList<>();
        for (Pessoa pessoas:dtos) {
            listaPessoaDTO.add(toDTO(pessoas));
        }


        return listaPessoaDTO;
    }

}
