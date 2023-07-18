package com.example.zoostore.api.operations.link.edit;

import com.example.zoostore.api.operations.Operation;
import com.example.zoostore.rest.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface EditLinkService extends Operation<EditLinkResponse,EditLinkRequest> {
    public EditLinkResponse process(EditLinkRequest link) ;
}
