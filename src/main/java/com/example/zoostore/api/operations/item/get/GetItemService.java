package com.example.zoostore.api.operations.item.get;

import org.springframework.stereotype.Service;

@Service

public interface GetItemService {
    public GetItemResponse getItem(GetItemRequest item);
}
