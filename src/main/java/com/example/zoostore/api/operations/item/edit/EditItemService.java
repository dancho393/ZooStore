package com.example.zoostore.api.operations.item.edit;

import org.springframework.stereotype.Service;

@Service
public interface EditItemService {
    public EditItemResponse editItem(EditItemRequest item);
}
