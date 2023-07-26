package com.example.zoostore.api.operations.item.archieve;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service
public interface ArchieveItemOperation extends Operation<ArchieveItemResponse,ArchieveItemRequest> {
    public ArchieveItemResponse process(ArchieveItemRequest item);
}
