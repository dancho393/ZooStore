package com.example.zoostore.services.IMPL;

import com.example.zoostore.dto.ItemDTO;
import com.example.zoostore.entities.Item;
import com.example.zoostore.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceIMPL {
    @Autowired
    private ItemRepository itemRepository;

    public Item createItem(Item item){


        return itemRepository.save(item);
    }


}
