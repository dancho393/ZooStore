package com.example.zoostore.api.operations.link.create;

import com.example.zoostore.api.operations.Operation;
import org.springframework.stereotype.Service;

@Service
public interface CreateLinkService extends Operation<CreateLinkResponse,CreateLinkRequest> {
    public CreateLinkResponse process(CreateLinkRequest link );
}
