package com.example.zoostore.api.operations.tag.attach;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service
public interface AttachTagService extends Operation<AttachTagResponse,AttachTagRequest> {
    public AttachTagResponse process(AttachTagRequest tagToItem);
}
