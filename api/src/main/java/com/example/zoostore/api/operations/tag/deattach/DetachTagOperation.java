package com.example.zoostore.api.operations.tag.deattach;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service

public interface DetachTagOperation extends Operation<DetachTagResponse,DetachTagRequest> {
    public DetachTagResponse process(DetachTagRequest tagItem);
}
