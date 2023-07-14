package com.example.zoostore.bussiness.operations.item;

import com.example.zoostore.api.configs.ResourceNotFoundExpcetion;
import com.example.zoostore.api.operations.item.edit.EditItemRequest;
import com.example.zoostore.api.operations.item.edit.EditItemResponse;
import com.example.zoostore.api.operations.item.edit.EditItemService;
import com.example.zoostore.data.entities.Item;
import com.example.zoostore.data.entities.Vendor;
import com.example.zoostore.data.repositories.ItemRepository;
import com.example.zoostore.data.repositories.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EditItemIMPL implements EditItemService {
    private final ItemRepository itemRepository;
    private final VendorRepository vendorRepository;


    @Override
    public EditItemResponse editItem(EditItemRequest item) throws ResourceNotFoundExpcetion {
        Item itemEntity = itemRepository.findById(item.getId())
                .orElseThrow(()->new ResourceNotFoundExpcetion("Item Not Found"));
        itemEntity.setTitle(item.getTitle());
        itemEntity.setDescription(item.getDescription());
        Vendor vendorEntity = vendorRepository.findById(item.getVendor()).orElse(null);
        itemEntity.setVendor(vendorEntity);
        return EditItemResponse.builder()
                .id(itemEntity.getId())
                .title(itemEntity.getTitle())
                .description(itemEntity.getDescription())
                .vendor(itemEntity.getVendor().getName())
                .build();
    }
}
