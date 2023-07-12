package com.example.zoostore.api.operations.tag.create;

import org.springframework.stereotype.Service;

@Service
public interface CreateTagService {
    public CreateTagResponse createTag(CreateTagRequest tag);
}
