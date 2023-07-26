package com.example.zoostore.core.operations.link;

import com.example.zoostore.api.operations.link.delete.DeleteLinkRequest;
import com.example.zoostore.api.operations.link.delete.DeleteLinkResponse;
import com.example.zoostore.api.operations.link.delete.DeleteLinkOperation;
import com.example.zoostore.persistence.entities.Link;
import com.example.zoostore.persistence.repositories.LinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteLinkIMPL implements DeleteLinkOperation {
    private final LinkRepository linkRepository;

    @Override
    public DeleteLinkResponse process(DeleteLinkRequest link) {
        Link linkEntity =linkRepository.findById(link.getId()).orElse(null);
        linkRepository.deleteById(link.getId());
        return DeleteLinkResponse.builder()
                .id(link.getId())
                .url(linkEntity.getUrl())
                .build();
    }
}
