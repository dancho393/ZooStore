package com.example.zoostore.core.operations.item;


import com.example.zoostore.api.operations.item.edit.EditItemRequest;
import com.example.zoostore.api.operations.item.edit.EditItemResponse;
import com.example.zoostore.api.operations.item.edit.EditItemOperation;
import com.example.zoostore.core.exceptions.ResourceNotFoundException;
import com.example.zoostore.persistence.entities.Item;
import com.example.zoostore.persistence.entities.Vendor;
import com.example.zoostore.persistence.repositories.ItemRepository;
import com.example.zoostore.persistence.repositories.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EditItemIMPL implements EditItemOperation {
    private final ItemRepository itemRepository;
    private final VendorRepository vendorRepository;


    @Override
    public EditItemResponse process(EditItemRequest item)  {
        Item itemEntity = itemRepository.findById(item.getId())
                .orElseThrow(()->new ResourceNotFoundException("Item Not Found"));
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
