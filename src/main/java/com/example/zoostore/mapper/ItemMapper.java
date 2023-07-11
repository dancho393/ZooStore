package com.example.zoostore.mapper;

import com.example.zoostore.models.addItemIO.ItemInput;
import com.example.zoostore.entities.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {
    public Item toDTO(Item item){
            return null;

    }

    public Item toEntity(ItemInput item){
        Item itemEntity =new Item();
        itemEntity.setArchived(false);
        itemEntity.setTitle(item.getTitle());
        itemEntity.setDescription(item.getDescription());

        return itemEntity;
    }


}
