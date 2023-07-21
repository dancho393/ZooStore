package com.example.zoostore.api.operations.tag.get;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service
public interface GetTagService extends Operation<GetTagResponse,GetTagRequest> {
    public GetTagResponse process(GetTagRequest tag) ;
}
