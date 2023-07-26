package com.example.zoostore.core.operations.tag;


import com.example.zoostore.api.operations.tag.deattach.DetachTagRequest;
import com.example.zoostore.api.operations.tag.deattach.DetachTagResponse;
import com.example.zoostore.api.operations.tag.deattach.DetachTagOperation;
import com.example.zoostore.core.exceptions.ResourceNotFoundException;
import com.example.zoostore.persistence.entities.Tag;
import com.example.zoostore.persistence.repositories.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DetachTagIMPL implements DetachTagOperation {
    private final TagRepository tagRepository;
    @Override
    public DetachTagResponse process(DetachTagRequest tagItem) {
        Tag tagEntity = tagRepository.findById(tagItem.getTagId())
                .orElseThrow(()-> new ResourceNotFoundException("Tag Not Found"));

        return DetachTagResponse.builder()
                .id(tagEntity.getId())
                .title(tagEntity.getTitle())
                .build();
    }
}
