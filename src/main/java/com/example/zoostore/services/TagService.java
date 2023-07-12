package com.example.zoostore.services;

import com.example.zoostore.models.addTagToItem.addTagToItemRequest;
import com.example.zoostore.models.addTagToItem.addTagToItemResponse;
import com.example.zoostore.models.createTagIO.TagInput;
import com.example.zoostore.models.createTagIO.TagOutput;
import org.springframework.stereotype.Service;

@Service
public interface TagService {
    public TagOutput createTag(TagInput tag);
    public addTagToItemResponse attachTag(addTagToItemRequest input);



}
