package com.example.zoostore.core.operations.item;

import com.example.zoostore.rest.exceptions.ResourceNotFoundException;
import com.example.zoostore.api.operations.item.get.GetItemRequest;
import com.example.zoostore.api.operations.item.get.GetItemResponse;
import com.example.zoostore.api.operations.item.get.GetItemService;
import com.example.zoostore.persistence.entities.Item;
import com.example.zoostore.persistence.entities.Link;
import com.example.zoostore.persistence.entities.Tag;
import com.example.zoostore.persistence.repositories.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetItemIMPL implements GetItemService {
    private final ItemRepository itemRepository;
    @Override
    public GetItemResponse process(GetItemRequest item)  {
        Item itemEntity = itemRepository.findById(item.getId())
                .orElseThrow(()->new ResourceNotFoundException("Item Not Found"));
        Set<String> links = itemEntity.getLinks()
                .stream()
                .map(Link::getUrl)
                .collect(Collectors.toSet());

        Set<String> tags = itemEntity.getTags()
                .stream()
                .map(Tag::getTitle)
                .collect(Collectors.toSet());

        return GetItemResponse.builder()
                .id(itemEntity.getId())
                .title(itemEntity.getTitle())
                .description(itemEntity.getDescription())
                .vendorName(itemEntity.getVendor().getName())
                .links(links)
                .tags(tags)
                .build();
    }
}
