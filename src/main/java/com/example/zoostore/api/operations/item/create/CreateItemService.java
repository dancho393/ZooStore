package com.example.zoostore.api.operations.item.create;

import com.example.zoostore.data.entities.Item;
import com.example.zoostore.models.createItemIO.ItemInput;
import org.springframework.stereotype.Service;

@Service
public interface CreateItemService {
    public CreateItemResponse createItem(CreateItemRequest item);
}
