package com.example.zoostore.api.operations.item.archieve;

import com.example.zoostore.api.configs.ResourceNotFoundExpcetion;
import org.springframework.stereotype.Service;

@Service
public interface ArchieveItemService {
    public ArchieveItemResponse archieveItem(ArchieveItemRequest item) throws ResourceNotFoundExpcetion;
}
