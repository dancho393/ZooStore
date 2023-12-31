package com.example.zoostore.core.operations.link;

import com.example.zoostore.api.operations.link.create.CreateLinkOperation;
import com.example.zoostore.api.operations.link.create.CreateLinkRequest;
import com.example.zoostore.api.operations.link.create.CreateLinkResponse;
import com.example.zoostore.core.exceptions.ResourceNotFoundException;
import com.example.zoostore.persistence.entities.Item;
import com.example.zoostore.persistence.entities.Link;
import com.example.zoostore.persistence.repositories.ItemRepository;
import com.example.zoostore.persistence.repositories.LinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateLinkIMPL implements CreateLinkOperation {
    private final LinkRepository linkRepository;
    private final ItemRepository itemRepository;
    @Override
    public CreateLinkResponse process(CreateLinkRequest link) {
        Item itemEntity = itemRepository.findById(link.getItemId())
                .orElseThrow(()->new ResourceNotFoundException("Item Not Found"));
        Link linkEntity = Link.builder()
                .url(link.getUrl())
                .item(itemEntity)
                .build();
        linkRepository.save(linkEntity);
        return CreateLinkResponse.builder()
                .id(linkEntity.getId())
                .itemTitle(itemEntity.getTitle())
                .url(link.getUrl())
                .build();
    }

}
