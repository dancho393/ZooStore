package com.example.zoostore.bussiness.operations.item;

import com.example.zoostore.api.operations.item.create.CreateItemRequest;
import com.example.zoostore.api.operations.item.create.CreateItemResponse;
import com.example.zoostore.api.operations.item.create.CreateItemService;
import com.example.zoostore.bussiness.mapper.ItemMapper;
import com.example.zoostore.data.entities.Item;
import com.example.zoostore.data.entities.Vendor;
import com.example.zoostore.data.repositories.ItemRepository;
import com.example.zoostore.data.repositories.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateItemIMPL implements CreateItemService {
    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;
    private final VendorRepository vendorRepository;
    @Override
    public CreateItemResponse createItem(CreateItemRequest item) {
        Item itemEntity= itemMapper.toEntity(item);
        Vendor vendorEntity = vendorRepository.findById(item.getVendor()).orElse(null);
        itemEntity.setVendor(vendorEntity);
        itemRepository.save(itemEntity);

        return CreateItemResponse.builder()
                .id(itemEntity.getId())
                .title(itemEntity.getTitle())
                .vendorName(vendorEntity.getName())
                .build();


    }
}
