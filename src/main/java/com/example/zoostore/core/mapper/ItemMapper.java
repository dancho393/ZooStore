package com.example.zoostore.core.mapper;

import com.example.zoostore.api.operations.item.create.CreateItemRequest;
import com.example.zoostore.persistence.entities.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {
    public Item toDTO(Item item){
            return null;

    }

    public Item toEntity(CreateItemRequest item){
        Item itemEntity = Item.builder()
                .archived(false)
                .title(item.getTitle())
                .description(item.getDescription())
                .build();

        return itemEntity;
    }


}
