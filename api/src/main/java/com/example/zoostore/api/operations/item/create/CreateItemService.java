package com.example.zoostore.api.operations.item.create;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service
public interface CreateItemService extends Operation<CreateItemResponse,CreateItemRequest> {
    public CreateItemResponse process(CreateItemRequest item);
}
