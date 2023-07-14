package com.example.zoostore.bussiness.operations.tag;

import com.example.zoostore.api.configs.ResourceNotFoundExpcetion;
import com.example.zoostore.api.operations.tag.deattach.DetachTagRequest;
import com.example.zoostore.api.operations.tag.deattach.DetachTagResponse;
import com.example.zoostore.api.operations.tag.deattach.DetachTagService;
import com.example.zoostore.data.entities.Tag;
import com.example.zoostore.data.repositories.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DetachTagIMPL implements DetachTagService {
    private final TagRepository tagRepository;
    @Override
    public DetachTagResponse detachTag(DetachTagRequest tagItem) throws ResourceNotFoundExpcetion {
        Tag tagEntity = tagRepository.findById(tagItem.getTagId())
                .orElseThrow(()-> new ResourceNotFoundExpcetion("Tag Not Found"));
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
