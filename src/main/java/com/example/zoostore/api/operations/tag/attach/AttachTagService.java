package com.example.zoostore.api.operations.tag.attach;

import org.springframework.stereotype.Service;

@Service
public interface AttachTagService {
    public AttachTagResponse attachTag(AttachTagRequest tagToItem);
}
