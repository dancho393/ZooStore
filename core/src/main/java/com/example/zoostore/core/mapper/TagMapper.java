package com.example.zoostore.core.mapper;

import com.example.zoostore.api.operations.tag.create.CreateTagRequest;
import com.example.zoostore.api.operations.tag.create.CreateTagResponse;
import com.example.zoostore.persistence.entities.Item;
import com.example.zoostore.persistence.entities.Tag;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class TagMapper {
    public Tag toEntity(CreateTagRequest tag){
        Tag tagEntity = Tag.builder()
                .title(tag.getTitle())
                .items(new HashSet<Item>())
                .build();
        return tagEntity;
    }
    public CreateTagResponse toTagResponse(CreateTagRequest tag){
        return new CreateTagResponse(tag.getTitle());

    }
}
