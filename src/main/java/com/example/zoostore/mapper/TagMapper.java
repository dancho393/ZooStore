package com.example.zoostore.mapper;

import com.example.zoostore.models.createTagIO.TagInput;
import com.example.zoostore.models.createTagIO.TagOutput;
import com.example.zoostore.entities.Item;
import com.example.zoostore.entities.Tag;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class TagMapper {
    public Tag toEntity(TagInput tag){
        Tag tagEntity = Tag.builder()
                .title(tag.getTitle())
                .items(new HashSet<Item>())
                .build();
        return tagEntity;
    }
    public TagOutput toTagOutput(TagInput tag){
        return new TagOutput(tag.getTitle());

    }
}
