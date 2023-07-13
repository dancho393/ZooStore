package com.example.zoostore.api.operations.item.create;

import org.springframework.stereotype.Service;

@Service
public interface CreateItemService {
    public CreateItemResponse createItem(CreateItemRequest item);
}
