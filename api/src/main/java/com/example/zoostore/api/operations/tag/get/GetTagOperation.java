package com.example.zoostore.api.operations.tag.get;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service
public interface GetTagOperation extends Operation<GetTagResponse,GetTagRequest> {
    public GetTagResponse process(GetTagRequest tag) ;
}
