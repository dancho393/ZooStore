package com.example.zoostore.core.operations.link;

import com.example.zoostore.rest.exceptions.ResourceNotFoundException;
import com.example.zoostore.api.operations.link.edit.EditLinkRequest;
import com.example.zoostore.api.operations.link.edit.EditLinkResponse;
import com.example.zoostore.api.operations.link.edit.EditLinkService;
import com.example.zoostore.persistence.entities.Link;
import com.example.zoostore.persistence.repositories.LinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EditLinkIMPL implements EditLinkService {
    private final LinkRepository linkRepository;

    @Override
    public EditLinkResponse process(EditLinkRequest link) throws ResourceNotFoundException {
        Link linkEntity = linkRepository.findById(link.getId())
                        .orElseThrow(()->new ResourceNotFoundException("Link Not Found"));

        linkEntity.setUrl(link.getUrl());
        linkRepository.save(linkEntity);
        return EditLinkResponse.builder()
                .id(linkEntity.getId())
                .url(linkEntity.getUrl())
                .build();
    }
}
