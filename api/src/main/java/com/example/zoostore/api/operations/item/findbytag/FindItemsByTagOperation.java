package com.example.zoostore.api.operations.item.findbytag;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service
public interface FindItemsByTagOperation extends Operation<FindItemsByTagResponse,FindItemsByTagRequest> {
    FindItemsByTagResponse process(FindItemsByTagRequest tag);
}
