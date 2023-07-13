package com.example.zoostore.api.operations.link.create;

import org.springframework.stereotype.Service;

@Service
public interface CreateLinkService {
    public CreateLinkResponse createLink(CreateLinkRequest link );
}
