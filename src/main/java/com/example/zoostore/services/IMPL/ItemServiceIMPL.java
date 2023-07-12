package com.example.zoostore.services.IMPL;

import com.example.zoostore.models.archieveItem.archieveItemReponse;
import com.example.zoostore.models.createItemIO.ItemInput;
import com.example.zoostore.data.entities.Item;
import com.example.zoostore.bussiness.mapper.ItemMapper;
import com.example.zoostore.data.repositories.ItemRepository;
import com.example.zoostore.services.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ItemServiceIMPL implements ItemService {

    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;
    private final VendorServiceIMPL vendorService;



    @Override
    public Item createItem(ItemInput item){

//        Item  itemEntity= itemMapper.toEntity(item);
//        itemEntity.setVendor(vendorService.getById(item.getVendor()));
//        itemRepository.save(itemEntity);

        return null;
    }
    @Override
    public Item getItemById(UUID id){
        return itemRepository.getById(id);

    }
    public void saveItem(Item item){
        itemRepository.save(item);
    }
    public archieveItemReponse archieveItem(UUID itemId){
        Item item = itemRepository.findById(itemId).orElse(null);
        item.setArchived(true);
        itemRepository.save(item);
        return new archieveItemReponse().builder()
                .itemId(item.getId())
                .title(item.getTitle())
                .archieve(item.isArchived())
                .build();
    }


}
