package com.example.zoostore.bussiness.operations.link;

import com.example.zoostore.api.operations.link.delete.DeleteLinkRequest;
import com.example.zoostore.api.operations.link.delete.DeleteLinkResponse;
import com.example.zoostore.api.operations.link.delete.DeleteLinkService;
import com.example.zoostore.data.entities.Link;
import com.example.zoostore.data.repositories.LinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteLinkIMPL implements DeleteLinkService {
    private final LinkRepository linkRepository;

    @Override
    public DeleteLinkResponse deleteLink(DeleteLinkRequest link) {
        Link linkEntity =linkRepository.findById(link.getId()).orElse(null);
        linkRepository.deleteById(link.getId());
        return DeleteLinkResponse.builder()
                .id(link.getId())
                .url(linkEntity.getUrl())
                .build();
    }
}
