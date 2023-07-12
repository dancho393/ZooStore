package com.example.zoostore.api.operations.link.get;

import com.example.zoostore.api.operations.item.get.GetItemResponse;
import org.springframework.stereotype.Service;

@Service
public interface GetLinkService {
    public GetLinkResponse getLink(GetLinkRequest link);
}
