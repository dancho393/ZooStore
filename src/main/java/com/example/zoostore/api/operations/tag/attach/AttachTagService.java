package com.example.zoostore.api.operations.tag.attach;

import com.example.zoostore.api.configs.ResourceNotFoundExpcetion;
import org.springframework.stereotype.Service;

@Service
public interface AttachTagService {
    public AttachTagResponse attachTag(AttachTagRequest tagToItem) throws ResourceNotFoundExpcetion;
}
