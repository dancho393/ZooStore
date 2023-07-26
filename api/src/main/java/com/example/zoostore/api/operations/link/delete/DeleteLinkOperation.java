package com.example.zoostore.api.operations.link.delete;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service
public interface DeleteLinkOperation extends Operation<DeleteLinkResponse,DeleteLinkRequest> {
    public DeleteLinkResponse process(DeleteLinkRequest link);
}
