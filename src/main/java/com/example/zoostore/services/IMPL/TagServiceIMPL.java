package com.example.zoostore.services.IMPL;

import com.example.zoostore.entities.Item;
import com.example.zoostore.entities.Tag;
import com.example.zoostore.models.addTagToItem.addTagToItemRequest;
import com.example.zoostore.models.addTagToItem.addTagToItemResponse;
import com.example.zoostore.models.createTagIO.TagInput;
import com.example.zoostore.models.createTagIO.TagOutput;
import com.example.zoostore.mapper.TagMapper;
import com.example.zoostore.repositories.TagRepository;
import com.example.zoostore.services.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TagServiceIMPL implements TagService {

    private final ItemServiceIMPL itemService;
    private final TagRepository tagRepository;
    private final TagMapper tagMapper;

    @Override
    public TagOutput createTag(TagInput tag) {
        tagRepository.save(tagMapper.toEntity(tag));
        return tagMapper.toTagOutput(tag);
    }

    public addTagToItemResponse attachTag(addTagToItemRequest input){
        Tag tag=tagRepository.getById(input.getTagId());
        Item item = itemService.getItemById(input.getItemId());

        tag.getItems().add(item);
        item.getTags().add(tag);

        tagRepository.save(tag);
        itemService.saveItem(item);


        return new addTagToItemResponse().builder()
                .tagName(tag.getTitle())
                .itemName(item.getTitle())
                .build();
    }
}
