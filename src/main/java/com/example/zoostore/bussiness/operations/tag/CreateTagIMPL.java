package com.example.zoostore.bussiness.operations.tag;

import com.example.zoostore.api.operations.tag.create.CreateTagRequest;
import com.example.zoostore.api.operations.tag.create.CreateTagResponse;
import com.example.zoostore.api.operations.tag.create.CreateTagService;
import com.example.zoostore.bussiness.mapper.TagMapper;
import com.example.zoostore.data.entities.Tag;
import com.example.zoostore.data.repositories.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateTagIMPL implements CreateTagService {

    private final TagRepository tagRepository;
    private final TagMapper tagMapper;
    @Override
    public CreateTagResponse createTag(CreateTagRequest tag) {
        Tag tagEntity = tagMapper.toEntity(tag);
        tagRepository.save(tagMapper.toEntity(tag));
        return tagMapper.toTagResponse(tag);
    }
}
