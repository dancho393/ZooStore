package com.example.zoostore.api.operations.link.create;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service
public interface CreateLinkOperation extends Operation<CreateLinkResponse,CreateLinkRequest> {
    public CreateLinkResponse process(CreateLinkRequest link );
}
