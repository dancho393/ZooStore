package com.example.zoostore.api.operations.link.delete;

import com.example.zoostore.api.operations.Operation;
import org.springframework.stereotype.Service;

@Service
public interface DeleteLinkService extends Operation<DeleteLinkResponse,DeleteLinkRequest> {
    public DeleteLinkResponse process(DeleteLinkRequest link);
}
