package com.example.zoostore.core.operations.item;

import com.example.zoostore.api.operations.item.create.CreateItemOperation;
import com.example.zoostore.api.operations.item.create.CreateItemRequest;
import com.example.zoostore.api.operations.item.create.CreateItemResponse;
import com.example.zoostore.core.exceptions.ResourceNotFoundException;
import com.example.zoostore.core.mapper.ItemMapper;
import com.example.zoostore.persistence.entities.Item;
import com.example.zoostore.persistence.entities.Vendor;
import com.example.zoostore.persistence.repositories.ItemRepository;
import com.example.zoostore.persistence.repositories.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateItemIMPL implements CreateItemOperation {
    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;
    private final VendorRepository vendorRepository;
    @Override
    public CreateItemResponse process(CreateItemRequest item) {
        Item itemEntity= itemMapper.toEntity(item);
        Vendor vendorEntity = vendorRepository.findById(item.getVendor())
                .orElseThrow(()->new ResourceNotFoundException("Item Not Found"));
        itemEntity.setVendor(vendorEntity);
        itemRepository.save(itemEntity);

        return CreateItemResponse.builder()
                .id(itemEntity.getId())
                .title(itemEntity.getTitle())
                .vendorName(vendorEntity.getName())
                .build();


    }
}
