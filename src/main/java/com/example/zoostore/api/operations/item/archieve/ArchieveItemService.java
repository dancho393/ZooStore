package com.example.zoostore.api.operations.item.archieve;

import org.springframework.stereotype.Service;

@Service
public interface ArchieveItemService {
    public ArchieveItemResponse archieveItem(ArchieveItemRequest item);
}
