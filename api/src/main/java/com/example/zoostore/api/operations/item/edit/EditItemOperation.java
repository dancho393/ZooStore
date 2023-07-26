package com.example.zoostore.api.operations.item.edit;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service
public interface EditItemOperation extends Operation<EditItemResponse,EditItemRequest> {
    public EditItemResponse process(EditItemRequest item);
}
