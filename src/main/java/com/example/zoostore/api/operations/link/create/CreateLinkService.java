package com.example.zoostore.api.operations.link.create;

import com.example.zoostore.api.operations.item.create.CreateItemRequest;
import com.example.zoostore.api.operations.item.create.CreateItemResponse;
import org.springframework.stereotype.Service;

@Service
public interface CreateLinkService {
    public CreateLinkResponse createLink(CreateLinkRequest link );
}
