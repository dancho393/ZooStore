package com.example.zoostore.bussiness.operations.tag;

import com.example.zoostore.api.operations.tag.delete.DeleteTagRequest;
import com.example.zoostore.api.operations.tag.delete.DeleteTagResponse;
import com.example.zoostore.api.operations.tag.delete.DeleteTagService;
import com.example.zoostore.bussiness.mapper.TagMapper;
import com.example.zoostore.data.entities.Tag;
import com.example.zoostore.data.repositories.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteTagIMPL implements DeleteTagService {
    private final TagRepository tagRepository;
    private final TagMapper tagMapper;

    @Override
    public DeleteTagResponse deleteTag(DeleteTagRequest tag) {
        Tag tagEntity = Tag.builder()
                .id(tag.getId())
                .build();
        tagRepository.delete(tagEntity);
        return  DeleteTagResponse.builder()
                .id(tag.getId())
                .build();
    }
}
