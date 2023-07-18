package com.example.zoostore.api.operations.tag.edit;

import com.example.zoostore.api.operations.Operation;
import com.example.zoostore.rest.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface EditTagService extends Operation<EditTagResponse,EditTagRequest> {
    public EditTagResponse process(EditTagRequest tag);
}
