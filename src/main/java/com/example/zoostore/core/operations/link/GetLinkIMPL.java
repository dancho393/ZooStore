package com.example.zoostore.core.operations.link;

import com.example.zoostore.rest.exceptions.ResourceNotFoundException;
import com.example.zoostore.api.operations.link.get.GetLinkRequest;
import com.example.zoostore.api.operations.link.get.GetLinkResponse;
import com.example.zoostore.api.operations.link.get.GetLinkService;
import com.example.zoostore.persistence.entities.Link;
import com.example.zoostore.persistence.repositories.LinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetLinkIMPL implements GetLinkService {
    private final LinkRepository linkRepository;

    @Override
    public GetLinkResponse process(GetLinkRequest link)  {
        Link linkEntity = linkRepository.findById(link.getId())
                .orElseThrow(()->new ResourceNotFoundException("Link Not Found"));
        return GetLinkResponse.builder()
                .id(link.getId())
                .url(linkEntity.getUrl())
                .itemName(linkEntity.getItem().getTitle())
                .build();
    }
}
