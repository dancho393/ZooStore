package com.example.zoostore.core.operations.item;

import com.example.zoostore.api.operations.item.archieve.ArchieveItemOperation;
import com.example.zoostore.api.operations.item.archieve.ArchieveItemRequest;
import com.example.zoostore.api.operations.item.archieve.ArchieveItemResponse;
import com.example.zoostore.core.exceptions.ResourceNotFoundException;
import com.example.zoostore.persistence.entities.Item;
import com.example.zoostore.persistence.repositories.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class ArchieveItemIMPL implements ArchieveItemOperation {
    private final ItemRepository itemRepository;

    @Override
    public ArchieveItemResponse process(ArchieveItemRequest item)  {
        Item itemEntity=itemRepository.findById(item.getId())
                .orElseThrow(()->new ResourceNotFoundException("Item Not Found"));
        itemEntity.setArchived(true);
        itemRepository.save(itemEntity);
        return ArchieveItemResponse.builder()
                .id(itemEntity.getId())
                .title(itemEntity.getTitle())
                .vendorName(itemEntity.getVendor().getName())
                .archived(itemEntity.isArchived())
                .build();
    }


}
