package com.example.zoostore.api.operations.item.get;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service

public interface GetItemOperation extends Operation<GetItemResponse,GetItemRequest> {
    public GetItemResponse process(GetItemRequest item) ;
}
