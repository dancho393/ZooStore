package com.example.zoostore.services.IMPL;

import com.example.zoostore.models.addTagIO.TagInput;
import com.example.zoostore.models.addTagIO.TagOutput;
import com.example.zoostore.mapper.TagMapper;
import com.example.zoostore.repositories.TagRepository;
import com.example.zoostore.services.TagService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TagServiceIMPL implements TagService {

    private final TagRepository tagRepository;
    private final TagMapper tagMapper;

    @Override
    public TagOutput createTag(TagInput tag) {
        tagRepository.save(tagMapper.toEntity(tag));
        return tagMapper.toTagOutput(tag);
    }
}
