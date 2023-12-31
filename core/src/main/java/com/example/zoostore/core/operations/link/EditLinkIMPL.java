package com.example.zoostore.core.operations.link;


import com.example.zoostore.api.operations.link.edit.EditLinkOperation;
import com.example.zoostore.api.operations.link.edit.EditLinkRequest;
import com.example.zoostore.api.operations.link.edit.EditLinkResponse;
import com.example.zoostore.core.exceptions.ResourceNotFoundException;
import com.example.zoostore.persistence.entities.Link;
import com.example.zoostore.persistence.repositories.LinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EditLinkIMPL implements EditLinkOperation {
    private final LinkRepository linkRepository;

    @Override
    public EditLinkResponse process(EditLinkRequest link)  {
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
