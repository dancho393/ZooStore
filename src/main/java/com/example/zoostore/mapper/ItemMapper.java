package com.example.zoostore.mapper;

import com.example.zoostore.models.createItemIO.ItemInput;
import com.example.zoostore.entities.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {
    public Item toDTO(Item item){
            return null;

    }

    public Item toEntity(ItemInput item){
        Item itemEntity = Item.builder()
                .archived(false)
                .title(item.getTitle())
                .description(item.getDescription())
                .build();

        return itemEntity;
    }


}
