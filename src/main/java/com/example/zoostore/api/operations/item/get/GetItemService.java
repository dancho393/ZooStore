package com.example.zoostore.api.operations.item.get;

import com.example.zoostore.api.configs.ResourceNotFoundExpcetion;
import org.springframework.stereotype.Service;

@Service

public interface GetItemService {
    public GetItemResponse getItem(GetItemRequest item) throws ResourceNotFoundExpcetion;
}
