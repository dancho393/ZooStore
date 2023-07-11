package com.example.zoostore.services.IMPL;

import com.example.zoostore.exceptions.EntityNotFoundException;
import com.example.zoostore.models.addItemIO.ItemInput;
import com.example.zoostore.entities.Item;
import com.example.zoostore.mapper.ItemMapper;
import com.example.zoostore.repositories.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceIMPL {
    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;
    private final VendorServiceIMPL vendorService;


    public Item createItem(ItemInput item){

        Item  itemEntity= itemMapper.toEntity(item);
        itemEntity.setVendor(vendorService.getById(item.getVendor()));
        itemRepository.save(itemEntity);

        return itemEntity;

    }


}
