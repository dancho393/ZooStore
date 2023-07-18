package com.example.zoostore.api.operations.item.archieve;

import com.example.zoostore.api.operations.Operation;
import org.springframework.stereotype.Service;

@Service
public interface ArchieveItemService extends Operation<ArchieveItemResponse,ArchieveItemRequest> {
    public ArchieveItemResponse process(ArchieveItemRequest item);
}
