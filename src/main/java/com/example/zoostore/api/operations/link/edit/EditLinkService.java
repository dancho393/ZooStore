package com.example.zoostore.api.operations.link.edit;

import org.springframework.stereotype.Service;

@Service
public interface EditLinkService {
    public EditLinkResponse editLink(EditLinkRequest link);
}
