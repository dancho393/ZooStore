package com.example.zoostore.services;

import com.example.zoostore.entities.Item;
import com.example.zoostore.models.addTagToItem.addTagToItemRequest;
import com.example.zoostore.models.createItemIO.ItemInput;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface ItemService {
    public Item createItem(ItemInput item);
    public Item getItemById(UUID id);

}
