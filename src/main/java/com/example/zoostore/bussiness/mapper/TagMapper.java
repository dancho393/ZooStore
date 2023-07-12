package com.example.zoostore.bussiness.mapper;

import com.example.zoostore.api.operations.tag.create.CreateTagRequest;
import com.example.zoostore.api.operations.tag.create.CreateTagResponse;
import com.example.zoostore.models.createTagIO.TagInput;
import com.example.zoostore.models.createTagIO.TagOutput;
import com.example.zoostore.data.entities.Item;
import com.example.zoostore.data.entities.Tag;
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
