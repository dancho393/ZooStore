package com.example.zoostore.core.operations.tag;

import com.example.zoostore.rest.exceptions.ResourceNotFoundException;
import com.example.zoostore.api.operations.tag.deattach.DetachTagRequest;
import com.example.zoostore.api.operations.tag.deattach.DetachTagResponse;
import com.example.zoostore.api.operations.tag.deattach.DetachTagService;
import com.example.zoostore.persistence.entities.Tag;
import com.example.zoostore.persistence.repositories.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DetachTagIMPL implements DetachTagService {
    private final TagRepository tagRepository;
    @Override
    public DetachTagResponse process(DetachTagRequest tagItem) throws ResourceNotFoundException {
        Tag tagEntity = tagRepository.findById(tagItem.getTagId())
                .orElseThrow(()-> new ResourceNotFoundException("Tag Not Found"));
        tagEntity.getItems()
                .stream()
                .filter(item -> item.getId() != tagItem.getItemId())
                .collect(Collectors.toSet());
        return DetachTagResponse.builder()
                .id(tagEntity.getId())
                .title(tagEntity.getTitle())
                .itemNames(tagEntity.getItems())
                .build();
    }
}
