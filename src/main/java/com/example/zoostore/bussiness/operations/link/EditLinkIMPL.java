package com.example.zoostore.bussiness.operations.link;

import com.example.zoostore.api.configs.ResourceNotFoundExpcetion;
import com.example.zoostore.api.operations.link.edit.EditLinkRequest;
import com.example.zoostore.api.operations.link.edit.EditLinkResponse;
import com.example.zoostore.api.operations.link.edit.EditLinkService;
import com.example.zoostore.data.entities.Link;
import com.example.zoostore.data.repositories.LinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EditLinkIMPL implements EditLinkService {
    private final LinkRepository linkRepository;

    @Override
    public EditLinkResponse editLink(EditLinkRequest link) throws ResourceNotFoundExpcetion {
        Link linkEntity = linkRepository.findById(link.getId())
                        .orElseThrow(()->new ResourceNotFoundExpcetion("Link Not Found"));

        linkEntity.setUrl(link.getUrl());
        linkRepository.save(linkEntity);
        return EditLinkResponse.builder()
                .id(linkEntity.getId())
                .url(linkEntity.getUrl())
                .build();
    }
}
