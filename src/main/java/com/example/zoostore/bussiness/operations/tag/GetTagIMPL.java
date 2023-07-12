package com.example.zoostore.bussiness.operations.tag;

import com.example.zoostore.api.operations.tag.get.GetTagRequest;
import com.example.zoostore.api.operations.tag.get.GetTagResponce;
import com.example.zoostore.api.operations.tag.get.GetTagService;
import com.example.zoostore.data.entities.Tag;
import com.example.zoostore.data.repositories.TagRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetTagIMPL implements GetTagService {
    private final TagRepository tagRepository;


    @Override
    public GetTagResponce getTag(GetTagRequest tag) {
        Tag tagEntity = tagRepository.findById(tag.getId()).orElse(null);
        return GetTagResponce.builder()
                .id(tagEntity.getId())
                .title(tagEntity.getTitle())
                .build();
    }
}
