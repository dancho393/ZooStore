package com.example.zoostore.api.operations.tag.edit;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service
public interface EditTagOperation extends Operation<EditTagResponse,EditTagRequest> {
    public EditTagResponse process(EditTagRequest tag);
}
