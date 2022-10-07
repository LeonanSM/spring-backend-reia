package com.sistema.item.dto.mapper;

import com.sistema.item.Item;
import com.sistema.item.dto.ItemDTOCreate;

public class ItemDTOCreateMapper {

    public Item toEntity (ItemDTOCreate dto){

        Item item = new Item();

        item.setPedido(dto.getPedido());
        item.setDescricao(dto.getDesCricao());

        return item;
    }
}
