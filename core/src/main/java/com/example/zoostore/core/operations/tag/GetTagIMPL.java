package com.example.zoostore.core.operations.tag;


import com.example.zoostore.api.operations.tag.get.GetTagRequest;
import com.example.zoostore.api.operations.tag.get.GetTagResponse;
import com.example.zoostore.api.operations.tag.get.GetTagOperation;
import com.example.zoostore.core.exceptions.ResourceNotFoundException;
import com.example.zoostore.persistence.entities.Tag;
import com.example.zoostore.persistence.repositories.TagRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetTagIMPL implements GetTagOperation {
    private final TagRepository tagRepository;


    @Override
    public GetTagResponse process(GetTagRequest tag) {
        Tag tagEntity = tagRepository.findById(tag.getId())
                .orElseThrow(()->new ResourceNotFoundException("Tag Not Found"));
        return GetTagResponse.builder()
                .id(tagEntity.getId())
                .title(tagEntity.getTitle())
                .build();
    }
}
