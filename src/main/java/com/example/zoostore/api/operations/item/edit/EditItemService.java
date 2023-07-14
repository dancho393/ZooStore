package com.example.zoostore.api.operations.item.edit;

import com.example.zoostore.api.configs.ResourceNotFoundExpcetion;
import org.springframework.stereotype.Service;

@Service
public interface EditItemService {
    public EditItemResponse editItem(EditItemRequest item) throws ResourceNotFoundExpcetion;
}
