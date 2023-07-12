package com.example.zoostore.bussiness.operations.item;

import com.example.zoostore.api.operations.item.archieve.ArchieveItemRequest;
import com.example.zoostore.api.operations.item.archieve.ArchieveItemResponse;
import com.example.zoostore.api.operations.item.archieve.ArchieveItemService;
import com.example.zoostore.data.entities.Item;
import com.example.zoostore.data.repositories.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArchieveItemIMPL implements ArchieveItemService {
    private final ItemRepository itemRepository;


    @Override
    public ArchieveItemResponse archieveItem(ArchieveItemRequest item) {
        Item itemEntity=itemRepository.findById(item.getId()).orElse(null);
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
