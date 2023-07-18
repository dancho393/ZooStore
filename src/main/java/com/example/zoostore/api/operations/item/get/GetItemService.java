package com.example.zoostore.api.operations.item.get;

import com.example.zoostore.api.operations.Operation;
import com.example.zoostore.rest.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service

public interface GetItemService extends Operation<GetItemResponse,GetItemRequest> {
    public GetItemResponse process(GetItemRequest item) ;
}
