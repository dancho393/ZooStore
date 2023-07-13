package com.example.zoostore.api.operations.link.get;

import org.springframework.stereotype.Service;

@Service
public interface GetLinkService {
    public GetLinkResponse getLink(GetLinkRequest link);
}
