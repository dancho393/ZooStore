package com.example.zoostore.bussiness.operations.link;

import com.example.zoostore.api.operations.item.get.GetItemResponse;
import com.example.zoostore.api.operations.link.get.GetLinkRequest;
import com.example.zoostore.api.operations.link.get.GetLinkResponse;
import com.example.zoostore.api.operations.link.get.GetLinkService;
import com.example.zoostore.data.entities.Link;
import com.example.zoostore.data.repositories.LinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetLinkIMPL implements GetLinkService {
    private final LinkRepository linkRepository;

    @Override
    public GetLinkResponse getLink(GetLinkRequest link) {
        Link linkEntity = linkRepository.findById(link.getId())
                .orElse(null);
        return GetLinkResponse.builder()
                .id(link.getId())
                .url(linkEntity.getUrl())
                .itemName(linkEntity.getItem().getTitle())
                .build();
    }
}
