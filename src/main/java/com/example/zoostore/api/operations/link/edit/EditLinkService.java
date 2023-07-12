package com.example.zoostore.api.operations.link.edit;

import com.example.zoostore.api.operations.item.edit.EditItemRequest;
import org.springframework.stereotype.Service;

@Service
public interface EditLinkService {
    public EditLinkResponse editLink(EditLinkRequest link);
}
