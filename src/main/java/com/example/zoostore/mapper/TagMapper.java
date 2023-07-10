package com.example.zoostore.mapper;

import com.example.zoostore.dto.addTagIO.TagInput;
import com.example.zoostore.dto.addTagIO.TagOutput;
import com.example.zoostore.entities.Item;
import com.example.zoostore.entities.Tag;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class TagMapper {
    public Tag toEntity(TagInput tag){
        Tag tagEntity = new Tag();
        tagEntity.setTitle(tag.getTitle());
        tagEntity.setItems(new HashSet<Item>());
        return tagEntity;
    }
    public TagOutput toTagOutput(TagInput tag){
        return new TagOutput(tag.getTitle());

    }
}
