package com.example.zoostore.api.operations.tag.delete;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service
public interface DeleteTagService extends Operation<DeleteTagResponse,DeleteTagRequest> {
    public DeleteTagResponse process(DeleteTagRequest tag);
}
