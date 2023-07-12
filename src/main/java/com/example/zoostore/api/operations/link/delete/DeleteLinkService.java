package com.example.zoostore.api.operations.link.delete;

import org.springframework.stereotype.Service;

@Service
public interface DeleteLinkService {
    public DeleteLinkResponse deleteLink(DeleteLinkRequest link);
}
