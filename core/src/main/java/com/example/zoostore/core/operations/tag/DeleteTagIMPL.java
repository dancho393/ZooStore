package com.example.zoostore.core.operations.tag;

import com.example.zoostore.api.operations.tag.delete.DeleteTagOperation;
import com.example.zoostore.api.operations.tag.delete.DeleteTagRequest;
import com.example.zoostore.api.operations.tag.delete.DeleteTagResponse;
import com.example.zoostore.core.mapper.TagMapper;
import com.example.zoostore.persistence.entities.Tag;
import com.example.zoostore.persistence.repositories.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteTagIMPL implements DeleteTagOperation {
    private final TagRepository tagRepository;
    private final TagMapper tagMapper;

    @Override
    public DeleteTagResponse process(DeleteTagRequest tag) {
        Tag tagEntity = Tag.builder()
                .id(tag.getId())
                .build();
        tagRepository.delete(tagEntity);
        return  DeleteTagResponse.builder()
                .id(tag.getId())
                .build();
    }
}
