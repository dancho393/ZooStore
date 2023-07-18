package com.example.zoostore.core.operations.tag;

import com.example.zoostore.rest.exceptions.ResourceNotFoundException;
import com.example.zoostore.api.operations.tag.attach.AttachTagRequest;
import com.example.zoostore.api.operations.tag.attach.AttachTagResponse;
import com.example.zoostore.api.operations.tag.attach.AttachTagService;
import com.example.zoostore.persistence.entities.Item;
import com.example.zoostore.persistence.entities.Tag;
import com.example.zoostore.persistence.repositories.ItemRepository;
import com.example.zoostore.persistence.repositories.TagRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AttachTagIMPL implements AttachTagService {
    private final TagRepository tagRepository;
    private final ItemRepository itemRepository;
    @Override
    public AttachTagResponse process(AttachTagRequest tagToItem) throws ResourceNotFoundException {
        Tag tag=tagRepository.findById(tagToItem.getTagId())
                .orElseThrow(()->new ResourceNotFoundException("Tag Not Found"));
        Item item = itemRepository.findById(tagToItem.getItemId())
                .orElseThrow(()->new ResourceNotFoundException("Item Not Found"));

        tag.getItems().add(item);
        item.getTags().add(tag);

        tagRepository.save(tag);
        itemRepository.save(item);


        return new AttachTagResponse().builder()
                .tagName(tag.getTitle())
                .itemName(item.getTitle())
                .build();
    }
}
