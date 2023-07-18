package com.example.zoostore.api.operations.link.edit;

import com.example.zoostore.api.operations.base.Operation;
import org.springframework.stereotype.Service;

@Service
public interface EditLinkService extends Operation<EditLinkResponse,EditLinkRequest> {
    public EditLinkResponse process(EditLinkRequest link) ;
}
