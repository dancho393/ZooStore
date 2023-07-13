package com.example.zoostore.bussiness.operations.tag;

import com.example.zoostore.api.configs.ResourceNotFoundExpcetion;
import com.example.zoostore.api.operations.tag.attach.AttachTagRequest;
import com.example.zoostore.api.operations.tag.attach.AttachTagResponse;
import com.example.zoostore.api.operations.tag.attach.AttachTagService;
import com.example.zoostore.data.entities.Item;
import com.example.zoostore.data.entities.Tag;
import com.example.zoostore.data.repositories.ItemRepository;
import com.example.zoostore.data.repositories.TagRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AttachTagIMPL implements AttachTagService {
    private final TagRepository tagRepository;
    private final ItemRepository itemRepository;
    @Override
    public AttachTagResponse attachTag(AttachTagRequest tagToItem) throws ResourceNotFoundExpcetion {
        Tag tag=tagRepository.findById(tagToItem.getTagId())
                .orElseThrow(()->new ResourceNotFoundExpcetion("Tag Not Found"));
        Item item = itemRepository.findById(tagToItem.getItemId()).orElse(null);

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
