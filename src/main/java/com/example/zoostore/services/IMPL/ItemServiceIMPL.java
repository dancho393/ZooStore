package com.example.zoostore.services.IMPL;

import com.example.zoostore.dto.ItemDTO;
import com.example.zoostore.entities.Item;
import com.example.zoostore.mapper.ItemMapper;
import com.example.zoostore.repositories.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceIMPL {

    private ItemRepository itemRepository;
    private ItemMapper itemMapper;

    public Item createItem(Item item){


        return itemRepository.save(item);
    }


}
