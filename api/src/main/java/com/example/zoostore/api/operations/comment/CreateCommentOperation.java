package com.example.zoostore.api.operations.comment;

import com.example.zoostore.api.operations.base.Operation;

public interface CreateCommentOperation extends Operation<CreateCommentsResponse, CreateCommentsRequest> {
    CreateCommentsResponse process(CreateCommentsRequest request);

}
