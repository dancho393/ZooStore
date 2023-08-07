package com.example.zoostore.api.operations.comment;

import com.example.zoostore.api.operations.base.Operation;
import com.example.zoostore.api.operations.base.OperationRequest;
import com.example.zoostore.api.operations.base.OperationResponse;

public interface CreateCommentOperation extends Operation<CreateCommentResponse, CreateCommentRequest> {
    CreateCommentResponse process(CreateCommentRequest request);

}
