package com.example.zoostore.api.operations.link.get;

import com.example.zoostore.api.operations.Operation;
import com.example.zoostore.rest.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface GetLinkService extends Operation<GetLinkResponse,GetLinkRequest>{
    public GetLinkResponse process(GetLinkRequest link) ;
}
