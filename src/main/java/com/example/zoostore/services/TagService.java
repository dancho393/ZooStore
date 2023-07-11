package com.example.zoostore.services;

import com.example.zoostore.models.addTagIO.TagInput;
import com.example.zoostore.models.addTagIO.TagOutput;
import org.springframework.stereotype.Service;

@Service
public interface TagService {
    public TagOutput createTag(TagInput tag);



}
