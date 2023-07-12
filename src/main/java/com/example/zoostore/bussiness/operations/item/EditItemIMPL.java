package com.example.zoostore.bussiness.operations.item;

import com.example.zoostore.api.operations.item.edit.EditItemRequest;
import com.example.zoostore.api.operations.item.edit.EditItemService;
import com.example.zoostore.api.operations.vendor.edit.EditVendorRequest;
import com.example.zoostore.api.operations.vendor.edit.EditVendorResponse;
import com.example.zoostore.data.entities.Item;
import com.example.zoostore.data.repositories.ItemRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EditItemIMPL implements EditItemService {
    private final ItemRepository itemRepository;

    @Override
    public EditVendorResponse editItem(EditItemRequest item) {
        Item itemEntity = itemRepository.findById(item.getId()).orElse(null);

        return null;
    }
}
