package com.example.zoostore.api.operations.tag.create;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service
public interface CreateTagOperation extends Operation<CreateTagResponse,CreateTagRequest> {
    public CreateTagResponse process(CreateTagRequest tag);
}
