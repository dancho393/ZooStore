package com.example.zoostore.api.operations.link.get;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service
public interface GetLinkOperation extends Operation<GetLinkResponse,GetLinkRequest>{
    public GetLinkResponse process(GetLinkRequest link) ;
}
