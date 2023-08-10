package com.example.zoostore.core.operations.tag;

import com.example.zoostore.api.operations.tag.create.CreateTagOperation;
import com.example.zoostore.api.operations.tag.create.CreateTagRequest;
import com.example.zoostore.api.operations.tag.create.CreateTagResponse;
import com.example.zoostore.core.mapper.TagMapper;
import com.example.zoostore.persistence.entities.Tag;
import com.example.zoostore.persistence.repositories.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateTagIMPL implements CreateTagOperation {

    private final TagRepository tagRepository;
    private final TagMapper tagMapper;
    @Override
    public CreateTagResponse process(CreateTagRequest tag) {
        Tag tagEntity = tagMapper.toEntity(tag);
        tagRepository.save(tagMapper.toEntity(tag));
        return tagMapper.toTagResponse(tag);
    }
}
