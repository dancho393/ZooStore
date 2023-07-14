package com.example.zoostore.api.operations.tag.edit;

import com.example.zoostore.api.configs.ResourceNotFoundExpcetion;
import org.springframework.stereotype.Service;

@Service
public interface EditTagService {
    public EditTagResponse editTag(EditTagRequest tag) throws ResourceNotFoundExpcetion;
}
