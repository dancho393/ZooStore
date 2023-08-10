package com.example.zoostore.api.operations.comment;

import com.example.zoostore.api.operations.base.Operation;

public interface CreateCommentOperation extends Operation<CreateCommentResponse, CreateCommentRequest> {
    CreateCommentResponse process(CreateCommentRequest request);

}
