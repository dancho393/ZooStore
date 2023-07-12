package com.example.zoostore.api.operations.tag.delete;

import org.springframework.stereotype.Service;

@Service
public interface DeleteTagService {
    public DeleteTagResponse deleteTag(DeleteTagRequest tag);
}
