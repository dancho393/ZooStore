package com.example.zoostore.api.operations.tag.edit;

import org.springframework.stereotype.Service;

@Service
public interface EditTagService {
    public EditTagResponse editTag(EditTagRequest tag);
}
